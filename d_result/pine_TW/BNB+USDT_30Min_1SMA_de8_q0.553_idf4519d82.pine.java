//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: BNBUSDT_30Min_1SMA_f4519d82 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_1SMA_f4519d82", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_f4519d82(Bullish_CHoCHInt, Bearish_CHoCHInt, Order_Block_Low, FVG_UpInt, FVG_DownInt, atr, Premium_Zone, Discount_Zone, Swing_High, Internal_Swing_High, Equilibrium_Zone, Swing_Low, Order_Block_High, Bearish_BOSInt, Internal_Swing_Low, Bullish_BOSInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Equilibrium_Zone <= 587.975 )
		if( Equilibrium_Zone <= 210.898 )
			if( Discount_Zone <= 37.98 )
				if( Swing_High <= 30.88 )
					if( Equilibrium_Zone <= 20.8095 )
						if( Equilibrium_Zone <= 20.7041 )
							if( Internal_Swing_Low <= 19.8004 )
								if( Order_Block_Low <= 1.35603 )
									ret := 0.061776
								if( Order_Block_Low > 1.35603 )
									ret := 1.000000 // buy
							if( Internal_Swing_Low > 19.8004 )
								if( Internal_Swing_Low <= 20.2835 )
									ret := -1.000000 // sell
								if( Internal_Swing_Low > 20.2835 )
									ret := -0.416667
						if( Equilibrium_Zone > 20.7041 )
							if( Swing_High <= 0.961836 )
								if( Equilibrium_Zone <= 20.7613 )
									ret := -0.444444
								if( Equilibrium_Zone > 20.7613 )
									ret := -0.790698 // sell
							if( Swing_High > 0.961836 )
								ret := -1.000000 // sell
					if( Equilibrium_Zone > 20.8095 )
						if( Premium_Zone <= 26.8681 )
							if( atr <= 2.76405 )
								if( Internal_Swing_Low <= 24.3766 )
									ret := 0.741497 // buy
								if( Internal_Swing_Low > 24.3766 )
									ret := 0.000000
							if( atr > 2.76405 )
								if( atr <= 4.95969 )
									ret := -0.083333
								if( atr > 4.95969 )
									ret := 0.472973
						if( Premium_Zone > 26.8681 )
							if( Internal_Swing_High <= 131.436 )
								if( Discount_Zone <= 29.1063 )
									ret := 0.074361
								if( Discount_Zone > 29.1063 )
									ret := 0.177190
							if( Internal_Swing_High > 131.436 )
								if( Internal_Swing_High <= 136.65 )
									ret := -0.700000 // sell
								if( Internal_Swing_High > 136.65 )
									ret := -1.000000 // sell
				if( Swing_High > 30.88 )
					if( Order_Block_Low <= 106.858 )
						if( Internal_Swing_Low <= 0.825553 )
							if( atr <= 5.56485 )
								if( atr <= 3.60139 )
									ret := -0.333333
								if( atr > 3.60139 )
									ret := 0.137405
							if( atr > 5.56485 )
								if( atr <= 7.1071 )
									ret := -0.768116 // sell
								if( atr > 7.1071 )
									ret := -0.296000
						if( Internal_Swing_Low > 0.825553 )
							if( Internal_Swing_Low <= 29.2131 )
								ret := 1.000000 // buy
							if( Internal_Swing_Low > 29.2131 )
								if( Premium_Zone <= 46.3801 )
									ret := 0.500000
								if( Premium_Zone > 46.3801 )
									ret := 0.500000
					if( Order_Block_Low > 106.858 )
						ret := 1.000000 // buy
			if( Discount_Zone > 37.98 )
				if( Discount_Zone <= 86.8648 )
					if( atr <= 10.701 )
						if( Premium_Zone <= 44.9656 )
							if( Equilibrium_Zone <= 41.5103 )
								if( Equilibrium_Zone <= 41.4741 )
									ret := 0.500000
								if( Equilibrium_Zone > 41.4741 )
									ret := -1.000000 // sell
							if( Equilibrium_Zone > 41.5103 )
								if( Discount_Zone <= 38.2159 )
									ret := 1.000000 // buy
								if( Discount_Zone > 38.2159 )
									ret := 0.652174
						if( Premium_Zone > 44.9656 )
							if( atr <= 3.96267 )
								if( Equilibrium_Zone <= 41.8903 )
									ret := 0.285714
								if( Equilibrium_Zone > 41.8903 )
									ret := -0.774194 // sell
							if( atr > 3.96267 )
								if( Discount_Zone <= 38.6222 )
									ret := 0.048276
								if( Discount_Zone > 38.6222 )
									ret := 0.644068
					if( atr > 10.701 )
						if( Internal_Swing_Low <= 130.027 )
							if( Internal_Swing_High <= 54.4134 )
								if( Premium_Zone <= 359.464 )
									ret := 0.883817 // buy
								if( Premium_Zone > 359.464 )
									ret := 0.000000
							if( Internal_Swing_High > 54.4134 )
								if( Swing_High <= 75.6689 )
									ret := 0.208791
								if( Swing_High > 75.6689 )
									ret := 0.728395 // buy
						if( Internal_Swing_Low > 130.027 )
							if( Equilibrium_Zone <= 131.965 )
								ret := -1.000000 // sell
							if( Equilibrium_Zone > 131.965 )
								ret := 0.714286 // buy
				if( Discount_Zone > 86.8648 )
					if( Discount_Zone <= 91.1078 )
						if( Equilibrium_Zone <= 141.344 )
							if( Discount_Zone <= 90.6985 )
								if( Discount_Zone <= 88.9922 )
									ret := -1.000000 // sell
								if( Discount_Zone > 88.9922 )
									ret := 0.500000
							if( Discount_Zone > 90.6985 )
								if( Internal_Swing_High <= 66.8958 )
									ret := -0.850000 // sell
								if( Internal_Swing_High > 66.8958 )
									ret := -0.750000 // sell
						if( Equilibrium_Zone > 141.344 )
							ret := 0.000000
					if( Discount_Zone > 91.1078 )
						if( Swing_High <= 187.923 )
							if( Premium_Zone <= 219.602 )
								if( Discount_Zone <= 110.707 )
									ret := 0.356383
								if( Discount_Zone > 110.707 )
									ret := -0.009560
							if( Premium_Zone > 219.602 )
								if( Premium_Zone <= 246.168 )
									ret := 0.617778
								if( Premium_Zone > 246.168 )
									ret := 0.073171
						if( Swing_High > 187.923 )
							if( Discount_Zone <= 167.625 )
								if( Premium_Zone <= 249.919 )
									ret := -0.736842 // sell
								if( Premium_Zone > 249.919 )
									ret := 1.000000 // buy
							if( Discount_Zone > 167.625 )
								if( Equilibrium_Zone <= 205.025 )
									ret := 0.250000
								if( Equilibrium_Zone > 205.025 )
									ret := -0.107143
		if( Equilibrium_Zone > 210.898 )
			if( Internal_Swing_Low <= 582.54 )
				if( atr <= 33.3152 )
					if( Order_Block_Low <= 275.12 )
						if( Internal_Swing_Low <= 424.716 )
							if( Premium_Zone <= 612.65 )
								if( Swing_High <= 257.85 )
									ret := 0.019113
								if( Swing_High > 257.85 )
									ret := 0.155689
							if( Premium_Zone > 612.65 )
								if( Discount_Zone <= 560.835 )
									ret := -0.703704 // sell
								if( Discount_Zone > 560.835 )
									ret := -0.045455
						if( Internal_Swing_Low > 424.716 )
							if( Premium_Zone <= 508.75 )
								if( atr <= 25.6599 )
									ret := -0.866667 // sell
								if( atr > 25.6599 )
									ret := -0.329114
							if( Premium_Zone > 508.75 )
								if( Discount_Zone <= 454.369 )
									ret := 0.378378
								if( Discount_Zone > 454.369 )
									ret := -0.169521
					if( Order_Block_Low > 275.12 )
						if( Premium_Zone <= 292.458 )
							if( Premium_Zone <= 291.291 )
								ret := 1.000000 // buy
							if( Premium_Zone > 291.291 )
								ret := 0.750000 // buy
						if( Premium_Zone > 292.458 )
							if( Equilibrium_Zone <= 287.911 )
								if( Order_Block_Low <= 285.686 )
									ret := 0.205882
								if( Order_Block_Low > 285.686 )
									ret := -0.588235
							if( Equilibrium_Zone > 287.911 )
								if( Swing_Low <= 299.073 )
									ret := 0.378840
								if( Swing_Low > 299.073 )
									ret := 0.108844
				if( atr > 33.3152 )
					if( Swing_High <= 599.733 )
						if( Equilibrium_Zone <= 586.792 )
							if( atr <= 74.0238 )
								if( Equilibrium_Zone <= 219.725 )
									ret := -0.212121
								if( Equilibrium_Zone > 219.725 )
									ret := 0.090035
							if( atr > 74.0238 )
								if( Equilibrium_Zone <= 267.602 )
									ret := -0.130293
								if( Equilibrium_Zone > 267.602 )
									ret := 0.045854
						if( Equilibrium_Zone > 586.792 )
							if( Premium_Zone <= 699.525 )
								if( atr <= 67.6811 )
									ret := 0.343284
								if( atr > 67.6811 )
									ret := -0.727273 // sell
							if( Premium_Zone > 699.525 )
								if( Internal_Swing_High <= 287.719 )
									ret := 0.943396 // buy
								if( Internal_Swing_High > 287.719 )
									ret := 0.363636
					if( Swing_High > 599.733 )
						if( Internal_Swing_Low <= 175.706 )
							if( Equilibrium_Zone <= 582.125 )
								if( Premium_Zone <= 617.025 )
									ret := 0.000000
								if( Premium_Zone > 617.025 )
									ret := -0.824561 // sell
							if( Equilibrium_Zone > 582.125 )
								if( Premium_Zone <= 627.815 )
									ret := 0.800000 // buy
								if( Premium_Zone > 627.815 )
									ret := -0.235294
						if( Internal_Swing_Low > 175.706 )
							ret := 1.000000 // buy
			if( Internal_Swing_Low > 582.54 )
				if( Internal_Swing_Low <= 597.684 )
					if( Internal_Swing_High <= 594.331 )
						if( atr <= 34.55 )
							if( atr <= 24.4 )
								ret := -0.285714
							if( atr > 24.4 )
								if( Discount_Zone <= 550.474 )
									ret := 0.133333
								if( Discount_Zone > 550.474 )
									ret := 0.000000
						if( atr > 34.55 )
							if( Discount_Zone <= 547.882 )
								if( atr <= 47.35 )
									ret := -0.071429
								if( atr > 47.35 )
									ret := -0.533333
							if( Discount_Zone > 547.882 )
								ret := -1.000000 // sell
					if( Internal_Swing_High > 594.331 )
						if( Discount_Zone <= 511.88 )
							ret := 0.500000
						if( Discount_Zone > 511.88 )
							ret := 1.000000 // buy
				if( Internal_Swing_Low > 597.684 )
					if( Internal_Swing_Low <= 607.35 )
						if( Premium_Zone <= 629.648 )
							ret := -1.000000 // sell
						if( Premium_Zone > 629.648 )
							if( Discount_Zone <= 420.072 )
								ret := 1.000000 // buy
							if( Discount_Zone > 420.072 )
								if( Equilibrium_Zone <= 571.2 )
									ret := 0.000000
								if( Equilibrium_Zone > 571.2 )
									ret := 0.647059
					if( Internal_Swing_Low > 607.35 )
						ret := -0.800000 // sell
	if( Equilibrium_Zone > 587.975 )
		if( Equilibrium_Zone <= 593.297 )
			if( atr <= 48.8354 )
				if( atr <= 33.1339 )
					if( Discount_Zone <= 565.106 )
						if( Premium_Zone <= 622.736 )
							if( Discount_Zone <= 559.133 )
								if( Swing_High <= 301.4 )
									ret := -1.000000 // sell
								if( Swing_High > 301.4 )
									ret := -0.250000
							if( Discount_Zone > 559.133 )
								if( Equilibrium_Zone <= 591.291 )
									ret := -0.250000
								if( Equilibrium_Zone > 591.291 )
									ret := 0.083333
						if( Premium_Zone > 622.736 )
							if( Internal_Swing_Low <= 288.9 )
								if( Internal_Swing_High <= 606 )
									ret := 0.000000
								if( Internal_Swing_High > 606 )
									ret := -0.500000
							if( Internal_Swing_Low > 288.9 )
								if( Internal_Swing_Low <= 591.306 )
									ret := 0.833333 // buy
								if( Internal_Swing_Low > 591.306 )
									ret := 0.062500
					if( Discount_Zone > 565.106 )
						if( Premium_Zone <= 616.207 )
							if( atr <= 21.8848 )
								if( Equilibrium_Zone <= 592.448 )
									ret := -0.840000 // sell
								if( Equilibrium_Zone > 592.448 )
									ret := -0.200000
							if( atr > 21.8848 )
								if( Discount_Zone <= 568.97 )
									ret := -0.230769
								if( Discount_Zone > 568.97 )
									ret := 0.217391
						if( Premium_Zone > 616.207 )
							if( Premium_Zone <= 616.958 )
								if( Premium_Zone <= 616.864 )
									ret := -1.000000 // sell
								if( Premium_Zone > 616.864 )
									ret := -0.750000 // sell
							if( Premium_Zone > 616.958 )
								ret := -1.000000 // sell
				if( atr > 33.1339 )
					if( Equilibrium_Zone <= 592.639 )
						if( Internal_Swing_High <= 585.724 )
							if( Discount_Zone <= 542.716 )
								ret := -0.333333
							if( Discount_Zone > 542.716 )
								if( atr <= 40.07 )
									ret := 0.522388
								if( atr > 40.07 )
									ret := 0.824561 // buy
						if( Internal_Swing_High > 585.724 )
							if( Discount_Zone <= 551.979 )
								if( Swing_High <= 610.574 )
									ret := 0.740741 // buy
								if( Swing_High > 610.574 )
									ret := -0.750000 // sell
							if( Discount_Zone > 551.979 )
								if( Internal_Swing_High <= 593.338 )
									ret := -0.666667
								if( Internal_Swing_High > 593.338 )
									ret := -0.125000
					if( Equilibrium_Zone > 592.639 )
						if( Internal_Swing_High <= 593.2 )
							if( Equilibrium_Zone <= 593.076 )
								if( Internal_Swing_Low <= 290.15 )
									ret := -0.125000
								if( Internal_Swing_Low > 290.15 )
									ret := 0.200000
							if( Equilibrium_Zone > 593.076 )
								ret := -0.750000 // sell
						if( Internal_Swing_High > 593.2 )
							if( Equilibrium_Zone <= 592.902 )
								ret := -1.000000 // sell
							if( Equilibrium_Zone > 592.902 )
								ret := 0.000000
			if( atr > 48.8354 )
				if( Swing_Low <= 139.278 )
					if( Internal_Swing_Low <= 595.7 )
						if( Internal_Swing_Low <= 575.387 )
							if( Discount_Zone <= 465.323 )
								if( Equilibrium_Zone <= 588.902 )
									ret := -0.500000
								if( Equilibrium_Zone > 588.902 )
									ret := 0.428571
							if( Discount_Zone > 465.323 )
								if( Premium_Zone <= 671.6 )
									ret := -0.398876
								if( Premium_Zone > 671.6 )
									ret := -0.664122
						if( Internal_Swing_Low > 575.387 )
							if( Premium_Zone <= 672.057 )
								if( Internal_Swing_Low <= 586.048 )
									ret := -0.960000 // sell
								if( Internal_Swing_Low > 586.048 )
									ret := -0.769231 // sell
							if( Premium_Zone > 672.057 )
								ret := -0.250000
					if( Internal_Swing_Low > 595.7 )
						if( atr <= 116.877 )
							if( Equilibrium_Zone <= 592.375 )
								if( Internal_Swing_Low <= 602.236 )
									ret := -0.166667
								if( Internal_Swing_Low > 602.236 )
									ret := 0.055556
							if( Equilibrium_Zone > 592.375 )
								ret := -0.500000
						if( atr > 116.877 )
							ret := -0.600000
				if( Swing_Low > 139.278 )
					if( Premium_Zone <= 666.892 )
						if( Internal_Swing_Low <= 569.907 )
							ret := -0.333333
						if( Internal_Swing_Low > 569.907 )
							ret := -1.000000 // sell
					if( Premium_Zone > 666.892 )
						if( Premium_Zone <= 714.57 )
							ret := 1.000000 // buy
						if( Premium_Zone > 714.57 )
							ret := 0.500000
		if( Equilibrium_Zone > 593.297 )
			if( Discount_Zone <= 582.265 )
				if( Swing_Low <= 546.861 )
					if( Internal_Swing_High <= 656.437 )
						if( atr <= 129.79 )
							if( Discount_Zone <= 513.394 )
								if( Internal_Swing_High <= 579.179 )
									ret := -0.089947
								if( Internal_Swing_High > 579.179 )
									ret := -0.773196 // sell
							if( Discount_Zone > 513.394 )
								if( Discount_Zone <= 517.345 )
									ret := 0.460784
								if( Discount_Zone > 517.345 )
									ret := -0.014956
						if( atr > 129.79 )
							if( Internal_Swing_High <= 583.434 )
								if( Premium_Zone <= 738.257 )
									ret := 1.000000 // buy
								if( Premium_Zone > 738.257 )
									ret := 0.809524 // buy
							if( Internal_Swing_High > 583.434 )
								ret := 0.125000
					if( Internal_Swing_High > 656.437 )
						if( Swing_High <= 663.854 )
							if( Premium_Zone <= 768.619 )
								if( Equilibrium_Zone <= 628.725 )
									ret := -0.500000
								if( Equilibrium_Zone > 628.725 )
									ret := -0.857143 // sell
							if( Premium_Zone > 768.619 )
								if( Internal_Swing_High <= 707.45 )
									ret := 0.133333
								if( Internal_Swing_High > 707.45 )
									ret := -0.500000
						if( Swing_High > 663.854 )
							if( Discount_Zone <= 569.41 )
								if( Premium_Zone <= 750.325 )
									ret := 0.485714
								if( Premium_Zone > 750.325 )
									ret := -0.600000
							if( Discount_Zone > 569.41 )
								if( Swing_High <= 684.955 )
									ret := -1.000000 // sell
								if( Swing_High > 684.955 )
									ret := -0.750000 // sell
				if( Swing_Low > 546.861 )
					if( atr <= 50.8685 )
						if( Equilibrium_Zone <= 597.969 )
							if( Order_Block_High <= 588.744 )
								if( atr <= 35.1375 )
									ret := -0.153846
								if( atr > 35.1375 )
									ret := 0.416667
							if( Order_Block_High > 588.744 )
								ret := 1.000000 // buy
						if( Equilibrium_Zone > 597.969 )
							if( Internal_Swing_Low <= 583.54 )
								ret := -1.000000 // sell
							if( Internal_Swing_Low > 583.54 )
								if( Equilibrium_Zone <= 603.595 )
									ret := 0.071429
								if( Equilibrium_Zone > 603.595 )
									ret := -0.542857
					if( atr > 50.8685 )
						if( Bearish_BOSInt <= 0.5 )
							if( Premium_Zone <= 717.7 )
								if( Discount_Zone <= 517.33 )
									ret := 0.916667 // buy
								if( Discount_Zone > 517.33 )
									ret := 0.172043
							if( Premium_Zone > 717.7 )
								if( Equilibrium_Zone <= 660.665 )
									ret := 0.810811 // buy
								if( Equilibrium_Zone > 660.665 )
									ret := 0.250000
						if( Bearish_BOSInt > 0.5 )
							if( atr <= 65.83 )
								if( Internal_Swing_Low <= 574.619 )
									ret := 1.000000 // buy
								if( Internal_Swing_Low > 574.619 )
									ret := 0.500000
							if( atr > 65.83 )
								ret := 1.000000 // buy
			if( Discount_Zone > 582.265 )
				if( Internal_Swing_Low <= 627.45 )
					if( Internal_Swing_High <= 660.455 )
						if( Discount_Zone <= 587.99 )
							if( Equilibrium_Zone <= 603.236 )
								if( Equilibrium_Zone <= 602.068 )
									ret := -0.565217
								if( Equilibrium_Zone > 602.068 )
									ret := -1.000000 // sell
							if( Equilibrium_Zone > 603.236 )
								if( Discount_Zone <= 584.413 )
									ret := -0.462963
								if( Discount_Zone > 584.413 )
									ret := -0.090226
						if( Discount_Zone > 587.99 )
							if( Premium_Zone <= 757.888 )
								if( atr <= 50.0226 )
									ret := -0.465116
								if( atr > 50.0226 )
									ret := -0.822581 // sell
							if( Premium_Zone > 757.888 )
								if( Premium_Zone <= 758.858 )
									ret := 0.250000
								if( Premium_Zone > 758.858 )
									ret := -0.375000
					if( Internal_Swing_High > 660.455 )
						if( Swing_High <= 669.714 )
							if( Discount_Zone <= 598.113 )
								if( atr <= 87.3248 )
									ret := 0.700000 // buy
								if( atr > 87.3248 )
									ret := 0.428571
							if( Discount_Zone > 598.113 )
								ret := 0.000000
						if( Swing_High > 669.714 )
							ret := -1.000000 // sell
				if( Internal_Swing_Low > 627.45 )
					if( Equilibrium_Zone <= 645.433 )
						if( Equilibrium_Zone <= 637.701 )
							if( Internal_Swing_Low <= 629.665 )
								ret := 1.000000 // buy
							if( Internal_Swing_Low > 629.665 )
								if( Internal_Swing_Low <= 639.007 )
									ret := 0.666667
								if( Internal_Swing_Low > 639.007 )
									ret := 0.818182 // buy
						if( Equilibrium_Zone > 637.701 )
							if( Internal_Swing_Low <= 654.27 )
								ret := 0.000000
							if( Internal_Swing_Low > 654.27 )
								ret := 0.500000
					if( Equilibrium_Zone > 645.433 )
						if( Equilibrium_Zone <= 675.686 )
							if( Discount_Zone <= 599.391 )
								if( Swing_Low <= 632.05 )
									ret := -0.642857
								if( Swing_Low > 632.05 )
									ret := 0.333333
							if( Discount_Zone > 599.391 )
								ret := -1.000000 // sell
						if( Equilibrium_Zone > 675.686 )
							if( Swing_Low <= 660.719 )
								if( Order_Block_High <= 323.05 )
									ret := 0.000000
								if( Order_Block_High > 323.05 )
									ret := 1.000000 // buy
							if( Swing_Low > 660.719 )
								if( Discount_Zone <= 641.022 )
									ret := -0.777778 // sell
								if( Discount_Zone > 641.022 )
									ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Smart_Money_Concepts 
//@version=5
//indicator "Smart Money Concepts - Pine Script Version", overlay=true)

// Constants
SWING_LENGTH = 50
INTERNAL_SWING_LENGTH = 5
ATR_PERIOD = 200

// ATR Calculation
atr = ta.sma(ta.tr, ATR_PERIOD)

// Swings Detection
var float Swing_High = na
var float Swing_Low = na
Swing_High := ta.highest(high, SWING_LENGTH) == high ? high : na
Swing_Low := ta.lowest(low, SWING_LENGTH) == low ? low : na

var float Internal_Swing_High = na
var float Internal_Swing_Low = na
Internal_Swing_High := ta.highest(high, INTERNAL_SWING_LENGTH) == high ? high : na
Internal_Swing_Low := ta.lowest(low, INTERNAL_SWING_LENGTH) == low ? low : na

// Market Structure Detection
Bullish_BOS = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and not na(Swing_High[1])
Bearish_BOS = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and not na(Swing_Low[1])

Bullish_CHoCH = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and (close[1] < ta.valuewhen(Swing_Low, Swing_Low, 1))
Bearish_CHoCH = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and (close[1] > ta.valuewhen(Swing_High, Swing_High, 1))

Bullish_BOSInt = Bullish_BOS ? 1 : 0
Bearish_BOSInt = Bearish_BOS ? 1 : 0
Bullish_CHoCHInt = Bullish_CHoCH ? 1 : 0
Bearish_CHoCHInt = Bearish_CHoCH ? 1 : 0

// Order Blocks Detection
var float Order_Block_High = na
var float Order_Block_Low = na

threshold = atr
if Bullish_BOS
    Order_Block_High := high
    Order_Block_Low := low
if Bearish_BOS
    Order_Block_High := high
    Order_Block_Low := low

if math.abs(Order_Block_High - Order_Block_Low) > threshold
    Order_Block_High := na
    Order_Block_Low := na

// Fair Value Gaps (FVG) Detection
delta_per = (close - open) / open * 100
FVG_Up = (low > high[2]) and (close > high[2]) and (delta_per > atr)
FVG_Down = (high < low[2]) and (close < low[2]) and (-delta_per > atr)

FVG_UpInt = FVG_Up ? 1 : 0
FVG_DownInt = FVG_Down ? 1 : 0

// Premium/Discount Zones Calculation
avg_price = (ta.valuewhen(Swing_High, Swing_High, 0) + ta.valuewhen(Swing_Low, Swing_Low, 0)) / 2
var float Premium_Zone = avg_price + atr
var float Discount_Zone = avg_price - atr
var float Equilibrium_Zone = avg_price

// Plotting
plot(close, title="Close", color=color.black)

plotshape(series=Swing_High, location=location.abovebar, color=color.green, style=shape.triangledown, title="Swing High")
plotshape(series=Swing_Low, location=location.belowbar, color=color.red, style=shape.triangleup, title="Swing Low")

plotshape(series=Bullish_BOS, location=location.belowbar, color=color.blue, style=shape.circle, title="Bullish BOS")
plotshape(series=Bearish_BOS, location=location.abovebar, color=color.orange, style=shape.circle, title="Bearish BOS")
plotshape(series=Bullish_CHoCH, location=location.belowbar, color=color.aqua, style=shape.square, title="Bullish CHoCH")
plotshape(series=Bearish_CHoCH, location=location.abovebar, color=color.purple, style=shape.square, title="Bearish CHoCH")

plot(Order_Block_High, title="Order Block High", color=color.yellow, style=plot.style_linebr)
plot(Order_Block_Low, title="Order Block Low", color=color.yellow, style=plot.style_linebr)

bgcolor(FVG_Up ? color.new(color.green, 80) : na, title="Bullish FVG")
bgcolor(FVG_Down ? color.new(color.red, 80) : na, title="Bearish FVG")

plot(Premium_Zone, "Premium Zone", color=color.red)
plot(Discount_Zone, "Discount Zone", color=color.green)
plot(Equilibrium_Zone, "Equilibrium Zone", color=color.gray)

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
float op_operation = decision_tree_0_BNBUSDT_30Min_f4519d82(Bullish_CHoCHInt, Bearish_CHoCHInt, Order_Block_Low, FVG_UpInt, FVG_DownInt, atr, Premium_Zone, Discount_Zone, Swing_High, Internal_Swing_High, Equilibrium_Zone, Swing_Low, Order_Block_High, Bearish_BOSInt, Internal_Swing_Low, Bullish_BOSInt)

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


