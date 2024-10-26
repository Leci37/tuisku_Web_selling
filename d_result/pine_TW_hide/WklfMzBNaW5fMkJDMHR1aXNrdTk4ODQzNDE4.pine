//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: ZI_30Min_2BC0_98843418 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_30Min_2BC0_98843418", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_30Min_98843418(bbp, bullPower, BBPower_Color, bearPower, bbm, ad, ad_mf, mf)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bearPower <= 0.108602 )
		if( ad_mf <= 0.264846 )
			if( ad_mf <= -3381.1 )
				if( bearPower <= -1.88953 )
					if( ad <= -132357 )
						if( ad <= -791547 )
							ret := 0.722222 // buy
						if( ad > -791547 )
							ret := 0.042424
					if( ad > -132357 )
						if( mf <= 0.042868 )
							ret := 0.688172
						if( mf > 0.042868 )
							ret := 0.045455
				if( bearPower > -1.88953 )
					if( ad_mf <= -3685.68 )
						if( ad_mf <= -274192 )
							ret := 0.124424
						if( ad_mf > -274192 )
							ret := -0.009028
					if( ad_mf > -3685.68 )
						if( bullPower <= -0.119835 )
							ret := -0.891892 // sell
						if( bullPower > -0.119835 )
							ret := -0.393939
			if( ad_mf > -3381.1 )
				if( bearPower <= -0.395995 )
					if( bbm <= 0.62296 )
						if( bbm <= 0.004398 )
							ret := 0.390110
						if( bbm > 0.004398 )
							ret := 0.134904
					if( bbm > 0.62296 )
						if( ad_mf <= -138.803 )
							ret := 0.661111
						if( ad_mf > -138.803 )
							ret := -1.000000 // sell
				if( bearPower > -0.395995 )
					if( bullPower <= -0.026703 )
						if( ad <= -1541 )
							ret := -0.285714
						if( ad > -1541 )
							ret := 0.204295
					if( bullPower > -0.026703 )
						if( mf <= 0.246941 )
							ret := -0.031471
						if( mf > 0.246941 )
							ret := 0.381679
		if( ad_mf > 0.264846 )
			if( ad <= 13227.8 )
				if( bullPower <= 0.055737 )
					if( ad_mf <= 5313.19 )
						if( bbm <= 0.583494 )
							ret := -0.032872
						if( bbm > 0.583494 )
							ret := 0.686869
					if( ad_mf > 5313.19 )
						if( bbp <= -0.895177 )
							ret := -0.601626
						if( bbp > -0.895177 )
							ret := 0.013514
				if( bullPower > 0.055737 )
					if( ad_mf <= 1123.34 )
						if( bbp <= 0.091907 )
							ret := -0.400000
						if( bbp > 0.091907 )
							ret := -0.730612 // sell
					if( ad_mf > 1123.34 )
						if( mf <= -0.051455 )
							ret := 0.071698
						if( mf > -0.051455 )
							ret := -0.312354
			if( ad > 13227.8 )
				if( ad_mf <= 1.06881e+06 )
					if( bbp <= -3.06097 )
						if( mf <= -0.023235 )
							ret := -0.215190
						if( mf > -0.023235 )
							ret := -0.787879 // sell
					if( bbp > -3.06097 )
						if( ad <= 753038 )
							ret := 0.041794
						if( ad > 753038 )
							ret := -0.364486
				if( ad_mf > 1.06881e+06 )
					if( ad <= 1.40315e+06 )
						if( BBPower_Color <= 0.5 )
							ret := 0.747253 // buy
						if( BBPower_Color > 0.5 )
							ret := 0.181818
					if( ad > 1.40315e+06 )
						if( bullPower <= -0.954201 )
							ret := 0.733333 // buy
						if( bullPower > -0.954201 )
							ret := -0.264151
	if( bearPower > 0.108602 )
		if( bbm <= 5e-05 )
			if( bearPower <= 0.581595 )
				if( ad_mf <= -0.091894 )
					if( bbp <= 0.633943 )
						if( ad_mf <= -0.263771 )
							ret := -0.598039
						if( ad_mf > -0.263771 )
							ret := 0.068182
					if( bbp > 0.633943 )
						if( bearPower <= 0.492682 )
							ret := 0.387097
						if( bearPower > 0.492682 )
							ret := -0.216981
				if( ad_mf > -0.091894 )
					if( bullPower <= 0.146689 )
						if( mf <= -0.040667 )
							ret := -0.155556
						if( mf > -0.040667 )
							ret := 0.608696
					if( bullPower > 0.146689 )
						if( bearPower <= 0.544012 )
							ret := -0.404022
						if( bearPower > 0.544012 )
							ret := 0.571429
			if( bearPower > 0.581595 )
				if( ad_mf <= -0.355595 )
					if( mf <= 0.495789 )
						ret := -1.000000 // sell
					if( mf > 0.495789 )
						ret := 0.000000
				if( ad_mf > -0.355595 )
					if( mf <= 0.09867 )
						if( ad_mf <= 0.21292 )
							ret := -0.753927 // sell
						if( ad_mf > 0.21292 )
							ret := -0.333333
					if( mf > 0.09867 )
						if( ad_mf <= -0.247202 )
							ret := -0.549020
						if( ad_mf > -0.247202 )
							ret := 0.104651
		if( bbm > 5e-05 )
			if( ad <= -402.826 )
				if( ad <= -648.5 )
					if( ad_mf <= -1514.2 )
						if( bbm <= 1.09406 )
							ret := 0.044747
						if( bbm > 1.09406 )
							ret := -0.317073
					if( ad_mf > -1514.2 )
						if( bbm <= 0.77 )
							ret := -0.392473
						if( bbm > 0.77 )
							ret := 0.888889 // buy
				if( ad > -648.5 )
					if( mf <= 0.23049 )
						if( ad <= -431.784 )
							ret := 0.784615 // buy
						if( ad > -431.784 )
							ret := -0.600000
					if( mf > 0.23049 )
						if( bbp <= 0.398859 )
							ret := -0.833333 // sell
						if( bbp > 0.398859 )
							ret := 0.444444
			if( ad > -402.826 )
				if( ad_mf <= 4264.25 )
					if( bbp <= 1.62485 )
						if( ad <= 1540.34 )
							ret := -0.148676
						if( ad > 1540.34 )
							ret := -0.431694
					if( bbp > 1.62485 )
						if( bbp <= 2.51295 )
							ret := -0.477064
						if( bbp > 2.51295 )
							ret := -0.818182 // sell
				if( ad_mf > 4264.25 )
					if( bbp <= 4.82401 )
						if( mf <= 0.187917 )
							ret := 0.017590
						if( mf > 0.187917 )
							ret := -0.173458
					if( bbp > 4.82401 )
						if( bbm <= 1.30265 )
							ret := -0.333333
						if( bbm > 1.30265 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ZI_30Min_98843418(bbp, bullPower, BBPower_Color, bearPower, bbm, ad, ad_mf, mf)

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


