//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: XRPUSDT_30Min_1FIB_7a0aff71 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_1FIB_7a0aff71", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_7a0aff71(basis_minus, lower_4, lower_6, upper_1, upper_3, lower_2, basis, upper_4, upper_5, lower_1, upper_6, lower_3, basis_max, lower_5, upper_2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( upper_6 <= 0.614155 )
		if( basis <= 0.237493 )
			if( basis_max <= -0.016379 )
				if( lower_4 <= 0.163753 )
					if( upper_6 <= 0.349119 )
						if( lower_3 <= 0.175834 )
							ret := 0.875000 // buy
						if( lower_3 > 0.175834 )
							if( upper_4 <= 0.304364 )
								ret := 1.000000 // buy
							if( upper_4 > 0.304364 )
								ret := 0.900000 // buy
					if( upper_6 > 0.349119 )
						ret := 0.777778 // buy
				if( lower_4 > 0.163753 )
					if( lower_4 <= 0.164297 )
						if( lower_1 <= 0.206583 )
							ret := -0.444444
						if( lower_1 > 0.206583 )
							ret := -1.000000 // sell
					if( lower_4 > 0.164297 )
						if( upper_4 <= 0.242359 )
							if( upper_1 <= 0.232836 )
								if( lower_4 <= 0.207577 )
									ret := 0.073684
								if( lower_4 > 0.207577 )
									ret := 0.770000 // buy
							if( upper_1 > 0.232836 )
								if( basis_minus <= 0.017765 )
									ret := -0.772727 // sell
								if( basis_minus > 0.017765 )
									ret := 0.095238
						if( upper_4 > 0.242359 )
							if( lower_3 <= 0.178266 )
								if( basis_max <= -0.109133 )
									ret := 0.333333
								if( basis_max > -0.109133 )
									ret := 0.769231 // buy
							if( lower_3 > 0.178266 )
								if( lower_4 <= 0.214243 )
									ret := -0.408451
								if( lower_4 > 0.214243 )
									ret := 0.150725
			if( basis_max > -0.016379 )
				if( lower_4 <= 0.228791 )
					if( upper_1 <= 0.233372 )
						if( basis_minus <= 0.013913 )
							ret := 0.916667 // buy
						if( basis_minus > 0.013913 )
							ret := 1.000000 // buy
					if( upper_1 > 0.233372 )
						if( lower_4 <= 0.222264 )
							ret := -0.333333
						if( lower_4 > 0.222264 )
							if( lower_3 <= 0.227558 )
								if( basis <= 0.230878 )
									ret := 0.444444
								if( basis > 0.230878 )
									ret := 0.666667
							if( lower_3 > 0.227558 )
								if( upper_6 <= 0.248192 )
									ret := 0.851852 // buy
								if( upper_6 > 0.248192 )
									ret := 0.972973 // buy
				if( lower_4 > 0.228791 )
					if( upper_5 <= 0.243865 )
						if( lower_1 <= 0.235103 )
							if( upper_6 <= 0.245683 )
								ret := 0.000000
							if( upper_6 > 0.245683 )
								ret := 1.000000 // buy
						if( lower_1 > 0.235103 )
							if( upper_5 <= 0.243605 )
								if( basis_minus <= 0.008107 )
									ret := 1.000000 // buy
								if( basis_minus > 0.008107 )
									ret := 0.750000 // buy
							if( upper_5 > 0.243605 )
								ret := 1.000000 // buy
					if( upper_5 > 0.243865 )
						if( basis <= 0.236653 )
							if( upper_6 <= 0.248675 )
								ret := 0.214286
							if( upper_6 > 0.248675 )
								ret := 0.400000
						if( basis > 0.236653 )
							if( basis <= 0.23718 )
								ret := -0.315789
							if( basis > 0.23718 )
								if( basis <= 0.237355 )
									ret := 0.187500
								if( basis > 0.237355 )
									ret := -0.181818
		if( basis > 0.237493 )
			if( basis_max <= -0.02808 )
				if( basis_minus <= 0.043229 )
					if( basis_minus <= 0.031457 )
						if( upper_1 <= 0.323169 )
							if( lower_1 <= 0.285199 )
								if( lower_4 <= 0.271381 )
									ret := -0.295082
								if( lower_4 > 0.271381 )
									ret := 0.228188
							if( lower_1 > 0.285199 )
								if( upper_2 <= 0.32737 )
									ret := -0.597561
								if( upper_2 > 0.32737 )
									ret := -0.937500 // sell
						if( upper_1 > 0.323169 )
							if( upper_3 <= 0.422433 )
								if( basis <= 0.402426 )
									ret := 0.136997
								if( basis > 0.402426 )
									ret := 0.782051 // buy
							if( upper_3 > 0.422433 )
								if( upper_1 <= 0.474215 )
									ret := -0.347607
								if( upper_1 > 0.474215 )
									ret := 0.129803
					if( basis_minus > 0.031457 )
						if( upper_4 <= 0.386865 )
							if( lower_6 <= 0.330899 )
								if( lower_3 <= 0.257241 )
									ret := 0.909091 // buy
								if( lower_3 > 0.257241 )
									ret := 0.262609
							if( lower_6 > 0.330899 )
								if( upper_5 <= 0.39118 )
									ret := 1.000000 // buy
								if( upper_5 > 0.39118 )
									ret := 0.727273 // buy
						if( upper_4 > 0.386865 )
							if( lower_6 <= 0.3272 )
								if( upper_6 <= 0.408154 )
									ret := -0.967213 // sell
								if( upper_6 > 0.408154 )
									ret := 0.111111
							if( lower_6 > 0.3272 )
								if( upper_5 <= 0.426659 )
									ret := -0.027317
								if( upper_5 > 0.426659 )
									ret := 0.141867
				if( basis_minus > 0.043229 )
					if( lower_5 <= 0.374452 )
						if( upper_5 <= 0.33905 )
							if( lower_4 <= 0.172264 )
								if( lower_6 <= 0.12265 )
									ret := 0.640000
								if( lower_6 > 0.12265 )
									ret := -1.000000 // sell
							if( lower_4 > 0.172264 )
								if( lower_3 <= 0.217321 )
									ret := 0.542169
								if( lower_3 > 0.217321 )
									ret := 1.000000 // buy
						if( upper_5 > 0.33905 )
							if( upper_4 <= 0.369422 )
								if( basis_max <= -0.064699 )
									ret := -0.460884
								if( basis_max > -0.064699 )
									ret := -0.101721
							if( upper_4 > 0.369422 )
								if( basis_minus <= 0.045375 )
									ret := -0.600629
								if( basis_minus > 0.045375 )
									ret := 0.010813
					if( lower_5 > 0.374452 )
						if( basis <= 0.427545 )
							if( lower_1 <= 0.415403 )
								if( upper_2 <= 0.440744 )
									ret := 0.750000 // buy
								if( upper_2 > 0.440744 )
									ret := 0.942857 // buy
							if( lower_1 > 0.415403 )
								ret := 0.625000
						if( basis > 0.427545 )
							if( lower_6 <= 0.505724 )
								if( basis <= 0.428811 )
									ret := -1.000000 // sell
								if( basis > 0.428811 )
									ret := 0.068488
							if( lower_6 > 0.505724 )
								if( upper_3 <= 0.577253 )
									ret := 0.238095
								if( upper_3 > 0.577253 )
									ret := 0.851064 // buy
			if( basis_max > -0.02808 )
				if( lower_2 <= 0.534255 )
					if( upper_1 <= 0.543221 )
						if( basis_max <= -0.008566 )
							if( upper_4 <= 0.346878 )
								if( lower_1 <= 0.319394 )
									ret := 0.008493
								if( lower_1 > 0.319394 )
									ret := 0.443812
							if( upper_4 > 0.346878 )
								if( basis <= 0.43395 )
									ret := -0.075104
								if( basis > 0.43395 )
									ret := 0.009401
						if( basis_max > -0.008566 )
							if( upper_3 <= 0.524705 )
								if( lower_2 <= 0.239909 )
									ret := -0.396552
								if( lower_2 > 0.239909 )
									ret := -0.089971
							if( upper_3 > 0.524705 )
								if( lower_2 <= 0.520146 )
									ret := -0.769231 // sell
								if( lower_2 > 0.520146 )
									ret := -1.000000 // sell
					if( upper_1 > 0.543221 )
						if( upper_2 <= 0.550383 )
							if( upper_5 <= 0.55341 )
								ret := -0.769231 // sell
							if( upper_5 > 0.55341 )
								if( basis_max <= -0.018392 )
									ret := -1.000000 // sell
								if( basis_max > -0.018392 )
									ret := -0.818182 // sell
						if( upper_2 > 0.550383 )
							if( upper_4 <= 0.556567 )
								ret := 0.000000
							if( upper_4 > 0.556567 )
								ret := 0.647059
				if( lower_2 > 0.534255 )
					if( lower_5 <= 0.52932 )
						if( basis_minus <= 0.022208 )
							if( lower_5 <= 0.527297 )
								ret := -0.538462
							if( lower_5 > 0.527297 )
								if( upper_4 <= 0.556331 )
									ret := 0.393939
								if( upper_4 > 0.556331 )
									ret := 0.757576 // buy
						if( basis_minus > 0.022208 )
							if( basis_minus <= 0.022998 )
								ret := 1.000000 // buy
							if( basis_minus > 0.022998 )
								ret := 0.833333 // buy
					if( lower_5 > 0.52932 )
						if( upper_4 <= 0.603031 )
							if( lower_2 <= 0.545607 )
								if( lower_4 <= 0.534303 )
									ret := 0.000000
								if( lower_4 > 0.534303 )
									ret := -0.539326
							if( lower_2 > 0.545607 )
								if( basis <= 0.570031 )
									ret := 0.187448
								if( basis > 0.570031 )
									ret := -0.020025
						if( upper_4 > 0.603031 )
							if( upper_1 <= 0.59386 )
								ret := 0.000000
							if( upper_1 > 0.59386 )
								if( upper_5 <= 0.607115 )
									ret := 1.000000 // buy
								if( upper_5 > 0.607115 )
									ret := 0.344828
	if( upper_6 > 0.614155 )
		if( lower_2 <= 1.50784 )
			if( lower_4 <= 0.146273 )
				if( upper_4 <= 0.552755 )
					if( upper_5 <= 0.589492 )
						ret := 0.900000 // buy
					if( upper_5 > 0.589492 )
						ret := 1.000000 // buy
				if( upper_4 > 0.552755 )
					if( basis_max <= -0.342687 )
						ret := 1.000000 // buy
					if( basis_max > -0.342687 )
						if( lower_3 <= 0.178645 )
							ret := -1.000000 // sell
						if( lower_3 > 0.178645 )
							ret := -0.900000 // sell
			if( lower_4 > 0.146273 )
				if( upper_2 <= 0.614223 )
					if( upper_6 <= 0.740991 )
						if( lower_5 <= 0.308904 )
							if( upper_3 <= 0.593212 )
								if( lower_1 <= 0.316995 )
									ret := -0.201299
								if( lower_1 > 0.316995 )
									ret := 0.186235
							if( upper_3 > 0.593212 )
								if( basis_minus <= 0.226662 )
									ret := 0.750000 // buy
								if( basis_minus > 0.226662 )
									ret := 0.954545 // buy
						if( lower_5 > 0.308904 )
							if( upper_5 <= 0.593693 )
								if( basis_max <= -0.178563 )
									ret := 0.727273 // buy
								if( basis_max > -0.178563 )
									ret := -0.869863 // sell
							if( upper_5 > 0.593693 )
								if( lower_6 <= 0.266889 )
									ret := -0.822222 // sell
								if( lower_6 > 0.266889 )
									ret := -0.086352
					if( upper_6 > 0.740991 )
						if( basis <= 0.457842 )
							if( lower_6 <= 0.145327 )
								if( basis <= 0.454037 )
									ret := -0.857143 // sell
								if( basis > 0.454037 )
									ret := -0.257143
							if( lower_6 > 0.145327 )
								ret := 0.823529 // buy
						if( basis > 0.457842 )
							if( lower_4 <= 0.303259 )
								if( upper_2 <= 0.59046 )
									ret := -0.764706 // sell
								if( upper_2 > 0.59046 )
									ret := -1.000000 // sell
							if( lower_4 > 0.303259 )
								ret := 0.428571
				if( upper_2 > 0.614223 )
					if( lower_5 <= 0.591084 )
						if( lower_1 <= 0.781376 )
							if( upper_4 <= 0.632938 )
								if( upper_5 <= 0.639898 )
									ret := 0.167105
								if( upper_5 > 0.639898 )
									ret := 0.710526 // buy
							if( upper_4 > 0.632938 )
								if( upper_6 <= 0.680307 )
									ret := -0.105853
								if( upper_6 > 0.680307 )
									ret := 0.088711
						if( lower_1 > 0.781376 )
							if( basis_max <= -0.475719 )
								ret := -0.900000 // sell
							if( basis_max > -0.475719 )
								if( lower_1 <= 0.82828 )
									ret := 0.904110 // buy
								if( lower_1 > 0.82828 )
									ret := 0.300000
					if( lower_5 > 0.591084 )
						if( upper_5 <= 0.72365 )
							if( lower_1 <= 0.612047 )
								if( lower_3 <= 0.603508 )
									ret := -0.237778
								if( lower_3 > 0.603508 )
									ret := -0.621302
							if( lower_1 > 0.612047 )
								if( lower_1 <= 0.619033 )
									ret := 0.094280
								if( lower_1 > 0.619033 )
									ret := -0.165022
						if( upper_5 > 0.72365 )
							if( upper_3 <= 1.92458 )
								if( basis_minus <= 0.158566 )
									ret := -0.034933
								if( basis_minus > 0.158566 )
									ret := 0.057550
							if( upper_3 > 1.92458 )
								if( lower_5 <= 1.21481 )
									ret := 0.058824
								if( lower_5 > 1.21481 )
									ret := -0.921875 // sell
		if( lower_2 > 1.50784 )
			if( upper_3 <= 1.85096 )
				if( upper_1 <= 1.69292 )
					if( lower_1 <= 1.56099 )
						if( basis_minus <= 0.12123 )
							ret := 0.416667
						if( basis_minus > 0.12123 )
							if( basis <= 1.58008 )
								if( lower_5 <= 1.47386 )
									ret := -0.960000 // sell
								if( lower_5 > 1.47386 )
									ret := -1.000000 // sell
							if( basis > 1.58008 )
								if( basis_minus <= 0.135438 )
									ret := 0.500000
								if( basis_minus > 0.135438 )
									ret := -0.827586 // sell
					if( lower_1 > 1.56099 )
						if( basis <= 1.60337 )
							if( upper_3 <= 1.68258 )
								ret := 0.454545
							if( upper_3 > 1.68258 )
								ret := -0.555556
						if( basis > 1.60337 )
							if( upper_4 <= 1.70368 )
								ret := 0.187500
							if( upper_4 > 1.70368 )
								ret := 0.904762 // buy
				if( upper_1 > 1.69292 )
					if( basis <= 1.71736 )
						if( basis <= 1.68677 )
							if( upper_3 <= 1.84491 )
								ret := -0.200000
							if( upper_3 > 1.84491 )
								ret := -1.000000 // sell
						if( basis > 1.68677 )
							ret := -1.000000 // sell
					if( basis > 1.71736 )
						if( upper_1 <= 1.78014 )
							ret := 0.900000 // buy
						if( upper_1 > 1.78014 )
							ret := -1.000000 // sell
			if( upper_3 > 1.85096 )
				if( upper_4 <= 1.91008 )
					if( upper_6 <= 1.99928 )
						ret := 0.529412
					if( upper_6 > 1.99928 )
						ret := 1.000000 // buy
				if( upper_4 > 1.91008 )
					if( lower_2 <= 1.51667 )
						ret := 0.454545
					if( lower_2 > 1.51667 )
						if( lower_3 <= 1.50024 )
							ret := -0.714286 // sell
						if( lower_3 > 1.50024 )
							ret := -0.600000
	
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
float op_operation = decision_tree_0_XRPUSDT_30Min_7a0aff71(basis_minus, lower_4, lower_6, upper_1, upper_3, lower_2, basis, upper_4, upper_5, lower_1, upper_6, lower_3, basis_max, lower_5, upper_2)

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


