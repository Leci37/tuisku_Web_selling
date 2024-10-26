//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: NVDA_1Hour_2BC0_4dd16b49 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_1Hour_2BC0_4dd16b49", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_1Hour_4dd16b49(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bbp <= 2.42581 )
		if( mf <= -0.086486 )
			if( ad_mf <= -2.48346e+06 )
				if( bearPower <= -3.39931 )
					if( ad_mf <= -4.29651e+06 )
						if( ad_mf <= -4.81885e+06 )
							ret := -0.301746
						if( ad_mf > -4.81885e+06 )
							ret := 0.476190
					if( ad_mf > -4.29651e+06 )
						if( bearPower <= -8.43076 )
							ret := 0.000000
						if( bearPower > -8.43076 )
							ret := -0.715152 // sell
				if( bearPower > -3.39931 )
					if( bbm <= 3.48296 )
						if( ad <= -1.44569e+07 )
							ret := -0.508197
						if( ad > -1.44569e+07 )
							ret := 0.148649
					if( bbm > 3.48296 )
						if( BBPower_Color <= 0.5 )
							ret := 0.709091 // buy
						if( BBPower_Color > 0.5 )
							ret := -0.125000
			if( ad_mf > -2.48346e+06 )
				if( bearPower <= -8.38464 )
					if( ad_mf <= 1496.85 )
						if( ad <= -615469 )
							ret := 0.233645
						if( ad > -615469 )
							ret := 0.492492
					if( ad_mf > 1496.85 )
						if( mf <= -0.430268 )
							ret := 0.722222 // buy
						if( mf > -0.430268 )
							ret := 0.018767
				if( bearPower > -8.38464 )
					if( bullPower <= 5.03321 )
						if( ad_mf <= -2.04924e+06 )
							ret := 0.512821
						if( ad_mf > -2.04924e+06 )
							ret := 0.060780
					if( bullPower > 5.03321 )
						if( ad_mf <= -1.44357e+06 )
							ret := 1.000000 // buy
						if( ad_mf > -1.44357e+06 )
							ret := -0.840909 // sell
		if( mf > -0.086486 )
			if( ad_mf <= 5.35456e+06 )
				if( ad <= 4.87353e+06 )
					if( ad <= -913006 )
						if( bullPower <= -6.15133 )
							ret := 0.644068
						if( bullPower > -6.15133 )
							ret := -0.186512
					if( ad > -913006 )
						if( ad_mf <= -744906 )
							ret := 0.388350
						if( ad_mf > -744906 )
							ret := -0.060026
				if( ad > 4.87353e+06 )
					if( mf <= 0.141539 )
						if( ad_mf <= 4.97038e+06 )
							ret := 0.960000 // buy
						if( ad_mf > 4.97038e+06 )
							ret := -0.170732
					if( mf > 0.141539 )
						if( bbm <= 1.75788 )
							ret := 0.000000
						if( bbm > 1.75788 )
							ret := 0.916667 // buy
			if( ad_mf > 5.35456e+06 )
				if( bbp <= -5.25432 )
					if( ad_mf <= 8.26131e+06 )
						if( bullPower <= -13.7935 )
							ret := 0.000000
						if( bullPower > -13.7935 )
							ret := -0.854839 // sell
					if( ad_mf > 8.26131e+06 )
						if( bearPower <= -6.68595 )
							ret := -0.083333
						if( bearPower > -6.68595 )
							ret := -0.884615 // sell
				if( bbp > -5.25432 )
					if( bullPower <= 3.63762 )
						if( ad_mf <= 5.4196e+06 )
							ret := -1.000000 // sell
						if( ad_mf > 5.4196e+06 )
							ret := -0.260870
					if( bullPower > 3.63762 )
						if( mf <= 0.066137 )
							ret := -0.333333
						if( mf > 0.066137 )
							ret := 0.814815 // buy
	if( bbp > 2.42581 )
		if( mf <= 0.331717 )
			if( ad <= -1.70894e+06 )
				if( ad <= -6.16361e+06 )
					if( ad_mf <= -7.38384e+06 )
						if( bbp <= 15.6571 )
							ret := 0.258065
						if( bbp > 15.6571 )
							ret := -0.882353 // sell
					if( ad_mf > -7.38384e+06 )
						if( mf <= 0.13802 )
							ret := -0.840000 // sell
						if( mf > 0.13802 )
							ret := 0.333333
				if( ad > -6.16361e+06 )
					if( bbp <= 12.1356 )
						if( mf <= -0.20153 )
							ret := -0.194444
						if( mf > -0.20153 )
							ret := 0.332024
					if( bbp > 12.1356 )
						if( ad_mf <= -3.61434e+06 )
							ret := 0.351351
						if( ad_mf > -3.61434e+06 )
							ret := 0.750000 // buy
			if( ad > -1.70894e+06 )
				if( bullPower <= 14.2417 )
					if( ad_mf <= -1.19393e+06 )
						if( bbp <= 2.73898 )
							ret := 0.666667
						if( bbp > 2.73898 )
							ret := -0.232955
					if( ad_mf > -1.19393e+06 )
						if( ad_mf <= 873696 )
							ret := 0.043144
						if( ad_mf > 873696 )
							ret := 0.125275
				if( bullPower > 14.2417 )
					if( bbm <= 20.6168 )
						if( bbm <= 3.75145 )
							ret := -0.076923
						if( bbm > 3.75145 )
							ret := 0.414815
					if( bbm > 20.6168 )
						if( bbm <= 23.7371 )
							ret := -0.761905 // sell
						if( bbm > 23.7371 )
							ret := 0.441176
		if( mf > 0.331717 )
			if( ad <= 2.20288e+06 )
				if( bullPower <= 8.07178 )
					if( bbm <= 9.26731 )
						if( ad_mf <= -754.734 )
							ret := 0.169576
						if( ad_mf > -754.734 )
							ret := -0.154780
					if( bbm > 9.26731 )
						ret := -1.000000 // sell
				if( bullPower > 8.07178 )
					if( bbm <= 1.318 )
						if( bbp <= 17.0848 )
							ret := -0.500000
						if( bbp > 17.0848 )
							ret := 0.857143 // buy
					if( bbm > 1.318 )
						if( bbm <= 3.48346 )
							ret := -0.632184
						if( bbm > 3.48346 )
							ret := -0.354331
			if( ad > 2.20288e+06 )
				if( bbp <= 4.59576 )
					if( ad <= 2.69091e+06 )
						ret := 0.384615
					if( ad > 2.69091e+06 )
						if( bbm <= 1.2325 )
							ret := 0.181818
						if( bbm > 1.2325 )
							ret := -0.474359
				if( bbp > 4.59576 )
					if( ad_mf <= 9.07625e+06 )
						if( bullPower <= 13.7629 )
							ret := 0.136986
						if( bullPower > 13.7629 )
							ret := 0.670588
					if( ad_mf > 9.07625e+06 )
						if( bullPower <= 13.2212 )
							ret := 0.074074
						if( bullPower > 13.2212 )
							ret := -0.846154 // sell
	
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
float op_operation = decision_tree_0_NVDA_1Hour_4dd16b49(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)

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


