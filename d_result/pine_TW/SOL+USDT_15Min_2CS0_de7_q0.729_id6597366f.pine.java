//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: SOLUSDT_15Min_2CS0_6597366f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_15Min_2CS0_6597366f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_15Min_6597366f(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( k <= 60.7056 )
		if( rsi1 <= 43.856 )
			if( smoothK_k <= 14.8503 )
				if( mf <= -0.103683 )
					if( ad <= -231922 )
						if( smoothK_k <= 6.78603 )
							if( mf <= -0.184147 )
								ret := 0.942857 // buy
							if( mf > -0.184147 )
								ret := -0.166667
						if( smoothK_k > 6.78603 )
							if( mf <= -0.287599 )
								ret := 0.555556
							if( mf > -0.287599 )
								ret := -0.500000
					if( ad > -231922 )
						if( rsi1 <= 24.7634 )
							if( mf <= -0.16171 )
								ret := -0.257576
							if( mf > -0.16171 )
								ret := -0.423706
						if( rsi1 > 24.7634 )
							if( smoothD_d <= 7.65287 )
								ret := -0.229344
							if( smoothD_d > 7.65287 )
								ret := -0.109867
				if( mf > -0.103683 )
					if( rsi1 <= 31.2427 )
						if( mf <= -0.002697 )
							if( rsi1 <= 19.2223 )
								ret := -0.686047
							if( rsi1 > 19.2223 )
								ret := -0.531907
						if( mf > -0.002697 )
							if( smoothK_k <= -2.99875 )
								ret := -0.506173
							if( smoothK_k > -2.99875 )
								ret := -0.712526 // sell
					if( rsi1 > 31.2427 )
						if( ad <= 16142 )
							if( rsi1 <= 37.5889 )
								ret := -0.455741
							if( rsi1 > 37.5889 )
								ret := -0.310787
						if( ad > 16142 )
							if( mf <= 0.031779 )
								ret := -0.522908
							if( mf > 0.031779 )
								ret := -0.676613
			if( smoothK_k > 14.8503 )
				if( ad_mf <= -50826.5 )
					if( rsi1 <= 34.9264 )
						if( ad <= -54108.4 )
							if( d <= 27.9034 )
								ret := -0.352041
							if( d > 27.9034 )
								ret := -0.031915
						if( ad > -54108.4 )
							if( smoothD_d <= 17.2664 )
								ret := -0.357143
							if( smoothD_d > 17.2664 )
								ret := 0.430769
					if( rsi1 > 34.9264 )
						if( smoothK_k <= 30.5454 )
							if( ad <= -51215.7 )
								ret := -0.142157
							if( ad > -51215.7 )
								ret := 0.750000 // buy
						if( smoothK_k > 30.5454 )
							if( smoothD_d <= 48.99 )
								ret := 0.311751
							if( smoothD_d > 48.99 )
								ret := 0.000000
				if( ad_mf > -50826.5 )
					if( mf <= -0.091702 )
						if( smoothD_d <= 10.4834 )
							if( rsi1 <= 36.9337 )
								ret := -0.509615
							if( rsi1 > 36.9337 )
								ret := -0.142857
						if( smoothD_d > 10.4834 )
							if( rsi1 <= 36.1014 )
								ret := -0.161739
							if( rsi1 > 36.1014 )
								ret := -0.046053
					if( mf > -0.091702 )
						if( rsi1 <= 37.4839 )
							if( ad <= 17048.2 )
								ret := -0.348389
							if( ad > 17048.2 )
								ret := -0.446166
						if( rsi1 > 37.4839 )
							if( ad_mf <= 15226.5 )
								ret := -0.202919
							if( ad_mf > 15226.5 )
								ret := -0.362035
		if( rsi1 > 43.856 )
			if( ad <= 17642.7 )
				if( k <= 18.7846 )
					if( mf <= 0.141156 )
						if( rsi1 <= 52.0181 )
							if( ad <= 4472.19 )
								ret := -0.090050
							if( ad > 4472.19 )
								ret := -0.226619
						if( rsi1 > 52.0181 )
							if( mf <= -0.11807 )
								ret := -0.367347
							if( mf > -0.11807 )
								ret := 0.114264
					if( mf > 0.141156 )
						if( rsi1 <= 59.4659 )
							if( ad_mf <= -52434.8 )
								ret := -0.642276
							if( ad_mf > -52434.8 )
								ret := -0.268009
						if( rsi1 > 59.4659 )
							if( smoothD_d <= 4.13653 )
								ret := -0.031746
							if( smoothD_d > 4.13653 )
								ret := 0.297794
				if( k > 18.7846 )
					if( rsi1 <= 53.3077 )
						if( d_k <= -1.09926 )
							if( ad <= -53180.9 )
								ret := 0.294840
							if( ad > -53180.9 )
								ret := 0.054069
						if( d_k > -1.09926 )
							if( mf <= 0.088953 )
								ret := -0.058939
							if( mf > 0.088953 )
								ret := -0.211932
					if( rsi1 > 53.3077 )
						if( d_k <= 2.16825 )
							if( d <= 29.0357 )
								ret := 0.144917
							if( d > 29.0357 )
								ret := 0.311923
						if( d_k > 2.16825 )
							if( d_k <= 12.5838 )
								ret := 0.041246
							if( d_k > 12.5838 )
								ret := 0.141631
			if( ad > 17642.7 )
				if( k <= 36.5541 )
					if( ad_mf <= 88104.4 )
						if( k <= 9.45254 )
							if( mf <= 0.323944 )
								ret := -0.448810
							if( mf > 0.323944 )
								ret := -0.184211
						if( k > 9.45254 )
							if( rsi1 <= 53.9326 )
								ret := -0.326977
							if( rsi1 > 53.9326 )
								ret := -0.098706
					if( ad_mf > 88104.4 )
						if( mf <= 0.068858 )
							if( ad_mf <= 97133.7 )
								ret := 0.400000
							if( ad_mf > 97133.7 )
								ret := -0.453782
						if( mf > 0.068858 )
							if( rsi1 <= 69.489 )
								ret := -0.758065 // sell
							if( rsi1 > 69.489 )
								ret := -0.071429
				if( k > 36.5541 )
					if( ad <= 88148.5 )
						if( rsi1 <= 66.0607 )
							if( d_k <= 0.774206 )
								ret := 0.053749
							if( d_k > 0.774206 )
								ret := -0.172366
						if( rsi1 > 66.0607 )
							if( mf <= -0.033037 )
								ret := -0.500000
							if( mf > -0.033037 )
								ret := 0.320542
					if( ad > 88148.5 )
						if( mf <= 0.102243 )
							if( d <= 67.5111 )
								ret := -0.053846
							if( d > 67.5111 )
								ret := 0.769231 // buy
						if( mf > 0.102243 )
							if( rsi1 <= 54.4584 )
								ret := -0.753247 // sell
							if( rsi1 > 54.4584 )
								ret := -0.376543
	if( k > 60.7056 )
		if( rsi1 <= 58.3342 )
			if( rsi1 <= 50.0212 )
				if( ad_mf <= -53047.6 )
					if( mf <= 0.006523 )
						if( smoothD_d <= 72.0539 )
							if( mf <= -0.296426 )
								ret := 0.901961 // buy
							if( mf > -0.296426 )
								ret := 0.468750
						if( smoothD_d > 72.0539 )
							if( smoothK_k <= 68.2991 )
								ret := -0.040816
							if( smoothK_k > 68.2991 )
								ret := 0.399471
					if( mf > 0.006523 )
						if( d_k <= -18.4305 )
							ret := 0.571429
						if( d_k > -18.4305 )
							if( k <= 71.9582 )
								ret := -0.596491
							if( k > 71.9582 )
								ret := -0.253521
				if( ad_mf > -53047.6 )
					if( rsi1 <= 43.5502 )
						if( smoothK_k <= 87.9524 )
							if( ad <= 83631.9 )
								ret := -0.142774
							if( ad > 83631.9 )
								ret := 0.175325
						if( smoothK_k > 87.9524 )
							if( d <= 89.2965 )
								ret := -0.003623
							if( d > 89.2965 )
								ret := 0.168116
					if( rsi1 > 43.5502 )
						if( smoothK_k <= 67.174 )
							if( smoothD_d <= 57.7542 )
								ret := 0.047120
							if( smoothD_d > 57.7542 )
								ret := -0.177400
						if( smoothK_k > 67.174 )
							if( ad_mf <= -19221.3 )
								ret := 0.237903
							if( ad_mf > -19221.3 )
								ret := 0.023002
			if( rsi1 > 50.0212 )
				if( smoothK_k <= 79.9615 )
					if( mf <= -0.006929 )
						if( ad <= -27234.7 )
							if( ad_mf <= -208490 )
								ret := -0.333333
							if( ad_mf > -208490 )
								ret := 0.453629
						if( ad > -27234.7 )
							if( ad_mf <= 99637.1 )
								ret := 0.126651
							if( ad_mf > 99637.1 )
								ret := 0.666667
					if( mf > -0.006929 )
						if( smoothD_d <= 57.7497 )
							if( ad_mf <= -25817.1 )
								ret := 0.487179
							if( ad_mf > -25817.1 )
								ret := 0.201161
						if( smoothD_d > 57.7497 )
							if( ad <= 68662.5 )
								ret := -0.002809
							if( ad > 68662.5 )
								ret := -0.407895
				if( smoothK_k > 79.9615 )
					if( mf <= -0.006743 )
						if( ad_mf <= -5262.03 )
							if( d_k <= 7.23725 )
								ret := 0.478420
							if( d_k > 7.23725 )
								ret := -0.095238
						if( ad_mf > -5262.03 )
							if( ad_mf <= 44872.3 )
								ret := 0.186675
							if( ad_mf > 44872.3 )
								ret := 0.593074
					if( mf > -0.006743 )
						if( ad <= -73199.8 )
							if( k <= 94.4761 )
								ret := -0.533333
							if( k > 94.4761 )
								ret := 0.666667
						if( ad > -73199.8 )
							if( ad <= -25572 )
								ret := 0.360000
							if( ad > -25572 )
								ret := 0.138756
		if( rsi1 > 58.3342 )
			if( rsi1 <= 70.1343 )
				if( smoothK_k <= 80.59 )
					if( ad_mf <= 77740.1 )
						if( smoothD_d <= 59.5628 )
							if( ad <= -20817.5 )
								ret := 0.601562
							if( ad > -20817.5 )
								ret := 0.392857
						if( smoothD_d > 59.5628 )
							if( d_k <= -7.56947 )
								ret := 0.464684
							if( d_k > -7.56947 )
								ret := 0.233896
					if( ad_mf > 77740.1 )
						if( ad_mf <= 79016.5 )
							if( mf <= 0.181679 )
								ret := -0.937500 // sell
							if( mf > 0.181679 )
								ret := 0.000000
						if( ad_mf > 79016.5 )
							if( mf <= 0.084009 )
								ret := 0.320000
							if( mf > 0.084009 )
								ret := -0.122699
				if( smoothK_k > 80.59 )
					if( ad <= -5761.73 )
						if( d_k <= 1.00888 )
							if( ad_mf <= -147728 )
								ret := 0.076923
							if( ad_mf > -147728 )
								ret := 0.535484
						if( d_k > 1.00888 )
							if( smoothD_d <= 91.4495 )
								ret := 0.411667
							if( smoothD_d > 91.4495 )
								ret := 0.264706
					if( ad > -5761.73 )
						if( ad_mf <= 9111.03 )
							if( smoothK_k <= 96.9882 )
								ret := 0.311450
							if( smoothK_k > 96.9882 )
								ret := 0.090909
						if( ad_mf > 9111.03 )
							if( mf <= 0.092625 )
								ret := 0.505967
							if( mf > 0.092625 )
								ret := 0.294509
			if( rsi1 > 70.1343 )
				if( smoothK_k <= 81.7436 )
					if( ad <= 84053.8 )
						if( smoothD_d <= 84.6368 )
							if( ad_mf <= 50697.9 )
								ret := 0.372115
							if( ad_mf > 50697.9 )
								ret := 0.569672
						if( smoothD_d > 84.6368 )
							if( mf <= 0.120928 )
								ret := 0.715116 // buy
							if( mf > 0.120928 )
								ret := 0.398438
					if( ad > 84053.8 )
						if( d_k <= 5.46166 )
							if( ad <= 395007 )
								ret := -0.062802
							if( ad > 395007 )
								ret := -0.863636 // sell
						if( d_k > 5.46166 )
							if( smoothD_d <= 74.3185 )
								ret := -0.136364
							if( smoothD_d > 74.3185 )
								ret := 0.564103
				if( smoothK_k > 81.7436 )
					if( ad_mf <= 81828.6 )
						if( smoothK_k <= 96.9999 )
							if( ad <= -57767.7 )
								ret := 0.319277
							if( ad > -57767.7 )
								ret := 0.611337
						if( smoothK_k > 96.9999 )
							if( mf <= 0.144314 )
								ret := 0.501404
							if( mf > 0.144314 )
								ret := 0.154930
					if( ad_mf > 81828.6 )
						if( ad_mf <= 395678 )
							if( ad <= 114922 )
								ret := 0.262774
							if( ad > 114922 )
								ret := 0.487562
						if( ad_mf > 395678 )
							if( ad <= 408036 )
								ret := -1.000000 // sell
							if( ad > 408036 )
								ret := 0.190476
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_SOLUSDT_15Min_6597366f(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


