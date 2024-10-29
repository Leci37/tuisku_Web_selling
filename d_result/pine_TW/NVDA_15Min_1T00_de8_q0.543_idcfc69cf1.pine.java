//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: NVDA_15Min_1T00_cfc69cf1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_15Min_1T00_cfc69cf1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_15Min_cfc69cf1(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema13 <= -0.714169 )
		if( tema <= 836.668 )
			if( ema12 <= -11.5841 )
				if( ema2 <= 175.916 )
					ret := 1.000000 // buy
				if( ema2 > 175.916 )
					if( ema12 <= -76.7468 )
						if( ema1 <= 450.98 )
							ret := 0.000000
						if( ema1 > 450.98 )
							ret := 0.500000
					if( ema12 > -76.7468 )
						if( tema <= 194.592 )
							ret := -1.000000 // sell
						if( tema > 194.592 )
							if( ema2 <= 794.541 )
								if( ema12 <= -27.5121 )
									ret := -1.000000 // sell
								if( ema12 > -27.5121 )
									ret := -0.750000 // sell
							if( ema2 > 794.541 )
								ret := -1.000000 // sell
			if( ema12 > -11.5841 )
				if( ema13 <= -7.19071 )
					if( ema2 <= 555.679 )
						if( ema3 <= 490.993 )
							if( ema2 <= 468.464 )
								if( ema1 <= 303.67 )
									ret := 0.159722
								if( ema1 > 303.67 )
									ret := 0.620112
							if( ema2 > 468.464 )
								if( ema2 <= 486.014 )
									ret := -0.663043
								if( ema2 > 486.014 )
									ret := 0.555556
						if( ema3 > 490.993 )
							if( tema <= 492.456 )
								if( ema12 <= -6.39029 )
									ret := 1.000000 // buy
								if( ema12 > -6.39029 )
									ret := 0.759398 // buy
							if( tema > 492.456 )
								if( ema1 <= 524.516 )
									ret := -0.326531
								if( ema1 > 524.516 )
									ret := 0.525253
					if( ema2 > 555.679 )
						if( ema1 <= 563.365 )
							if( ema13 <= -7.70777 )
								if( ema1 <= 551.577 )
									ret := -1.000000 // sell
								if( ema1 > 551.577 )
									ret := -0.863636 // sell
							if( ema13 > -7.70777 )
								ret := 0.437500
						if( ema1 > 563.365 )
							if( ema1 <= 678.335 )
								if( ema3 <= 579.601 )
									ret := -0.125000
								if( ema3 > 579.601 )
									ret := 0.789474 // buy
							if( ema1 > 678.335 )
								if( ema2 <= 821.708 )
									ret := -0.385281
								if( ema2 > 821.708 )
									ret := 0.301587
				if( ema13 > -7.19071 )
					if( ema2 <= 112.312 )
						if( tema <= 106.933 )
							if( tema <= 105.105 )
								if( ema13 <= -2.01104 )
									ret := 0.211538
								if( ema13 > -2.01104 )
									ret := -0.246575
							if( tema > 105.105 )
								if( ema2 <= 108.893 )
									ret := 0.288889
								if( ema2 > 108.893 )
									ret := -0.875000 // sell
						if( tema > 106.933 )
							if( ema13 <= -2.36944 )
								ret := 0.263158
							if( ema13 > -2.36944 )
								if( ema13 <= -1.5061 )
									ret := -0.883721 // sell
								if( ema13 > -1.5061 )
									ret := -0.526316
					if( ema2 > 112.312 )
						if( ema1 <= 112.368 )
							if( ema2 <= 113.841 )
								if( ema2 <= 112.583 )
									ret := 0.913043 // buy
								if( ema2 > 112.583 )
									ret := 0.608696
							if( ema2 > 113.841 )
								ret := -1.000000 // sell
						if( ema1 > 112.368 )
							if( ema1 <= 162.674 )
								if( tema <= 156.156 )
									ret := -0.006619
								if( tema > 156.156 )
									ret := 0.198758
							if( ema1 > 162.674 )
								if( tema <= 165.096 )
									ret := -0.326211
								if( tema > 165.096 )
									ret := -0.039825
		if( tema > 836.668 )
			if( ema12 <= -5.83159 )
				if( ema1 <= 858.023 )
					ret := 0.800000 // buy
				if( ema1 > 858.023 )
					if( ema12 <= -10.2998 )
						if( ema3 <= 932.703 )
							if( ema3 <= 919.344 )
								ret := 0.909091 // buy
							if( ema3 > 919.344 )
								ret := 1.000000 // buy
						if( ema3 > 932.703 )
							ret := -0.142857
					if( ema12 > -10.2998 )
						if( ema3 <= 918.72 )
							if( ema3 <= 891.079 )
								if( ema13 <= -11.2384 )
									ret := -0.083333
								if( ema13 > -11.2384 )
									ret := -0.812500 // sell
							if( ema3 > 891.079 )
								if( ema2 <= 899.823 )
									ret := -1.000000 // sell
								if( ema2 > 899.823 )
									ret := -0.684211
						if( ema3 > 918.72 )
							if( ema1 <= 1088.68 )
								ret := 0.705882 // buy
							if( ema1 > 1088.68 )
								if( ema12 <= -8.59358 )
									ret := -0.850746 // sell
								if( ema12 > -8.59358 )
									ret := -0.086957
			if( ema12 > -5.83159 )
				if( ema1 <= 864.947 )
					if( tema <= 857.475 )
						if( ema1 <= 848.732 )
							if( ema2 <= 848.565 )
								if( ema12 <= -3.01407 )
									ret := -0.636364
								if( ema12 > -3.01407 )
									ret := 0.465116
							if( ema2 > 848.565 )
								if( ema3 <= 850.125 )
									ret := 1.000000 // buy
								if( ema3 > 850.125 )
									ret := 0.729167 // buy
						if( ema1 > 848.732 )
							if( ema2 <= 855.982 )
								if( ema3 <= 857.011 )
									ret := -0.473684
								if( ema3 > 857.011 )
									ret := -0.916667 // sell
							if( ema2 > 855.982 )
								if( ema12 <= -5.21749 )
									ret := -0.727273 // sell
								if( ema12 > -5.21749 )
									ret := 0.457627
					if( tema > 857.475 )
						if( tema <= 863.475 )
							if( tema <= 861.875 )
								if( ema1 <= 859.979 )
									ret := 1.000000 // buy
								if( ema1 > 859.979 )
									ret := 0.680000
							if( tema > 861.875 )
								ret := 0.333333
						if( tema > 863.475 )
							ret := 1.000000 // buy
				if( ema1 > 864.947 )
					if( ema2 <= 898.315 )
						if( ema3 <= 890.332 )
							if( ema1 <= 879.468 )
								if( ema3 <= 881.119 )
									ret := 0.074074
								if( ema3 > 881.119 )
									ret := -0.565789
							if( ema1 > 879.468 )
								if( ema2 <= 886.292 )
									ret := 0.363636
								if( ema2 > 886.292 )
									ret := 0.784314 // buy
						if( ema3 > 890.332 )
							if( ema13 <= -6.57559 )
								if( ema12 <= -5.09439 )
									ret := -0.500000
								if( ema12 > -5.09439 )
									ret := 0.545455
							if( ema13 > -6.57559 )
								if( ema3 <= 897.036 )
									ret := -0.534091
								if( ema3 > 897.036 )
									ret := -0.805195 // sell
					if( ema2 > 898.315 )
						if( ema1 <= 927.607 )
							if( ema3 <= 904.026 )
								if( ema2 <= 902.74 )
									ret := 0.329193
								if( ema2 > 902.74 )
									ret := -0.703704 // sell
							if( ema3 > 904.026 )
								if( ema13 <= -2.7156 )
									ret := 0.686567
								if( ema13 > -2.7156 )
									ret := 0.293333
						if( ema1 > 927.607 )
							if( ema2 <= 1044.07 )
								if( ema12 <= -2.78132 )
									ret := 0.423077
								if( ema12 > -2.78132 )
									ret := -0.338624
							if( ema2 > 1044.07 )
								if( tema <= 1132.28 )
									ret := 0.761905 // buy
								if( tema > 1132.28 )
									ret := 0.235714
	if( ema13 > -0.714169 )
		if( ema13 <= 3.59253 )
			if( ema1 <= 106.259 )
				if( ema3 <= 86.9406 )
					if( ema3 <= 86.7639 )
						if( ema12 <= 0.253588 )
							ret := 1.000000 // buy
						if( ema12 > 0.253588 )
							ret := 0.750000 // buy
					if( ema3 > 86.7639 )
						ret := 0.769231 // buy
				if( ema3 > 86.9406 )
					if( ema1 <= 106.062 )
						if( ema13 <= -0.122224 )
							if( ema1 <= 105.571 )
								if( ema2 <= 102.608 )
									ret := -0.111786
								if( ema2 > 102.608 )
									ret := 0.226933
							if( ema1 > 105.571 )
								if( tema <= 105.358 )
									ret := -0.833333 // sell
								if( tema > 105.358 )
									ret := -0.195652
						if( ema13 > -0.122224 )
							if( ema12 <= 0.18886 )
								if( ema2 <= 91.3907 )
									ret := 0.722222 // buy
								if( ema2 > 91.3907 )
									ret := 0.202656
							if( ema12 > 0.18886 )
								if( ema3 <= 105.147 )
									ret := -0.044480
								if( ema3 > 105.147 )
									ret := 0.725806 // buy
					if( ema1 > 106.062 )
						if( ema12 <= 0.590529 )
							if( ema13 <= -0.080009 )
								if( ema3 <= 106.735 )
									ret := 0.956522 // buy
								if( ema3 > 106.735 )
									ret := 0.222222
							if( ema13 > -0.080009 )
								if( tema <= 105.937 )
									ret := -1.000000 // sell
								if( tema > 105.937 )
									ret := 0.705882 // buy
						if( ema12 > 0.590529 )
							ret := -0.750000 // sell
			if( ema1 > 106.259 )
				if( ema3 <= 106.962 )
					if( ema12 <= 0.080195 )
						if( ema2 <= 106.366 )
							ret := 0.307692
						if( ema2 > 106.366 )
							if( ema3 <= 106.887 )
								if( ema1 <= 106.399 )
									ret := -0.214286
								if( ema1 > 106.399 )
									ret := -0.854015 // sell
							if( ema3 > 106.887 )
								ret := -0.380952
					if( ema12 > 0.080195 )
						if( ema2 <= 106.226 )
							if( ema2 <= 105.73 )
								ret := -1.000000 // sell
							if( ema2 > 105.73 )
								if( ema12 <= 0.290392 )
									ret := -0.055556
								if( ema12 > 0.290392 )
									ret := -0.540984
						if( ema2 > 106.226 )
							if( ema13 <= 1.21029 )
								if( ema1 <= 106.861 )
									ret := 0.179688
								if( ema1 > 106.861 )
									ret := -0.360248
							if( ema13 > 1.21029 )
								if( tema <= 109.523 )
									ret := 0.870968 // buy
								if( tema > 109.523 )
									ret := -0.333333
				if( ema3 > 106.962 )
					if( ema1 <= 1205.16 )
						if( ema1 <= 1162.69 )
							if( ema2 <= 839.807 )
								if( ema1 <= 579.313 )
									ret := 0.001359
								if( ema1 > 579.313 )
									ret := 0.097116
							if( ema2 > 839.807 )
								if( ema12 <= 1.66465 )
									ret := -0.052661
								if( ema12 > 1.66465 )
									ret := -0.457516
						if( ema1 > 1162.69 )
							if( ema13 <= 1.67556 )
								ret := 0.636364
							if( ema13 > 1.67556 )
								if( ema2 <= 1179.08 )
									ret := 1.000000 // buy
								if( ema2 > 1179.08 )
									ret := 0.909091 // buy
					if( ema1 > 1205.16 )
						if( ema3 <= 1239 )
							if( ema2 <= 1206.68 )
								if( ema2 <= 1206.11 )
									ret := -0.888889 // sell
								if( ema2 > 1206.11 )
									ret := -1.000000 // sell
							if( ema2 > 1206.68 )
								ret := 0.533333
						if( ema3 > 1239 )
							ret := -1.000000 // sell
		if( ema13 > 3.59253 )
			if( ema2 <= 256.966 )
				if( ema3 <= 222.153 )
					if( ema12 <= 2.3169 )
						if( ema1 <= 211.787 )
							if( ema13 <= 4.15989 )
								if( ema2 <= 205.23 )
									ret := 0.625000
								if( ema2 > 205.23 )
									ret := -0.444444
							if( ema13 > 4.15989 )
								if( ema13 <= 4.53522 )
									ret := -0.825000 // sell
								if( ema13 > 4.53522 )
									ret := 0.200000
						if( ema1 > 211.787 )
							if( ema3 <= 215.49 )
								if( ema2 <= 210.779 )
									ret := 1.000000 // buy
								if( ema2 > 210.779 )
									ret := 0.906250 // buy
							if( ema3 > 215.49 )
								if( ema1 <= 222.702 )
									ret := -0.444444
								if( ema1 > 222.702 )
									ret := 0.953488 // buy
					if( ema12 > 2.3169 )
						if( ema1 <= 218.967 )
							if( ema2 <= 194.435 )
								if( ema1 <= 189.252 )
									ret := -0.110236
								if( ema1 > 189.252 )
									ret := 0.636364
							if( ema2 > 194.435 )
								if( ema13 <= 4.90402 )
									ret := -0.849206 // sell
								if( ema13 > 4.90402 )
									ret := -0.261905
						if( ema1 > 218.967 )
							if( ema2 <= 221.528 )
								if( ema12 <= 4.38464 )
									ret := 0.876404 // buy
								if( ema12 > 4.38464 )
									ret := -0.818182 // sell
							if( ema2 > 221.528 )
								if( ema1 <= 226.367 )
									ret := 0.000000
								if( ema1 > 226.367 )
									ret := -0.950000 // sell
				if( ema3 > 222.153 )
					if( ema12 <= 2.71887 )
						if( ema1 <= 230.596 )
							ret := 0.411765
						if( ema1 > 230.596 )
							if( ema2 <= 233.551 )
								if( ema3 <= 228.104 )
									ret := -0.769231 // sell
								if( ema3 > 228.104 )
									ret := -0.972973 // sell
							if( ema2 > 233.551 )
								if( ema2 <= 237.904 )
									ret := 0.333333
								if( ema2 > 237.904 )
									ret := -0.590604
					if( ema12 > 2.71887 )
						if( ema2 <= 244.711 )
							if( ema12 <= 5.35414 )
								if( ema2 <= 230.169 )
									ret := -0.416667
								if( ema2 > 230.169 )
									ret := -0.810127 // sell
							if( ema12 > 5.35414 )
								if( tema <= 249.46 )
									ret := 0.846154 // buy
								if( tema > 249.46 )
									ret := -1.000000 // sell
						if( ema2 > 244.711 )
							if( tema <= 260.452 )
								if( ema3 <= 248.18 )
									ret := 0.666667
								if( ema3 > 248.18 )
									ret := 0.150000
							if( tema > 260.452 )
								if( tema <= 261.499 )
									ret := -0.289474
								if( tema > 261.499 )
									ret := -0.800000 // sell
			if( ema2 > 256.966 )
				if( ema2 <= 477.741 )
					if( tema <= 421.542 )
						if( ema13 <= 27.1395 )
							if( ema13 <= 5.29441 )
								if( ema3 <= 298.146 )
									ret := 0.030568
								if( ema3 > 298.146 )
									ret := 0.377232
							if( ema13 > 5.29441 )
								if( ema1 <= 294.124 )
									ret := 0.434109
								if( ema1 > 294.124 )
									ret := -0.155642
						if( ema13 > 27.1395 )
							if( ema13 <= 40.6655 )
								ret := -0.555556
							if( ema13 > 40.6655 )
								ret := -1.000000 // sell
					if( tema > 421.542 )
						if( ema12 <= 4.13484 )
							if( ema2 <= 469.326 )
								if( ema1 <= 469.967 )
									ret := 0.384409
								if( ema1 > 469.967 )
									ret := -0.615385
							if( ema2 > 469.326 )
								if( tema <= 477.227 )
									ret := 0.830189 // buy
								if( tema > 477.227 )
									ret := 0.218750
						if( ema12 > 4.13484 )
							if( tema <= 431.804 )
								ret := 1.000000 // buy
							if( tema > 431.804 )
								if( ema2 <= 470.084 )
									ret := 0.214286
								if( ema2 > 470.084 )
									ret := 0.942857 // buy
				if( ema2 > 477.741 )
					if( ema2 <= 543.197 )
						if( ema2 <= 526.223 )
							if( ema12 <= 4.31063 )
								if( ema2 <= 507.358 )
									ret := -0.082500
								if( ema2 > 507.358 )
									ret := 0.280206
							if( ema12 > 4.31063 )
								if( tema <= 495.377 )
									ret := 0.357143
								if( tema > 495.377 )
									ret := -0.690265
						if( ema2 > 526.223 )
							if( ema2 <= 527.664 )
								if( ema2 <= 526.448 )
									ret := -0.500000
								if( ema2 > 526.448 )
									ret := -0.910256 // sell
							if( ema2 > 527.664 )
								if( tema <= 538.283 )
									ret := 0.012500
								if( tema > 538.283 )
									ret := -0.515556
					if( ema2 > 543.197 )
						if( ema2 <= 676.388 )
							if( ema12 <= 1.97084 )
								if( ema1 <= 630.506 )
									ret := 0.645669
								if( ema1 > 630.506 )
									ret := 0.000000
							if( ema12 > 1.97084 )
								if( ema3 <= 668.978 )
									ret := 0.270878
								if( ema3 > 668.978 )
									ret := 0.956522 // buy
						if( ema2 > 676.388 )
							if( ema2 <= 1115.35 )
								if( ema2 <= 957.67 )
									ret := 0.053204
								if( ema2 > 957.67 )
									ret := 0.551020
							if( ema2 > 1115.35 )
								if( ema2 <= 1151.98 )
									ret := -0.527397
								if( ema2 > 1151.98 )
									ret := 0.102941
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_NVDA_15Min_cfc69cf1(ema12, ema3, ema13, tema, ema1, ema2)

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


