//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ultimate_MA_MTF_V2
// ID_model: GTLB_15Min_1ULT_c0a37e6f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GTLB_15Min_1ULT_c0a37e6f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GTLB_15Min_c0a37e6f(ma_downInt, cr_upInt, avg2, cr_down2Int, cr_up2Int, cr_downInt, ma_upInt, avg)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( avg2 <= 44.578 )
		if( avg2 <= 43.1279 )
			if( cr_down2Int <= 0.5 )
				if( avg2 <= 43.0042 )
					if( cr_downInt <= 0.5 )
						if( cr_upInt <= 0.5 )
							ret := 0.079511
						if( cr_upInt > 0.5 )
							ret := 0.023585
					if( cr_downInt > 0.5 )
						if( avg2 <= 36.2851 )
							ret := 0.350000
						if( avg2 > 36.2851 )
							ret := 0.034483
				if( avg2 > 43.0042 )
					if( avg <= 45.3392 )
						if( avg <= 41.7484 )
							ret := 0.214286
						if( avg > 41.7484 )
							ret := -0.607477
					if( avg > 45.3392 )
						ret := 1.000000 // buy
			if( cr_down2Int > 0.5 )
				if( avg <= 42.9615 )
					if( avg2 <= 31.0347 )
						if( ma_upInt <= 0.5 )
							ret := 0.777778 // buy
						if( ma_upInt > 0.5 )
							ret := 0.000000
					if( avg2 > 31.0347 )
						if( avg2 <= 33.0357 )
							ret := -0.600000
						if( avg2 > 33.0357 )
							ret := 0.072072
				if( avg > 42.9615 )
					ret := -1.000000 // sell
		if( avg2 > 43.1279 )
			if( avg2 <= 43.629 )
				if( avg2 <= 43.5006 )
					if( avg <= 41.9005 )
						if( avg <= 41.3994 )
							ret := -0.153846
						if( avg > 41.3994 )
							ret := 0.974359 // buy
					if( avg > 41.9005 )
						if( avg <= 42.2866 )
							ret := -0.480000
						if( avg > 42.2866 )
							ret := 0.275261
				if( avg2 > 43.5006 )
					if( avg2 <= 43.5066 )
						ret := 1.000000 // buy
					if( avg2 > 43.5066 )
						if( avg2 <= 43.508 )
							ret := -0.500000
						if( avg2 > 43.508 )
							ret := 0.610063
			if( avg2 > 43.629 )
				if( avg <= 46.5105 )
					if( avg <= 44.7933 )
						if( avg <= 44.6163 )
							ret := 0.085543
						if( avg > 44.6163 )
							ret := -0.405797
					if( avg > 44.7933 )
						if( avg <= 45.209 )
							ret := 0.609091
						if( avg > 45.209 )
							ret := 0.156250
				if( avg > 46.5105 )
					if( avg2 <= 44.2106 )
						ret := 0.000000
					if( avg2 > 44.2106 )
						if( avg <= 46.7501 )
							ret := -0.600000
						if( avg > 46.7501 )
							ret := -1.000000 // sell
	if( avg2 > 44.578 )
		if( avg <= 44.9767 )
			if( avg2 <= 45.2145 )
				if( avg2 <= 44.6119 )
					if( avg2 <= 44.581 )
						ret := -1.000000 // sell
					if( avg2 > 44.581 )
						if( avg <= 44.677 )
							ret := 0.380952
						if( avg > 44.677 )
							ret := -0.357143
				if( avg2 > 44.6119 )
					if( cr_downInt <= 0.5 )
						if( avg <= 44.1859 )
							ret := -0.703297 // sell
						if( avg > 44.1859 )
							ret := -0.406250
					if( cr_downInt > 0.5 )
						if( avg2 <= 44.799 )
							ret := 0.333333
						if( avg2 > 44.799 )
							ret := 0.000000
			if( avg2 > 45.2145 )
				if( avg <= 43.6806 )
					if( avg <= 43.3181 )
						if( avg2 <= 45.3715 )
							ret := -0.769231 // sell
						if( avg2 > 45.3715 )
							ret := 0.034483
					if( avg > 43.3181 )
						if( avg2 <= 45.3827 )
							ret := -0.333333
						if( avg2 > 45.3827 )
							ret := -0.939394 // sell
				if( avg > 43.6806 )
					if( avg2 <= 45.7669 )
						if( avg <= 44.6651 )
							ret := 0.521739
						if( avg > 44.6651 )
							ret := -0.155172
					if( avg2 > 45.7669 )
						if( avg2 <= 45.8621 )
							ret := -0.666667
						if( avg2 > 45.8621 )
							ret := -0.186047
		if( avg > 44.9767 )
			if( avg <= 55.1122 )
				if( ma_upInt <= 0.5 )
					if( avg2 <= 45.1966 )
						if( avg2 <= 45.1535 )
							ret := 0.897059 // buy
						if( avg2 > 45.1535 )
							ret := 0.571429
					if( avg2 > 45.1966 )
						if( avg2 <= 45.4968 )
							ret := -0.418182
						if( avg2 > 45.4968 )
							ret := 0.061204
				if( ma_upInt > 0.5 )
					if( cr_upInt <= 0.5 )
						if( cr_downInt <= 0.5 )
							ret := -0.020721
						if( cr_downInt > 0.5 )
							ret := -0.016461
					if( cr_upInt > 0.5 )
						if( avg2 <= 52.9228 )
							ret := 0.189300
						if( avg2 > 52.9228 )
							ret := 0.600000
			if( avg > 55.1122 )
				if( avg2 <= 122.109 )
					if( avg2 <= 55.1856 )
						if( avg <= 55.9372 )
							ret := -0.411058
						if( avg > 55.9372 )
							ret := 0.103896
					if( avg2 > 55.1856 )
						if( ma_downInt <= 0.5 )
							ret := -0.077872
						if( ma_downInt > 0.5 )
							ret := -0.043433
				if( avg2 > 122.109 )
					if( avg2 <= 124.82 )
						if( avg2 <= 123.325 )
							ret := -0.328767
						if( avg2 > 123.325 )
							ret := -0.873016 // sell
					if( avg2 > 124.82 )
						if( avg2 <= 128.257 )
							ret := 0.027778
						if( avg2 > 128.257 )
							ret := -0.322314
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ultimate_MA_MTF_V2 
//@version=5
//indicator title="CM_Ultimate_MA_MTF_V2", shorttitle="CM_Ultimate_MA_MTF_V2", overlay=true)

// Inputs
src = close
useCurrentRes = input(true, title="Use Current Chart Resolution?")
resCustom = input.timeframe(title="Use Different Timeframe? Uncheck Box Above", defval="D")
len = input.int(20, title="Moving Average Length - LookBack Period")
factorT3 = input.float(defval=7, title="Tilson T3 Factor - *.10 - so 7 = .7 etc.", minval=0)
atype = input.int(1, minval=1, maxval=8, title="1=SMA, 2=EMA, 3=WMA, 4=HullMA, 5=VWMA, 6=RMA, 7=TEMA, 8=Tilson T3")
spc = input(false, title="Show Price Crossing 1st Mov Avg - Highlight Bar?")
cc = input(true, title="Change Color Based On Direction?")
smoothe = input.int(2, minval=1, maxval=10, title="Color Smoothing - Setting 1 = No Smoothing")
doma2 = input(false, title="Optional 2nd Moving Average")
spc2 = input(false, title="Show Price Crossing 2nd Mov Avg?")
len2 = input.int(50, title="Moving Average Length - Optional 2nd MA")
sfactorT3 = input.float(defval=7, title="Tilson T3 Factor - *.10 - so 7 = .7 etc.", minval=0)
atype2 = input.int(1, minval=1, maxval=8, title="1=SMA, 2=EMA, 3=WMA, 4=HullMA, 5=VWMA, 6=RMA, 7=TEMA, 8=Tilson T3")
cc2 = input(true, title="Change Color Based On Direction 2nd MA?")
warn = input(false, title="***You Can Turn On The Show Dots Parameter Below Without Plotting 2nd MA to See Crosses***")
warn2 = input(false, title="***If Using Cross Feature W/O Plotting 2ndMA - Make Sure 2ndMA Parameters are Set Correctly***")
sd = input(false, title="Show Dots on Cross of Both MA's")

res = useCurrentRes ? timeframe.period : resCustom

// Hull MA definition
hullma = ta.wma(2 * ta.wma(src, len / 2) - ta.wma(src, len), math.round(math.sqrt(len)))

// TEMA definition
ema1 = ta.ema(src, len)
ema2 = ta.ema(ema1, len)
ema3 = ta.ema(ema2, len)
tema = 3 * (ema1 - ema2) + ema3

// Tilson T3 definition
factor = factorT3 * 0.10
gd(src, len, factor) => ta.ema(src, len) * (1 + factor) - ta.ema(ta.ema(src, len), len) * factor
t3(src, len, factor) => gd(gd(gd(src, len, factor), len, factor), len, factor)
tilT3 = t3(src, len, factor)

avg = atype == 1 ? ta.sma(src, len) : atype == 2 ? ta.ema(src, len) : atype == 3 ? ta.wma(src, len) : atype == 4 ? hullma : atype == 5 ? ta.vwma(src, len) : atype == 6 ? ta.rma(src, len) : atype == 7 ? tema : tilT3

// 2nd MA definitions
hullma2 = ta.wma(2 * ta.wma(src, len2 / 2) - ta.wma(src, len2), math.round(math.sqrt(len2)))
sema1 = ta.ema(src, len2)
sema2 = ta.ema(sema1, len2)
sema3 = ta.ema(sema2, len2)
stema = 3 * (sema1 - sema2) + sema3
sfactor = sfactorT3 * 0.10
sgd(src, len2, sfactor) => ta.ema(src, len2) * (1 + sfactor) - ta.ema(ta.ema(src, len2), len2) * sfactor
st3(src, len2, sfactor) => sgd(sgd(gd(src, len2, sfactor), len2, sfactor), len2, sfactor)
stilT3 = st3(src, len2, sfactor)

avg2 = atype2 == 1 ? ta.sma(src, len2) : atype2 == 2 ? ta.ema(src, len2) : atype2 == 3 ? ta.wma(src, len2) : atype2 == 4 ? hullma2 : atype2 == 5 ? ta.vwma(src, len2) : atype2 == 6 ? ta.rma(src, len2) : atype2 == 7 ? stema : stilT3

out1 = request.security(syminfo.tickerid, res, avg)
out2 = request.security(syminfo.tickerid, res, avg2)

// Formula for Price Crossing Moving Average #1
cr_up = open < out1 and close > out1
cr_down = open > out1 and close < out1

// Formula for Price Crossing Moving Average #2
cr_up2 = open < out2 and close > out2
cr_down2 = open > out2 and close < out2

// Barcolor Criteria for Price Crossing Moving Average #1
iscrossUp() => cr_up
iscrossDown() => cr_down

// Barcolor Criteria for Price Crossing Moving Average #2
iscrossUp2() => cr_up2
iscrossDown2() => cr_down2

ma_up = out1 >= ta.valuewhen(out1[smoothe] >= out1[1], out1[smoothe], 1)
ma_down = out1 < ta.valuewhen(out1[smoothe] < out1[1], out1[smoothe], 1)

col = cc ? (ma_up ? color.lime : ma_down ? color.red : color.aqua) : color.aqua
col2 = cc2 ? (ma_up ? color.lime : ma_down ? color.red : color.aqua) : color.white

plot(out1, title="Multi-Timeframe Moving Avg", linewidth=4, color=col)
plot(doma2 and out2 ? out2 : na, title="2nd Multi-TimeFrame Moving Average", linewidth=4, color=col2)
plot(sd and ta.crossover(out1, out2) ? out2 : na, style=plot.style_cross, linewidth=15, color=color.aqua)

// Barcolor Plot for Price Crossing Moving Average #1
barcolor(spc and iscrossUp() ? color.yellow : na)
barcolor(spc and iscrossDown() ? color.yellow : na)

// Barcolor Plot for Price Crossing Moving Average #2
barcolor(spc2 and iscrossUp2() ? color.yellow : na)
barcolor(spc2 and iscrossDown2() ? color.yellow : na)

cr_upInt = cr_up ? 1: 0    //Bool to int
cr_up2Int = cr_up2 ? 1: 0    //Bool to int
cr_downInt = cr_down ? 1: 0    //Bool to int
cr_down2Int = cr_down2 ? 1: 0    //Bool to int
ma_upInt = ma_up ? 1: 0    //Bool to int
ma_downInt = ma_down ? 1: 0    //Bool to int

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
float op_operation = decision_tree_0_GTLB_15Min_c0a37e6f(ma_downInt, cr_upInt, avg2, cr_down2Int, cr_up2Int, cr_downInt, ma_upInt, avg)

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


