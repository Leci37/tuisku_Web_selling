//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: DOTUSDT_1Hour_2BC0_4be180da Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_1Hour_2BC0_4be180da", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_1Hour_4be180da(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad_mf <= -115262 )
		if( bullPower <= -0.388109 )
			if( ad_mf <= -580735 )
				if( ad <= -2.15922e+06 )
					ret := -0.466667
				if( ad > -2.15922e+06 )
					if( mf <= -0.188901 )
						if( ad <= -797663 )
							ret := 0.636364
						if( ad > -797663 )
							ret := -0.166667
					if( mf > -0.188901 )
						if( mf <= -0.091907 )
							ret := 0.770492 // buy
						if( mf > -0.091907 )
							ret := 0.961538 // buy
			if( ad_mf > -580735 )
				if( ad_mf <= -394842 )
					if( mf <= -0.197336 )
						ret := 0.384615
					if( mf > -0.197336 )
						if( bbp <= -1.8779 )
							ret := -0.937500 // sell
						if( bbp > -1.8779 )
							ret := -0.062500
				if( ad_mf > -394842 )
					if( mf <= 0.001963 )
						if( ad_mf <= -148059 )
							ret := 0.657407
						if( ad_mf > -148059 )
							ret := 0.083333
					if( mf > 0.001963 )
						if( bbm <= 0.643501 )
							ret := 0.228571
						if( bbm > 0.643501 )
							ret := -0.695652
		if( bullPower > -0.388109 )
			if( bbm <= 0.279575 )
				if( ad <= -119660 )
					if( ad <= -453255 )
						if( bearPower <= -0.270961 )
							ret := -0.088889
						if( bearPower > -0.270961 )
							ret := 0.327354
					if( ad > -453255 )
						if( ad_mf <= -433891 )
							ret := -0.420455
						if( ad_mf > -433891 )
							ret := 0.084273
				if( ad > -119660 )
					if( bullPower <= 0.086499 )
						if( mf <= 0.012964 )
							ret := 0.342105
						if( mf > 0.012964 )
							ret := 0.829268 // buy
					if( bullPower > 0.086499 )
						if( bearPower <= 0.063974 )
							ret := -0.153846
						if( bearPower > 0.063974 )
							ret := 0.875000 // buy
			if( bbm > 0.279575 )
				if( ad <= -2.7942e+06 )
					ret := 1.000000 // buy
				if( ad > -2.7942e+06 )
					if( bbm <= 2.03609 )
						if( ad_mf <= -408752 )
							ret := 0.088324
						if( ad_mf > -408752 )
							ret := -0.026841
					if( bbm > 2.03609 )
						if( ad_mf <= -568780 )
							ret := -0.658824
						if( ad_mf > -568780 )
							ret := 0.259259
	if( ad_mf > -115262 )
		if( bbp <= 1.09946 )
			if( ad_mf <= 264782 )
				if( mf <= 0.09625 )
					if( bbm <= 1.29412 )
						if( bullPower <= -0.106831 )
							ret := -0.136157
						if( bullPower > -0.106831 )
							ret := -0.038641
					if( bbm > 1.29412 )
						if( bullPower <= -0.052226 )
							ret := 0.861111 // buy
						if( bullPower > -0.052226 )
							ret := -0.125000
				if( mf > 0.09625 )
					if( ad_mf <= -112144 )
						if( mf <= 0.173033 )
							ret := -0.880000 // sell
						if( mf > 0.173033 )
							ret := -0.181818
					if( ad_mf > -112144 )
						if( ad_mf <= 56149.6 )
							ret := 0.051623
						if( ad_mf > 56149.6 )
							ret := -0.027954
			if( ad_mf > 264782 )
				if( ad_mf <= 352936 )
					if( ad_mf <= 350637 )
						if( mf <= 0.129038 )
							ret := 0.086697
						if( mf > 0.129038 )
							ret := 0.290718
					if( ad_mf > 350637 )
						if( bbm <= 0.232807 )
							ret := 0.400000
						if( bbm > 0.232807 )
							ret := 1.000000 // buy
				if( ad_mf > 352936 )
					if( ad_mf <= 358730 )
						if( mf <= 0.054051 )
							ret := 0.031746
						if( mf > 0.054051 )
							ret := -0.640449
					if( ad_mf > 358730 )
						if( bearPower <= 0.237296 )
							ret := 0.019621
						if( bearPower > 0.237296 )
							ret := 0.567164
		if( bbp > 1.09946 )
			if( bbm <= 1.47529 )
				if( mf <= 0.153208 )
					if( ad <= 259266 )
						if( mf <= 0.074852 )
							ret := -0.642857
						if( mf > 0.074852 )
							ret := -0.213333
					if( ad > 259266 )
						if( mf <= 0.128822 )
							ret := 0.019231
						if( mf > 0.128822 )
							ret := -0.559322
				if( mf > 0.153208 )
					if( ad_mf <= 45007.9 )
						if( bearPower <= 0.517882 )
							ret := -0.179487
						if( bearPower > 0.517882 )
							ret := 0.650000
					if( ad_mf > 45007.9 )
						if( bbm <= 0.533511 )
							ret := -0.318519
						if( bbm > 0.533511 )
							ret := -0.006787
			if( bbm > 1.47529 )
				if( ad <= 2.11392e+06 )
					if( ad <= 1.0194e+06 )
						if( ad_mf <= 936724 )
							ret := -0.578947
						if( ad_mf > 936724 )
							ret := 0.125000
					if( ad > 1.0194e+06 )
						if( mf <= 0.204326 )
							ret := -0.480000
						if( mf > 0.204326 )
							ret := -1.000000 // sell
				if( ad > 2.11392e+06 )
					if( ad_mf <= 2.53215e+06 )
						ret := 0.384615
					if( ad_mf > 2.53215e+06 )
						if( ad_mf <= 3.16964e+06 )
							ret := -1.000000 // sell
						if( ad_mf > 3.16964e+06 )
							ret := -0.133333
	
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
float op_operation = decision_tree_0_DOTUSDT_1Hour_4be180da(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)

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


