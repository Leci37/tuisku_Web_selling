//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: PTON_1Hour_2CV0_a7ae36bb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_1Hour_2CV0_a7ae36bb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_1Hour_a7ae36bb(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad_mf <= -0.040777 )
		if( ad_mf <= -0.291327 )
			if( ad_mf <= -0.329157 )
				if( mf <= 0.187569 )
					if( ad_mf <= -3190.43 )
						if( ad <= -6126.19 )
							ret := 0.042418
						if( ad > -6126.19 )
							ret := 0.232190
					if( ad_mf > -3190.43 )
						if( ad <= -2006.83 )
							ret := -0.215328
						if( ad > -2006.83 )
							ret := 0.019698
				if( mf > 0.187569 )
					if( ad_mf <= -377879 )
						if( ad <= -2.16141e+06 )
							ret := -0.368421
						if( ad > -2.16141e+06 )
							ret := 0.378378
					if( ad_mf > -377879 )
						if( VIP_VIM <= 0.247331 )
							ret := -0.018933
						if( VIP_VIM > 0.247331 )
							ret := 0.196404
			if( ad_mf > -0.329157 )
				if( VIP_VIM <= 0.178498 )
					ret := 0.100000
				if( VIP_VIM > 0.178498 )
					if( ad_mf <= -0.306428 )
						ret := -0.941176 // sell
					if( ad_mf > -0.306428 )
						ret := -0.588235
		if( ad_mf > -0.291327 )
			if( VIP <= 1.12464 )
				if( VIP_VIM <= -0.120768 )
					if( VIP <= 0.807199 )
						ret := 0.619048
					if( VIP > 0.807199 )
						if( mf <= 0.067593 )
							ret := 0.450000
						if( mf > 0.067593 )
							ret := -0.412500
				if( VIP_VIM > -0.120768 )
					if( VIP <= 1.05262 )
						if( mf <= 0.063489 )
							ret := -0.153846
						if( mf > 0.063489 )
							ret := 0.630769
					if( VIP > 1.05262 )
						if( ad_mf <= -0.092642 )
							ret := 0.708333 // buy
						if( ad_mf > -0.092642 )
							ret := 1.000000 // buy
			if( VIP > 1.12464 )
				if( VIP <= 1.22101 )
					if( VIP <= 1.18203 )
						if( mf <= 0.075871 )
							ret := -0.666667
						if( mf > 0.075871 )
							ret := 0.204082
					if( VIP > 1.18203 )
						if( VIM <= 0.866494 )
							ret := 0.000000
						if( VIM > 0.866494 )
							ret := -0.671429
				if( VIP > 1.22101 )
					if( mf <= 0.165063 )
						if( mf <= 0.095754 )
							ret := 0.102564
						if( mf > 0.095754 )
							ret := -0.484848
					if( mf > 0.165063 )
						if( VIM <= 0.847056 )
							ret := 0.679012
						if( VIM > 0.847056 )
							ret := 0.150000
	if( ad_mf > -0.040777 )
		if( ad_mf <= 15809.5 )
			if( VIP <= 0.776073 )
				if( ad_mf <= 8414.25 )
					if( mf <= -0.18699 )
						if( ad_mf <= 0.37219 )
							ret := -0.838384 // sell
						if( ad_mf > 0.37219 )
							ret := -0.440594
					if( mf > -0.18699 )
						if( ad_mf <= 0.115612 )
							ret := -0.550000
						if( ad_mf > 0.115612 )
							ret := -0.131148
				if( ad_mf > 8414.25 )
					if( ad <= 9658.73 )
						ret := 0.705882 // buy
					if( ad > 9658.73 )
						if( VIP <= 0.66982 )
							ret := 0.454545
						if( VIP > 0.66982 )
							ret := -0.277778
			if( VIP > 0.776073 )
				if( ad <= 12262.2 )
					if( mf <= -0.18284 )
						if( VIP <= 1.11523 )
							ret := -0.019906
						if( VIP > 1.11523 )
							ret := 0.551282
					if( mf > -0.18284 )
						if( VIP_VIM <= 0.365705 )
							ret := -0.177112
						if( VIP_VIM > 0.365705 )
							ret := 0.012030
				if( ad > 12262.2 )
					if( ad_mf <= 15633.3 )
						if( ad_mf <= 13705.7 )
							ret := -0.659091
						if( ad_mf > 13705.7 )
							ret := -0.166667
					if( ad_mf > 15633.3 )
						ret := -1.000000 // sell
		if( ad_mf > 15809.5 )
			if( mf <= 0.209761 )
				if( ad <= 17155.3 )
					if( VIM <= 1.14632 )
						if( ad <= 16775.8 )
							ret := 1.000000 // buy
						if( ad > 16775.8 )
							ret := 0.814815 // buy
					if( VIM > 1.14632 )
						if( VIP <= 0.872834 )
							ret := 0.166667
						if( VIP > 0.872834 )
							ret := -0.818182 // sell
				if( ad > 17155.3 )
					if( VIM <= 0.877532 )
						if( VIP <= 1.14029 )
							ret := -0.404412
						if( VIP > 1.14029 )
							ret := -0.068306
					if( VIM > 0.877532 )
						if( VIP_VIM <= -0.332143 )
							ret := -0.095902
						if( VIP_VIM > -0.332143 )
							ret := 0.038722
			if( mf > 0.209761 )
				if( ad <= 2.7115e+06 )
					if( ad_mf <= 2.38016e+06 )
						if( ad <= 2.00502e+06 )
							ret := 0.165236
						if( ad > 2.00502e+06 )
							ret := -0.275362
					if( ad_mf > 2.38016e+06 )
						if( VIM <= 0.646773 )
							ret := -0.111111
						if( VIM > 0.646773 )
							ret := 0.705882 // buy
				if( ad > 2.7115e+06 )
					if( ad_mf <= 2.92257e+06 )
						if( VIM <= 0.722224 )
							ret := -0.750000 // sell
						if( VIM > 0.722224 )
							ret := -1.000000 // sell
					if( ad_mf > 2.92257e+06 )
						if( ad_mf <= 9.55374e+06 )
							ret := 0.006757
						if( ad_mf > 9.55374e+06 )
							ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_PTON_1Hour_a7ae36bb(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


