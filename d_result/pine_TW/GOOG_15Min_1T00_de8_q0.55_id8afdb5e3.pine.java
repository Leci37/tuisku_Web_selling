//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: GOOG_15Min_1T00_8afdb5e3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_15Min_1T00_8afdb5e3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_15Min_8afdb5e3(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema13 <= -6.42708 )
		if( tema <= 2561.9 )
			if( tema <= 1154.04 )
				if( tema <= 1023.34 )
					if( tema <= 154.535 )
						if( ema1 <= 120.939 )
							ret := -0.454545
						if( ema1 > 120.939 )
							if( tema <= 115.372 )
								ret := -0.818182 // sell
							if( tema > 115.372 )
								ret := -0.909091 // sell
					if( tema > 154.535 )
						if( ema1 <= 1017.11 )
							if( tema <= 1003.16 )
								if( ema1 <= 937.034 )
									ret := 0.537037
								if( ema1 > 937.034 )
									ret := 0.111111
							if( tema > 1003.16 )
								if( ema2 <= 1010.63 )
									ret := 0.500000
								if( ema2 > 1010.63 )
									ret := -0.675325
						if( ema1 > 1017.11 )
							if( tema <= 1016.86 )
								if( ema2 <= 1023.15 )
									ret := 1.000000 // buy
								if( ema2 > 1023.15 )
									ret := 0.614035
							if( tema > 1016.86 )
								if( ema1 <= 1028.62 )
									ret := 0.010870
								if( ema1 > 1028.62 )
									ret := 0.672131
				if( tema > 1023.34 )
					if( ema2 <= 1069.5 )
						if( tema <= 1036.54 )
							if( ema1 <= 1037.71 )
								if( ema1 <= 1028.49 )
									ret := -1.000000 // sell
								if( ema1 > 1028.49 )
									ret := -0.302326
							if( ema1 > 1037.71 )
								if( ema1 <= 1040.48 )
									ret := 0.740741 // buy
								if( ema1 > 1040.48 )
									ret := -0.065574
						if( tema > 1036.54 )
							if( ema2 <= 1064.23 )
								if( ema1 <= 1044.68 )
									ret := -0.507692
								if( ema1 > 1044.68 )
									ret := -0.811966 // sell
							if( ema2 > 1064.23 )
								if( ema13 <= -7.07903 )
									ret := -0.097561
								if( ema13 > -7.07903 )
									ret := -1.000000 // sell
					if( ema2 > 1069.5 )
						if( ema13 <= -18.8916 )
							if( tema <= 1132.03 )
								if( ema2 <= 1080.94 )
									ret := 1.000000 // buy
								if( ema2 > 1080.94 )
									ret := 0.590361
							if( tema > 1132.03 )
								ret := -0.944444 // sell
						if( ema13 > -18.8916 )
							if( tema <= 1052.3 )
								ret := 0.923077 // buy
							if( tema > 1052.3 )
								if( ema1 <= 1083.79 )
									ret := -0.522222
								if( ema1 > 1083.79 )
									ret := -0.196181
			if( tema > 1154.04 )
				if( ema13 <= -21.9797 )
					if( ema3 <= 2307.16 )
						if( ema3 <= 2090.03 )
							if( ema2 <= 2062.23 )
								if( ema1 <= 1705.27 )
									ret := 0.015707
								if( ema1 > 1705.27 )
									ret := 0.589744
							if( ema2 > 2062.23 )
								ret := -0.888889 // sell
						if( ema3 > 2090.03 )
							if( ema13 <= -32.8683 )
								if( ema2 <= 2201.85 )
									ret := -0.157895
								if( ema2 > 2201.85 )
									ret := 0.642857
							if( ema13 > -32.8683 )
								if( ema12 <= -13.2533 )
									ret := 0.805556 // buy
								if( ema12 > -13.2533 )
									ret := 0.493506
					if( ema3 > 2307.16 )
						if( ema2 <= 2563.78 )
							if( ema13 <= -24.8099 )
								if( ema13 <= -32.3529 )
									ret := 0.142857
								if( ema13 > -32.3529 )
									ret := -0.442308
							if( ema13 > -24.8099 )
								if( ema3 <= 2554.92 )
									ret := 0.516667
								if( ema3 > 2554.92 )
									ret := -0.187500
						if( ema2 > 2563.78 )
							if( ema12 <= -14.3007 )
								if( ema12 <= -17.8368 )
									ret := 0.777778 // buy
								if( ema12 > -17.8368 )
									ret := 0.125000
							if( ema12 > -14.3007 )
								ret := 1.000000 // buy
				if( ema13 > -21.9797 )
					if( ema3 <= 1179.09 )
						if( ema3 <= 1172.1 )
							ret := 0.210526
						if( ema3 > 1172.1 )
							if( ema2 <= 1173.31 )
								if( ema13 <= -10.5494 )
									ret := 0.461538
								if( ema13 > -10.5494 )
									ret := 0.859649 // buy
							if( ema2 > 1173.31 )
								ret := 0.333333
					if( ema3 > 1179.09 )
						if( ema2 <= 2355.2 )
							if( ema3 <= 2348.76 )
								if( ema12 <= -8.9724 )
									ret := -0.205663
								if( ema12 > -8.9724 )
									ret := 0.008371
							if( ema3 > 2348.76 )
								if( ema3 <= 2353.21 )
									ret := -0.794118 // sell
								if( ema3 > 2353.21 )
									ret := -0.448276
						if( ema2 > 2355.2 )
							if( ema3 <= 2556.81 )
								if( ema1 <= 2463.52 )
									ret := 0.157692
								if( ema1 > 2463.52 )
									ret := 0.601399
							if( ema3 > 2556.81 )
								if( ema12 <= -9.97367 )
									ret := 0.552632
								if( ema12 > -9.97367 )
									ret := -0.423729
		if( tema > 2561.9 )
			if( ema2 <= 2629.32 )
				if( ema2 <= 2598.29 )
					if( ema3 <= 2601.66 )
						if( ema2 <= 2577.12 )
							ret := 0.266667
						if( ema2 > 2577.12 )
							if( ema12 <= -9.49334 )
								ret := 0.000000
							if( ema12 > -9.49334 )
								if( ema1 <= 2579.2 )
									ret := -0.904762 // sell
								if( ema1 > 2579.2 )
									ret := -0.357143
					if( ema3 > 2601.66 )
						if( tema <= 2579.14 )
							ret := 0.000000
						if( tema > 2579.14 )
							if( ema1 <= 2589.01 )
								ret := 1.000000 // buy
							if( ema1 > 2589.01 )
								ret := 0.705882 // buy
				if( ema2 > 2598.29 )
					if( tema <= 2580.05 )
						if( ema3 <= 2608.99 )
							ret := -0.777778 // sell
						if( ema3 > 2608.99 )
							if( ema1 <= 2591.14 )
								if( ema13 <= -30.4688 )
									ret := -1.000000 // sell
								if( ema13 > -30.4688 )
									ret := -0.166667
							if( ema1 > 2591.14 )
								if( ema3 <= 2619.98 )
									ret := 0.857143 // buy
								if( ema3 > 2619.98 )
									ret := 0.625000
					if( tema > 2580.05 )
						if( ema1 <= 2603.22 )
							if( ema12 <= -5.11888 )
								if( ema13 <= -16.2435 )
									ret := -0.866667 // sell
								if( ema13 > -16.2435 )
									ret := -1.000000 // sell
							if( ema12 > -5.11888 )
								ret := -0.571429
						if( ema1 > 2603.22 )
							if( ema1 <= 2608.57 )
								ret := 0.062500
							if( ema1 > 2608.57 )
								if( ema3 <= 2621.16 )
									ret := -1.000000 // sell
								if( ema3 > 2621.16 )
									ret := -0.656000
			if( ema2 > 2629.32 )
				if( ema2 <= 2730.89 )
					if( ema1 <= 2709.26 )
						if( ema2 <= 2674.75 )
							if( ema12 <= -4.23799 )
								if( tema <= 2655.87 )
									ret := -0.012121
								if( tema > 2655.87 )
									ret := 0.846154 // buy
							if( ema12 > -4.23799 )
								if( ema13 <= -7.74042 )
									ret := -0.333333
								if( ema13 > -7.74042 )
									ret := 0.820000 // buy
						if( ema2 > 2674.75 )
							if( ema1 <= 2662.81 )
								ret := 0.900000 // buy
							if( ema1 > 2662.81 )
								if( ema3 <= 2722.5 )
									ret := -0.387681
								if( ema3 > 2722.5 )
									ret := 0.500000
					if( ema1 > 2709.26 )
						if( tema <= 2697.44 )
							ret := -0.166667
						if( tema > 2697.44 )
							if( ema12 <= -6.48828 )
								if( ema2 <= 2728.01 )
									ret := 0.948718 // buy
								if( ema2 > 2728.01 )
									ret := 0.555556
							if( ema12 > -6.48828 )
								if( ema13 <= -9.51855 )
									ret := 0.770833 // buy
								if( ema13 > -9.51855 )
									ret := 0.451613
				if( ema2 > 2730.89 )
					if( ema12 <= -18.8242 )
						if( ema2 <= 2815.64 )
							ret := -0.300000
						if( ema2 > 2815.64 )
							if( ema1 <= 2806.41 )
								ret := 1.000000 // buy
							if( ema1 > 2806.41 )
								if( tema <= 2910.53 )
									ret := 0.380952
								if( tema > 2910.53 )
									ret := 0.842105 // buy
					if( ema12 > -18.8242 )
						if( ema3 <= 2740.5 )
							if( tema <= 2721.82 )
								if( ema12 <= -5.97628 )
									ret := -1.000000 // sell
								if( ema12 > -5.97628 )
									ret := -0.833333 // sell
							if( tema > 2721.82 )
								ret := -0.461538
						if( ema3 > 2740.5 )
							if( ema12 <= -1.47827 )
								if( ema13 <= -29.4598 )
									ret := -0.615385
								if( ema13 > -29.4598 )
									ret := -0.161831
							if( ema12 > -1.47827 )
								ret := -0.866667 // sell
	if( ema13 > -6.42708 )
		if( tema <= 2965.69 )
			if( ema3 <= 88.3435 )
				if( ema13 <= 0.012994 )
					if( ema2 <= 87.3754 )
						if( ema3 <= 86.9829 )
							if( ema12 <= -0.19971 )
								if( ema1 <= 84.1823 )
									ret := 0.000000
								if( ema1 > 84.1823 )
									ret := -0.823529 // sell
							if( ema12 > -0.19971 )
								if( ema2 <= 86.7605 )
									ret := -0.181818
								if( ema2 > 86.7605 )
									ret := 0.705882 // buy
						if( ema3 > 86.9829 )
							if( ema12 <= -0.045792 )
								if( ema13 <= -0.208655 )
									ret := -0.777778 // sell
								if( ema13 > -0.208655 )
									ret := -0.214286
							if( ema12 > -0.045792 )
								if( ema2 <= 87.2227 )
									ret := -0.900000 // sell
								if( ema2 > 87.2227 )
									ret := -1.000000 // sell
					if( ema2 > 87.3754 )
						if( ema2 <= 87.7304 )
							if( tema <= 87.7277 )
								if( ema2 <= 87.5079 )
									ret := 0.647059
								if( ema2 > 87.5079 )
									ret := 0.969697 // buy
							if( tema > 87.7277 )
								ret := 0.647059
						if( ema2 > 87.7304 )
							if( ema3 <= 87.9235 )
								if( tema <= 87.7626 )
									ret := -0.875000 // sell
								if( tema > 87.7626 )
									ret := -0.411765
							if( ema3 > 87.9235 )
								if( ema12 <= -0.207817 )
									ret := 0.711538 // buy
								if( ema12 > -0.207817 )
									ret := 0.045455
				if( ema13 > 0.012994 )
					if( ema12 <= 0.218427 )
						if( ema2 <= 87.7612 )
							if( ema3 <= 84.1548 )
								ret := 0.375000
							if( ema3 > 84.1548 )
								if( tema <= 86.8127 )
									ret := 0.948276 // buy
								if( tema > 86.8127 )
									ret := 0.833333 // buy
						if( ema2 > 87.7612 )
							if( ema2 <= 87.9346 )
								if( tema <= 88.1002 )
									ret := -0.083333
								if( tema > 88.1002 )
									ret := 0.777778 // buy
							if( ema2 > 87.9346 )
								if( ema13 <= 0.11115 )
									ret := 0.166667
								if( ema13 > 0.11115 )
									ret := -0.250000
					if( ema12 > 0.218427 )
						if( ema2 <= 87.0228 )
							if( ema1 <= 87.0148 )
								ret := -0.095238
							if( ema1 > 87.0148 )
								ret := -0.733333 // sell
						if( ema2 > 87.0228 )
							if( ema13 <= 0.530392 )
								if( ema2 <= 87.488 )
									ret := 0.666667
								if( ema2 > 87.488 )
									ret := 0.050000
							if( ema13 > 0.530392 )
								if( ema12 <= 0.690773 )
									ret := 0.561404
								if( ema12 > 0.690773 )
									ret := 1.000000 // buy
			if( ema3 > 88.3435 )
				if( ema12 <= 0.023203 )
					if( ema2 <= 88.7057 )
						if( ema13 <= -0.033581 )
							if( ema1 <= 87.8395 )
								ret := 0.083333
							if( ema1 > 87.8395 )
								if( ema2 <= 88.6007 )
									ret := -0.858491 // sell
								if( ema2 > 88.6007 )
									ret := -0.309524
						if( ema13 > -0.033581 )
							if( ema1 <= 88.4324 )
								ret := 0.875000 // buy
							if( ema1 > 88.4324 )
								ret := 0.222222
					if( ema2 > 88.7057 )
						if( ema1 <= 153.792 )
							if( ema3 <= 153.549 )
								if( ema13 <= 0.075807 )
									ret := 0.015495
								if( ema13 > 0.075807 )
									ret := 0.250000
							if( ema3 > 153.549 )
								if( ema1 <= 153.193 )
									ret := -1.000000 // sell
								if( ema1 > 153.193 )
									ret := -0.516129
						if( ema1 > 153.792 )
							if( ema12 <= -0.262234 )
								if( tema <= 183.574 )
									ret := -0.103043
								if( tema > 183.574 )
									ret := 0.053174
							if( ema12 > -0.262234 )
								if( ema2 <= 173.405 )
									ret := 0.219811
								if( ema2 > 173.405 )
									ret := 0.070026
				if( ema12 > 0.023203 )
					if( ema3 <= 2895.61 )
						if( tema <= 2888.52 )
							if( ema2 <= 88.5059 )
								if( ema13 <= 0.191672 )
									ret := -1.000000 // sell
								if( ema13 > 0.191672 )
									ret := -0.833333 // sell
							if( ema2 > 88.5059 )
								if( ema2 <= 98.3847 )
									ret := 0.068355
								if( ema2 > 98.3847 )
									ret := -0.019785
						if( tema > 2888.52 )
							if( ema13 <= 23.7053 )
								if( tema <= 2898.18 )
									ret := 0.602564
								if( tema > 2898.18 )
									ret := 0.072727
							if( ema13 > 23.7053 )
								if( ema3 <= 2889.87 )
									ret := 0.958904 // buy
								if( ema3 > 2889.87 )
									ret := 0.200000
					if( ema3 > 2895.61 )
						if( ema3 <= 2942.12 )
							if( ema13 <= 0.125989 )
								ret := 0.761905 // buy
							if( ema13 > 0.125989 )
								if( ema1 <= 2940.08 )
									ret := -0.291777
								if( ema1 > 2940.08 )
									ret := -0.609023
						if( ema3 > 2942.12 )
							if( ema13 <= 0.558862 )
								ret := -0.538462
							if( ema13 > 0.558862 )
								if( ema3 <= 2946.48 )
									ret := 0.703704 // buy
								if( ema3 > 2946.48 )
									ret := 0.069767
		if( tema > 2965.69 )
			if( ema3 <= 2949.39 )
				if( ema1 <= 2961.77 )
					if( ema1 <= 2913.49 )
						ret := 1.000000 // buy
					if( ema1 > 2913.49 )
						if( ema3 <= 2936.9 )
							if( ema2 <= 2938.65 )
								ret := -0.625000
							if( ema2 > 2938.65 )
								ret := -0.888889 // sell
						if( ema3 > 2936.9 )
							ret := 0.666667
				if( ema1 > 2961.77 )
					if( ema1 <= 2971.47 )
						ret := 0.615385
					if( ema1 > 2971.47 )
						ret := 1.000000 // buy
			if( ema3 > 2949.39 )
				if( ema3 <= 2977.55 )
					if( ema3 <= 2964.61 )
						if( ema12 <= 6.31095 )
							if( ema2 <= 2958.55 )
								ret := -0.545455
							if( ema2 > 2958.55 )
								if( ema12 <= 2.57861 )
									ret := -0.769231 // sell
								if( ema12 > 2.57861 )
									ret := -0.947368 // sell
						if( ema12 > 6.31095 )
							ret := -0.461538
					if( ema3 > 2964.61 )
						if( ema13 <= 5.65388 )
							if( ema2 <= 2969.68 )
								if( tema <= 2968.73 )
									ret := -0.714286 // sell
								if( tema > 2968.73 )
									ret := 0.000000
							if( ema2 > 2969.68 )
								if( ema2 <= 2976.63 )
									ret := -0.914286 // sell
								if( ema2 > 2976.63 )
									ret := -0.346154
						if( ema13 > 5.65388 )
							if( ema13 <= 8.98169 )
								ret := 0.222222
							if( ema13 > 8.98169 )
								ret := -0.300000
				if( ema3 > 2977.55 )
					if( ema2 <= 2989.41 )
						if( ema2 <= 2984.92 )
							if( ema12 <= 0.73459 )
								if( ema13 <= -1.44568 )
									ret := 0.000000
								if( ema13 > -1.44568 )
									ret := 0.181818
							if( ema12 > 0.73459 )
								ret := -0.473684
						if( ema2 > 2984.92 )
							if( ema12 <= 2.30454 )
								if( ema13 <= -4.3523 )
									ret := 0.933333 // buy
								if( ema13 > -4.3523 )
									ret := 0.048780
							if( ema12 > 2.30454 )
								if( ema13 <= 6.21935 )
									ret := 1.000000 // buy
								if( ema13 > 6.21935 )
									ret := 0.777778 // buy
					if( ema2 > 2989.41 )
						if( ema2 <= 3024.91 )
							if( tema <= 2987.75 )
								ret := 0.250000
							if( tema > 2987.75 )
								if( ema3 <= 3015.52 )
									ret := -0.641975
								if( ema3 > 3015.52 )
									ret := 0.000000
						if( ema2 > 3024.91 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_GOOG_15Min_8afdb5e3(ema12, ema3, ema13, tema, ema1, ema2)

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


