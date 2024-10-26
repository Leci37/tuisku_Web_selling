//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: ATOMUSDT_15Min_2MT0_01793d27 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_2MT0_01793d27", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_01793d27(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= -0.035415 )
		if( Negative_Money_Flow_Sum <= 3.40518e+06 )
			if( ema1 <= 8.97909 )
				if( ema3 <= 6.2008 )
					if( ema3 <= 5.54782 )
						if( Typical_Price <= 5.28188 )
							if( ema1 <= 4.92591 )
								if( ema13 <= -0.073482 )
									ret := 0.138889
								if( ema13 > -0.073482 )
									ret := 0.703704 // buy
							if( ema1 > 4.92591 )
								if( Money_Flow_Ratio <= 0.327198 )
									ret := 0.178571
								if( Money_Flow_Ratio > 0.327198 )
									ret := -0.300000
						if( Typical_Price > 5.28188 )
							ret := 1.000000 // buy
					if( ema3 > 5.54782 )
						if( Positive_Money_Flow_Sum <= 184514 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 184514 )
							if( ema3 <= 5.70641 )
								ret := -0.900000 // sell
							if( ema3 > 5.70641 )
								if( Raw_Money_Flow <= 171657 )
									ret := 0.063830
								if( Raw_Money_Flow > 171657 )
									ret := -0.488889
				if( ema3 > 6.2008 )
					if( MFI_High <= -54.054 )
						if( Negative_Money_Flow <= 11180.9 )
							if( Money_Flow_Ratio <= 0.271286 )
								if( ema2 <= 6.74071 )
									ret := -0.200000
								if( ema2 > 6.74071 )
									ret := 0.233333
							if( Money_Flow_Ratio > 0.271286 )
								if( MFI_Low <= 5.32989 )
									ret := -0.571429
								if( MFI_Low > 5.32989 )
									ret := 0.625000
						if( Negative_Money_Flow > 11180.9 )
							if( Money_Flow_Ratio <= 0.327811 )
								if( ema13 <= -0.09938 )
									ret := -0.158940
								if( ema13 > -0.09938 )
									ret := 0.554604
							if( Money_Flow_Ratio > 0.327811 )
								if( Positive_Money_Flow_Sum <= 720097 )
									ret := 0.428571
								if( Positive_Money_Flow_Sum > 720097 )
									ret := -0.766667 // sell
					if( MFI_High > -54.054 )
						if( ema3 <= 6.52818 )
							if( Negative_Money_Flow_Sum <= 2.31765e+06 )
								if( ema13 <= -0.062562 )
									ret := 0.423077
								if( ema13 > -0.062562 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 2.31765e+06 )
								ret := 1.000000 // buy
						if( ema3 > 6.52818 )
							if( ema2 <= 8.87342 )
								if( Positive_Money_Flow_Sum <= 1.0891e+06 )
									ret := 0.139013
								if( Positive_Money_Flow_Sum > 1.0891e+06 )
									ret := 0.459259
							if( ema2 > 8.87342 )
								if( ema13 <= -0.12601 )
									ret := 1.000000 // buy
								if( ema13 > -0.12601 )
									ret := 0.695652
			if( ema1 > 8.97909 )
				if( Negative_Money_Flow <= 144701 )
					if( Raw_Money_Flow <= 146230 )
						if( Negative_Money_Flow_Sum <= 3.24314e+06 )
							if( ema3 <= 12.74 )
								if( Negative_Money_Flow_Sum <= 3.02114e+06 )
									ret := -0.018779
								if( Negative_Money_Flow_Sum > 3.02114e+06 )
									ret := -0.622222
							if( ema3 > 12.74 )
								if( ema1 <= 13.8778 )
									ret := -0.554217
								if( ema1 > 13.8778 )
									ret := -0.166667
						if( Negative_Money_Flow_Sum > 3.24314e+06 )
							if( Negative_Money_Flow_Sum <= 3.294e+06 )
								ret := 0.761905 // buy
							if( Negative_Money_Flow_Sum > 3.294e+06 )
								ret := 0.062500
					if( Raw_Money_Flow > 146230 )
						if( MFI <= 38.1522 )
							if( Raw_Money_Flow <= 171327 )
								if( ema12 <= -0.047976 )
									ret := 0.671053
								if( ema12 > -0.047976 )
									ret := 0.114583
							if( Raw_Money_Flow > 171327 )
								if( ema12 <= -0.047032 )
									ret := 0.164345
								if( ema12 > -0.047032 )
									ret := -0.196296
						if( MFI > 38.1522 )
							if( Negative_Money_Flow_Sum <= 1.92941e+06 )
								if( tema <= 11.9367 )
									ret := 0.043478
								if( tema > 11.9367 )
									ret := -0.550000
							if( Negative_Money_Flow_Sum > 1.92941e+06 )
								if( ema13 <= -0.059582 )
									ret := 0.435644
								if( ema13 > -0.059582 )
									ret := -0.181818
				if( Negative_Money_Flow > 144701 )
					if( Negative_Money_Flow <= 222220 )
						if( ema1 <= 11.7522 )
							if( ema3 <= 10.1626 )
								if( ema12 <= -0.03768 )
									ret := 0.146341
								if( ema12 > -0.03768 )
									ret := 0.880000 // buy
							if( ema3 > 10.1626 )
								if( MFI_High <= -53.5395 )
									ret := 0.495238
								if( MFI_High > -53.5395 )
									ret := 0.802198 // buy
						if( ema1 > 11.7522 )
							if( MFI <= 30.2382 )
								if( ema1 <= 12.6089 )
									ret := 0.177778
								if( ema1 > 12.6089 )
									ret := -0.418919
							if( MFI > 30.2382 )
								if( Negative_Money_Flow <= 190693 )
									ret := 0.571429
								if( Negative_Money_Flow > 190693 )
									ret := -0.078947
					if( Negative_Money_Flow > 222220 )
						if( Negative_Money_Flow_Sum <= 1.4381e+06 )
							if( ema13 <= -0.064245 )
								if( tema <= 9.83955 )
									ret := -0.900000 // sell
								if( tema > 9.83955 )
									ret := -1.000000 // sell
							if( ema13 > -0.064245 )
								if( Negative_Money_Flow_Sum <= 1.35036e+06 )
									ret := 0.058824
								if( Negative_Money_Flow_Sum > 1.35036e+06 )
									ret := -0.909091 // sell
						if( Negative_Money_Flow_Sum > 1.4381e+06 )
							if( tema <= 15.6672 )
								if( MFI <= 11.3969 )
									ret := -0.183673
								if( MFI > 11.3969 )
									ret := 0.192689
							if( tema > 15.6672 )
								if( Typical_Price <= 19.1303 )
									ret := -0.510638
								if( Typical_Price > 19.1303 )
									ret := 0.277778
		if( Negative_Money_Flow_Sum > 3.40518e+06 )
			if( ema12 <= -0.104884 )
				if( ema3 <= 13.3649 )
					if( MFI <= 31.3463 )
						if( ema12 <= -0.177169 )
							if( Negative_Money_Flow_Sum <= 1.23089e+07 )
								if( Typical_Price <= 10.7852 )
									ret := 0.928571 // buy
								if( Typical_Price > 10.7852 )
									ret := 0.670000
							if( Negative_Money_Flow_Sum > 1.23089e+07 )
								if( Negative_Money_Flow <= 1.42894e+06 )
									ret := 0.169492
								if( Negative_Money_Flow > 1.42894e+06 )
									ret := 0.674556
						if( ema12 > -0.177169 )
							if( MFI_High <= -56.8046 )
								if( ema2 <= 10.9049 )
									ret := -0.010870
								if( ema2 > 10.9049 )
									ret := 0.331111
							if( MFI_High > -56.8046 )
								if( tema <= 11.1992 )
									ret := 0.679856
								if( tema > 11.1992 )
									ret := 0.122340
					if( MFI > 31.3463 )
						if( Negative_Money_Flow <= 638181 )
							if( tema <= 8.09682 )
								if( Typical_Price <= 6.72667 )
									ret := -0.076923
								if( Typical_Price > 6.72667 )
									ret := -0.777778 // sell
							if( tema > 8.09682 )
								if( Typical_Price <= 10.5108 )
									ret := 0.718182 // buy
								if( Typical_Price > 10.5108 )
									ret := 0.116751
						if( Negative_Money_Flow > 638181 )
							if( MFI <= 42.4225 )
								if( ema1 <= 10.0788 )
									ret := 0.625000
								if( ema1 > 10.0788 )
									ret := -0.632479
							if( MFI > 42.4225 )
								if( tema <= 10.8324 )
									ret := -0.181818
								if( tema > 10.8324 )
									ret := 0.680000
				if( ema3 > 13.3649 )
					if( Money_Flow_Ratio <= 0.484839 )
						if( Raw_Money_Flow <= 1.04704e+06 )
							if( Negative_Money_Flow_Sum <= 2.39222e+07 )
								if( MFI <= 24.0286 )
									ret := 0.402930
								if( MFI > 24.0286 )
									ret := -0.262411
							if( Negative_Money_Flow_Sum > 2.39222e+07 )
								if( MFI_High <= -61.5344 )
									ret := -0.818182 // sell
								if( MFI_High > -61.5344 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.04704e+06 )
							if( ema12 <= -0.328136 )
								if( ema1 <= 13.3427 )
									ret := 0.400000
								if( ema1 > 13.3427 )
									ret := -0.792453 // sell
							if( ema12 > -0.328136 )
								if( MFI_Low <= -6.2102 )
									ret := 0.510638
								if( MFI_Low > -6.2102 )
									ret := -0.252830
					if( Money_Flow_Ratio > 0.484839 )
						if( ema3 <= 14.3633 )
							if( Raw_Money_Flow <= 1.08032e+06 )
								if( Negative_Money_Flow_Sum <= 1.00066e+07 )
									ret := -0.588235
								if( Negative_Money_Flow_Sum > 1.00066e+07 )
									ret := -0.066667
							if( Raw_Money_Flow > 1.08032e+06 )
								if( Money_Flow_Ratio <= 0.730695 )
									ret := 0.125000
								if( Money_Flow_Ratio > 0.730695 )
									ret := 0.600000
						if( ema3 > 14.3633 )
							if( Negative_Money_Flow <= 1.75435e+06 )
								if( Negative_Money_Flow <= 915189 )
									ret := 0.705128 // buy
								if( Negative_Money_Flow > 915189 )
									ret := 0.050000
							if( Negative_Money_Flow > 1.75435e+06 )
								if( ema2 <= 14.5995 )
									ret := 1.000000 // buy
								if( ema2 > 14.5995 )
									ret := 0.909091 // buy
			if( ema12 > -0.104884 )
				if( Money_Flow_Ratio <= 0.267231 )
					if( Negative_Money_Flow_Sum <= 4.84201e+06 )
						if( ema2 <= 8.25682 )
							if( Raw_Money_Flow <= 887694 )
								if( Positive_Money_Flow_Sum <= 701829 )
									ret := -0.903226 // sell
								if( Positive_Money_Flow_Sum > 701829 )
									ret := -0.326923
							if( Raw_Money_Flow > 887694 )
								ret := 0.818182 // buy
						if( ema2 > 8.25682 )
							if( Positive_Money_Flow <= 171732 )
								if( Positive_Money_Flow_Sum <= 1.08664e+06 )
									ret := 0.205749
								if( Positive_Money_Flow_Sum > 1.08664e+06 )
									ret := -0.613636
							if( Positive_Money_Flow > 171732 )
								if( ema3 <= 10.8898 )
									ret := -0.120879
								if( ema3 > 10.8898 )
									ret := -0.580000
					if( Negative_Money_Flow_Sum > 4.84201e+06 )
						if( Positive_Money_Flow_Sum <= 1.06491e+06 )
							if( Positive_Money_Flow_Sum <= 813466 )
								if( Negative_Money_Flow <= 698089 )
									ret := 0.000000
								if( Negative_Money_Flow > 698089 )
									ret := -0.538462
							if( Positive_Money_Flow_Sum > 813466 )
								if( Raw_Money_Flow <= 569928 )
									ret := -0.661111
								if( Raw_Money_Flow > 569928 )
									ret := -0.233766
						if( Positive_Money_Flow_Sum > 1.06491e+06 )
							if( Raw_Money_Flow <= 1.30261e+06 )
								if( MFI_Low <= -1.07098 )
									ret := -0.032491
								if( MFI_Low > -1.07098 )
									ret := -0.429603
							if( Raw_Money_Flow > 1.30261e+06 )
								if( Positive_Money_Flow_Sum <= 1.56157e+06 )
									ret := 0.709677 // buy
								if( Positive_Money_Flow_Sum > 1.56157e+06 )
									ret := -0.225000
				if( Money_Flow_Ratio > 0.267231 )
					if( MFI_High <= -39.1913 )
						if( Raw_Money_Flow <= 1.62359e+06 )
							if( Money_Flow_Ratio <= 0.552769 )
								if( MFI <= 34.6911 )
									ret := 0.095880
								if( MFI > 34.6911 )
									ret := -0.200692
							if( Money_Flow_Ratio > 0.552769 )
								if( Positive_Money_Flow_Sum <= 2.26219e+06 )
									ret := -0.284091
								if( Positive_Money_Flow_Sum > 2.26219e+06 )
									ret := 0.293384
						if( Raw_Money_Flow > 1.62359e+06 )
							if( MFI_Low <= 18.4892 )
								if( ema3 <= 13.0215 )
									ret := 0.647368
								if( ema3 > 13.0215 )
									ret := 0.240964
							if( MFI_Low > 18.4892 )
								if( ema1 <= 12.2746 )
									ret := -0.230769
								if( ema1 > 12.2746 )
									ret := -1.000000 // sell
					if( MFI_High > -39.1913 )
						if( tema <= 9.94466 )
							if( MFI <= 46.701 )
								if( MFI <= 45.632 )
									ret := 0.117647
								if( MFI > 45.632 )
									ret := -0.545455
							if( MFI > 46.701 )
								if( MFI <= 56.5735 )
									ret := 0.372093
								if( MFI > 56.5735 )
									ret := 0.829268 // buy
						if( tema > 9.94466 )
							if( Positive_Money_Flow_Sum <= 1.72942e+07 )
								if( MFI <= 47.1499 )
									ret := -0.197115
								if( MFI > 47.1499 )
									ret := 0.012903
							if( Positive_Money_Flow_Sum > 1.72942e+07 )
								if( MFI <= 53.5089 )
									ret := -0.583333
								if( MFI > 53.5089 )
									ret := -1.000000 // sell
	if( ema12 > -0.035415 )
		if( Positive_Money_Flow <= 466044 )
			if( ema3 <= 13.6026 )
				if( Positive_Money_Flow_Sum <= 648771 )
					if( Negative_Money_Flow <= 297919 )
						if( ema1 <= 4.99244 )
							if( ema12 <= -0.021699 )
								if( Money_Flow_Ratio <= 0.397166 )
									ret := 0.487603
								if( Money_Flow_Ratio > 0.397166 )
									ret := -0.166667
							if( ema12 > -0.021699 )
								if( tema <= 4.95125 )
									ret := 0.026217
								if( tema > 4.95125 )
									ret := 0.328244
						if( ema1 > 4.99244 )
							if( MFI <= 78.7357 )
								if( Typical_Price <= 9.34078 )
									ret := -0.062346
								if( Typical_Price > 9.34078 )
									ret := -0.128587
							if( MFI > 78.7357 )
								if( ema2 <= 6.29778 )
									ret := 0.553846
								if( ema2 > 6.29778 )
									ret := 0.085561
					if( Negative_Money_Flow > 297919 )
						if( ema3 <= 10.9794 )
							if( Negative_Money_Flow_Sum <= 1.26211e+06 )
								if( Money_Flow_Ratio <= 0.253346 )
									ret := 0.074627
								if( Money_Flow_Ratio > 0.253346 )
									ret := 0.526786
							if( Negative_Money_Flow_Sum > 1.26211e+06 )
								if( Negative_Money_Flow_Sum <= 1.30978e+06 )
									ret := -0.777778 // sell
								if( Negative_Money_Flow_Sum > 1.30978e+06 )
									ret := 0.195804
						if( ema3 > 10.9794 )
							if( Raw_Money_Flow <= 404239 )
								if( ema3 <= 11.3344 )
									ret := -0.800000 // sell
								if( ema3 > 11.3344 )
									ret := -0.545455
							if( Raw_Money_Flow > 404239 )
								ret := 0.090909
				if( Positive_Money_Flow_Sum > 648771 )
					if( MFI <= 46.796 )
						if( Raw_Money_Flow <= 388505 )
							if( Positive_Money_Flow_Sum <= 5.27369e+06 )
								if( Negative_Money_Flow <= 71369.3 )
									ret := 0.039103
								if( Negative_Money_Flow > 71369.3 )
									ret := 0.115317
							if( Positive_Money_Flow_Sum > 5.27369e+06 )
								if( ema1 <= 11.9771 )
									ret := 0.965517 // buy
								if( ema1 > 11.9771 )
									ret := 0.444444
						if( Raw_Money_Flow > 388505 )
							if( MFI_Low <= 21.2936 )
								if( MFI_High <= -40.5607 )
									ret := -0.076613
								if( MFI_High > -40.5607 )
									ret := -0.312500
							if( MFI_Low > 21.2936 )
								if( Negative_Money_Flow_Sum <= 3.0952e+06 )
									ret := -0.109937
								if( Negative_Money_Flow_Sum > 3.0952e+06 )
									ret := 0.220588
					if( MFI > 46.796 )
						if( Negative_Money_Flow_Sum <= 2.1316e+06 )
							if( Negative_Money_Flow_Sum <= 1.20421e+06 )
								if( ema13 <= 0.100379 )
									ret := -0.000663
								if( ema13 > 0.100379 )
									ret := -0.205805
							if( Negative_Money_Flow_Sum > 1.20421e+06 )
								if( ema3 <= 11.7634 )
									ret := 0.095757
								if( ema3 > 11.7634 )
									ret := -0.029539
						if( Negative_Money_Flow_Sum > 2.1316e+06 )
							if( MFI_High <= -32.0387 )
								if( Negative_Money_Flow_Sum <= 3.54274e+06 )
									ret := -0.408219
								if( Negative_Money_Flow_Sum > 3.54274e+06 )
									ret := -0.081967
							if( MFI_High > -32.0387 )
								if( Negative_Money_Flow_Sum <= 1.51297e+07 )
									ret := -0.030505
								if( Negative_Money_Flow_Sum > 1.51297e+07 )
									ret := -0.776119 // sell
			if( ema3 > 13.6026 )
				if( MFI_High <= -20.7919 )
					if( ema12 <= 0.052015 )
						if( Positive_Money_Flow_Sum <= 5.23583e+06 )
							if( ema13 <= 0.108122 )
								if( Money_Flow_Ratio <= 1.39441 )
									ret := -0.112415
								if( Money_Flow_Ratio > 1.39441 )
									ret := -0.443182
							if( ema13 > 0.108122 )
								if( Positive_Money_Flow_Sum <= 4.09176e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 4.09176e+06 )
									ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 5.23583e+06 )
							if( Money_Flow_Ratio <= 1.10762 )
								if( Money_Flow_Ratio <= 0.864162 )
									ret := -0.390625
								if( Money_Flow_Ratio > 0.864162 )
									ret := -0.773050 // sell
							if( Money_Flow_Ratio > 1.10762 )
								if( ema2 <= 14.2272 )
									ret := 0.469697
								if( ema2 > 14.2272 )
									ret := -0.317308
					if( ema12 > 0.052015 )
						if( Positive_Money_Flow_Sum <= 7.01237e+06 )
							if( Positive_Money_Flow <= 91952.4 )
								if( ema3 <= 14.8126 )
									ret := 0.111111
								if( ema3 > 14.8126 )
									ret := -0.320000
							if( Positive_Money_Flow > 91952.4 )
								ret := -0.916667 // sell
						if( Positive_Money_Flow_Sum > 7.01237e+06 )
							if( MFI_High <= -31.868 )
								ret := -0.117647
							if( MFI_High > -31.868 )
								if( ema3 <= 14.1828 )
									ret := -0.600000
								if( ema3 > 14.1828 )
									ret := -1.000000 // sell
				if( MFI_High > -20.7919 )
					if( Negative_Money_Flow_Sum <= 4.65695e+06 )
						if( Positive_Money_Flow_Sum <= 1.17563e+07 )
							if( Negative_Money_Flow <= 215544 )
								if( Positive_Money_Flow_Sum <= 4.59544e+06 )
									ret := -0.123077
								if( Positive_Money_Flow_Sum > 4.59544e+06 )
									ret := 0.293194
							if( Negative_Money_Flow > 215544 )
								if( MFI_Low <= 55.6733 )
									ret := -0.194245
								if( MFI_Low > 55.6733 )
									ret := -0.510870
						if( Positive_Money_Flow_Sum > 1.17563e+07 )
							if( Negative_Money_Flow_Sum <= 3.56752e+06 )
								if( Negative_Money_Flow <= 1.14823e+06 )
									ret := -0.400000
								if( Negative_Money_Flow > 1.14823e+06 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 3.56752e+06 )
								ret := -0.384615
					if( Negative_Money_Flow_Sum > 4.65695e+06 )
						if( ema12 <= 0.040091 )
							if( Raw_Money_Flow <= 519841 )
								ret := 0.318182
							if( Raw_Money_Flow > 519841 )
								if( Raw_Money_Flow <= 1.3325e+06 )
									ret := -0.400000
								if( Raw_Money_Flow > 1.3325e+06 )
									ret := -1.000000 // sell
						if( ema12 > 0.040091 )
							if( tema <= 16.5894 )
								if( Positive_Money_Flow_Sum <= 1.82377e+07 )
									ret := 0.274725
								if( Positive_Money_Flow_Sum > 1.82377e+07 )
									ret := 0.786408 // buy
							if( tema > 16.5894 )
								if( Positive_Money_Flow_Sum <= 1.1463e+07 )
									ret := 0.583333
								if( Positive_Money_Flow_Sum > 1.1463e+07 )
									ret := -0.600000
		if( Positive_Money_Flow > 466044 )
			if( MFI_High <= -35.7753 )
				if( tema <= 11.2595 )
					if( ema3 <= 10.7421 )
						if( Typical_Price <= 8.86427 )
							if( Positive_Money_Flow <= 786080 )
								if( Money_Flow_Ratio <= 0.745751 )
									ret := -0.592593
								if( Money_Flow_Ratio > 0.745751 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow > 786080 )
								ret := 0.739130 // buy
						if( Typical_Price > 8.86427 )
							if( Negative_Money_Flow_Sum <= 6.02376e+06 )
								if( ema3 <= 10.2745 )
									ret := 0.223301
								if( ema3 > 10.2745 )
									ret := -0.454545
							if( Negative_Money_Flow_Sum > 6.02376e+06 )
								if( MFI_High <= -48.5869 )
									ret := 0.111111
								if( MFI_High > -48.5869 )
									ret := -0.787879 // sell
					if( ema3 > 10.7421 )
						if( tema <= 10.7371 )
							ret := 0.812500 // buy
						if( tema > 10.7371 )
							if( Positive_Money_Flow <= 693451 )
								if( MFI_High <= -39.7162 )
									ret := -0.452381
								if( MFI_High > -39.7162 )
									ret := 0.217391
							if( Positive_Money_Flow > 693451 )
								if( Typical_Price <= 11.0989 )
									ret := 0.750000 // buy
								if( Typical_Price > 11.0989 )
									ret := 0.066667
				if( tema > 11.2595 )
					if( Raw_Money_Flow <= 2.10577e+06 )
						if( MFI <= 39.8682 )
							if( MFI_Low <= 17.3828 )
								if( Money_Flow_Ratio <= 0.377969 )
									ret := 0.142857
								if( Money_Flow_Ratio > 0.377969 )
									ret := -0.551546
							if( MFI_Low > 17.3828 )
								if( Negative_Money_Flow_Sum <= 1.54583e+07 )
									ret := 0.011628
								if( Negative_Money_Flow_Sum > 1.54583e+07 )
									ret := -1.000000 // sell
						if( MFI > 39.8682 )
							if( MFI_High <= -37.7205 )
								if( ema1 <= 11.9491 )
									ret := -0.928571 // sell
								if( ema1 > 11.9491 )
									ret := -0.743363 // sell
							if( MFI_High > -37.7205 )
								if( ema2 <= 14.439 )
									ret := -0.418367
								if( ema2 > 14.439 )
									ret := -0.833333 // sell
					if( Raw_Money_Flow > 2.10577e+06 )
						ret := 0.789474 // buy
			if( MFI_High > -35.7753 )
				if( Positive_Money_Flow <= 4.91699e+06 )
					if( MFI <= 53.8959 )
						if( Raw_Money_Flow <= 2.58419e+06 )
							if( Typical_Price <= 7.99883 )
								if( tema <= 6.45846 )
									ret := 0.161290
								if( tema > 6.45846 )
									ret := 0.867925 // buy
							if( Typical_Price > 7.99883 )
								if( MFI_Low <= 31.0232 )
									ret := -0.084975
								if( MFI_Low > 31.0232 )
									ret := 0.179204
						if( Raw_Money_Flow > 2.58419e+06 )
							if( MFI_Low <= 28.8456 )
								ret := -1.000000 // sell
							if( MFI_Low > 28.8456 )
								ret := -0.818182 // sell
					if( MFI > 53.8959 )
						if( Money_Flow_Ratio <= 2.03986 )
							if( ema2 <= 10.728 )
								if( Positive_Money_Flow_Sum <= 8.10483e+06 )
									ret := -0.016726
								if( Positive_Money_Flow_Sum > 8.10483e+06 )
									ret := -0.416107
							if( ema2 > 10.728 )
								if( MFI_Low <= 34.3418 )
									ret := -0.605634
								if( MFI_Low > 34.3418 )
									ret := -0.239078
						if( Money_Flow_Ratio > 2.03986 )
							if( MFI_Low <= 76.0975 )
								if( Negative_Money_Flow_Sum <= 1.96549e+06 )
									ret := -0.127222
								if( Negative_Money_Flow_Sum > 1.96549e+06 )
									ret := 0.019048
							if( MFI_Low > 76.0975 )
								if( MFI_Low <= 76.5053 )
									ret := -0.583333
								if( MFI_Low > 76.5053 )
									ret := -0.923077 // sell
				if( Positive_Money_Flow > 4.91699e+06 )
					if( ema3 <= 12.9317 )
						if( Typical_Price <= 12.2784 )
							if( ema12 <= 0.139987 )
								ret := -0.500000
							if( ema12 > 0.139987 )
								ret := -1.000000 // sell
						if( Typical_Price > 12.2784 )
							ret := 0.000000
					if( ema3 > 12.9317 )
						if( ema2 <= 14.9446 )
							ret := -1.000000 // sell
						if( ema2 > 14.9446 )
							ret := -0.857143 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_ATOMUSDT_15Min_01793d27(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


