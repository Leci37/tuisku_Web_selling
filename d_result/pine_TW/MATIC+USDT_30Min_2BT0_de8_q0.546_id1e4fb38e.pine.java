//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: MATICUSDT_30Min_2BT0_1e4fb38e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_2BT0_1e4fb38e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_1e4fb38e(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.017676 )
		if( ema12 <= -0.038488 )
			if( tema <= 2.16508 )
				if( ema3 <= 1.76171 )
					if( ema2 <= 1.69069 )
						if( bbp <= -0.101043 )
							if( ema2 <= 1.6445 )
								if( tema <= 1.32283 )
									ret := 0.573034
								if( tema > 1.32283 )
									ret := 0.081633
							if( ema2 > 1.6445 )
								if( ema1 <= 1.63726 )
									ret := 0.928571 // buy
								if( ema1 > 1.63726 )
									ret := 0.000000
						if( bbp > -0.101043 )
							ret := -0.833333 // sell
					if( ema2 > 1.69069 )
						if( ema2 <= 1.71884 )
							if( ema13 <= -0.081014 )
								ret := -0.750000 // sell
							if( ema13 > -0.081014 )
								ret := -1.000000 // sell
						if( ema2 > 1.71884 )
							ret := -0.250000
				if( ema3 > 1.76171 )
					if( bbp <= -0.158689 )
						if( bbp <= -0.16086 )
							if( ema1 <= 1.98598 )
								if( bullPower <= -0.040763 )
									ret := 0.904762 // buy
								if( bullPower > -0.040763 )
									ret := -0.100000
							if( ema1 > 1.98598 )
								if( ema2 <= 2.23288 )
									ret := -0.636364
								if( ema2 > 2.23288 )
									ret := 1.000000 // buy
						if( bbp > -0.16086 )
							ret := -0.833333 // sell
					if( bbp > -0.158689 )
						if( bbp <= -0.088675 )
							if( ema12 <= -0.041101 )
								if( ema13 <= -0.084417 )
									ret := 0.945946 // buy
								if( ema13 > -0.084417 )
									ret := 0.774194 // buy
							if( ema12 > -0.041101 )
								ret := 1.000000 // buy
						if( bbp > -0.088675 )
							ret := 0.200000
			if( tema > 2.16508 )
				if( tema <= 2.20552 )
					if( ema12 <= -0.042324 )
						ret := -1.000000 // sell
					if( ema12 > -0.042324 )
						ret := -0.500000
				if( tema > 2.20552 )
					if( bbm <= 0.0445 )
						ret := 0.000000
					if( bbm > 0.0445 )
						if( ema2 <= 2.55518 )
							ret := 0.500000
						if( ema2 > 2.55518 )
							ret := 1.000000 // buy
		if( ema12 > -0.038488 )
			if( ema2 <= 1.39913 )
				if( bullPower <= -0.03487 )
					if( tema <= 0.732759 )
						if( bearPower <= -0.069333 )
							ret := 0.000000
						if( bearPower > -0.069333 )
							ret := -1.000000 // sell
					if( tema > 0.732759 )
						if( ema13 <= -0.051737 )
							if( ema12 <= -0.035219 )
								if( bullPower <= -0.047589 )
									ret := -0.500000
								if( bullPower > -0.047589 )
									ret := 1.000000 // buy
							if( ema12 > -0.035219 )
								ret := 1.000000 // buy
						if( ema13 > -0.051737 )
							if( ema12 <= -0.031563 )
								if( bbp <= -0.125188 )
									ret := -1.000000 // sell
								if( bbp > -0.125188 )
									ret := -0.750000 // sell
							if( ema12 > -0.031563 )
								if( ema13 <= -0.041052 )
									ret := 0.250000
								if( ema13 > -0.041052 )
									ret := -0.444444
				if( bullPower > -0.03487 )
					if( ema12 <= -0.015971 )
						if( ema3 <= 1.37366 )
							if( ema2 <= 1.14086 )
								if( ema1 <= 0.969822 )
									ret := 0.433735
								if( ema1 > 0.969822 )
									ret := 0.850746 // buy
							if( ema2 > 1.14086 )
								if( ema2 <= 1.20286 )
									ret := -0.173913
								if( ema2 > 1.20286 )
									ret := 0.555556
						if( ema3 > 1.37366 )
							if( ema3 <= 1.40923 )
								ret := 1.000000 // buy
							if( ema3 > 1.40923 )
								ret := 0.750000 // buy
					if( ema12 > -0.015971 )
						if( ema1 <= 1.31974 )
							if( bbm <= 0.00625 )
								if( bbp <= -0.043362 )
									ret := 0.500000
								if( bbp > -0.043362 )
									ret := 1.000000 // buy
							if( bbm > 0.00625 )
								if( bullPower <= -0.025703 )
									ret := 0.800000 // buy
								if( bullPower > -0.025703 )
									ret := 0.051282
						if( ema1 > 1.31974 )
							if( bbm <= 0.01112 )
								ret := 0.250000
							if( bbm > 0.01112 )
								if( ema13 <= -0.018796 )
									ret := 0.636364
								if( ema13 > -0.018796 )
									ret := 1.000000 // buy
			if( ema2 > 1.39913 )
				if( tema <= 1.46113 )
					if( ema13 <= -0.033889 )
						if( ema2 <= 1.42437 )
							if( bbp <= -0.099597 )
								ret := 1.000000 // buy
							if( bbp > -0.099597 )
								if( tema <= 1.36301 )
									ret := -0.818182 // sell
								if( tema > 1.36301 )
									ret := 0.750000 // buy
						if( ema2 > 1.42437 )
							if( ema1 <= 1.45558 )
								if( ema13 <= -0.050298 )
									ret := -0.928571 // sell
								if( ema13 > -0.050298 )
									ret := -0.600000
							if( ema1 > 1.45558 )
								if( bbp <= -0.08589 )
									ret := -0.750000 // sell
								if( bbp > -0.08589 )
									ret := -1.000000 // sell
					if( ema13 > -0.033889 )
						if( bbm <= 0.021304 )
							if( ema12 <= -0.015326 )
								if( ema1 <= 1.47226 )
									ret := -0.111111
								if( ema1 > 1.47226 )
									ret := -0.833333 // sell
							if( ema12 > -0.015326 )
								if( tema <= 1.41921 )
									ret := 0.833333 // buy
								if( tema > 1.41921 )
									ret := -0.250000
						if( bbm > 0.021304 )
							if( bbm <= 0.038519 )
								if( bearPower <= -0.045024 )
									ret := 0.937500 // buy
								if( bearPower > -0.045024 )
									ret := 0.400000
							if( bbm > 0.038519 )
								ret := 0.000000
				if( tema > 1.46113 )
					if( tema <= 1.59596 )
						if( ema12 <= -0.013124 )
							if( ema1 <= 1.59397 )
								if( ema1 <= 1.54727 )
									ret := 0.639535
								if( ema1 > 1.54727 )
									ret := 0.098592
							if( ema1 > 1.59397 )
								if( bullPower <= -0.022581 )
									ret := 0.666667
								if( bullPower > -0.022581 )
									ret := 0.950000 // buy
						if( ema12 > -0.013124 )
							if( bullPower <= -0.020499 )
								ret := -0.750000 // sell
							if( bullPower > -0.020499 )
								ret := -0.200000
					if( tema > 1.59596 )
						if( tema <= 1.66459 )
							if( ema13 <= -0.037928 )
								if( bearPower <= -0.06653 )
									ret := -0.961538 // sell
								if( bearPower > -0.06653 )
									ret := -0.200000
							if( ema13 > -0.037928 )
								if( ema13 <= -0.031989 )
									ret := 1.000000 // buy
								if( ema13 > -0.031989 )
									ret := -0.296296
						if( tema > 1.66459 )
							if( bbp <= -0.068507 )
								if( ema1 <= 2.56907 )
									ret := 0.286747
								if( ema1 > 2.56907 )
									ret := -0.409091
							if( bbp > -0.068507 )
								if( ema3 <= 1.91106 )
									ret := 0.103448
								if( ema3 > 1.91106 )
									ret := -0.555556
	if( bullPower > -0.017676 )
		if( ema3 <= 0.366747 )
			if( bearPower <= -0.000768 )
				if( bullPower <= -0.006416 )
					if( bbm <= 0.005905 )
						ret := -0.200000
					if( bbm > 0.005905 )
						if( tema <= 0.334912 )
							if( bearPower <= -0.021692 )
								ret := 1.000000 // buy
							if( bearPower > -0.021692 )
								if( bearPower <= -0.020648 )
									ret := 0.500000
								if( bearPower > -0.020648 )
									ret := 0.931818 // buy
						if( tema > 0.334912 )
							ret := 0.200000
				if( bullPower > -0.006416 )
					if( ema1 <= 0.349642 )
						if( ema3 <= 0.342349 )
							if( ema2 <= 0.326782 )
								if( tema <= 0.122895 )
									ret := 0.281319
								if( tema > 0.122895 )
									ret := 0.063281
							if( ema2 > 0.326782 )
								if( ema1 <= 0.342403 )
									ret := 0.790909 // buy
								if( ema1 > 0.342403 )
									ret := -0.222222
						if( ema3 > 0.342349 )
							if( bbp <= -0.00293 )
								if( ema2 <= 0.342827 )
									ret := -0.600000
								if( ema2 > 0.342827 )
									ret := 0.239130
							if( bbp > -0.00293 )
								if( bbm <= 0.00592 )
									ret := -0.687500
								if( bbm > 0.00592 )
									ret := -0.956522 // sell
					if( ema1 > 0.349642 )
						if( ema1 <= 0.353971 )
							if( bbm <= 0.00857 )
								if( bullPower <= -0.002819 )
									ret := 0.250000
								if( bullPower > -0.002819 )
									ret := 0.869048 // buy
							if( bbm > 0.00857 )
								if( ema2 <= 0.356043 )
									ret := 0.000000
								if( ema2 > 0.356043 )
									ret := 0.777778 // buy
						if( ema1 > 0.353971 )
							if( tema <= 0.350821 )
								if( bullPower <= -0.002423 )
									ret := -1.000000 // sell
								if( bullPower > -0.002423 )
									ret := -0.750000 // sell
							if( tema > 0.350821 )
								if( bbp <= -0.005824 )
									ret := 0.790123 // buy
								if( bbp > -0.005824 )
									ret := 0.252294
			if( bearPower > -0.000768 )
				if( bbm <= 0.000128 )
					if( ema3 <= 0.01299 )
						if( tema <= 0.012398 )
							if( ema12 <= -2.5e-05 )
								if( bbp <= -0.000227 )
									ret := -0.200000
								if( bbp > -0.000227 )
									ret := -1.000000 // sell
							if( ema12 > -2.5e-05 )
								ret := 0.285714
						if( tema > 0.012398 )
							if( bbp <= -0.000179 )
								ret := -0.500000
							if( bbp > -0.000179 )
								if( ema13 <= 0.000141 )
									ret := -1.000000 // sell
								if( ema13 > 0.000141 )
									ret := -0.750000 // sell
					if( ema3 > 0.01299 )
						if( bullPower <= -6.4e-05 )
							if( ema1 <= 0.020353 )
								if( ema2 <= 0.019548 )
									ret := -0.182540
								if( ema2 > 0.019548 )
									ret := -0.658537
							if( ema1 > 0.020353 )
								if( ema3 <= 0.020735 )
									ret := 0.846154 // buy
								if( ema3 > 0.020735 )
									ret := 0.000000
						if( bullPower > -6.4e-05 )
							if( bullPower <= 9e-06 )
								if( ema2 <= 0.019688 )
									ret := 0.064838
								if( ema2 > 0.019688 )
									ret := 0.636364
							if( bullPower > 9e-06 )
								if( ema1 <= 0.019416 )
									ret := -0.046843
								if( ema1 > 0.019416 )
									ret := -0.254902
				if( bbm > 0.000128 )
					if( tema <= 0.017764 )
						if( bearPower <= 0.000219 )
							if( ema12 <= -0.000394 )
								if( ema12 <= -0.000433 )
									ret := -0.500000
								if( ema12 > -0.000433 )
									ret := -1.000000 // sell
							if( ema12 > -0.000394 )
								if( ema1 <= 0.012374 )
									ret := 0.733333 // buy
								if( ema1 > 0.012374 )
									ret := 0.241618
						if( bearPower > 0.000219 )
							if( ema1 <= 0.014815 )
								if( ema2 <= 0.013912 )
									ret := 0.000000
								if( ema2 > 0.013912 )
									ret := 0.875000 // buy
							if( ema1 > 0.014815 )
								if( ema13 <= 0.000313 )
									ret := 0.125000
								if( ema13 > 0.000313 )
									ret := -0.581818
					if( tema > 0.017764 )
						if( bullPower <= 0.028893 )
							if( ema13 <= 0.019849 )
								if( ema12 <= 4e-05 )
									ret := 0.135299
								if( ema12 > 4e-05 )
									ret := 0.045761
							if( ema13 > 0.019849 )
								if( ema3 <= 0.193923 )
									ret := 0.333333
								if( ema3 > 0.193923 )
									ret := 1.000000 // buy
						if( bullPower > 0.028893 )
							if( bearPower <= 0.003847 )
								ret := 0.166667
							if( bearPower > 0.003847 )
								if( ema2 <= 0.359673 )
									ret := -0.939394 // sell
								if( ema2 > 0.359673 )
									ret := 0.000000
		if( ema3 > 0.366747 )
			if( ema1 <= 1.61046 )
				if( bearPower <= -0.012693 )
					if( bbp <= -0.104294 )
						if( bbp <= -0.197434 )
							ret := -0.250000
						if( bbp > -0.197434 )
							if( bbp <= -0.110096 )
								ret := 1.000000 // buy
							if( bbp > -0.110096 )
								ret := 0.600000
					if( bbp > -0.104294 )
						if( bbp <= -0.013438 )
							if( ema2 <= 1.10176 )
								if( ema3 <= 1.08699 )
									ret := 0.107588
								if( ema3 > 1.08699 )
									ret := 0.536585
							if( ema2 > 1.10176 )
								if( ema3 <= 1.61485 )
									ret := 0.008835
								if( ema3 > 1.61485 )
									ret := 0.364341
						if( bbp > -0.013438 )
							if( ema2 <= 1.26927 )
								if( ema2 <= 0.894595 )
									ret := 0.363985
								if( ema2 > 0.894595 )
									ret := -0.108747
							if( ema2 > 1.26927 )
								if( tema <= 1.37698 )
									ret := 0.624204
								if( tema > 1.37698 )
									ret := 0.259681
				if( bearPower > -0.012693 )
					if( ema13 <= 0.069726 )
						if( bbp <= 0.120563 )
							if( tema <= 1.60445 )
								if( ema13 <= -0.00048 )
									ret := -0.010138
								if( ema13 > -0.00048 )
									ret := 0.036188
							if( tema > 1.60445 )
								if( ema2 <= 1.57515 )
									ret := 0.791045 // buy
								if( ema2 > 1.57515 )
									ret := 0.323077
						if( bbp > 0.120563 )
							if( ema12 <= 0.009596 )
								ret := 0.600000
							if( ema12 > 0.009596 )
								if( ema13 <= 0.057171 )
									ret := -0.822581 // sell
								if( ema13 > 0.057171 )
									ret := -0.227273
					if( ema13 > 0.069726 )
						if( ema1 <= 1.30621 )
							if( ema3 <= 1.07247 )
								if( ema2 <= 1.06491 )
									ret := 0.777778 // buy
								if( ema2 > 1.06491 )
									ret := 0.000000
							if( ema3 > 1.07247 )
								if( bbm <= 0.05433 )
									ret := 0.800000 // buy
								if( bbm > 0.05433 )
									ret := 1.000000 // buy
						if( ema1 > 1.30621 )
							if( ema13 <= 0.123278 )
								if( bbm <= 0.032218 )
									ret := -0.800000 // sell
								if( bbm > 0.032218 )
									ret := 0.673469
							if( ema13 > 0.123278 )
								if( bullPower <= 0.099249 )
									ret := 1.000000 // buy
								if( bullPower > 0.099249 )
									ret := -0.538462
			if( ema1 > 1.61046 )
				if( bullPower <= 0.071313 )
					if( bbm <= 0.091785 )
						if( ema13 <= -0.071223 )
							if( tema <= 1.84149 )
								if( bullPower <= -0.008204 )
									ret := 0.166667
								if( bullPower > -0.008204 )
									ret := -0.800000 // sell
							if( tema > 1.84149 )
								if( ema12 <= -0.038089 )
									ret := -0.500000
								if( ema12 > -0.038089 )
									ret := -1.000000 // sell
						if( ema13 > -0.071223 )
							if( bbp <= -0.084526 )
								if( ema2 <= 2.23997 )
									ret := -0.812500 // sell
								if( ema2 > 2.23997 )
									ret := 0.444444
							if( bbp > -0.084526 )
								if( ema2 <= 1.68733 )
									ret := -0.106441
								if( ema2 > 1.68733 )
									ret := 0.000170
					if( bbm > 0.091785 )
						if( ema2 <= 1.73341 )
							if( ema13 <= -0.048854 )
								if( ema3 <= 1.80042 )
									ret := 0.250000
								if( ema3 > 1.80042 )
									ret := 1.000000 // buy
							if( ema13 > -0.048854 )
								ret := 1.000000 // buy
						if( ema2 > 1.73341 )
							if( ema13 <= -0.033122 )
								if( bbp <= -0.091223 )
									ret := -0.176471
								if( bbp > -0.091223 )
									ret := -0.900000 // sell
							if( ema13 > -0.033122 )
								if( ema2 <= 1.98589 )
									ret := 0.000000
								if( ema2 > 1.98589 )
									ret := 0.580645
				if( bullPower > 0.071313 )
					if( ema3 <= 1.98645 )
						if( ema1 <= 1.69194 )
							if( ema3 <= 1.63428 )
								if( bearPower <= 0.030651 )
									ret := -0.666667
								if( bearPower > 0.030651 )
									ret := 0.384615
							if( ema3 > 1.63428 )
								if( bullPower <= 0.082836 )
									ret := 0.200000
								if( bullPower > 0.082836 )
									ret := 0.937500 // buy
						if( ema1 > 1.69194 )
							if( ema3 <= 1.70992 )
								if( ema2 <= 1.7068 )
									ret := -0.876923 // sell
								if( ema2 > 1.7068 )
									ret := -0.387097
							if( ema3 > 1.70992 )
								if( bullPower <= 0.141926 )
									ret := -0.124324
								if( bullPower > 0.141926 )
									ret := 0.468750
					if( ema3 > 1.98645 )
						if( bullPower <= 0.087323 )
							if( bullPower <= 0.083125 )
								if( ema1 <= 2.19923 )
									ret := -0.823529 // sell
								if( ema1 > 2.19923 )
									ret := -0.159420
							if( bullPower > 0.083125 )
								if( bbp <= 0.123877 )
									ret := -0.041667
								if( bbp > 0.123877 )
									ret := 0.888889 // buy
						if( bullPower > 0.087323 )
							if( bbp <= 0.374227 )
								if( bbm <= 0.057908 )
									ret := -0.400000
								if( bbm > 0.057908 )
									ret := -0.798561 // sell
							if( bbp > 0.374227 )
								if( ema3 <= 2.13106 )
									ret := 0.500000
								if( ema3 > 2.13106 )
									ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_MATICUSDT_30Min_1e4fb38e(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


