//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: UBER_1Min_2BC0_ff16b62a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2BC0_ff16b62a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_ff16b62a(bbp, bullPower, BBPower_Color, bearPower, bbm, ad_mf, mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( bearPower <= 0.085865 )
		if( bbm <= 8.6e-05 )
			if( bearPower <= -0.045217 )
				if( bbp <= -0.29165 )
					if( ad_mf <= 0.421783 )
						if( bearPower <= -0.246588 )
							if( ad_mf <= -0.685619 )
								ret := -0.142857
							if( ad_mf > -0.685619 )
								ret := 0.867299 // buy
						if( bearPower > -0.246588 )
							if( bullPower <= -0.211907 )
								ret := 0.191011
							if( bullPower > -0.211907 )
								ret := 0.647597
					if( ad_mf > 0.421783 )
						if( ad_mf <= 0.620424 )
							if( bearPower <= -0.340215 )
								ret := 0.714286 // buy
							if( bearPower > -0.340215 )
								ret := -0.061538
						if( ad_mf > 0.620424 )
							if( ad_mf <= 0.845448 )
								ret := 0.891892 // buy
							if( ad_mf > 0.845448 )
								ret := 0.428571
				if( bbp > -0.29165 )
					if( mf <= 0.143074 )
						if( mf <= -0.10266 )
							if( ad_mf <= 0.144938 )
								ret := -0.109589
							if( ad_mf > 0.144938 )
								ret := 0.437656
						if( mf > -0.10266 )
							if( bbp <= -0.139988 )
								ret := 0.571963
							if( bbp > -0.139988 )
								ret := 0.355172
					if( mf > 0.143074 )
						if( mf <= 0.346378 )
							if( ad_mf <= -0.34344 )
								ret := -0.714286 // sell
							if( ad_mf > -0.34344 )
								ret := 0.141762
						if( mf > 0.346378 )
							if( mf <= 0.665034 )
								ret := 0.510730
							if( mf > 0.665034 )
								ret := 0.232143
			if( bearPower > -0.045217 )
				if( bbp <= 0.016912 )
					if( ad_mf <= -0.836577 )
						if( bullPower <= -0.024165 )
							if( bbp <= -0.065163 )
								ret := 0.555556
							if( bbp > -0.065163 )
								ret := 0.923077 // buy
						if( bullPower > -0.024165 )
							if( bearPower <= -0.01095 )
								ret := -0.153846
							if( bearPower > -0.01095 )
								ret := 0.717949 // buy
					if( ad_mf > -0.836577 )
						if( ad_mf <= -0.584316 )
							if( ad_mf <= -0.604226 )
								ret := 0.000000
							if( ad_mf > -0.604226 )
								ret := -0.652174
						if( ad_mf > -0.584316 )
							if( ad_mf <= 0.034152 )
								ret := 0.248528
							if( ad_mf > 0.034152 )
								ret := 0.125199
				if( bbp > 0.016912 )
					if( bullPower <= 0.041533 )
						if( mf <= 0.700405 )
							if( mf <= 0.647517 )
								ret := 0.047619
							if( mf > 0.647517 )
								ret := 0.631579
						if( mf > 0.700405 )
							if( bearPower <= 0.025654 )
								ret := -0.066667
							if( bearPower > 0.025654 )
								ret := -0.538462
					if( bullPower > 0.041533 )
						if( bearPower <= 0.047995 )
							if( ad_mf <= 0.165239 )
								ret := -0.320988
							if( ad_mf > 0.165239 )
								ret := 0.102041
						if( bearPower > 0.047995 )
							if( mf <= 0.771176 )
								ret := -0.033001
							if( mf > 0.771176 )
								ret := -0.600000
		if( bbm > 8.6e-05 )
			if( ad <= -44297.2 )
				if( bullPower <= 0.136191 )
					if( bbp <= -1.68993 )
						ret := 1.000000 // buy
					if( bbp > -1.68993 )
						if( ad_mf <= -705724 )
							if( bbm <= 0.106374 )
								ret := 0.153846
							if( bbm > 0.106374 )
								ret := 0.966667 // buy
						if( ad_mf > -705724 )
							if( ad <= -344408 )
								ret := -0.621622
							if( ad > -344408 )
								ret := 0.128244
				if( bullPower > 0.136191 )
					if( bullPower <= 1.09446 )
						if( ad <= -437157 )
							if( bbm <= 0.331889 )
								ret := 0.428571
							if( bbm > 0.331889 )
								ret := 0.942857 // buy
						if( ad > -437157 )
							if( ad_mf <= -92884.5 )
								ret := 0.115207
							if( ad_mf > -92884.5 )
								ret := 0.434879
					if( bullPower > 1.09446 )
						ret := -0.666667
			if( ad > -44297.2 )
				if( ad_mf <= -215.38 )
					if( ad <= -1969.15 )
						if( bbm <= 0.501998 )
							if( bbp <= -0.388476 )
								ret := -0.134085
							if( bbp > -0.388476 )
								ret := 0.039607
						if( bbm > 0.501998 )
							if( mf <= -0.026831 )
								ret := 0.789474 // buy
							if( mf > -0.026831 )
								ret := 0.080000
					if( ad > -1969.15 )
						if( bbm <= 0.090228 )
							if( bullPower <= -0.053158 )
								ret := 0.333988
							if( bullPower > -0.053158 )
								ret := 0.092998
						if( bbm > 0.090228 )
							if( mf <= 0.123372 )
								ret := 0.605010
							if( mf > 0.123372 )
								ret := 0.192308
				if( ad_mf > -215.38 )
					if( bbm <= 1.13018 )
						if( ad_mf <= 92230.5 )
							if( bbm <= 0.122604 )
								ret := 0.019910
							if( bbm > 0.122604 )
								ret := -0.044936
						if( ad_mf > 92230.5 )
							if( mf <= 0.310366 )
								ret := 0.229592
							if( mf > 0.310366 )
								ret := -0.126016
					if( bbm > 1.13018 )
						if( bbp <= -0.958437 )
							ret := -0.727273 // sell
						if( bbp > -0.958437 )
							ret := -1.000000 // sell
	if( bearPower > 0.085865 )
		if( bbm <= 5e-05 )
			if( mf <= -0.614184 )
				if( mf <= -0.914776 )
					ret := 0.000000
				if( mf > -0.914776 )
					if( bbp <= 0.188048 )
						ret := -0.692308
					if( bbp > 0.188048 )
						if( mf <= -0.707203 )
							if( bbp <= 0.369192 )
								ret := -0.980000 // sell
							if( bbp > 0.369192 )
								ret := -0.875000 // sell
						if( mf > -0.707203 )
							ret := -0.666667
			if( mf > -0.614184 )
				if( mf <= -0.581247 )
					if( bearPower <= 0.124207 )
						ret := 0.818182 // buy
					if( bearPower > 0.124207 )
						ret := 0.142857
				if( mf > -0.581247 )
					if( bullPower <= 0.124955 )
						if( ad_mf <= -0.683413 )
							if( mf <= 0.783796 )
								ret := -1.000000 // sell
							if( mf > 0.783796 )
								ret := -0.428571
						if( ad_mf > -0.683413 )
							if( bbp <= 0.2119 )
								ret := -0.295019
							if( bbp > 0.2119 )
								ret := -0.091429
					if( bullPower > 0.124955 )
						if( mf <= 0.803398 )
							if( bullPower <= 0.689334 )
								ret := -0.349064
							if( bullPower > 0.689334 )
								ret := -1.000000 // sell
						if( mf > 0.803398 )
							if( bearPower <= 0.287981 )
								ret := -0.714286 // sell
							if( bearPower > 0.287981 )
								ret := 0.888889 // buy
		if( bbm > 5e-05 )
			if( bbm <= 0.48012 )
				if( mf <= -0.490091 )
					if( bbp <= 0.294211 )
						ret := -1.000000 // sell
					if( bbp > 0.294211 )
						ret := -0.636364
				if( mf > -0.490091 )
					if( bbp <= 1.34895 )
						if( bearPower <= 0.459921 )
							if( ad_mf <= 359594 )
								ret := 0.004083
							if( ad_mf > 359594 )
								ret := -0.800000 // sell
						if( bearPower > 0.459921 )
							if( ad_mf <= -0.439179 )
								ret := 1.000000 // buy
							if( ad_mf > -0.439179 )
								ret := 0.500000
					if( bbp > 1.34895 )
						if( bbm <= 0.255 )
							ret := -0.285714
						if( bbm > 0.255 )
							if( bullPower <= 0.947534 )
								ret := -0.857143 // sell
							if( bullPower > 0.947534 )
								ret := -1.000000 // sell
			if( bbm > 0.48012 )
				if( mf <= 0.683603 )
					if( bearPower <= 0.312793 )
						if( bbm <= 0.678833 )
							if( ad <= 13596.3 )
								ret := -0.793103 // sell
							if( ad > 13596.3 )
								ret := -0.285714
						if( bbm > 0.678833 )
							ret := 0.400000
					if( bearPower > 0.312793 )
						if( mf <= -0.010882 )
							if( bearPower <= 0.799865 )
								ret := -0.866667 // sell
							if( bearPower > 0.799865 )
								ret := -1.000000 // sell
						if( mf > -0.010882 )
							ret := -1.000000 // sell
				if( mf > 0.683603 )
					ret := 0.428571
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UBER_1Min_ff16b62a(bbp, bullPower, BBPower_Color, bearPower, bbm, ad_mf, mf, ad)

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


