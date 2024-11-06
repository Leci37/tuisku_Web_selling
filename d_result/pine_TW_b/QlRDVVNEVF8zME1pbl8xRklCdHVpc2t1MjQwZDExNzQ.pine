//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: BTCUSDT_30Min_1FIB_240d1174 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_30Min_1FIB_240d1174", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_30Min_240d1174(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upper_1 <= 62116.5 )
		if( upper_1 <= 60683.6 )
			if( upper_3 <= 58944.7 )
				if( lower_4 <= 46493.4 )
					if( lower_1 <= 48143.3 )
						if( lower_4 <= 19206.1 )
							if( lower_4 <= 19099.2 )
								if( lower_5 <= 18954.9 )
									ret := 0.083637
								if( lower_5 > 18954.9 )
									ret := 0.531250
							if( lower_4 > 19099.2 )
								if( basis_max <= -1483.44 )
									ret := 0.476038
								if( basis_max > -1483.44 )
									ret := -0.025424
						if( lower_4 > 19206.1 )
							if( lower_1 <= 19799.5 )
								if( basis_max <= -938.818 )
									ret := 0.037037
								if( basis_max > -938.818 )
									ret := -0.513333
							if( lower_1 > 19799.5 )
								if( upper_5 <= 54600.7 )
									ret := 0.041513
								if( upper_5 > 54600.7 )
									ret := 0.506667
					if( lower_1 > 48143.3 )
						if( basis_max <= -8221.55 )
							if( upper_1 <= 52784.5 )
								if( lower_1 <= 48525.4 )
									ret := 0.555556
								if( lower_1 > 48525.4 )
									ret := 0.863636 // buy
							if( upper_1 > 52784.5 )
								if( lower_1 <= 50069.5 )
									ret := -0.307463
								if( lower_1 > 50069.5 )
									ret := 0.481481
						if( basis_max > -8221.55 )
							if( basis <= 49549.5 )
								if( lower_5 <= 45770 )
									ret := 0.909091 // buy
								if( lower_5 > 45770 )
									ret := -0.454545
							if( basis > 49549.5 )
								if( lower_2 <= 47125.6 )
									ret := 0.400000
								if( lower_2 > 47125.6 )
									ret := -0.744526 // sell
				if( lower_4 > 46493.4 )
					if( lower_5 <= 46015.8 )
						if( lower_5 <= 45430.9 )
							if( upper_5 <= 60203.7 )
								if( lower_4 <= 46721.5 )
									ret := 0.000000
								if( lower_4 > 46721.5 )
									ret := -1.000000 // sell
							if( upper_5 > 60203.7 )
								if( basis_minus <= 10115.1 )
									ret := 1.000000 // buy
								if( basis_minus > 10115.1 )
									ret := 0.500000
						if( lower_5 > 45430.9 )
							if( upper_5 <= 57841.9 )
								if( upper_2 <= 54570.1 )
									ret := 0.595556
								if( upper_2 > 54570.1 )
									ret := -0.650000
							if( upper_5 > 57841.9 )
								if( lower_3 <= 48435.4 )
									ret := 0.867470 // buy
								if( lower_3 > 48435.4 )
									ret := -0.250000
					if( lower_5 > 46015.8 )
						if( basis <= 57339.1 )
							if( basis <= 47853.9 )
								if( upper_6 <= 49111.9 )
									ret := -0.888889 // sell
								if( upper_6 > 49111.9 )
									ret := -0.302326
							if( basis > 47853.9 )
								if( lower_2 <= 55966.2 )
									ret := 0.128591
								if( lower_2 > 55966.2 )
									ret := -0.286232
						if( basis > 57339.1 )
							if( basis <= 57673.1 )
								if( lower_4 <= 56034.6 )
									ret := 0.500000
								if( lower_4 > 56034.6 )
									ret := 0.827160 // buy
							if( basis > 57673.1 )
								if( basis_max <= -1946.96 )
									ret := -0.142857
								if( basis_max > -1946.96 )
									ret := 0.435484
			if( upper_3 > 58944.7 )
				if( upper_2 <= 58618.9 )
					if( lower_2 <= 56388.9 )
						if( upper_1 <= 57960.9 )
							if( lower_2 <= 51706.5 )
								if( lower_6 <= 45584.6 )
									ret := 0.200000
								if( lower_6 > 45584.6 )
									ret := -0.870968 // sell
							if( lower_2 > 51706.5 )
								if( upper_1 <= 57615.9 )
									ret := 0.473684
								if( upper_1 > 57615.9 )
									ret := -0.341880
						if( upper_1 > 57960.9 )
							if( upper_6 <= 60427.2 )
								ret := -0.250000
							if( upper_6 > 60427.2 )
								if( lower_2 <= 55786.6 )
									ret := -0.964286 // sell
								if( lower_2 > 55786.6 )
									ret := -0.750000 // sell
					if( lower_2 > 56388.9 )
						ret := 0.666667
				if( upper_2 > 58618.9 )
					if( lower_6 <= 57601.2 )
						if( basis <= 59473.7 )
							if( basis <= 57590.3 )
								if( lower_3 <= 50126.6 )
									ret := -0.656250
								if( lower_3 > 50126.6 )
									ret := 0.157959
							if( basis > 57590.3 )
								if( lower_2 <= 54734.3 )
									ret := 0.524590
								if( lower_2 > 54734.3 )
									ret := -0.092822
						if( basis > 59473.7 )
							if( upper_6 <= 62505.7 )
								if( lower_1 <= 59072.8 )
									ret := 0.822581 // buy
								if( lower_1 > 59072.8 )
									ret := 0.198020
							if( upper_6 > 62505.7 )
								if( basis_max <= -2798.06 )
									ret := -0.318966
								if( basis_max > -2798.06 )
									ret := 0.018868
					if( lower_6 > 57601.2 )
						if( basis_minus <= 1224.6 )
							ret := -1.000000 // sell
						if( basis_minus > 1224.6 )
							if( upper_5 <= 59876.1 )
								ret := 0.000000
							if( upper_5 > 59876.1 )
								if( upper_4 <= 60204 )
									ret := -0.800000 // sell
								if( upper_4 > 60204 )
									ret := 0.000000
		if( upper_1 > 60683.6 )
			if( upper_6 <= 63727 )
				if( basis_minus <= 1946.43 )
					if( lower_5 <= 59913.6 )
						if( upper_3 <= 62152.5 )
							if( lower_1 <= 60822.2 )
								if( basis <= 61177.8 )
									ret := -0.444444
								if( basis > 61177.8 )
									ret := 0.050000
							if( lower_1 > 60822.2 )
								ret := -1.000000 // sell
						if( upper_3 > 62152.5 )
							if( lower_3 <= 60362.9 )
								if( basis_minus <= 1827.27 )
									ret := 1.000000 // buy
								if( basis_minus > 1827.27 )
									ret := 0.000000
							if( lower_3 > 60362.9 )
								ret := -0.166667
					if( lower_5 > 59913.6 )
						if( lower_3 <= 60649.5 )
							if( upper_5 <= 62661.8 )
								if( lower_4 <= 60275.6 )
									ret := 0.965517 // buy
								if( lower_4 > 60275.6 )
									ret := 0.692308
							if( upper_5 > 62661.8 )
								if( upper_6 <= 63326.1 )
									ret := 0.000000
								if( upper_6 > 63326.1 )
									ret := 0.500000
						if( lower_3 > 60649.5 )
							if( upper_1 <= 62098.3 )
								ret := 0.000000
							if( upper_1 > 62098.3 )
								ret := 0.500000
				if( basis_minus > 1946.43 )
					if( upper_3 <= 61423.1 )
						if( upper_5 <= 62130.4 )
							if( lower_2 <= 59030.2 )
								ret := 0.500000
							if( lower_2 > 59030.2 )
								ret := 0.800000 // buy
						if( upper_5 > 62130.4 )
							ret := -1.000000 // sell
					if( upper_3 > 61423.1 )
						if( basis <= 59849.3 )
							ret := 0.000000
						if( basis > 59849.3 )
							if( basis_max <= -3379.84 )
								if( upper_5 <= 62680.4 )
									ret := 1.000000 // buy
								if( upper_5 > 62680.4 )
									ret := 0.857143 // buy
							if( basis_max > -3379.84 )
								if( lower_2 <= 59034.5 )
									ret := -0.222222
								if( lower_2 > 59034.5 )
									ret := 0.689840
			if( upper_6 > 63727 )
				if( lower_1 <= 59666.1 )
					if( lower_6 <= 46308.7 )
						ret := -1.000000 // sell
					if( lower_6 > 46308.7 )
						if( lower_2 <= 57181.8 )
							if( upper_1 <= 61827.8 )
								if( upper_1 <= 61490.1 )
									ret := 0.326996
								if( upper_1 > 61490.1 )
									ret := 0.790476 // buy
							if( upper_1 > 61827.8 )
								if( upper_1 <= 61918 )
									ret := -1.000000 // sell
								if( upper_1 > 61918 )
									ret := -0.285714
						if( lower_2 > 57181.8 )
							if( basis_max <= -5180.21 )
								if( upper_5 <= 64942.9 )
									ret := -0.155844
								if( upper_5 > 64942.9 )
									ret := 0.274194
							if( basis_max > -5180.21 )
								if( basis_minus <= 4958.51 )
									ret := 0.203593
								if( basis_minus > 4958.51 )
									ret := 0.818182 // buy
				if( lower_1 > 59666.1 )
					if( upper_6 <= 65441.8 )
						if( upper_4 <= 62813.8 )
							if( upper_3 <= 62424.9 )
								if( upper_5 <= 63267 )
									ret := -0.829268 // sell
								if( upper_5 > 63267 )
									ret := -0.367347
							if( upper_3 > 62424.9 )
								ret := 0.800000 // buy
						if( upper_4 > 62813.8 )
							if( upper_2 <= 62638.7 )
								if( lower_3 <= 58487 )
									ret := 0.833333 // buy
								if( lower_3 > 58487 )
									ret := 0.272222
							if( upper_2 > 62638.7 )
								if( lower_1 <= 60062.3 )
									ret := 0.500000
								if( lower_1 > 60062.3 )
									ret := -0.714286 // sell
					if( upper_6 > 65441.8 )
						if( lower_3 <= 58434.1 )
							ret := 0.500000
						if( lower_3 > 58434.1 )
							if( lower_5 <= 57252 )
								if( lower_1 <= 59703.1 )
									ret := -0.888889 // sell
								if( lower_1 > 59703.1 )
									ret := -0.428571
							if( lower_5 > 57252 )
								ret := -1.000000 // sell
	if( upper_1 > 62116.5 )
		if( lower_6 <= 53707.3 )
			if( basis_max <= -7709.57 )
				if( lower_5 <= 54505.9 )
					ret := 0.250000
				if( lower_5 > 54505.9 )
					ret := 0.750000 // buy
			if( basis_max > -7709.57 )
				if( upper_1 <= 62169.8 )
					if( lower_5 <= 55258.1 )
						if( basis <= 60431.1 )
							ret := -0.750000 // sell
						if( basis > 60431.1 )
							ret := -0.200000
					if( lower_5 > 55258.1 )
						ret := -0.800000 // sell
				if( upper_1 > 62169.8 )
					if( upper_2 <= 63691.1 )
						if( lower_3 <= 56966.9 )
							if( basis_max <= -7363.33 )
								ret := -1.000000 // sell
							if( basis_max > -7363.33 )
								ret := -0.750000 // sell
						if( lower_3 > 56966.9 )
							ret := -1.000000 // sell
					if( upper_2 > 63691.1 )
						if( upper_2 <= 63723.7 )
							ret := 0.200000
						if( upper_2 > 63723.7 )
							if( lower_3 <= 57307.7 )
								ret := -1.000000 // sell
							if( lower_3 > 57307.7 )
								ret := -0.750000 // sell
		if( lower_6 > 53707.3 )
			if( basis_minus <= 2928.21 )
				if( basis_max <= -2436.48 )
					if( upper_6 <= 64421.6 )
						if( lower_3 <= 60505.4 )
							if( upper_4 <= 63364.3 )
								if( upper_5 <= 63568 )
									ret := -0.466667
								if( upper_5 > 63568 )
									ret := 0.014493
							if( upper_4 > 63364.3 )
								if( lower_6 <= 59172.1 )
									ret := -0.833333 // sell
								if( lower_6 > 59172.1 )
									ret := -0.500000
						if( lower_3 > 60505.4 )
							if( basis_minus <= 2519.36 )
								if( upper_6 <= 64258.1 )
									ret := 0.250000
								if( upper_6 > 64258.1 )
									ret := 0.000000
							if( basis_minus > 2519.36 )
								if( lower_6 <= 59284.7 )
									ret := 0.588235
								if( lower_6 > 59284.7 )
									ret := 1.000000 // buy
					if( upper_6 > 64421.6 )
						if( lower_2 <= 60778.6 )
							if( basis <= 61791.5 )
								if( lower_2 <= 60503.7 )
									ret := -0.696970
								if( lower_2 > 60503.7 )
									ret := -0.387755
							if( basis > 61791.5 )
								if( upper_6 <= 64762.2 )
									ret := -0.926829 // sell
								if( upper_6 > 64762.2 )
									ret := -0.250000
						if( lower_2 > 60778.6 )
							if( lower_2 <= 61140.1 )
								if( upper_6 <= 64568.5 )
									ret := -0.307692
								if( upper_6 > 64568.5 )
									ret := 0.258065
							if( lower_2 > 61140.1 )
								if( basis_minus <= 2806.45 )
									ret := -0.384496
								if( basis_minus > 2806.45 )
									ret := -0.090047
				if( basis_max > -2436.48 )
					if( upper_6 <= 64284.7 )
						if( lower_6 <= 59304.6 )
							if( lower_3 <= 60431.2 )
								if( lower_2 <= 60701 )
									ret := 0.125000
								if( lower_2 > 60701 )
									ret := 1.000000 // buy
							if( lower_3 > 60431.2 )
								if( upper_4 <= 63146.1 )
									ret := -0.720000 // sell
								if( upper_4 > 63146.1 )
									ret := -0.166667
						if( lower_6 > 59304.6 )
							if( lower_1 <= 61366.8 )
								if( lower_6 <= 59332.2 )
									ret := 0.750000 // buy
								if( lower_6 > 59332.2 )
									ret := 0.147541
							if( lower_1 > 61366.8 )
								if( upper_1 <= 63502.5 )
									ret := 0.783784 // buy
								if( upper_1 > 63502.5 )
									ret := 0.100000
					if( upper_6 > 64284.7 )
						if( upper_4 <= 65619.8 )
							if( basis_minus <= 2224.69 )
								if( upper_6 <= 65031.1 )
									ret := -0.094262
								if( upper_6 > 65031.1 )
									ret := -0.503497
							if( basis_minus > 2224.69 )
								if( lower_3 <= 61133.8 )
									ret := 1.000000 // buy
								if( lower_3 > 61133.8 )
									ret := 0.367347
						if( upper_4 > 65619.8 )
							if( upper_3 <= 69553.1 )
								if( lower_3 <= 65929.4 )
									ret := -0.018062
								if( lower_3 > 65929.4 )
									ret := 0.217284
							if( upper_3 > 69553.1 )
								if( lower_1 <= 69514.5 )
									ret := -0.582822
								if( lower_1 > 69514.5 )
									ret := 0.101124
			if( basis_minus > 2928.21 )
				if( upper_3 <= 73751.9 )
					if( upper_6 <= 75087 )
						if( upper_3 <= 69085.1 )
							if( upper_3 <= 68838.5 )
								if( upper_6 <= 71605.1 )
									ret := 0.044101
								if( upper_6 > 71605.1 )
									ret := -0.357143
							if( upper_3 > 68838.5 )
								if( upper_5 <= 71000.2 )
									ret := 0.575916
								if( upper_5 > 71000.2 )
									ret := -0.400000
						if( upper_3 > 69085.1 )
							if( upper_2 <= 69172.6 )
								if( upper_4 <= 69647.8 )
									ret := 0.153846
								if( upper_4 > 69647.8 )
									ret := -0.483544
							if( upper_2 > 69172.6 )
								if( basis <= 68373.8 )
									ret := 0.232719
								if( basis > 68373.8 )
									ret := -0.116331
					if( upper_6 > 75087 )
						if( upper_6 <= 75698.7 )
							if( basis_max <= -4068.08 )
								if( basis_minus <= 6707.08 )
									ret := 0.802198 // buy
								if( basis_minus > 6707.08 )
									ret := 0.428571
							if( basis_max > -4068.08 )
								if( upper_3 <= 73425.4 )
									ret := 0.105263
								if( upper_3 > 73425.4 )
									ret := -1.000000 // sell
						if( upper_6 > 75698.7 )
							if( upper_1 <= 72065.7 )
								if( basis_max <= -7438.2 )
									ret := 0.666667
								if( basis_max > -7438.2 )
									ret := -0.270588
							if( upper_1 > 72065.7 )
								if( upper_5 <= 74877 )
									ret := 0.769231 // buy
								if( upper_5 > 74877 )
									ret := 0.185185
				if( upper_3 > 73751.9 )
					if( lower_4 <= 68666.7 )
						if( basis <= 71473.4 )
							ret := -1.000000 // sell
						if( basis > 71473.4 )
							ret := -0.500000
					if( lower_4 > 68666.7 )
						if( basis <= 71577.5 )
							ret := -1.000000 // sell
						if( basis > 71577.5 )
							ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Fibonacci_Bollinger 
//@version=5
//indicator shorttitle="FBB", title="Fibonacci Bollinger Bands", overlay=true)

// Inputs
length_FiboBB = input.int(200, minval=1)
src = input(hlc3, title="Source")
mult = input.float(3.0, minval=0.001, maxval=50)

// Calculations
basis = ta.vwma(src, length_FiboBB)
dev = mult * ta.stdev(src, length_FiboBB)

// Upper Bands
upper_1 = basis + (0.236 * dev)
upper_2 = basis + (0.382 * dev)
upper_3 = basis + (0.5 * dev)
upper_4 = basis + (0.618 * dev)
upper_5 = basis + (0.764 * dev)
upper_6 = basis + (1 * dev)

// Lower Bands
lower_1 = basis - (0.236 * dev)
lower_2 = basis - (0.382 * dev)
lower_3 = basis - (0.5 * dev)
lower_4 = basis - (0.618 * dev)
lower_5 = basis - (0.764 * dev)
lower_6 = basis - (1 * dev)

basis_minus = basis -lower_6
basis_max = basis -upper_6

// Plotting
plot(basis, color=color.fuchsia, linewidth=2)
plot(upper_1, color=color.white, linewidth=1, title="0.236")
plot(upper_2, color=color.white, linewidth=1, title="0.382")
plot(upper_3, color=color.white, linewidth=1, title="0.5")
plot(upper_4, color=color.white, linewidth=1, title="0.618")
plot(upper_5, color=color.white, linewidth=1, title="0.764")
plot(upper_6, color=color.red, linewidth=2, title="1")
plot(lower_1, color=color.white, linewidth=1, title="0.236")
plot(lower_2, color=color.white, linewidth=1, title="0.382")
plot(lower_3, color=color.white, linewidth=1, title="0.5")
plot(lower_4, color=color.white, linewidth=1, title="0.618")
plot(lower_5, color=color.white, linewidth=1, title="0.764")
plot(lower_6, color=color.green, linewidth=2, title="1")

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
float op_operation = decision_tree_0_BTCUSDT_30Min_240d1174(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)

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


