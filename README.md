LinkedIn-to-ChatGPT CV: AI-Powered Résumé Generator and Tailoring Tool
======================================================================

How It Works
------------

Internally, the application follows a two-phase process:

1.  **Phase 1 – CV Parsing:** When you upload your LinkedIn PDF, the app uses **PyMuPDF** to extract all text content. It then scans for known section headings in the text. The parser uses a multilingual dictionary of section titles (e.g., “Experience”, “Experiencia”, “経験” for Experience) to find where each section starts. Text under each heading is collected into the corresponding section. The candidate’s name and headline are inferred by looking at the lines just above the first major section (usually above “Summary” or “Experience”). Work experiences are further broken down by looking for date patterns (e.g., “2020 – 2022” or “Jan 2018 – Present”) to separate each job entry. Finally, a JSON object is constructed containing all the sections: for example, `data["Experience_json"]` holds a structured list of jobs with fields (company, title, period, location, description), while `data["Experience"]` holds the raw text block. Similar keys exist for Education, Skills, etc., and basic info like name, headline, LinkedIn URL, and detected language are included. This JSON is saved (e.g., `YourName_YYYY_MM_DD.json`) and is used to populate the HTML template.
    
2.  **Phase 2 – CV Generation & Enhancement:** Using the parsed data (and any edits you made in the form), the app fills an HTML template to produce your CV. The template (found in `templates/cv_GPT_generic_en.html` and `_es.html`, etc.) defines the structure of the CV with placeholder sections. The app inserts your name into the `<h1>` tag, your headline into a header block, and builds the contact info section with icons (adding links for email, LinkedIn, GitHub as provided). It then populates each section:
    
    *   If **AI enhancement** is enabled for the base CV, the app calls GPT-4 to polish some sections before insertion. In one batch prompt, it sends your Profile Summary, Skills list, Language list (and possibly a sampling of your Experience) to GPT-4 with instructions to reformat them into the standard HTML structure (using `<strong>` for highlights, `<span class="skill-badge">` for skills, etc.). The response is parsed and replaces the original text for those sections. This ensures even if your LinkedIn summary was plain text, it becomes nicely formatted HTML with bold keywords and line breaks as needed.
        
    *   Next, the app assembles the final HTML. Each section is injected into the template at the right spot using BeautifulSoup (for example, it finds the `<div id="id_skills">` in the template and inserts the generated Skills content there). Sections that are empty (e.g., if you had no Certifications) are omitted or a warning placeholder inserted, to avoid blank headers. The result is written to an HTML file (e.g., `cv_basic_YourName_YYYY_MM_DD.html`). At this point, you have a complete base CV ready to download or print.
        
    *   If you provide a **job offer** for tailoring, an additional sequence runs. The app uses the function `generate_cv_from_offer` to handle this. First, it detects the job description language (e.g., English vs Spanish) using `langdetect` and selects the appropriate base CV HTML (it might use the one you just created as a starting point). Then it sends a prompt to GPT-4 to parse the job posting (asking for the key expectations and requirements in a structured format). The response is converted into a Python dict (with fields like `job_title`, `technologies_tools`, `responsibilities`, `soft_skills_and_values`, etc.). That dict is saved as a JSON (so you can inspect exactly what GPT-4 extracted).
        
    *   With the job requirements in hand, the app loads your base CV HTML into BeautifulSoup and locates the **Skills** and **Experience** sections in the HTML. It then prompts GPT-4 two more times: once with the Experience HTML and job requirements, and once with the Skills HTML and job requirements. Each prompt includes instructions _not to change the HTML structure or add unreal information_, and lists the relevant parts of the job spec so GPT can align the wording. For example, the Experience prompt might say: “Here are the responsibilities required… here is the original Experience section HTML… _please return an updated HTML block that weaves in those responsibilities and tools where appropriate_”. GPT-4 then responds with just the modified `<div class="section" id="id_professional_experience">…</div>` content. The app replaces the old experience section in the soup with this new content. It does the same for the Skills section. (If needed, a similar approach could be taken for the Profile Summary, but often the experience and skills carry the most weight for tailoring.)
        
    *   Finally, the soup (now containing the tailored CV) is saved as a new HTML file, named with your name and the job title. This file is the **job-specific CV**. The interface then allows you to view or download it. From the browser, you can also print it to PDF if desired, using the same print button or the Download PDF option.
        

Throughout this process, the application uses a **multi-step prompt strategy** with GPT-4 that mirrors best practices observed by professionals: it first _analyzes_ inputs (your data or the job data) and then _produces output in focused chunks_, rather than one-shot generation. This ensures higher quality and more accurate results, as the model can concentrate on one section or task at a time. All AI interactions are constrained by clear instructions to maintain authenticity and avoid exaggeration or falsehoods. The end result is a CV that is both **ATS-friendly** (structured, keyword-optimized) and **visually appealing**, tailored to put your most relevant qualifications in the spotlight.


Features
--------

*   **LinkedIn PDF Parsing:** Upload your LinkedIn “Save as PDF” profile, and the tool will extract structured data. It recognizes key sections (Contact Info, Summary, Experience, Education, Languages, Skills, Certifications) in multiple languages. (For example, it knows _“Experiencia”_ corresponds to _Experience_ in Spanish, _“Образование”_ to _Education_ in Russian, etc.) The parser uses heuristics and regex to identify job entries, roles, dates, and descriptions from the text, producing a JSON representation of your CV.
    
*   **Automated CV Generation (HTML):** The extracted data is used to generate a clean, responsive HTML CV based on a template. All sections are formatted consistently with icons and styling. Your **name** appears as a prominent header, contact details are listed with icons (📧 email, 📞 phone, 📍 location, and links to LinkedIn/GitHub, etc.), and each section of your CV is clearly delineated with headings and appropriate HTML structure. The HTML is mobile-friendly and print-ready – it includes a one-click “Download as PDF” (print) button for easy saving as A4 PDF.
    
*   **Editable Info via Web UI:** A user-friendly interface allows you to review and edit parsed details before generating the CV. You can correct or update your contact information, add a profile photo, and ensure no details are missing. This ensures the final CV reflects exactly what you want to present. You can then generate the base HTML CV with one click.
    
*   **AI Content Enhancement (GPT-4):** Optionally, the tool can improve the wording and clarity of certain sections using GPT-4. It can polish your **Profile Summary**, consolidate **Skills** with consistent formatting, and ensure language proficiency descriptions are standardized. The AI is guided by a structured prompt framework to fill each section according to a predefined HTML pattern, without altering the meaning (it avoids introducing any false information). This yields a more compelling narrative while keeping your voice and truth intact.
    
*   **Job Description Tailoring:** The standout feature is customizing your CV for a specific job posting. When you paste a job offer text, the system will:
    
    *   Analyze the job description with GPT-4 to extract the key requirements: the role title, required technologies/tools, main responsibilities, sought-after soft skills, company info, and location. This creates a structured profile of what the employer is looking for.
        
    *   **Targeted Adjustments:** The tool then subtly adjusts your CV’s **Professional Experience** and **Skills** sections to better match those requirements. It uses carefully crafted GPT-4 prompts to _enhance_ your existing bullet points and skills:
        
        *   In **Experience**, it might amplify relevant duties or projects by incorporating keywords from the job posting (e.g. emphasizing your experience with _“scalable systems”_ if the job asks for it), but it will _not fabricate new roles or achievements_. The original tone and order of your job entries are preserved, and the modifications are constrained (e.g. output is limited to ~10% length increase) to ensure subtlety.
            
        *   In **Skills**, it may add or highlight specific skills that the job description prioritizes (for example, if the job requires **SQL** and you have database experience listed, it might ensure SQL appears explicitly). The AI is instructed not to break the HTML structure or over-embellish – just to inject relevant keywords or additional skills you genuinely possess. It caps changes to a small length increase (around 15%).
            
    *   The result is a tailored CV where a recruiter can immediately see the alignment between your background and the job requirements. This addresses the _“keyword match”_ that many Applicant Tracking Systems (ATS) and hiring managers look for, giving you a competitive edge.
        
*   **Multilingual Support:** Both the parsing and the generation support multiple languages. The system auto-detects the language of your input CV and of the job offer. It will use the appropriate language template for section titles (for instance, a Spanish CV will have _“Educación”_ instead of _“Education”_) and even instruct GPT-4 to respond in that language for any generated text. This means you can tailor a CV in Spanish for a Spanish job, English for an English job, etc., maintaining a native tone in each.
    
*   **Outputs and Downloads:** All results are saved for your convenience. After parsing, you get a JSON file of the extracted data (which you can download for backup or debugging). After generation, you have the base HTML CV file, and after tailoring, another HTML file specific to the job (with the job title and date in the filename for clarity). The web interface provides quick links to open these files in your browser and buttons to download the HTML or a PDF version. The HTML’s print stylesheet ensures the exported PDF is properly formatted for A4 paper. You also have the option to download a JSON report of the job analysis (the structured requirements extracted from the job offer).
    

Installation & Setup
--------------------

1.  **Clone the Repository:** Download or clone this repo to your local machine.
    
2.  **Environment:** Ensure you have Python 3.8+ installed. It’s recommended to use a virtual environment.
    
3.  **Install Dependencies:** Install required packages with pip. (A `requirements.txt` is provided if available, otherwise manually install the following key libraries: `PyMuPDF` (fitz), `beautifulsoup4`, `langdetect` and `language-data` (`langcodes`), `openai`, and a web framework like `Flask` for the UI, plus any others as needed.)
    
4.  **Obtain OpenAI API Key:** This tool uses the OpenAI GPT-4 API. Get an API key from OpenAI and make sure you have access to the GPT-4 model. Save your API key in the file `chatGPT/agente_api_.txt` in the project directory (the app will read the key from this file on startup). **Important:** Keep this file secure and never commit it to a repository.
    
5.  **Run the Application:** Launch the Flask web app by running `python app.py`. By default, it will start a local server (in debug mode) on http://127.0.0.1:5000 (check the console output for the exact address and port).
    
6.  **Access the UI:** Open your web browser and navigate to the local server address (e.g. http://localhost:5000). You should see the LinkedIn-to-ChatGPT CV interface ready to use.
    

Usage Guide
-----------

Using the tool is straightforward and interactive. There are two main steps:

**🔁 Step 1: Convert your LinkedIn PDF CV.** On the homepage, you will find an upload field to select your LinkedIn profile PDF. _(Tip: In LinkedIn, go to your profile, click “More…” and choose “Save to PDF” to get your latest CV.)_ Upload this PDF. The app will parse it and display a summary of the extracted content. You’ll see your name, headline, location, etc., filled into an **“Edit Contact Info”** form. Review these fields and fill in any that were missing (such as email or phone, since LinkedIn might not include those in the PDF). You can also upload a profile photo at this stage to include in the CV. Once everything looks correct, click the **“Generate Basic HTML CV”** button.

_Figure: Screenshot of the web interface. The left side shows Step 1 after uploading a PDF – the CV has been parsed (see the JSON filename) and contact details are editable, including adding a profile image. The user can then generate the basic HTML CV. The right side (Step 2) is ready to accept a job offer; a sample job posting has been loaded for tailoring the CV._

After a moment, the base HTML CV will be generated (you'll see a success message or filename). You can then click **“Open CV in new tab”** to view the generated CV in your browser. It will open as a nicely formatted webpage version of your résumé. Use the **“Download HTML CV”** button to save the .html file locally if you want. If you prefer a PDF, you have two options: click **“Download as PDF”** (if enabled, this uses an automated converter or the browser’s print-to-PDF) or simply open the CV and use the **⬇️ Download as PDF (A4)** button at the top of the page (this triggers the browser’s print dialog with proper formatting for PDF). At this point, you have a complete, polished CV derived from your LinkedIn profile.

**🎯 Step 2: Customize your CV for a Job Offer (Optional).** If you have a specific job you’re applying to, copy the text of that job description (e.g., from LinkedIn Jobs or a company’s posting) and paste it into the **“Paste Job Offer”** text box on the right side of the interface. Then click the **“Customize/Tailor CV for Job”** button. The app will now go through the tailoring process described above. You’ll see status messages like “🌐 Detecting language of job offer” (ensuring the AI responds in the correct language) and updates such as “🛠️ Enhancing Experience section...” and “🎯 Enhancing Skills section...”, indicating that GPT-4 is working on those sections. This may take a bit longer (a few seconds up to a minute, depending on the length of the job description and the responsiveness of the API). Once done, the interface will refresh to show that a job-specific CV has been created. You’ll see a new filename (with the job title in it) indicating the tailored CV, and buttons to **Open** or **Download** this version. Again, you can view it in browser or save as HTML/PDF as needed. Additionally, a **JSON** of the job analysis (the extracted key points from the job offer) can be downloaded – this is useful if you’re curious what the AI identified as the important skills and responsibilities.

**Review the tailored CV carefully.** The AI should have only made subtle tweaks that improve alignment with the job posting. Ensure that all changes are accurate and reflect your real experience. For example, if it added a skill badge you forgot to list, confirm you indeed have that skill. The tool is designed to avoid misinformation, but final responsibility lies with you to verify the content (as recommended by career experts: _don’t let ChatGPT put words in your mouth that aren’t true_). Once satisfied, you now have a targeted CV ready to send off with your job application.

CV Template Structure & Sections
--------------------------------

The generated CV follows a structured template, ensuring all key information is presented clearly and consistently. Here’s an overview of the sections included, in the order they appear:

1.  **Name:** _Your full name_ is displayed as a large heading at the top of the CV (e.g., within an `<h1>` tag). This is your personal branding and is immediately visible.
    
2.  **Contact Info:** A block containing your contact and online presence details, labeled with small icons for quick recognition. This typically includes:
    
    *   **Email** (📧), **Phone** (📞), **Location** (📍 city/state/country),
        
    *   Links to **LinkedIn** and **GitHub** (with their logos), or other social/professional networks you provide (e.g., Instagram if relevant for your field),
        
    *   **Date of Birth** (🎂) if you choose to include it (optional).
        
    *   Each item is listed on a separate line with a bold label (e.g., **Email:**) and your info next to it. The icons make it easy for a reader to scan and find how to contact you or view your profiles.
        
3.  **Skills:** A section summarizing your technical and professional skills, typically grouped by category. For example, you might have subgroups like **Programming Languages**, **Tools & Frameworks**, **Soft Skills**, etc. Within each group, skills are presented as badge-like elements (e.g., `<span class="skill-badge">Python</span>` for a programming language). Grouping helps both human readers and ATS software quickly identify if you have skills in a particular area. The skill badges format also makes it visually clear and saves space.
    
4.  **Languages:** A list of languages you speak, with proficiency levels. Each language is listed with an indication of your fluency (e.g., _Native_, _Full Professional_, _Intermediate_). This section also includes a visual indicator — a small horizontal bar representing proficiency percentage or level. For example, “English – Full Professional” might have a bar ~85% filled. This gives a quick at-a-glance assessment of your language abilities.
    
5.  **Profile Summary:** A short paragraph that introduces you as a professional. This is sometimes labeled “Profile” or “Summary” or could be an “About Me” section. It’s written in a narrative form, highlighting your career focus, values, and key strengths. In the HTML, important phrases may be bolded (`<strong>...</strong>`) to draw attention to your core competencies or achievements, and occasionally code-style formatting (`<code>`) is used if mentioning specific programming languages or technical jargon. The profile summary aims to give a bit of personality and context to your CV, beyond the bullet points. It’s often the part that a recruiter will read to get a sense of your background and motivation.
    
6.  **Professional Experience:** This is the most substantial section, listing your work history in reverse chronological order. Each position you’ve held is typically formatted as:
    
    *   **Job Header:** A line with the **Company name** (optionally the location or industry in parentheses) and your **Role/Title** with the period of employment. In HTML, the company might be in a `<h3>` and the title & dates in an italicized `<p><em>...</em></p>` below it.
        
    *   **Bullet Points:** Under each job, a `<ul>` list of `<li>` items describing your key responsibilities and achievements in that role. Each bullet is phrased starting with a strong action verb and often includes **bold** keywords to highlight results or important tools (e.g., “Implemented **end-to-end encryption** improving security by 30%”). This structure makes it easy to see your impact in each role. When the CV is tailored to a job offer, some of these bullets may be subtly edited to include keywords from the job requirements (e.g., if the job asks for project management, a bullet about leading projects might be emphasized). The overall structure (company, title, date, bullets) remains the same.
        
7.  **Education:** Details of your academic background. Each entry includes the **Degree or Certification name**, the **Institution** (university or organization), and the **years attended or year of graduation**. Optionally, a bullet point or two under each can list notable coursework or honors (especially if you are a recent graduate or the degree is highly relevant). For instance, a Master’s degree entry might have a bullet about thesis work or key subjects. Education is usually in its own section with its heading (🎓 Education).
    
8.  **Certifications:** A list of any professional certifications, courses, or awards you have earned outside of formal education. Each item might include the **certificate name**, the **issuing organization**, and the **date** (or “Issued: 2021”). If applicable, it can also list skills gained from the certification. For example: _“**AWS Certified Solutions Architect** – Amazon (Issued: 2022). Skills: **Cloud Architecture**, **AWS EC2**, **S3**.”_ This section demonstrates ongoing learning and expertise in specific tools or methodologies.
    

All these sections are part of the HTML template and will only appear if there is data for them. The tool will skip or remove an empty section to keep the CV concise. The order is fixed as above, since that order was carefully chosen to balance content on the page and align with common recruiter priorities. By following this structured approach, the CV maintains a professional layout that is easy to read and ATS-optimized.

Future Improvements and Contributions
-------------------------------------

This project is in active development, and there are exciting possibilities for future enhancements, such as:

*   **Additional Templates/Themes:** Offering different CV design templates (e.g., a more modern style or a minimalistic style) while using the same data. Currently, the focus is on one clean template, but the system could be extended with theme choices.
    
*   **Cover Letter Generation:** Using a similar approach to generate tailored cover letters from the job description and your CV content.
    
*   **LinkedIn API Integration:** Automating the PDF retrieval step by directly pulling your profile data via LinkedIn’s API (if available), to skip manual PDF uploading.
    
*   **GPT-3.5 Support or Toggle:** Allowing use of GPT-3.5 for faster/cheaper operation with possibly slightly lower quality, for those who don’t have GPT-4 access.
    
*   **Interactive Editing:** After AI tailoring, highlighting the changes made and allowing the user to accept/reject each change (perhaps by showing before-and-after diff). This would give users more control over the final content and ensure nothing unexpected is included.
    
*   **Multi-language Enhancement:** While the parsing and generation support many languages, the prompt templates for AI enhancement might be further refined for languages other than English/Spanish. Contributions for prompt tuning in other languages (French, Chinese, etc.) would be welcome to improve the quality of AI-generated text in those languages.
    

We welcome contributions from the community. If you encounter issues or have ideas for improvements, feel free to open an issue or submit a pull request (once the repo is public). This tool aims to streamline the job application process by combining reliable parsing with the power of generative AI – making customizing your résumé easier, faster, and more effective. Happy job hunting!

**References:** The importance of tailoring resumes is highlighted by career studies and experts[judge.com](https://www.judge.com/resources/blogs/using-chatgpt-to-tailor-your-resume/#:~:text=,stand%20out%20and%20possibly%20secure), and this tool’s approach is informed by best practices in using AI for resume writing (e.g. analyzing before writing, and focusing on section-by-section enhancements). We have also incorporated guidelines from professional advice to ensure authenticity and ethical use of AI in resume customization, aligning the tool’s output with your real qualifications and the job’s needs. By using LinkedIn-to-ChatGPT CV, you leverage both your existing professional profile and cutting-edge AI assistance to put your best foot forward in the job market.

![Export to Google Doc](chrome-extension://iapioliapockkkikccgbiaalfhoieano/assets/create.svg)![Copy with formatting](chrome-extension://iapioliapockkkikccgbiaalfhoieano/assets/copy.svg)![Select for Multi-select](chrome-extension://iapioliapockkkikccgbiaalfhoieano/assets/multi-select.svg)

![](https://www.google.com/s2/favicons?domain=https://www.judge.com&sz=32)
