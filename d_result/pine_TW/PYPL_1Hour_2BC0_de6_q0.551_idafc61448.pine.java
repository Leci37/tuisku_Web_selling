//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: PYPL_1Hour_2BC0_afc61448 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Hour_2BC0_afc61448", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Hour_afc61448(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ad_mf <= -199.729 )
		if( ad_mf <= -2.62031e+06 )
			if( bullPower <= 0.515035 )
				if( bearPower <= -5.756 )
					ret := 0.666667
				if( bearPower > -5.756 )
					if( bbp <= -1.95085 )
						if( mf <= -0.178138 )
							ret := -0.652174
						if( mf > -0.178138 )
							ret := 0.391304
					if( bbp > -1.95085 )
						if( bearPower <= -0.842158 )
							ret := -0.849315 // sell
						if( bearPower > -0.842158 )
							ret := -0.391304
			if( bullPower > 0.515035 )
				if( ad <= -2.8711e+06 )
					if( bullPower <= 3.85705 )
						if( mf <= 0.004608 )
							ret := 0.603448
						if( mf > 0.004608 )
							ret := 0.040000
					if( bullPower > 3.85705 )
						ret := -1.000000 // sell
				if( ad > -2.8711e+06 )
					if( ad_mf <= -2.77158e+06 )
						ret := -1.000000 // sell
					if( ad_mf > -2.77158e+06 )
						if( bullPower <= 1.36256 )
							ret := 0.076923
						if( bullPower > 1.36256 )
							ret := -0.842105 // sell
		if( ad_mf > -2.62031e+06 )
			if( mf <= -0.385803 )
				if( bbm <= 0.424866 )
					if( ad_mf <= -32345.3 )
						if( mf <= -0.420475 )
							ret := -0.086957
						if( mf > -0.420475 )
							ret := -0.700000 // sell
					if( ad_mf > -32345.3 )
						if( bullPower <= -0.338467 )
							ret := 0.000000
						if( bullPower > -0.338467 )
							ret := 0.509804
				if( bbm > 0.424866 )
					if( bearPower <= -0.584653 )
						if( bbm <= 2.745 )
							ret := 0.296089
						if( bbm > 2.745 )
							ret := 0.730769 // buy
					if( bearPower > -0.584653 )
						if( mf <= -0.39065 )
							ret := 0.838710 // buy
						if( mf > -0.39065 )
							ret := 0.000000
			if( mf > -0.385803 )
				if( bullPower <= -0.748231 )
					if( ad_mf <= -24921.9 )
						if( mf <= -0.099635 )
							ret := -0.084359
						if( mf > -0.099635 )
							ret := 0.223214
					if( ad_mf > -24921.9 )
						if( bearPower <= -1.40018 )
							ret := 0.454965
						if( bearPower > -1.40018 )
							ret := 0.044444
				if( bullPower > -0.748231 )
					if( ad_mf <= -307.765 )
						if( bbm <= 8.10661 )
							ret := 0.027915
						if( bbm > 8.10661 )
							ret := 0.794118 // buy
					if( ad_mf > -307.765 )
						if( bbm <= 0.130019 )
							ret := -0.030769
						if( bbm > 0.130019 )
							ret := 0.640777
	if( ad_mf > -199.729 )
		if( ad <= 2.9137e+06 )
			if( ad <= 13919.5 )
				if( bbm <= 0.221114 )
					if( bbp <= 5.96099 )
						if( bearPower <= 0.485195 )
							ret := -0.031347
						if( bearPower > 0.485195 )
							ret := 0.135338
					if( bbp > 5.96099 )
						if( mf <= 0.206326 )
							ret := -1.000000 // sell
						if( mf > 0.206326 )
							ret := -0.200000
				if( bbm > 0.221114 )
					if( ad_mf <= 13177.9 )
						if( bearPower <= 0.696043 )
							ret := -0.107880
						if( bearPower > 0.696043 )
							ret := -0.266854
					if( ad_mf > 13177.9 )
						if( bbp <= 1.24982 )
							ret := -0.860000 // sell
						if( bbp > 1.24982 )
							ret := 0.000000
			if( ad > 13919.5 )
				if( bbp <= 1.29885 )
					if( bbm <= 2.00709 )
						if( ad <= 2.44348e+06 )
							ret := -0.007254
						if( ad > 2.44348e+06 )
							ret := 0.371795
					if( bbm > 2.00709 )
						if( bbm <= 4.02427 )
							ret := -0.242365
						if( bbm > 4.02427 )
							ret := 0.101695
				if( bbp > 1.29885 )
					if( bbp <= 10.0439 )
						if( ad_mf <= 260303 )
							ret := 0.263302
						if( ad_mf > 260303 )
							ret := 0.092560
					if( bbp > 10.0439 )
						if( bbm <= 4.51116 )
							ret := -0.384615
						if( bbm > 4.51116 )
							ret := -1.000000 // sell
		if( ad > 2.9137e+06 )
			if( ad_mf <= 3.19632e+06 )
				if( bbm <= 0.7425 )
					ret := 0.000000
				if( bbm > 0.7425 )
					if( BBPower_Color <= 0.5 )
						if( mf <= 0.128188 )
							ret := -1.000000 // sell
						if( mf > 0.128188 )
							ret := -0.875000 // sell
					if( BBPower_Color > 0.5 )
						if( bullPower <= 2.07855 )
							ret := 0.000000
						if( bullPower > 2.07855 )
							ret := -0.866667 // sell
			if( ad_mf > 3.19632e+06 )
				if( mf <= -0.138275 )
					if( mf <= -0.351569 )
						ret := 0.666667
					if( mf > -0.351569 )
						if( mf <= -0.162613 )
							ret := -1.000000 // sell
						if( mf > -0.162613 )
							ret := -0.600000
				if( mf > -0.138275 )
					if( bbp <= -2.73835 )
						if( bbm <= 2.70137 )
							ret := 0.500000
						if( bbm > 2.70137 )
							ret := 1.000000 // buy
					if( bbp > -2.73835 )
						if( mf <= 0.011892 )
							ret := 0.352941
						if( mf > 0.011892 )
							ret := -0.328000
	
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
float op_operation = decision_tree_0_PYPL_1Hour_afc61448(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)

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


