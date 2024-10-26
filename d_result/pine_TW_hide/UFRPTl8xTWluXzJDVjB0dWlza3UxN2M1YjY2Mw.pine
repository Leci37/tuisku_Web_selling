//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: PTON_1Min_2CV0_17c5b663 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_1Min_2CV0_17c5b663", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_1Min_17c5b663(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad_mf <= -0.471118 )
		if( VIM <= 1.43407 )
			if( VIM <= 0.92872 )
				if( ad_mf <= -2510.51 )
					if( ad_mf <= -2747.37 )
						if( VIM <= 0.606001 )
							ret := -0.339450
						if( VIM > 0.606001 )
							ret := 0.027089
					if( ad_mf > -2747.37 )
						if( VIP <= 1.28584 )
							ret := -0.505376
						if( VIP > 1.28584 )
							ret := 0.555556
				if( ad_mf > -2510.51 )
					if( ad_mf <= -1589.33 )
						if( ad <= -1668.5 )
							ret := 0.258575
						if( ad > -1668.5 )
							ret := 0.724138 // buy
					if( ad_mf > -1589.33 )
						if( ad_mf <= -0.542753 )
							ret := -0.011730
						if( ad_mf > -0.542753 )
							ret := 0.404959
			if( VIM > 0.92872 )
				if( ad_mf <= -2875.96 )
					if( VIP <= 1.55323 )
						if( VIP_VIM <= 0.335068 )
							ret := 0.109813
						if( VIP_VIM > 0.335068 )
							ret := -0.411765
					if( VIP > 1.55323 )
						if( ad <= -4097.5 )
							ret := -0.435897
						if( ad > -4097.5 )
							ret := 0.636364
				if( ad_mf > -2875.96 )
					if( VIP <= 0.614337 )
						ret := 0.950000 // buy
					if( VIP > 0.614337 )
						if( mf <= -0.467536 )
							ret := -0.075000
						if( mf > -0.467536 )
							ret := 0.183754
		if( VIM > 1.43407 )
			if( VIP_VIM <= 0.597909 )
				if( ad_mf <= -0.541669 )
					if( VIP_VIM <= 0.244775 )
						if( VIP <= 1.99398 )
							ret := 0.352986
						if( VIP > 1.99398 )
							ret := 0.625268
					if( VIP_VIM > 0.244775 )
						if( ad_mf <= -8325.9 )
							ret := -0.538462
						if( ad_mf > -8325.9 )
							ret := 0.323171
				if( ad_mf > -0.541669 )
					if( VIM <= 3.265 )
						if( VIP <= 1.99242 )
							ret := 0.764706 // buy
						if( VIP > 1.99242 )
							ret := -0.704545 // sell
					if( VIM > 3.265 )
						if( ad_mf <= -0.488675 )
							ret := 0.080000
						if( ad_mf > -0.488675 )
							ret := 0.866667 // buy
			if( VIP_VIM > 0.597909 )
				if( mf <= 0.699889 )
					if( ad_mf <= -0.542857 )
						if( VIM <= 1.97378 )
							ret := 0.240741
						if( VIM > 1.97378 )
							ret := -0.267123
					if( ad_mf > -0.542857 )
						if( VIP <= 4.26365 )
							ret := 0.105263
						if( VIP > 4.26365 )
							ret := 0.538462
				if( mf > 0.699889 )
					if( VIP_VIM <= 1.57306 )
						if( VIP_VIM <= 1.00038 )
							ret := -0.727273 // sell
						if( VIP_VIM > 1.00038 )
							ret := -1.000000 // sell
					if( VIP_VIM > 1.57306 )
						ret := -0.300000
	if( ad_mf > -0.471118 )
		if( ad_mf <= 865.319 )
			if( VIP_VIM <= 0.334681 )
				if( VIP_VIM <= -0.657506 )
					if( VIM <= 4.205 )
						if( ad_mf <= -0.215245 )
							ret := -0.066116
						if( ad_mf > -0.215245 )
							ret := 0.345525
					if( VIM > 4.205 )
						if( VIP <= 4.12195 )
							ret := -0.404651
						if( VIP > 4.12195 )
							ret := 0.159292
				if( VIP_VIM > -0.657506 )
					if( VIP <= 588 )
						if( VIP <= 0.86852 )
							ret := -0.084261
						if( VIP > 0.86852 )
							ret := 0.034686
					if( VIP > 588 )
						if( ad_mf <= -0.013725 )
							ret := -0.929825 // sell
						if( ad_mf > -0.013725 )
							ret := 0.090909
			if( VIP_VIM > 0.334681 )
				if( VIM <= 0.739003 )
					if( ad_mf <= 0.077626 )
						if( VIP <= 1.26484 )
							ret := -0.073171
						if( VIP > 1.26484 )
							ret := -0.487324
					if( ad_mf > 0.077626 )
						if( VIM <= 0.699349 )
							ret := 0.379310
						if( VIM > 0.699349 )
							ret := -0.230769
				if( VIM > 0.739003 )
					if( ad <= 829.843 )
						if( VIP_VIM <= 0.67378 )
							ret := -0.084712
						if( VIP_VIM > 0.67378 )
							ret := -0.216880
					if( ad > 829.843 )
						ret := 0.928571 // buy
		if( ad_mf > 865.319 )
			if( ad_mf <= 7049.66 )
				if( VIP_VIM <= 0.371339 )
					if( ad <= 1648.76 )
						if( mf <= 0.108258 )
							ret := -0.316783
						if( mf > 0.108258 )
							ret := -0.047619
					if( ad > 1648.76 )
						if( ad_mf <= 4612.79 )
							ret := -0.103893
						if( ad_mf > 4612.79 )
							ret := -0.197730
				if( VIP_VIM > 0.371339 )
					if( VIM <= 0.812042 )
						if( mf <= -0.052238 )
							ret := 0.220000
						if( mf > -0.052238 )
							ret := -0.196541
					if( VIM > 0.812042 )
						if( ad <= 2515.49 )
							ret := -0.656790
						if( ad > 2515.49 )
							ret := -0.425676
			if( ad_mf > 7049.66 )
				if( mf <= -0.333563 )
					if( mf <= -0.360398 )
						if( ad <= 7212.66 )
							ret := 0.705882 // buy
						if( ad > 7212.66 )
							ret := -0.206327
					if( mf > -0.360398 )
						if( ad <= 25139.7 )
							ret := -0.376147
						if( ad > 25139.7 )
							ret := -0.746032 // sell
				if( mf > -0.333563 )
					if( ad <= 7729.98 )
						if( VIM <= 1.29813 )
							ret := 0.151724
						if( VIM > 1.29813 )
							ret := -0.322581
					if( ad > 7729.98 )
						if( VIP_VIM <= 0.961007 )
							ret := -0.085123
						if( VIP_VIM > 0.961007 )
							ret := -0.553191
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PTON_1Min_17c5b663(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


