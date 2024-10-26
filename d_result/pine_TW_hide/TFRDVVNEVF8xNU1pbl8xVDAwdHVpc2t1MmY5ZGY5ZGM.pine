//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: LTCUSDT_15Min_1T00_2f9df9dc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_1T00_2f9df9dc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_2f9df9dc(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -0.11874 )
		if( tema <= 101.079 )
			if( ema12 <= -0.299254 )
				if( ema2 <= 68.1406 )
					if( ema12 <= -0.460267 )
						if( ema1 <= 44.2321 )
							if( ema2 <= 43.5491 )
								if( ema2 <= 43.2269 )
									ret := 1.000000 // buy
								if( ema2 > 43.2269 )
									ret := -0.230769
							if( ema2 > 43.5491 )
								if( ema12 <= -0.55857 )
									ret := 1.000000 // buy
								if( ema12 > -0.55857 )
									ret := 0.625000
						if( ema1 > 44.2321 )
							if( ema1 <= 44.7169 )
								ret := -1.000000 // sell
							if( ema1 > 44.7169 )
								if( ema2 <= 63.8618 )
									ret := 0.217731
								if( ema2 > 63.8618 )
									ret := -0.035144
					if( ema12 > -0.460267 )
						if( ema3 <= 53.7208 )
							if( ema12 <= -0.333259 )
								if( ema1 <= 52.537 )
									ret := -0.434599
								if( ema1 > 52.537 )
									ret := -0.950000 // sell
							if( ema12 > -0.333259 )
								if( ema2 <= 50.7674 )
									ret := -0.651163
								if( ema2 > 50.7674 )
									ret := 0.265625
						if( ema3 > 53.7208 )
							if( tema <= 64.0602 )
								if( ema1 <= 53.5878 )
									ret := 0.680851
								if( ema1 > 53.5878 )
									ret := 0.118289
							if( tema > 64.0602 )
								if( ema1 <= 64.579 )
									ret := -1.000000 // sell
								if( ema1 > 64.579 )
									ret := -0.189602
				if( ema2 > 68.1406 )
					if( tema <= 98.1897 )
						if( ema2 <= 96.079 )
							if( tema <= 95.0014 )
								if( ema13 <= -0.759652 )
									ret := 0.153790
								if( ema13 > -0.759652 )
									ret := 0.287603
							if( tema > 95.0014 )
								if( ema13 <= -0.643218 )
									ret := -0.235294
								if( ema13 > -0.643218 )
									ret := -0.944444 // sell
						if( ema2 > 96.079 )
							if( tema <= 96.853 )
								if( ema12 <= -0.378362 )
									ret := 0.806358 // buy
								if( ema12 > -0.378362 )
									ret := -0.052632
							if( tema > 96.853 )
								if( ema12 <= -0.963121 )
									ret := -0.108696
								if( ema12 > -0.963121 )
									ret := 0.440909
					if( tema > 98.1897 )
						if( ema1 <= 98.9349 )
							if( ema12 <= -0.710893 )
								ret := -1.000000 // sell
							if( ema12 > -0.710893 )
								ret := -0.333333
						if( ema1 > 98.9349 )
							if( ema3 <= 99.8047 )
								if( ema3 <= 99.7209 )
									ret := 0.916667 // buy
								if( ema3 > 99.7209 )
									ret := 1.000000 // buy
							if( ema3 > 99.8047 )
								if( ema2 <= 102.218 )
									ret := -0.007126
								if( ema2 > 102.218 )
									ret := -0.687500
			if( ema12 > -0.299254 )
				if( ema1 <= 62.1077 )
					if( ema2 <= 60.0252 )
						if( ema2 <= 53.499 )
							if( ema1 <= 45.7725 )
								if( ema2 <= 42.7047 )
									ret := 1.000000 // buy
								if( ema2 > 42.7047 )
									ret := -0.457143
							if( ema1 > 45.7725 )
								if( tema <= 49.4557 )
									ret := 0.630682
								if( tema > 49.4557 )
									ret := 0.224921
						if( ema2 > 53.499 )
							if( ema12 <= -0.121032 )
								if( ema1 <= 59.1329 )
									ret := 0.009254
								if( ema1 > 59.1329 )
									ret := -0.354610
							if( ema12 > -0.121032 )
								if( ema12 <= -0.119517 )
									ret := 0.722222 // buy
								if( ema12 > -0.119517 )
									ret := -0.133333
					if( ema2 > 60.0252 )
						if( ema3 <= 61.2142 )
							if( ema3 <= 60.805 )
								if( ema12 <= -0.123921 )
									ret := 0.814815 // buy
								if( ema12 > -0.123921 )
									ret := 0.500000
							if( ema3 > 60.805 )
								if( ema3 <= 60.8634 )
									ret := -0.205128
								if( ema3 > 60.8634 )
									ret := 0.734694 // buy
						if( ema3 > 61.2142 )
							if( ema12 <= -0.288809 )
								ret := 0.952381 // buy
							if( ema12 > -0.288809 )
								if( ema2 <= 61.4757 )
									ret := -0.127389
								if( ema2 > 61.4757 )
									ret := 0.430147
				if( ema1 > 62.1077 )
					if( ema1 <= 91.7563 )
						if( ema12 <= -0.29804 )
							if( ema1 <= 72.773 )
								if( tema <= 68.4006 )
									ret := -0.600000
								if( tema > 68.4006 )
									ret := -1.000000 // sell
							if( ema1 > 72.773 )
								if( ema13 <= -0.434318 )
									ret := -0.250000
								if( ema13 > -0.434318 )
									ret := -0.846154 // sell
						if( ema12 > -0.29804 )
							if( ema12 <= -0.153636 )
								if( ema2 <= 65.229 )
									ret := -0.113225
								if( ema2 > 65.229 )
									ret := 0.041990
							if( ema12 > -0.153636 )
								if( ema2 <= 74.8183 )
									ret := 0.198428
								if( ema2 > 74.8183 )
									ret := 0.007947
					if( ema1 > 91.7563 )
						if( ema2 <= 98.5499 )
							if( ema3 <= 96.2122 )
								if( tema <= 92.2996 )
									ret := -0.269231
								if( tema > 92.2996 )
									ret := 0.044186
							if( ema3 > 96.2122 )
								if( ema1 <= 96.0273 )
									ret := -0.768421 // sell
								if( ema1 > 96.0273 )
									ret := -0.248162
						if( ema2 > 98.5499 )
							if( tema <= 100.533 )
								if( ema1 <= 99.5595 )
									ret := 0.382857
								if( ema1 > 99.5595 )
									ret := -0.106383
							if( tema > 100.533 )
								if( ema2 <= 100.91 )
									ret := 0.090909
								if( ema2 > 100.91 )
									ret := 0.750000 // buy
		if( tema > 101.079 )
			if( ema12 <= -0.149517 )
				if( ema3 <= 105.193 )
					if( ema3 <= 102.223 )
						if( ema2 <= 101.696 )
							ret := -0.166667
						if( ema2 > 101.696 )
							if( ema13 <= -0.385656 )
								ret := 0.461538
							if( ema13 > -0.385656 )
								ret := 0.000000
					if( ema3 > 102.223 )
						if( ema3 <= 102.623 )
							if( ema13 <= -0.681504 )
								if( tema <= 101.317 )
									ret := -0.666667
								if( tema > 101.317 )
									ret := -1.000000 // sell
							if( ema13 > -0.681504 )
								ret := -1.000000 // sell
						if( ema3 > 102.623 )
							if( tema <= 102.16 )
								if( tema <= 101.568 )
									ret := -0.629630
								if( tema > 101.568 )
									ret := 0.382979
							if( tema > 102.16 )
								if( ema1 <= 102.92 )
									ret := -0.862500 // sell
								if( ema1 > 102.92 )
									ret := -0.634146
				if( ema3 > 105.193 )
					if( ema2 <= 105.042 )
						ret := 0.928571 // buy
					if( ema2 > 105.042 )
						if( ema12 <= -0.229504 )
							if( ema2 <= 105.641 )
								ret := 0.857143 // buy
							if( ema2 > 105.641 )
								if( ema13 <= -0.799845 )
									ret := -0.419162
								if( ema13 > -0.799845 )
									ret := 0.285714
						if( ema12 > -0.229504 )
							if( ema2 <= 107.209 )
								if( ema2 <= 106.913 )
									ret := -0.500000
								if( ema2 > 106.913 )
									ret := 0.333333
							if( ema2 > 107.209 )
								if( tema <= 108.985 )
									ret := -0.916667 // sell
								if( tema > 108.985 )
									ret := -0.666667
			if( ema12 > -0.149517 )
				if( ema1 <= 102.707 )
					ret := -0.666667
				if( ema1 > 102.707 )
					if( ema2 <= 105.063 )
						if( ema3 <= 103.623 )
							ret := 0.750000 // buy
						if( ema3 > 103.623 )
							ret := 1.000000 // buy
					if( ema2 > 105.063 )
						if( ema12 <= -0.135864 )
							ret := -0.500000
						if( ema12 > -0.135864 )
							ret := 0.125000
	if( ema12 > -0.11874 )
		if( ema2 <= 85.137 )
			if( tema <= 52.0329 )
				if( ema12 <= -0.11281 )
					if( ema2 <= 51.249 )
						if( ema3 <= 50.4012 )
							ret := -0.941176 // sell
						if( ema3 > 50.4012 )
							ret := -0.800000 // sell
					if( ema2 > 51.249 )
						ret := -0.076923
				if( ema12 > -0.11281 )
					if( ema2 <= 52.0491 )
						if( ema12 <= 0.089477 )
							if( ema3 <= 52.0066 )
								if( ema13 <= 0.098757 )
									ret := 0.079924
								if( ema13 > 0.098757 )
									ret := -0.174312
							if( ema3 > 52.0066 )
								if( ema3 <= 52.0233 )
									ret := -1.000000 // sell
								if( ema3 > 52.0233 )
									ret := -0.130435
						if( ema12 > 0.089477 )
							if( ema13 <= 0.272046 )
								if( ema2 <= 43.979 )
									ret := 1.000000 // buy
								if( ema2 > 43.979 )
									ret := 0.329759
							if( ema13 > 0.272046 )
								if( ema3 <= 45.9646 )
									ret := -0.289362
								if( ema3 > 45.9646 )
									ret := 0.186380
					if( ema2 > 52.0491 )
						if( ema12 <= -0.100918 )
							ret := 1.000000 // buy
						if( ema12 > -0.100918 )
							if( ema1 <= 52.1238 )
								if( ema2 <= 52.1115 )
									ret := 0.615385
								if( ema2 > 52.1115 )
									ret := 0.181818
							if( ema1 > 52.1238 )
								ret := 1.000000 // buy
			if( tema > 52.0329 )
				if( ema12 <= 0.225366 )
					if( ema13 <= 0.643245 )
						if( ema1 <= 52.1397 )
							if( ema2 <= 51.9636 )
								if( ema1 <= 52.0002 )
									ret := -0.388060
								if( ema1 > 52.0002 )
									ret := 0.492308
							if( ema2 > 51.9636 )
								if( ema2 <= 52.0817 )
									ret := -0.832000 // sell
								if( ema2 > 52.0817 )
									ret := 0.275862
						if( ema1 > 52.1397 )
							if( ema2 <= 52.1814 )
								if( ema1 <= 52.2519 )
									ret := 0.339623
								if( ema1 > 52.2519 )
									ret := 0.846154 // buy
							if( ema2 > 52.1814 )
								if( ema12 <= -0.004369 )
									ret := 0.019428
								if( ema12 > -0.004369 )
									ret := -0.019809
					if( ema13 > 0.643245 )
						if( ema12 <= 0.145363 )
							ret := -0.500000
						if( ema12 > 0.145363 )
							ret := -0.916667 // sell
				if( ema12 > 0.225366 )
					if( ema2 <= 81.3161 )
						if( tema <= 81.1753 )
							if( tema <= 56.0126 )
								if( ema1 <= 51.9448 )
									ret := -0.807692 // sell
								if( ema1 > 51.9448 )
									ret := 0.059179
							if( tema > 56.0126 )
								if( tema <= 71.5492 )
									ret := -0.161501
								if( tema > 71.5492 )
									ret := -0.043670
						if( tema > 81.1753 )
							if( ema3 <= 80.6558 )
								if( ema2 <= 80.3713 )
									ret := -0.411765
								if( ema2 > 80.3713 )
									ret := -0.673077
							if( ema3 > 80.6558 )
								if( ema13 <= 0.676111 )
									ret := -0.209790
								if( ema13 > 0.676111 )
									ret := 0.750000 // buy
					if( ema2 > 81.3161 )
						if( tema <= 86.7781 )
							if( ema3 <= 84.0661 )
								if( ema13 <= 1.65715 )
									ret := 0.001208
								if( ema13 > 1.65715 )
									ret := 0.743590 // buy
							if( ema3 > 84.0661 )
								if( ema3 <= 84.6062 )
									ret := 0.521472
								if( ema3 > 84.6062 )
									ret := 0.096774
						if( tema > 86.7781 )
							if( ema13 <= 2.85587 )
								if( ema13 <= 1.58521 )
									ret := -0.888889 // sell
								if( ema13 > 1.58521 )
									ret := -1.000000 // sell
							if( ema13 > 2.85587 )
								ret := 0.583333
		if( ema2 > 85.137 )
			if( ema1 <= 85.9645 )
				if( ema2 <= 85.8726 )
					if( ema3 <= 85.7821 )
						if( ema1 <= 85.7086 )
							if( ema2 <= 85.6102 )
								if( ema12 <= 0.223912 )
									ret := -0.302632
								if( ema12 > 0.223912 )
									ret := -0.009524
							if( ema2 > 85.6102 )
								if( tema <= 85.3638 )
									ret := -1.000000 // sell
								if( tema > 85.3638 )
									ret := 0.289855
						if( ema1 > 85.7086 )
							if( ema12 <= 0.478633 )
								if( ema1 <= 85.779 )
									ret := -0.784091 // sell
								if( ema1 > 85.779 )
									ret := -0.615854
							if( ema12 > 0.478633 )
								if( ema1 <= 85.9205 )
									ret := 0.958333 // buy
								if( ema1 > 85.9205 )
									ret := -1.000000 // sell
					if( ema3 > 85.7821 )
						if( ema3 <= 85.8942 )
							if( tema <= 85.6742 )
								ret := 0.095238
							if( tema > 85.6742 )
								if( ema2 <= 85.7762 )
									ret := 1.000000 // buy
								if( ema2 > 85.7762 )
									ret := 0.595745
						if( ema3 > 85.8942 )
							ret := -0.333333
				if( ema2 > 85.8726 )
					if( ema13 <= -0.00415 )
						if( ema2 <= 85.9224 )
							ret := -0.555556
						if( ema2 > 85.9224 )
							if( tema <= 85.8472 )
								ret := -1.000000 // sell
							if( tema > 85.8472 )
								ret := -0.937500 // sell
					if( ema13 > -0.00415 )
						ret := -1.000000 // sell
			if( ema1 > 85.9645 )
				if( tema <= 107.773 )
					if( tema <= 86.122 )
						if( ema3 <= 86.1336 )
							if( ema2 <= 85.9605 )
								if( tema <= 86.0826 )
									ret := 0.700000 // buy
								if( tema > 86.0826 )
									ret := 0.800000 // buy
							if( ema2 > 85.9605 )
								if( ema13 <= 0.099106 )
									ret := 0.727273 // buy
								if( ema13 > 0.099106 )
									ret := 1.000000 // buy
						if( ema3 > 86.1336 )
							if( ema13 <= -0.218793 )
								ret := 0.400000
							if( ema13 > -0.218793 )
								if( ema2 <= 86.2081 )
									ret := -0.666667
								if( ema2 > 86.2081 )
									ret := 0.200000
					if( tema > 86.122 )
						if( ema13 <= 1.48781 )
							if( ema13 <= -0.143121 )
								if( ema12 <= -0.104746 )
									ret := -0.014388
								if( ema12 > -0.104746 )
									ret := -0.231729
							if( ema13 > -0.143121 )
								if( ema2 <= 105.407 )
									ret := -0.063252
								if( ema2 > 105.407 )
									ret := 0.318996
						if( ema13 > 1.48781 )
							if( ema1 <= 86.8821 )
								if( tema <= 87.5304 )
									ret := -0.785714 // sell
								if( tema > 87.5304 )
									ret := -1.000000 // sell
							if( ema1 > 86.8821 )
								if( tema <= 105.224 )
									ret := 0.330065
								if( tema > 105.224 )
									ret := -0.685185
				if( tema > 107.773 )
					if( ema2 <= 107.919 )
						if( ema2 <= 106.879 )
							ret := -1.000000 // sell
						if( ema2 > 106.879 )
							if( ema2 <= 106.961 )
								ret := -0.625000
							if( ema2 > 106.961 )
								if( ema12 <= 0.648308 )
									ret := -0.956522 // sell
								if( ema12 > 0.648308 )
									ret := -0.714286 // sell
					if( ema2 > 107.919 )
						if( ema3 <= 112.482 )
							if( ema3 <= 110.946 )
								if( tema <= 110.498 )
									ret := 0.409091
								if( tema > 110.498 )
									ret := -0.721649 // sell
							if( ema3 > 110.946 )
								if( ema13 <= 0.305129 )
									ret := 0.657895
								if( ema13 > 0.305129 )
									ret := -0.111111
						if( ema3 > 112.482 )
							if( ema2 <= 113.053 )
								ret := -1.000000 // sell
							if( ema2 > 113.053 )
								ret := -0.769231 // sell
	
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
float op_operation = decision_tree_0_LTCUSDT_15Min_2f9df9dc(ema12, ema3, ema13, tema, ema1, ema2)

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


