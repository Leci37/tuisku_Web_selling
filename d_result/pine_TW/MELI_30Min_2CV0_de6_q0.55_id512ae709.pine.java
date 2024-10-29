//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: MELI_30Min_2CV0_512ae709 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_30Min_2CV0_512ae709", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_30Min_512ae709(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( mf <= 0.130656 )
		if( VIM <= 1.21007 )
			if( ad_mf <= 0.089121 )
				if( ad_mf <= -0.024351 )
					if( VIP <= 0.901758 )
						if( mf <= -0.07781 )
							ret := 0.213385
						if( mf > -0.07781 )
							ret := -0.002736
					if( VIP > 0.901758 )
						if( ad_mf <= -0.026061 )
							ret := 0.010281
						if( ad_mf > -0.026061 )
							ret := -0.807692 // sell
				if( ad_mf > -0.024351 )
					if( VIP_VIM <= 0.05695 )
						if( VIP_VIM <= -0.347102 )
							ret := -0.523810
						if( VIP_VIM > -0.347102 )
							ret := 0.516827
					if( VIP_VIM > 0.05695 )
						if( VIP <= 1.16041 )
							ret := -0.440217
						if( VIP > 1.16041 )
							ret := 0.264344
			if( ad_mf > 0.089121 )
				if( ad_mf <= 0.129777 )
					if( VIP_VIM <= -0.22323 )
						if( VIM <= 1.15882 )
							ret := -0.333333
						if( VIM > 1.15882 )
							ret := 0.812500 // buy
					if( VIP_VIM > -0.22323 )
						if( VIP <= 1.34943 )
							ret := -0.386581
						if( VIP > 1.34943 )
							ret := 0.500000
				if( ad_mf > 0.129777 )
					if( ad_mf <= 71130.3 )
						if( VIP_VIM <= 1.03299 )
							ret := -0.027049
						if( VIP_VIM > 1.03299 )
							ret := 1.000000 // buy
					if( ad_mf > 71130.3 )
						if( ad_mf <= 107954 )
							ret := -0.315104
						if( ad_mf > 107954 )
							ret := 0.016393
		if( VIM > 1.21007 )
			if( VIP_VIM <= 0.10298 )
				if( VIM <= 1.82828 )
					if( mf <= -0.347653 )
						if( ad_mf <= 0.51144 )
							ret := 0.257541
						if( ad_mf > 0.51144 )
							ret := -0.206667
					if( mf > -0.347653 )
						if( ad_mf <= -21713.7 )
							ret := -0.187646
						if( ad_mf > -21713.7 )
							ret := -0.054971
				if( VIM > 1.82828 )
					if( mf <= -0.050089 )
						if( ad_mf <= 21241.3 )
							ret := 0.707547 // buy
						if( ad_mf > 21241.3 )
							ret := -0.545455
					if( mf > -0.050089 )
						if( ad <= -11298.9 )
							ret := -0.833333 // sell
						if( ad > -11298.9 )
							ret := 0.034483
			if( VIP_VIM > 0.10298 )
				if( ad <= 181.5 )
					if( mf <= -0.008271 )
						if( mf <= -0.187297 )
							ret := -0.793103 // sell
						if( mf > -0.187297 )
							ret := -0.062500
					if( mf > -0.008271 )
						if( VIM <= 1.23765 )
							ret := -0.142857
						if( VIM > 1.23765 )
							ret := -0.816514 // sell
				if( ad > 181.5 )
					if( VIP_VIM <= 0.146101 )
						if( ad_mf <= 34954.2 )
							ret := -0.111111
						if( ad_mf > 34954.2 )
							ret := -1.000000 // sell
					if( VIP_VIM > 0.146101 )
						if( VIM <= 1.27743 )
							ret := 0.137931
						if( VIM > 1.27743 )
							ret := 0.702703 // buy
	if( mf > 0.130656 )
		if( ad <= 118200 )
			if( VIP_VIM <= 0.504145 )
				if( VIP_VIM <= 0.496962 )
					if( ad <= 99993.4 )
						if( ad <= 92058.7 )
							ret := 0.048714
						if( ad > 92058.7 )
							ret := -0.445545
					if( ad > 99993.4 )
						if( ad_mf <= 103284 )
							ret := 1.000000 // buy
						if( ad_mf > 103284 )
							ret := 0.227273
				if( VIP_VIM > 0.496962 )
					if( VIP <= 1.24809 )
						if( ad <= 8822.64 )
							ret := -0.416667
						if( ad > 8822.64 )
							ret := 0.062500
					if( VIP > 1.24809 )
						if( VIP <= 1.26865 )
							ret := -0.789474 // sell
						if( VIP > 1.26865 )
							ret := -0.450000
			if( VIP_VIM > 0.504145 )
				if( VIM <= 0.723028 )
					if( ad <= -55609.4 )
						if( mf <= 0.284296 )
							ret := 0.842105 // buy
						if( mf > 0.284296 )
							ret := 0.363636
					if( ad > -55609.4 )
						if( VIP <= 1.44284 )
							ret := -0.106117
						if( VIP > 1.44284 )
							ret := 0.157658
				if( VIM > 0.723028 )
					if( ad <= 63049.6 )
						if( VIP <= 1.61971 )
							ret := 0.254433
						if( VIP > 1.61971 )
							ret := -0.068493
					if( ad > 63049.6 )
						if( ad <= 76035.4 )
							ret := 0.583333
						if( ad > 76035.4 )
							ret := 0.862069 // buy
		if( ad > 118200 )
			if( VIP <= 1.01463 )
				if( ad <= 182886 )
					ret := -0.600000
				if( ad > 182886 )
					if( ad_mf <= 210368 )
						ret := 1.000000 // buy
					if( ad_mf > 210368 )
						ret := 0.416667
			if( VIP > 1.01463 )
				if( ad_mf <= 287158 )
					if( ad_mf <= 182331 )
						if( mf <= 0.372034 )
							ret := -0.552083
						if( mf > 0.372034 )
							ret := 0.266667
					if( ad_mf > 182331 )
						ret := 0.400000
				if( ad_mf > 287158 )
					if( mf <= 0.365929 )
						ret := -0.941176 // sell
					if( mf > 0.365929 )
						ret := -0.636364
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_MELI_30Min_512ae709(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


