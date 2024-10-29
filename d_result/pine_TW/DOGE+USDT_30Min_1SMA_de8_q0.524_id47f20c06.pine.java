//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: DOGEUSDT_30Min_1SMA_47f20c06 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_1SMA_47f20c06", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_47f20c06(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Discount_Zone <= 0.055704 )
		if( Premium_Zone <= 0.134154 )
			if( Internal_Swing_Low <= 0.002629 )
				if( Equilibrium_Zone <= 0.067674 )
					if( Order_Block_Low <= 0.002876 )
						if( atr <= 0.001102 )
							if( Premium_Zone <= 0.005549 )
								if( Internal_Swing_High <= 3.3e-05 )
									ret := 0.088505
								if( Internal_Swing_High > 3.3e-05 )
									ret := -0.065509
							if( Premium_Zone > 0.005549 )
								if( atr <= 0.000833 )
									ret := -0.708333 // sell
								if( atr > 0.000833 )
									ret := -0.322430
						if( atr > 0.001102 )
							if( Equilibrium_Zone <= 0.008699 )
								if( Premium_Zone <= 0.009946 )
									ret := 0.195122
								if( Premium_Zone > 0.009946 )
									ret := 0.727891 // buy
							if( Equilibrium_Zone > 0.008699 )
								if( Equilibrium_Zone <= 0.010458 )
									ret := -0.121348
								if( Equilibrium_Zone > 0.010458 )
									ret := 0.109176
					if( Order_Block_Low > 0.002876 )
						if( FVG_UpInt <= 0.5 )
							if( Equilibrium_Zone <= 0.064294 )
								if( Equilibrium_Zone <= 0.059694 )
									ret := -0.750000 // sell
								if( Equilibrium_Zone > 0.059694 )
									ret := -1.000000 // sell
							if( Equilibrium_Zone > 0.064294 )
								if( Order_Block_Low <= 0.069244 )
									ret := 0.500000
								if( Order_Block_Low > 0.069244 )
									ret := 0.000000
						if( FVG_UpInt > 0.5 )
							if( Discount_Zone <= 0.043009 )
								if( Discount_Zone <= 0.005613 )
									ret := -0.043478
								if( Discount_Zone > 0.005613 )
									ret := -0.818182 // sell
							if( Discount_Zone > 0.043009 )
								if( Internal_Swing_High <= 0.06377 )
									ret := -0.142857
								if( Internal_Swing_High > 0.06377 )
									ret := 0.560000
				if( Equilibrium_Zone > 0.067674 )
					if( Equilibrium_Zone <= 0.069989 )
						if( atr <= 0.01285 )
							ret := 1.000000 // buy
						if( atr > 0.01285 )
							if( Premium_Zone <= 0.081837 )
								if( Internal_Swing_High <= 0.03451 )
									ret := -0.869565 // sell
								if( Internal_Swing_High > 0.03451 )
									ret := -1.000000 // sell
							if( Premium_Zone > 0.081837 )
								if( Equilibrium_Zone <= 0.067994 )
									ret := 0.185185
								if( Equilibrium_Zone > 0.067994 )
									ret := -0.477941
					if( Equilibrium_Zone > 0.069989 )
						if( Discount_Zone <= 0.046502 )
							if( atr <= 0.030704 )
								if( atr <= 0.027185 )
									ret := -0.958333 // sell
								if( atr > 0.027185 )
									ret := -0.857143 // sell
							if( atr > 0.030704 )
								if( atr <= 0.043045 )
									ret := -0.016949
								if( atr > 0.043045 )
									ret := -0.437500
						if( Discount_Zone > 0.046502 )
							if( Internal_Swing_High <= 0.067154 )
								if( Premium_Zone <= 0.109565 )
									ret := 0.486486
								if( Premium_Zone > 0.109565 )
									ret := -0.073529
							if( Internal_Swing_High > 0.067154 )
								if( Internal_Swing_High <= 0.072955 )
									ret := -0.727273 // sell
								if( Internal_Swing_High > 0.072955 )
									ret := 0.121495
			if( Internal_Swing_Low > 0.002629 )
				if( atr <= 0.025715 )
					if( Equilibrium_Zone <= 0.066687 )
						if( atr <= 0.015873 )
							if( atr <= 0.008215 )
								if( Equilibrium_Zone <= 0.054212 )
									ret := 0.223236
								if( Equilibrium_Zone > 0.054212 )
									ret := 0.014085
							if( atr > 0.008215 )
								if( Internal_Swing_High <= 0.06858 )
									ret := 0.399771
								if( Internal_Swing_High > 0.06858 )
									ret := -0.750000 // sell
						if( atr > 0.015873 )
							if( Internal_Swing_Low <= 0.049704 )
								if( Discount_Zone <= 0.028028 )
									ret := 0.000000
								if( Discount_Zone > 0.028028 )
									ret := 0.793103 // buy
							if( Internal_Swing_Low > 0.049704 )
								if( Equilibrium_Zone <= 0.058979 )
									ret := -0.352941
								if( Equilibrium_Zone > 0.058979 )
									ret := 0.120332
					if( Equilibrium_Zone > 0.066687 )
						if( Internal_Swing_Low <= 0.067623 )
							if( Equilibrium_Zone <= 0.067966 )
								if( Internal_Swing_Low <= 0.06295 )
									ret := 0.000000
								if( Internal_Swing_Low > 0.06295 )
									ret := -0.836735 // sell
							if( Equilibrium_Zone > 0.067966 )
								if( atr <= 0.020457 )
									ret := 0.045455
								if( atr > 0.020457 )
									ret := -1.000000 // sell
						if( Internal_Swing_Low > 0.067623 )
							if( Discount_Zone <= 0.055565 )
								if( Internal_Swing_Low <= 0.076294 )
									ret := 0.292035
								if( Internal_Swing_Low > 0.076294 )
									ret := -1.000000 // sell
							if( Discount_Zone > 0.055565 )
								ret := -1.000000 // sell
				if( atr > 0.025715 )
					if( Premium_Zone <= 0.125938 )
						if( Discount_Zone <= 0.01385 )
							if( Internal_Swing_Low <= 0.019113 )
								ret := -1.000000 // sell
							if( Internal_Swing_Low > 0.019113 )
								if( atr <= 0.074935 )
									ret := 0.152174
								if( atr > 0.074935 )
									ret := 0.666667
						if( Discount_Zone > 0.01385 )
							if( Discount_Zone <= 0.046195 )
								if( Internal_Swing_Low <= 0.07685 )
									ret := 0.683333
								if( Internal_Swing_Low > 0.07685 )
									ret := -0.045455
							if( Discount_Zone > 0.046195 )
								if( Equilibrium_Zone <= 0.089797 )
									ret := 0.954545 // buy
								if( Equilibrium_Zone > 0.089797 )
									ret := 0.000000
					if( Premium_Zone > 0.125938 )
						if( Premium_Zone <= 0.127795 )
							if( Internal_Swing_Low <= 0.087202 )
								if( Premium_Zone <= 0.12748 )
									ret := -0.744186 // sell
								if( Premium_Zone > 0.12748 )
									ret := -0.333333
							if( Internal_Swing_Low > 0.087202 )
								if( Discount_Zone <= 0.039684 )
									ret := 0.000000
								if( Discount_Zone > 0.039684 )
									ret := 1.000000 // buy
						if( Premium_Zone > 0.127795 )
							if( Premium_Zone <= 0.132882 )
								if( Premium_Zone <= 0.129331 )
									ret := 0.666667
								if( Premium_Zone > 0.129331 )
									ret := 1.000000 // buy
							if( Premium_Zone > 0.132882 )
								ret := -0.142857
		if( Premium_Zone > 0.134154 )
			if( Discount_Zone <= -0.069872 )
				if( atr <= 0.379302 )
					if( Premium_Zone <= 0.636491 )
						if( atr <= 0.372519 )
							ret := 0.000000
						if( atr > 0.372519 )
							if( atr <= 0.377018 )
								if( Internal_Swing_Low <= 0.222092 )
									ret := -1.000000 // sell
								if( Internal_Swing_Low > 0.222092 )
									ret := -0.666667
							if( atr > 0.377018 )
								ret := -1.000000 // sell
					if( Premium_Zone > 0.636491 )
						if( Premium_Zone <= 0.637347 )
							ret := 0.500000
						if( Premium_Zone > 0.637347 )
							if( Premium_Zone <= 0.638417 )
								if( Premium_Zone <= 0.637921 )
									ret := -0.666667
								if( Premium_Zone > 0.637921 )
									ret := -1.000000 // sell
							if( Premium_Zone > 0.638417 )
								if( Premium_Zone <= 0.648566 )
									ret := 0.000000
								if( Premium_Zone > 0.648566 )
									ret := -1.000000 // sell
				if( atr > 0.379302 )
					if( Premium_Zone <= 0.639306 )
						if( atr <= 0.379793 )
							if( Discount_Zone <= -0.120325 )
								ret := 0.000000
							if( Discount_Zone > -0.120325 )
								ret := 0.800000 // buy
						if( atr > 0.379793 )
							ret := 1.000000 // buy
					if( Premium_Zone > 0.639306 )
						ret := 0.130435
			if( Discount_Zone > -0.069872 )
				if( Premium_Zone <= 0.13502 )
					if( Internal_Swing_High <= 0.031513 )
						if( Internal_Swing_Low <= 0.02741 )
							if( Internal_Swing_Low <= 0.0111 )
								if( Internal_Swing_High <= 0.029079 )
									ret := 0.727273 // buy
								if( Internal_Swing_High > 0.029079 )
									ret := 0.900000 // buy
							if( Internal_Swing_Low > 0.0111 )
								if( Swing_Low <= 0.005208 )
									ret := 0.950000 // buy
								if( Swing_Low > 0.005208 )
									ret := 1.000000 // buy
						if( Internal_Swing_Low > 0.02741 )
							ret := 0.250000
					if( Internal_Swing_High > 0.031513 )
						ret := -0.200000
				if( Premium_Zone > 0.13502 )
					if( atr <= 0.077984 )
						if( Discount_Zone <= 0.053394 )
							if( Premium_Zone <= 0.138638 )
								ret := -0.625000
							if( Premium_Zone > 0.138638 )
								if( FVG_DownInt <= 0.5 )
									ret := 0.694190
								if( FVG_DownInt > 0.5 )
									ret := -0.333333
						if( Discount_Zone > 0.053394 )
							if( Premium_Zone <= 0.209361 )
								if( FVG_DownInt <= 0.5 )
									ret := 0.245902
								if( FVG_DownInt > 0.5 )
									ret := -0.538462
							if( Premium_Zone > 0.209361 )
								ret := -1.000000 // sell
					if( atr > 0.077984 )
						if( atr <= 0.227913 )
							if( Internal_Swing_High <= 0.01718 )
								if( Swing_Low <= 0.011296 )
									ret := 0.161677
								if( Swing_Low > 0.011296 )
									ret := 1.000000 // buy
							if( Internal_Swing_High > 0.01718 )
								if( atr <= 0.085167 )
									ret := -0.741379 // sell
								if( atr > 0.085167 )
									ret := 0.136364
						if( atr > 0.227913 )
							if( Internal_Swing_High <= 0.383677 )
								if( Premium_Zone <= 0.65305 )
									ret := 0.792308 // buy
								if( Premium_Zone > 0.65305 )
									ret := 0.333333
							if( Internal_Swing_High > 0.383677 )
								if( Swing_High <= 0.205 )
									ret := -1.000000 // sell
								if( Swing_High > 0.205 )
									ret := -0.200000
	if( Discount_Zone > 0.055704 )
		if( Internal_Swing_High <= 0.171746 )
			if( Order_Block_Low <= 0.16598 )
				if( atr <= 0.016682 )
					if( atr <= 0.013216 )
						if( Discount_Zone <= 0.18747 )
							if( Premium_Zone <= 0.150866 )
								if( atr <= 0.006914 )
									ret := 0.007378
								if( atr > 0.006914 )
									ret := 0.059845
							if( Premium_Zone > 0.150866 )
								if( Premium_Zone <= 0.17853 )
									ret := -0.152928
								if( Premium_Zone > 0.17853 )
									ret := 0.241830
						if( Discount_Zone > 0.18747 )
							if( atr <= 0.011808 )
								ret := 0.600000
							if( atr > 0.011808 )
								ret := 1.000000 // buy
					if( atr > 0.013216 )
						if( Discount_Zone <= 0.08507 )
							if( Equilibrium_Zone <= 0.087602 )
								if( Equilibrium_Zone <= 0.070088 )
									ret := -0.535211
								if( Equilibrium_Zone > 0.070088 )
									ret := -0.028794
							if( Equilibrium_Zone > 0.087602 )
								if( Swing_High <= 0.097719 )
									ret := 0.370588
								if( Swing_High > 0.097719 )
									ret := -0.195122
						if( Discount_Zone > 0.08507 )
							if( Discount_Zone <= 0.120459 )
								if( Discount_Zone <= 0.112634 )
									ret := -0.144380
								if( Discount_Zone > 0.112634 )
									ret := -0.310891
							if( Discount_Zone > 0.120459 )
								if( Equilibrium_Zone <= 0.141073 )
									ret := 0.169643
								if( Equilibrium_Zone > 0.141073 )
									ret := -0.082435
				if( atr > 0.016682 )
					if( atr <= 0.020455 )
						if( Internal_Swing_Low <= 0.154503 )
							if( atr <= 0.018723 )
								if( atr <= 0.017099 )
									ret := 0.280255
								if( atr > 0.017099 )
									ret := 0.076359
							if( atr > 0.018723 )
								if( Equilibrium_Zone <= 0.152766 )
									ret := 0.305818
								if( Equilibrium_Zone > 0.152766 )
									ret := 0.114823
						if( Internal_Swing_Low > 0.154503 )
							if( Internal_Swing_Low <= 0.26209 )
								if( atr <= 0.019966 )
									ret := -0.091873
								if( atr > 0.019966 )
									ret := -0.619048
							if( Internal_Swing_Low > 0.26209 )
								if( Discount_Zone <= 0.244104 )
									ret := 1.000000 // buy
								if( Discount_Zone > 0.244104 )
									ret := 0.750000 // buy
					if( atr > 0.020455 )
						if( Equilibrium_Zone <= 0.097624 )
							if( Discount_Zone <= 0.070654 )
								if( Discount_Zone <= 0.059722 )
									ret := 0.005348
								if( Discount_Zone > 0.059722 )
									ret := -0.304428
							if( Discount_Zone > 0.070654 )
								if( Internal_Swing_Low <= 0.040905 )
									ret := 0.200000
								if( Internal_Swing_Low > 0.040905 )
									ret := 0.666667
						if( Equilibrium_Zone > 0.097624 )
							if( Equilibrium_Zone <= 0.321771 )
								if( Premium_Zone <= 0.355372 )
									ret := 0.057446
								if( Premium_Zone > 0.355372 )
									ret := 0.268396
							if( Equilibrium_Zone > 0.321771 )
								if( atr <= 0.080013 )
									ret := -0.387967
								if( atr > 0.080013 )
									ret := 0.028624
			if( Order_Block_Low > 0.16598 )
				if( Order_Block_High <= 0.282701 )
					if( Equilibrium_Zone <= 0.298368 )
						if( Premium_Zone <= 0.236922 )
							if( Premium_Zone <= 0.205108 )
								if( Order_Block_Low <= 0.167683 )
									ret := 1.000000 // buy
								if( Order_Block_Low > 0.167683 )
									ret := 0.571429
							if( Premium_Zone > 0.205108 )
								if( Premium_Zone <= 0.229988 )
									ret := -0.375000
								if( Premium_Zone > 0.229988 )
									ret := 0.166667
						if( Premium_Zone > 0.236922 )
							if( Discount_Zone <= 0.221125 )
								if( Order_Block_High <= 0.23633 )
									ret := 0.644444
								if( Order_Block_High > 0.23633 )
									ret := 1.000000 // buy
							if( Discount_Zone > 0.221125 )
								if( atr <= 0.0399 )
									ret := 0.000000
								if( atr > 0.0399 )
									ret := 0.750000 // buy
					if( Equilibrium_Zone > 0.298368 )
						ret := -0.750000 // sell
				if( Order_Block_High > 0.282701 )
					if( atr <= 0.045816 )
						if( Premium_Zone <= 0.349447 )
							ret := 0.750000 // buy
						if( Premium_Zone > 0.349447 )
							ret := 0.500000
					if( atr > 0.045816 )
						ret := 1.000000 // buy
		if( Internal_Swing_High > 0.171746 )
			if( atr <= 0.014996 )
				if( Internal_Swing_High <= 0.191228 )
					if( Internal_Swing_High <= 0.175214 )
						if( Premium_Zone <= 0.17815 )
							ret := -0.500000
						if( Premium_Zone > 0.17815 )
							if( atr <= 0.01275 )
								ret := 0.000000
							if( atr > 0.01275 )
								ret := 0.142857
					if( Internal_Swing_High > 0.175214 )
						ret := -0.800000 // sell
				if( Internal_Swing_High > 0.191228 )
					if( Discount_Zone <= 0.187237 )
						if( Internal_Swing_High <= 0.202538 )
							if( Equilibrium_Zone <= 0.198808 )
								if( Equilibrium_Zone <= 0.198555 )
									ret := 0.600000
								if( Equilibrium_Zone > 0.198555 )
									ret := 0.750000 // buy
							if( Equilibrium_Zone > 0.198808 )
								ret := 1.000000 // buy
						if( Internal_Swing_High > 0.202538 )
							if( Discount_Zone <= 0.186228 )
								ret := -0.166667
							if( Discount_Zone > 0.186228 )
								if( Discount_Zone <= 0.186774 )
									ret := 0.750000 // buy
								if( Discount_Zone > 0.186774 )
									ret := 1.000000 // buy
					if( Discount_Zone > 0.187237 )
						if( Internal_Swing_High <= 0.204831 )
							ret := 0.400000
						if( Internal_Swing_High > 0.204831 )
							ret := -0.142857
			if( atr > 0.014996 )
				if( atr <= 0.214182 )
					if( Discount_Zone <= 0.125553 )
						if( Swing_High <= 0.223043 )
							if( atr <= 0.046535 )
								if( Premium_Zone <= 0.194037 )
									ret := -0.750000 // sell
								if( Premium_Zone > 0.194037 )
									ret := -1.000000 // sell
							if( atr > 0.046535 )
								if( Internal_Swing_High <= 0.276183 )
									ret := -0.342697
								if( Internal_Swing_High > 0.276183 )
									ret := -1.000000 // sell
						if( Swing_High > 0.223043 )
							if( Premium_Zone <= 0.336768 )
								if( Premium_Zone <= 0.321348 )
									ret := 0.916667 // buy
								if( Premium_Zone > 0.321348 )
									ret := 0.500000
							if( Premium_Zone > 0.336768 )
								ret := -0.714286 // sell
					if( Discount_Zone > 0.125553 )
						if( Internal_Swing_Low <= 0.219313 )
							if( Internal_Swing_High <= 0.207965 )
								if( Discount_Zone <= 0.167737 )
									ret := -0.135838
								if( Discount_Zone > 0.167737 )
									ret := 0.239669
							if( Internal_Swing_High > 0.207965 )
								if( Internal_Swing_High <= 0.23765 )
									ret := -0.302326
								if( Internal_Swing_High > 0.23765 )
									ret := -0.126453
						if( Internal_Swing_Low > 0.219313 )
							if( atr <= 0.044647 )
								ret := 0.000000
							if( atr > 0.044647 )
								if( atr <= 0.080048 )
									ret := 1.000000 // buy
								if( atr > 0.080048 )
									ret := 0.307692
				if( atr > 0.214182 )
					if( atr <= 0.314995 )
						if( Discount_Zone <= 0.293963 )
							if( FVG_UpInt <= 0.5 )
								if( Internal_Swing_High <= 0.509534 )
									ret := 0.608696
								if( Internal_Swing_High > 0.509534 )
									ret := 0.097561
							if( FVG_UpInt > 0.5 )
								if( atr <= 0.23067 )
									ret := 0.142857
								if( atr > 0.23067 )
									ret := 0.750000 // buy
						if( Discount_Zone > 0.293963 )
							if( Premium_Zone <= 0.864374 )
								ret := -1.000000 // sell
							if( Premium_Zone > 0.864374 )
								if( atr <= 0.285978 )
									ret := -0.230769
								if( atr > 0.285978 )
									ret := 0.600000
					if( atr > 0.314995 )
						if( Premium_Zone <= 0.833257 )
							ret := -0.400000
						if( Premium_Zone > 0.833257 )
							if( Internal_Swing_High <= 0.60343 )
								ret := -0.750000 // sell
							if( Internal_Swing_High > 0.60343 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_47f20c06(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


