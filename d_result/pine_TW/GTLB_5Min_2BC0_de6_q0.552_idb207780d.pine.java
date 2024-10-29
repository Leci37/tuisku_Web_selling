//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: GTLB_5Min_2BC0_b207780d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GTLB_5Min_2BC0_b207780d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GTLB_5Min_b207780d(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= 0.032372 )
		if( bbm <= 0.02985 )
			if( mf <= -0.202237 )
				if( bullPower <= -0.029253 )
					if( mf <= -0.492062 )
						if( bullPower <= -0.124001 )
							ret := 0.898305 // buy
						if( bullPower > -0.124001 )
							ret := 0.500000
					if( mf > -0.492062 )
						if( mf <= -0.485034 )
							ret := -0.833333 // sell
						if( mf > -0.485034 )
							ret := 0.475806
				if( bullPower > -0.029253 )
					if( mf <= -0.297793 )
						if( bbp <= -0.05193 )
							ret := -0.888889 // sell
						if( bbp > -0.05193 )
							ret := 0.148148
					if( mf > -0.297793 )
						if( bearPower <= -0.027954 )
							ret := -0.333333
						if( bearPower > -0.027954 )
							ret := 0.777778 // buy
			if( mf > -0.202237 )
				if( ad_mf <= 0.165981 )
					if( mf <= 0.495672 )
						if( bbp <= -0.177124 )
							ret := 0.315188
						if( bbp > -0.177124 )
							ret := 0.144945
					if( mf > 0.495672 )
						if( mf <= 0.53491 )
							ret := 0.951613 // buy
						if( mf > 0.53491 )
							ret := 0.147541
				if( ad_mf > 0.165981 )
					if( bullPower <= -0.258969 )
						if( mf <= -0.192637 )
							ret := -0.312500
						if( mf > -0.192637 )
							ret := 0.428571
					if( bullPower > -0.258969 )
						if( ad_mf <= 0.171001 )
							ret := -0.869565 // sell
						if( ad_mf > 0.171001 )
							ret := -0.156627
		if( bbm > 0.02985 )
			if( ad_mf <= -56801.1 )
				if( bbp <= -4.61923 )
					ret := -1.000000 // sell
				if( bbp > -4.61923 )
					if( bbp <= -0.715881 )
						if( ad <= -78824.2 )
							ret := 0.310680
						if( ad > -78824.2 )
							ret := 0.807018 // buy
					if( bbp > -0.715881 )
						if( ad_mf <= -59153.8 )
							ret := 0.086207
						if( ad_mf > -59153.8 )
							ret := 0.869565 // buy
			if( ad_mf > -56801.1 )
				if( ad <= -715.5 )
					if( ad <= -986 )
						if( ad_mf <= -49259.5 )
							ret := -0.495327
						if( ad_mf > -49259.5 )
							ret := 0.050749
					if( ad > -986 )
						if( mf <= 0.139933 )
							ret := 0.607143
						if( mf > 0.139933 )
							ret := -0.255814
				if( ad > -715.5 )
					if( bullPower <= -1.54145 )
						if( bbp <= -10.3914 )
							ret := -0.666667
						if( bbp > -10.3914 )
							ret := -1.000000 // sell
					if( bullPower > -1.54145 )
						if( ad <= 63725 )
							ret := -0.040375
						if( ad > 63725 )
							ret := 0.280488
	if( bullPower > 0.032372 )
		if( bbm <= 0.009674 )
			if( bearPower <= 0.397773 )
				if( mf <= 0.161897 )
					if( bullPower <= 0.228133 )
						if( ad_mf <= -0.13923 )
							ret := -0.627119
						if( ad_mf > -0.13923 )
							ret := -0.155458
					if( bullPower > 0.228133 )
						if( ad_mf <= -0.005242 )
							ret := -0.695122
						if( ad_mf > -0.005242 )
							ret := -0.279891
				if( mf > 0.161897 )
					if( bbp <= 0.530162 )
						if( bbp <= 0.270337 )
							ret := 0.092251
						if( bbp > 0.270337 )
							ret := -0.248000
					if( bbp > 0.530162 )
						if( mf <= 0.329388 )
							ret := 0.656566
						if( mf > 0.329388 )
							ret := 0.088889
			if( bearPower > 0.397773 )
				if( ad_mf <= -0.015955 )
					if( bullPower <= 0.42004 )
						if( mf <= 0.368942 )
							ret := 0.625000
						if( mf > 0.368942 )
							ret := -1.000000 // sell
					if( bullPower > 0.42004 )
						if( bullPower <= 0.495497 )
							ret := -0.814159 // sell
						if( bullPower > 0.495497 )
							ret := -0.525581
				if( ad_mf > -0.015955 )
					if( ad_mf <= 0.013472 )
						if( bbp <= 2.00867 )
							ret := 0.709677 // buy
						if( bbp > 2.00867 )
							ret := -0.333333
					if( ad_mf > 0.013472 )
						if( bearPower <= 0.406571 )
							ret := -0.866667 // sell
						if( bearPower > 0.406571 )
							ret := -0.296804
		if( bbm > 0.009674 )
			if( ad <= -52186.2 )
				if( ad <= -198710 )
					if( ad_mf <= -530240 )
						ret := -1.000000 // sell
					if( ad_mf > -530240 )
						if( mf <= 0.307922 )
							ret := 0.765432 // buy
						if( mf > 0.307922 )
							ret := -1.000000 // sell
				if( ad > -198710 )
					if( bbm <= 1.18249 )
						if( bbm <= 0.496595 )
							ret := 0.182045
						if( bbm > 0.496595 )
							ret := 0.494208
					if( bbm > 1.18249 )
						if( bbm <= 1.38833 )
							ret := -0.761905 // sell
						if( bbm > 1.38833 )
							ret := 0.200000
			if( ad > -52186.2 )
				if( mf <= 0.293431 )
					if( bearPower <= 0.166339 )
						if( ad_mf <= 17998.8 )
							ret := -0.018317
						if( ad_mf > 17998.8 )
							ret := -0.126638
					if( bearPower > 0.166339 )
						if( mf <= 0.223753 )
							ret := 0.101592
						if( mf > 0.223753 )
							ret := -0.121324
				if( mf > 0.293431 )
					if( bullPower <= 1.19759 )
						if( bullPower <= 1.12934 )
							ret := -0.139504
						if( bullPower > 1.12934 )
							ret := -0.862069 // sell
					if( bullPower > 1.19759 )
						if( ad <= 179661 )
							ret := 0.200000
						if( ad > 179661 )
							ret := 0.920000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_GTLB_5Min_b207780d(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)

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


