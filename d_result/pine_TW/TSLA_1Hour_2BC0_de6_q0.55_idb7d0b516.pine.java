//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: TSLA_1Hour_2BC0_b7d0b516 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_1Hour_2BC0_b7d0b516", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_1Hour_b7d0b516(bbp, bullPower, BBPower_Color, bearPower, bbm, ad_mf, mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bearPower <= 0.001449 )
		if( bbp <= -142.048 )
			if( bbm <= 4.96293 )
				ret := 0.000000
			if( bbm > 4.96293 )
				if( bbp <= -179.744 )
					if( bbp <= -2489.79 )
						ret := 0.000000
					if( bbp > -2489.79 )
						ret := 1.000000 // buy
				if( bbp > -179.744 )
					if( bullPower <= -74.8013 )
						ret := -1.000000 // sell
					if( bullPower > -74.8013 )
						if( bbp <= -148.464 )
							ret := 0.571429
						if( bbp > -148.464 )
							ret := 1.000000 // buy
		if( bbp > -142.048 )
			if( ad <= -1.79477e+06 )
				if( bearPower <= -5.12966 )
					if( bbm <= 20.3117 )
						if( bbm <= 1.90074 )
							ret := 0.360000
						if( bbm > 1.90074 )
							ret := -0.363162
					if( bbm > 20.3117 )
						if( bullPower <= 21.2108 )
							ret := -0.125714
						if( bullPower > 21.2108 )
							ret := 0.769231 // buy
				if( bearPower > -5.12966 )
					if( ad <= -1.67976e+07 )
						if( bullPower <= 5.68716 )
							ret := 0.418750
						if( bullPower > 5.68716 )
							ret := -0.750000 // sell
					if( ad > -1.67976e+07 )
						if( ad_mf <= -1.22322e+07 )
							ret := -0.290503
						if( ad_mf > -1.22322e+07 )
							ret := -0.050804
			if( ad > -1.79477e+06 )
				if( ad_mf <= -264097 )
					if( bullPower <= 13.4184 )
						if( bearPower <= -21.7026 )
							ret := 0.339474
						if( bearPower > -21.7026 )
							ret := 0.052707
					if( bullPower > 13.4184 )
						if( bbp <= 15.5613 )
							ret := -0.655172
						if( bbp > 15.5613 )
							ret := 0.021277
				if( ad_mf > -264097 )
					if( ad_mf <= -80504.2 )
						if( mf <= 0.183339 )
							ret := -0.216609
						if( mf > 0.183339 )
							ret := 0.149485
					if( ad_mf > -80504.2 )
						if( mf <= -0.421954 )
							ret := 0.353211
						if( mf > -0.421954 )
							ret := -0.037118
	if( bearPower > 0.001449 )
		if( bearPower <= 8.18183 )
			if( ad_mf <= 3.45991e+06 )
				if( ad <= -1.45702e+07 )
					if( ad_mf <= -1.58455e+07 )
						if( bbm <= 7.05862 )
							ret := -0.222222
						if( bbm > 7.05862 )
							ret := 1.000000 // buy
					if( ad_mf > -1.58455e+07 )
						if( bbp <= 3.72709 )
							ret := 0.000000
						if( bbp > 3.72709 )
							ret := -0.925926 // sell
				if( ad > -1.45702e+07 )
					if( ad <= -1.01331e+07 )
						if( mf <= -0.027759 )
							ret := -0.318182
						if( mf > -0.027759 )
							ret := 0.587629
					if( ad > -1.01331e+07 )
						if( bbm <= 0.944942 )
							ret := 0.113229
						if( bbm > 0.944942 )
							ret := 0.016121
			if( ad_mf > 3.45991e+06 )
				if( bbp <= 10.84 )
					if( ad <= 9.09961e+06 )
						if( bearPower <= 3.02748 )
							ret := -0.077253
						if( bearPower > 3.02748 )
							ret := 0.480000
					if( ad > 9.09961e+06 )
						if( bearPower <= 0.546079 )
							ret := -0.130435
						if( bearPower > 0.546079 )
							ret := 0.381579
				if( bbp > 10.84 )
					if( ad <= 6.63128e+06 )
						if( bbm <= 23.7056 )
							ret := 0.615385
						if( bbm > 23.7056 )
							ret := -0.250000
					if( ad > 6.63128e+06 )
						if( mf <= 0.140461 )
							ret := 0.567568
						if( mf > 0.140461 )
							ret := -0.119565
		if( bearPower > 8.18183 )
			if( ad <= 3.91739e+06 )
				if( bullPower <= 24.164 )
					if( bearPower <= 17.9538 )
						if( ad <= 2.40263e+06 )
							ret := 0.274309
						if( ad > 2.40263e+06 )
							ret := -0.441176
					if( bearPower > 17.9538 )
						if( bullPower <= 22.3131 )
							ret := 1.000000 // buy
						if( bullPower > 22.3131 )
							ret := 0.758621 // buy
				if( bullPower > 24.164 )
					if( mf <= -0.176631 )
						if( bbp <= 79.1272 )
							ret := -1.000000 // sell
						if( bbp > 79.1272 )
							ret := 0.000000
					if( mf > -0.176631 )
						if( mf <= 0.51654 )
							ret := 0.084798
						if( mf > 0.51654 )
							ret := 0.730769 // buy
			if( ad > 3.91739e+06 )
				if( ad <= 6.60279e+06 )
					if( mf <= 0.544263 )
						if( BBPower_Color <= 0.5 )
							ret := 1.000000 // buy
						if( BBPower_Color > 0.5 )
							ret := 0.709302 // buy
					if( mf > 0.544263 )
						ret := -0.500000
				if( ad > 6.60279e+06 )
					if( bbm <= 11.4785 )
						ret := -0.875000 // sell
					if( bbm > 11.4785 )
						ret := 0.600000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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


//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf
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
float op_operation = decision_tree_0_TSLA_1Hour_b7d0b516(bbp, bullPower, BBPower_Color, bearPower, bbm, ad_mf, mf, ad)

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


