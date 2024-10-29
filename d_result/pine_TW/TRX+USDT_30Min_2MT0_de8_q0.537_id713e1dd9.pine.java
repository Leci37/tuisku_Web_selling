//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: TRXUSDT_30Min_2MT0_713e1dd9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_2MT0_713e1dd9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_713e1dd9(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema2 <= 0.064472 )
		if( Money_Flow_Ratio <= 0.605515 )
			if( Typical_Price <= 0.059619 )
				if( ema12 <= -8.1e-05 )
					if( Positive_Money_Flow_Sum <= 1.75685e+06 )
						if( Negative_Money_Flow_Sum <= 6.71142e+06 )
							if( Negative_Money_Flow <= 723589 )
								if( Typical_Price <= 0.027321 )
									ret := 0.046875
								if( Typical_Price > 0.027321 )
									ret := -0.447917
							if( Negative_Money_Flow > 723589 )
								if( ema2 <= 0.046712 )
									ret := 0.608108
								if( ema2 > 0.046712 )
									ret := -0.528302
						if( Negative_Money_Flow_Sum > 6.71142e+06 )
							if( Negative_Money_Flow_Sum <= 1.03786e+07 )
								if( MFI_Low <= -4.08805 )
									ret := 0.871795 // buy
								if( MFI_Low > -4.08805 )
									ret := 0.521739
							if( Negative_Money_Flow_Sum > 1.03786e+07 )
								if( tema <= 0.047172 )
									ret := -0.703704 // sell
								if( tema > 0.047172 )
									ret := 0.571429
					if( Positive_Money_Flow_Sum > 1.75685e+06 )
						if( Positive_Money_Flow_Sum <= 1.07869e+07 )
							if( Negative_Money_Flow_Sum <= 1.10445e+07 )
								if( ema13 <= -0.00036 )
									ret := 0.522109
								if( ema13 > -0.00036 )
									ret := 0.331721
							if( Negative_Money_Flow_Sum > 1.10445e+07 )
								if( Raw_Money_Flow <= 4.06819e+06 )
									ret := 0.238365
								if( Raw_Money_Flow > 4.06819e+06 )
									ret := 0.534483
						if( Positive_Money_Flow_Sum > 1.07869e+07 )
							if( ema12 <= -0.001347 )
								if( Typical_Price <= 0.050509 )
									ret := 0.338983
								if( Typical_Price > 0.050509 )
									ret := 0.816667 // buy
							if( ema12 > -0.001347 )
								if( ema13 <= -0.000518 )
									ret := -0.118087
								if( ema13 > -0.000518 )
									ret := 0.331210
				if( ema12 > -8.1e-05 )
					if( ema12 <= -7.6e-05 )
						if( tema <= 0.031903 )
							if( ema3 <= 0.026842 )
								ret := 0.200000
							if( ema3 > 0.026842 )
								if( Positive_Money_Flow <= 266306 )
									ret := -0.307692
								if( Positive_Money_Flow > 266306 )
									ret := 0.125000
						if( tema > 0.031903 )
							if( Positive_Money_Flow <= 420613 )
								if( MFI <= 31.1571 )
									ret := -0.277778
								if( MFI > 31.1571 )
									ret := -0.862069 // sell
							if( Positive_Money_Flow > 420613 )
								ret := 0.375000
					if( ema12 > -7.6e-05 )
						if( MFI_High <= -44.9406 )
							if( Negative_Money_Flow_Sum <= 3.78629e+06 )
								if( Negative_Money_Flow <= 794956 )
									ret := -0.034247
								if( Negative_Money_Flow > 794956 )
									ret := -0.809524 // sell
							if( Negative_Money_Flow_Sum > 3.78629e+06 )
								if( Positive_Money_Flow <= 473034 )
									ret := 0.097561
								if( Positive_Money_Flow > 473034 )
									ret := 0.389313
						if( MFI_High > -44.9406 )
							if( ema13 <= -0.000111 )
								if( Raw_Money_Flow <= 265652 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 265652 )
									ret := 0.053571
							if( ema13 > -0.000111 )
								if( Negative_Money_Flow <= 1.49328e+06 )
									ret := -0.184466
								if( Negative_Money_Flow > 1.49328e+06 )
									ret := 0.466667
			if( Typical_Price > 0.059619 )
				if( MFI_High <= -49.9402 )
					if( Money_Flow_Ratio <= 0.427784 )
						if( Positive_Money_Flow <= 1.55776e+06 )
							if( MFI_Low <= 5.47579 )
								if( Typical_Price <= 0.061168 )
									ret := 0.238494
								if( Typical_Price > 0.061168 )
									ret := -0.013645
							if( MFI_Low > 5.47579 )
								if( Negative_Money_Flow_Sum <= 1.59647e+07 )
									ret := -0.002688
								if( Negative_Money_Flow_Sum > 1.59647e+07 )
									ret := -0.479339
						if( Positive_Money_Flow > 1.55776e+06 )
							if( Money_Flow_Ratio <= 0.330413 )
								if( Negative_Money_Flow_Sum <= 3.35072e+07 )
									ret := 0.333333
								if( Negative_Money_Flow_Sum > 3.35072e+07 )
									ret := -0.437500
							if( Money_Flow_Ratio > 0.330413 )
								if( Typical_Price <= 0.060046 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.060046 )
									ret := 0.636364
					if( Money_Flow_Ratio > 0.427784 )
						ret := -0.937500 // sell
				if( MFI_High > -49.9402 )
					if( Positive_Money_Flow_Sum <= 2.20071e+07 )
						if( Negative_Money_Flow_Sum <= 6.69818e+06 )
							if( ema13 <= -6.5e-05 )
								if( Negative_Money_Flow <= 832742 )
									ret := 0.022801
								if( Negative_Money_Flow > 832742 )
									ret := -0.465116
							if( ema13 > -6.5e-05 )
								if( ema2 <= 0.063686 )
									ret := 0.323944
								if( ema2 > 0.063686 )
									ret := -0.062500
						if( Negative_Money_Flow_Sum > 6.69818e+06 )
							if( Negative_Money_Flow_Sum <= 9.35068e+06 )
								if( ema12 <= -0.000221 )
									ret := 0.217391
								if( ema12 > -0.000221 )
									ret := 0.581967
							if( Negative_Money_Flow_Sum > 9.35068e+06 )
								if( MFI_High <= -47.3539 )
									ret := 0.386740
								if( MFI_High > -47.3539 )
									ret := 0.046575
					if( Positive_Money_Flow_Sum > 2.20071e+07 )
						if( Raw_Money_Flow <= 3.83577e+06 )
							if( Negative_Money_Flow <= 1.80482e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 1.80482e+06 )
								ret := -0.818182 // sell
						if( Raw_Money_Flow > 3.83577e+06 )
							ret := 0.166667
		if( Money_Flow_Ratio > 0.605515 )
			if( ema2 <= 0.025261 )
				if( ema3 <= 0.025187 )
					if( tema <= 0.025176 )
						if( ema12 <= -1.3e-05 )
							if( Negative_Money_Flow <= 326966 )
								if( Negative_Money_Flow <= 22834.7 )
									ret := 0.217391
								if( Negative_Money_Flow > 22834.7 )
									ret := -0.620690
							if( Negative_Money_Flow > 326966 )
								if( ema1 <= 0.02493 )
									ret := 0.812500 // buy
								if( ema1 > 0.02493 )
									ret := 0.214286
						if( ema12 > -1.3e-05 )
							if( tema <= 0.02437 )
								if( MFI_Low <= 46.5791 )
									ret := 0.193548
								if( MFI_Low > 46.5791 )
									ret := -0.230769
							if( tema > 0.02437 )
								if( tema <= 0.024921 )
									ret := 0.862069 // buy
								if( tema > 0.024921 )
									ret := 0.369697
					if( tema > 0.025176 )
						if( ema12 <= 0.00016 )
							if( MFI <= 71.5206 )
								if( Typical_Price <= 0.025251 )
									ret := -0.375000
								if( Typical_Price > 0.025251 )
									ret := 0.192308
							if( MFI > 71.5206 )
								ret := -0.687500
						if( ema12 > 0.00016 )
							ret := 0.684211
				if( ema3 > 0.025187 )
					if( ema12 <= -2.5e-05 )
						if( MFI_High <= -36.5597 )
							ret := 1.000000 // buy
						if( MFI_High > -36.5597 )
							ret := 0.900000 // buy
					if( ema12 > -2.5e-05 )
						if( tema <= 0.025369 )
							ret := 0.150000
						if( tema > 0.025369 )
							ret := 0.923077 // buy
			if( ema2 > 0.025261 )
				if( ema13 <= 0.000527 )
					if( Money_Flow_Ratio <= 0.685629 )
						if( ema12 <= -6.6e-05 )
							if( Negative_Money_Flow_Sum <= 1.50279e+07 )
								if( Negative_Money_Flow_Sum <= 1.21543e+07 )
									ret := 0.033639
								if( Negative_Money_Flow_Sum > 1.21543e+07 )
									ret := 0.803150 // buy
							if( Negative_Money_Flow_Sum > 1.50279e+07 )
								if( Raw_Money_Flow <= 3.47225e+06 )
									ret := -0.455224
								if( Raw_Money_Flow > 3.47225e+06 )
									ret := 0.358209
						if( ema12 > -6.6e-05 )
							if( MFI_Low <= 20.5983 )
								if( ema2 <= 0.051244 )
									ret := -0.002604
								if( ema2 > 0.051244 )
									ret := -0.225182
							if( MFI_Low > 20.5983 )
								if( ema3 <= 0.050054 )
									ret := -0.500000
								if( ema3 > 0.050054 )
									ret := -0.833333 // sell
					if( Money_Flow_Ratio > 0.685629 )
						if( Positive_Money_Flow_Sum <= 3.79302e+06 )
							if( MFI_High <= -36.7708 )
								if( ema13 <= 3e-05 )
									ret := 0.197674
								if( ema13 > 3e-05 )
									ret := -0.114583
							if( MFI_High > -36.7708 )
								if( Negative_Money_Flow <= 1.353e+06 )
									ret := -0.071104
								if( Negative_Money_Flow > 1.353e+06 )
									ret := 0.733333 // buy
						if( Positive_Money_Flow_Sum > 3.79302e+06 )
							if( Raw_Money_Flow <= 522196 )
								if( Positive_Money_Flow_Sum <= 1.15352e+07 )
									ret := -0.034895
								if( Positive_Money_Flow_Sum > 1.15352e+07 )
									ret := 0.758065 // buy
							if( Raw_Money_Flow > 522196 )
								if( ema2 <= 0.030132 )
									ret := 0.215481
								if( ema2 > 0.030132 )
									ret := 0.070120
				if( ema13 > 0.000527 )
					if( MFI_Low <= 66.6172 )
						if( Typical_Price <= 0.036933 )
							if( ema1 <= 0.033997 )
								if( ema2 <= 0.031234 )
									ret := -0.454936
								if( ema2 > 0.031234 )
									ret := 0.130435
							if( ema1 > 0.033997 )
								if( MFI_Low <= 56.6758 )
									ret := -0.777778 // sell
								if( MFI_Low > 56.6758 )
									ret := 0.000000
						if( Typical_Price > 0.036933 )
							if( Negative_Money_Flow_Sum <= 3.48187e+06 )
								if( ema12 <= 0.000489 )
									ret := 0.071130
								if( ema12 > 0.000489 )
									ret := 0.831169 // buy
							if( Negative_Money_Flow_Sum > 3.48187e+06 )
								if( Positive_Money_Flow_Sum <= 1.19557e+07 )
									ret := -0.437500
								if( Positive_Money_Flow_Sum > 1.19557e+07 )
									ret := -0.054156
					if( MFI_Low > 66.6172 )
						if( Positive_Money_Flow <= 1.03406e+06 )
							if( Money_Flow_Ratio <= 7.12967 )
								ret := -0.642857
							if( Money_Flow_Ratio > 7.12967 )
								if( Negative_Money_Flow <= 521015 )
									ret := 0.085714
								if( Negative_Money_Flow > 521015 )
									ret := 0.800000 // buy
						if( Positive_Money_Flow > 1.03406e+06 )
							if( tema <= 0.060574 )
								if( ema2 <= 0.057642 )
									ret := -0.889908 // sell
								if( ema2 > 0.057642 )
									ret := -0.653846
							if( tema > 0.060574 )
								if( tema <= 0.063489 )
									ret := -0.260000
								if( tema > 0.063489 )
									ret := -0.631579
	if( ema2 > 0.064472 )
		if( ema13 <= 0.004633 )
			if( MFI_High <= -46.0414 )
				if( ema2 <= 0.067838 )
					if( MFI <= 12.3405 )
						if( Typical_Price <= 0.064584 )
							if( MFI_Low <= -10.2331 )
								ret := 1.000000 // buy
							if( MFI_Low > -10.2331 )
								ret := 0.600000
						if( Typical_Price > 0.064584 )
							if( Negative_Money_Flow <= 788392 )
								ret := 0.461538
							if( Negative_Money_Flow > 788392 )
								ret := -0.500000
					if( MFI > 12.3405 )
						if( ema12 <= -0.000734 )
							if( Money_Flow_Ratio <= 0.231175 )
								if( Raw_Money_Flow <= 2.83729e+06 )
									ret := -0.406250
								if( Raw_Money_Flow > 2.83729e+06 )
									ret := 0.411765
							if( Money_Flow_Ratio > 0.231175 )
								if( Positive_Money_Flow <= 184703 )
									ret := 0.254237
								if( Positive_Money_Flow > 184703 )
									ret := 0.896104 // buy
						if( ema12 > -0.000734 )
							if( tema <= 0.064023 )
								if( Negative_Money_Flow_Sum <= 2.18171e+07 )
									ret := -0.233766
								if( Negative_Money_Flow_Sum > 2.18171e+07 )
									ret := -0.923077 // sell
							if( tema > 0.064023 )
								if( ema3 <= 0.067699 )
									ret := -0.017715
								if( ema3 > 0.067699 )
									ret := 0.261905
				if( ema2 > 0.067838 )
					if( Negative_Money_Flow_Sum <= 1.86947e+08 )
						if( Negative_Money_Flow_Sum <= 3.13379e+06 )
							if( MFI_Low <= -2.8564 )
								ret := 0.760000 // buy
							if( MFI_Low > -2.8564 )
								if( Negative_Money_Flow_Sum <= 2.80258e+06 )
									ret := -0.068293
								if( Negative_Money_Flow_Sum > 2.80258e+06 )
									ret := 0.203822
						if( Negative_Money_Flow_Sum > 3.13379e+06 )
							if( tema <= 0.087429 )
								if( Negative_Money_Flow_Sum <= 4.94253e+06 )
									ret := -0.268206
								if( Negative_Money_Flow_Sum > 4.94253e+06 )
									ret := -0.043746
							if( tema > 0.087429 )
								if( ema3 <= 0.089512 )
									ret := -0.483871
								if( ema3 > 0.089512 )
									ret := -0.146852
					if( Negative_Money_Flow_Sum > 1.86947e+08 )
						if( ema2 <= 0.151604 )
							if( ema12 <= -0.000609 )
								if( Positive_Money_Flow <= 1.84486e+07 )
									ret := 0.937500 // buy
								if( Positive_Money_Flow > 1.84486e+07 )
									ret := 0.333333
							if( ema12 > -0.000609 )
								ret := -0.428571
						if( ema2 > 0.151604 )
							ret := -0.375000
			if( MFI_High > -46.0414 )
				if( Negative_Money_Flow <= 3.54168e+06 )
					if( MFI <= 74.7339 )
						if( Positive_Money_Flow_Sum <= 2.12048e+08 )
							if( ema2 <= 0.086885 )
								if( ema13 <= -0.000292 )
									ret := 0.071750
								if( ema13 > -0.000292 )
									ret := -0.046981
							if( ema2 > 0.086885 )
								if( ema12 <= -0.002562 )
									ret := 0.725490 // buy
								if( ema12 > -0.002562 )
									ret := 0.012818
						if( Positive_Money_Flow_Sum > 2.12048e+08 )
							if( tema <= 0.157033 )
								if( ema3 <= 0.136466 )
									ret := 0.800000 // buy
								if( ema3 > 0.136466 )
									ret := 1.000000 // buy
							if( tema > 0.157033 )
								ret := 0.250000
					if( MFI > 74.7339 )
						if( Positive_Money_Flow_Sum <= 2.6196e+07 )
							if( ema12 <= 0.001108 )
								if( Raw_Money_Flow <= 8.20587e+06 )
									ret := -0.030277
								if( Raw_Money_Flow > 8.20587e+06 )
									ret := -0.945946 // sell
							if( ema12 > 0.001108 )
								if( Negative_Money_Flow_Sum <= 4.97462e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 4.97462e+06 )
									ret := 0.700000 // buy
						if( Positive_Money_Flow_Sum > 2.6196e+07 )
							if( ema2 <= 0.094198 )
								if( Raw_Money_Flow <= 3.28339e+06 )
									ret := -0.579602
								if( Raw_Money_Flow > 3.28339e+06 )
									ret := -0.285968
							if( ema2 > 0.094198 )
								if( Raw_Money_Flow <= 1.20132e+07 )
									ret := -0.289557
								if( Raw_Money_Flow > 1.20132e+07 )
									ret := 0.222222
				if( Negative_Money_Flow > 3.54168e+06 )
					if( Money_Flow_Ratio <= 2.60533 )
						if( ema12 <= 0.001342 )
							if( ema13 <= 0.000634 )
								if( ema2 <= 0.110936 )
									ret := 0.179973
								if( ema2 > 0.110936 )
									ret := -0.044580
							if( ema13 > 0.000634 )
								if( tema <= 0.132371 )
									ret := 0.300145
								if( tema > 0.132371 )
									ret := -0.022026
						if( ema12 > 0.001342 )
							if( ema13 <= 0.003529 )
								if( Positive_Money_Flow_Sum <= 4.58936e+07 )
									ret := 0.900000 // buy
								if( Positive_Money_Flow_Sum > 4.58936e+07 )
									ret := -0.547445
							if( ema13 > 0.003529 )
								if( Raw_Money_Flow <= 8.11288e+06 )
									ret := -0.923077 // sell
								if( Raw_Money_Flow > 8.11288e+06 )
									ret := 0.600000
					if( Money_Flow_Ratio > 2.60533 )
						if( ema12 <= 0.001566 )
							if( Raw_Money_Flow <= 4.76072e+06 )
								if( ema13 <= 0.0016 )
									ret := 0.365079
								if( ema13 > 0.0016 )
									ret := -0.360000
							if( Raw_Money_Flow > 4.76072e+06 )
								if( ema13 <= 0.001703 )
									ret := -0.108434
								if( ema13 > 0.001703 )
									ret := -0.738739 // sell
						if( ema12 > 0.001566 )
							if( Negative_Money_Flow <= 7.56498e+06 )
								if( Positive_Money_Flow_Sum <= 8.25483e+07 )
									ret := -0.970588 // sell
								if( Positive_Money_Flow_Sum > 8.25483e+07 )
									ret := 0.407407
							if( Negative_Money_Flow > 7.56498e+06 )
								if( ema2 <= 0.102796 )
									ret := -0.090909
								if( ema2 > 0.102796 )
									ret := 0.629032
		if( ema13 > 0.004633 )
			if( Typical_Price <= 0.115194 )
				if( MFI_High <= -6.09508 )
					if( ema1 <= 0.108103 )
						ret := -0.941176 // sell
					if( ema1 > 0.108103 )
						ret := 0.454545
				if( MFI_High > -6.09508 )
					if( Positive_Money_Flow <= 2.88334e+07 )
						if( Negative_Money_Flow <= 1.84668e+07 )
							if( Positive_Money_Flow_Sum <= 1.90687e+08 )
								ret := 0.692308
							if( Positive_Money_Flow_Sum > 1.90687e+08 )
								ret := 0.764706 // buy
						if( Negative_Money_Flow > 1.84668e+07 )
							ret := 0.100000
					if( Positive_Money_Flow > 2.88334e+07 )
						ret := -0.200000
			if( Typical_Price > 0.115194 )
				if( Positive_Money_Flow_Sum <= 2.66721e+08 )
					if( Typical_Price <= 0.168177 )
						if( ema13 <= 0.005565 )
							if( Positive_Money_Flow <= 2.75674e+07 )
								if( Negative_Money_Flow <= 1.99035e+07 )
									ret := -0.511111
								if( Negative_Money_Flow > 1.99035e+07 )
									ret := 0.777778 // buy
							if( Positive_Money_Flow > 2.75674e+07 )
								if( Raw_Money_Flow <= 3.19668e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 3.19668e+07 )
									ret := -0.818182 // sell
						if( ema13 > 0.005565 )
							if( MFI_Low <= 61.8294 )
								if( ema1 <= 0.155836 )
									ret := -1.000000 // sell
								if( ema1 > 0.155836 )
									ret := -0.973684 // sell
							if( MFI_Low > 61.8294 )
								ret := -0.750000 // sell
					if( Typical_Price > 0.168177 )
						ret := 0.315789
				if( Positive_Money_Flow_Sum > 2.66721e+08 )
					if( Raw_Money_Flow <= 1.94973e+07 )
						ret := 1.000000 // buy
					if( Raw_Money_Flow > 1.94973e+07 )
						if( tema <= 0.136251 )
							ret := 0.375000
						if( tema > 0.136251 )
							ret := -0.777778 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_TRXUSDT_30Min_713e1dd9(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)

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


