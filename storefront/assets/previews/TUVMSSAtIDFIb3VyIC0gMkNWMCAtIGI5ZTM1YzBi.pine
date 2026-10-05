//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: MELI_1Hour_2CV0_b9e35c0b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_1Hour_2CV0_b9e35c0b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_1Hour_b9e35c0b(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( mf <= 0.224012 )
		if( VIM <= 1.68957 )
			if( ad_mf <= 97020.9 )
				if( VIP <= 1.31023 )
					if( ad_mf <= 2307.6 )
						if( ad_mf <= -5218.6 )
							ret := -0.018806
						if( ad_mf > -5218.6 )
							ret := -0.120718
					if( ad_mf > 2307.6 )
						if( VIM <= 0.690616 )
							ret := -0.727273 // sell
						if( VIM > 0.690616 )
							ret := 0.019015
				if( VIP > 1.31023 )
					if( ad_mf <= 48627.9 )
						if( VIM <= 0.720981 )
							ret := 0.303754
						if( VIM > 0.720981 )
							ret := 0.105511
					if( ad_mf > 48627.9 )
						if( VIM <= 1.45789 )
							ret := -0.351724
						if( VIM > 1.45789 )
							ret := 0.888889 // buy
			if( ad_mf > 97020.9 )
				if( ad_mf <= 123373 )
					if( mf <= -0.192363 )
						ret := 0.875000 // buy
					if( mf > -0.192363 )
						if( ad_mf <= 103591 )
							ret := -0.263736
						if( ad_mf > 103591 )
							ret := -0.664706
				if( ad_mf > 123373 )
					if( ad_mf <= 125135 )
						if( VIM <= 0.789239 )
							ret := -1.000000 // sell
						if( VIM > 0.789239 )
							ret := 0.827586 // buy
					if( ad_mf > 125135 )
						if( VIP <= 1.38319 )
							ret := -0.236181
						if( VIP > 1.38319 )
							ret := 0.714286 // buy
		if( VIM > 1.68957 )
			if( mf <= -0.071992 )
				if( ad_mf <= 510.428 )
					if( mf <= -0.405074 )
						ret := -0.200000
					if( mf > -0.405074 )
						if( VIP <= 1.42608 )
							ret := 0.892308 // buy
						if( VIP > 1.42608 )
							ret := 0.333333
				if( ad_mf > 510.428 )
					ret := -0.200000
			if( mf > -0.071992 )
				if( ad_mf <= -0.053747 )
					ret := 0.428571
				if( ad_mf > -0.053747 )
					ret := -0.230769
	if( mf > 0.224012 )
		if( ad_mf <= -0.257705 )
			if( VIP <= 1.52344 )
				if( VIP_VIM <= -0.321429 )
					if( VIP_VIM <= -0.446202 )
						ret := 0.000000
					if( VIP_VIM > -0.446202 )
						if( ad_mf <= -32648.7 )
							ret := 0.000000
						if( ad_mf > -32648.7 )
							ret := -0.933333 // sell
				if( VIP_VIM > -0.321429 )
					if( ad_mf <= -73432.2 )
						if( VIM <= 0.842516 )
							ret := 0.071429
						if( VIM > 0.842516 )
							ret := 0.809524 // buy
					if( ad_mf > -73432.2 )
						if( ad <= -58728.4 )
							ret := -0.370370
						if( ad > -58728.4 )
							ret := 0.087719
			if( VIP > 1.52344 )
				if( VIM <= 0.733794 )
					if( ad_mf <= -0.299945 )
						if( mf <= 0.413275 )
							ret := -0.454545
						if( mf > 0.413275 )
							ret := 0.500000
					if( ad_mf > -0.299945 )
						ret := 1.000000 // buy
				if( VIM > 0.733794 )
					if( VIP_VIM <= 0.619293 )
						if( VIP_VIM <= 0.414865 )
							ret := 0.000000
						if( VIP_VIM > 0.414865 )
							ret := -1.000000 // sell
					if( VIP_VIM > 0.619293 )
						if( VIP_VIM <= 0.663615 )
							ret := 0.142857
						if( VIP_VIM > 0.663615 )
							ret := -0.750000 // sell
		if( ad_mf > -0.257705 )
			if( ad_mf <= 4696.16 )
				if( mf <= 0.252374 )
					if( VIP_VIM <= 0.199062 )
						if( VIM <= 1.22628 )
							ret := 0.682927
						if( VIM > 1.22628 )
							ret := -1.000000 // sell
					if( VIP_VIM > 0.199062 )
						if( VIP <= 1.43255 )
							ret := -0.500000
						if( VIP > 1.43255 )
							ret := 0.425000
				if( mf > 0.252374 )
					if( VIP <= 1.0172 )
						ret := 0.000000
					if( VIP > 1.0172 )
						if( ad <= 376 )
							ret := 0.878049 // buy
						if( ad > 376 )
							ret := 0.611765
			if( ad_mf > 4696.16 )
				if( ad <= 6230.91 )
					if( ad_mf <= 5222.4 )
						ret := -0.571429
					if( ad_mf > 5222.4 )
						ret := -1.000000 // sell
				if( ad > 6230.91 )
					if( VIM <= 0.657861 )
						if( mf <= 0.244927 )
							ret := 1.000000 // buy
						if( mf > 0.244927 )
							ret := -0.370968
					if( VIM > 0.657861 )
						if( ad <= 74528.7 )
							ret := 0.112216
						if( ad > 74528.7 )
							ret := 0.464567
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_MELI_1Hour_b9e35c0b(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


