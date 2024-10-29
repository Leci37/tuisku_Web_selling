//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: ZI_5Min_2BV0_7cd42f4e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_5Min_2BV0_7cd42f4e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_5Min_7cd42f4e(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP_VIM, VIP, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bearPower <= 0.083082 )
		if( bbm <= 0.00411 )
			if( bbp <= 0.045822 )
				if( bbp <= -0.097535 )
					if( VIM <= 1.9937 )
						if( VIP <= 1.2121 )
							ret := 0.415254
						if( VIP > 1.2121 )
							ret := 0.795745 // buy
					if( VIM > 1.9937 )
						if( VIP_VIM <= 0.001451 )
							ret := 0.135036
						if( VIP_VIM > 0.001451 )
							ret := 0.742574 // buy
				if( bbp > -0.097535 )
					if( VIP_VIM <= 0.116043 )
						if( VIM <= 1.07947 )
							ret := 0.369565
						if( VIM > 1.07947 )
							ret := 0.044932
					if( VIP_VIM > 0.116043 )
						if( VIP <= 2.14706 )
							ret := 0.555184
						if( VIP > 2.14706 )
							ret := 0.047619
			if( bbp > 0.045822 )
				if( VIP <= 1.28124 )
					if( VIP_VIM <= 0.02003 )
						if( VIP <= 1.19819 )
							ret := -0.500000
						if( VIP > 1.19819 )
							ret := 0.105263
					if( VIP_VIM > 0.02003 )
						if( bullPower <= 0.029286 )
							ret := 1.000000 // buy
						if( bullPower > 0.029286 )
							ret := 0.132075
				if( VIP > 1.28124 )
					if( VIP_VIM <= -0.435842 )
						if( VIM <= 5.18757 )
							ret := -0.295455
						if( VIM > 5.18757 )
							ret := 0.521739
					if( VIP_VIM > -0.435842 )
						if( VIP_VIM <= -0.05215 )
							ret := -0.785714 // sell
						if( VIP_VIM > -0.05215 )
							ret := -0.401003
		if( bbm > 0.00411 )
			if( bearPower <= -0.172282 )
				if( VIM <= 2.54456 )
					if( bullPower <= -0.235498 )
						if( VIM <= 1.73535 )
							ret := 0.422053
						if( VIM > 1.73535 )
							ret := -0.220930
					if( bullPower > -0.235498 )
						if( VIM <= 1.20597 )
							ret := -0.332765
						if( VIM > 1.20597 )
							ret := -0.092797
				if( VIM > 2.54456 )
					if( VIM <= 4.6516 )
						if( bullPower <= -0.075413 )
							ret := -0.794118 // sell
						if( bullPower > -0.075413 )
							ret := -0.395833
					if( VIM > 4.6516 )
						if( VIP_VIM <= -0.633939 )
							ret := 0.666667
						if( VIP_VIM > -0.633939 )
							ret := -0.571429
			if( bearPower > -0.172282 )
				if( bullPower <= 0.07313 )
					if( bullPower <= -0.106963 )
						if( VIP_VIM <= -0.883267 )
							ret := -0.120690
						if( VIP_VIM > -0.883267 )
							ret := 0.568627
					if( bullPower > -0.106963 )
						if( VIP_VIM <= -0.662053 )
							ret := -0.138131
						if( VIP_VIM > -0.662053 )
							ret := 0.005131
				if( bullPower > 0.07313 )
					if( VIP_VIM <= -0.059624 )
						if( VIP_VIM <= -0.205155 )
							ret := 0.107438
						if( VIP_VIM > -0.205155 )
							ret := -0.233766
					if( VIP_VIM > -0.059624 )
						if( VIM <= 0.572091 )
							ret := -0.339450
						if( VIM > 0.572091 )
							ret := 0.121434
	if( bearPower > 0.083082 )
		if( bbm <= 0.009998 )
			if( VIP <= 4.18152 )
				if( VIM <= 1.81057 )
					if( VIP_VIM <= -0.484697 )
						ret := 0.625000
					if( VIP_VIM > -0.484697 )
						if( VIP <= 1.87159 )
							ret := -0.643137
						if( VIP > 1.87159 )
							ret := 0.080000
				if( VIM > 1.81057 )
					if( VIP_VIM <= -0.071006 )
						if( VIP <= 1.11116 )
							ret := -0.666667
						if( VIP > 1.11116 )
							ret := -0.973118 // sell
					if( VIP_VIM > -0.071006 )
						if( bbp <= 0.384204 )
							ret := -0.627586
						if( bbp > 0.384204 )
							ret := -0.944444 // sell
			if( VIP > 4.18152 )
				if( bullPower <= 0.092819 )
					ret := -1.000000 // sell
				if( bullPower > 0.092819 )
					if( VIP_VIM <= 0.985676 )
						if( VIP <= 5.82792 )
							ret := 0.812500 // buy
						if( VIP > 5.82792 )
							ret := -0.043478
					if( VIP_VIM > 0.985676 )
						ret := -0.916667 // sell
		if( bbm > 0.009998 )
			if( VIP_VIM <= 0.94537 )
				if( bbp <= 0.406056 )
					if( bullPower <= 0.205985 )
						if( VIM <= 0.625509 )
							ret := -0.617284
						if( VIM > 0.625509 )
							ret := -0.079956
					if( bullPower > 0.205985 )
						if( bullPower <= 0.22279 )
							ret := 0.313084
						if( bullPower > 0.22279 )
							ret := 0.010274
				if( bbp > 0.406056 )
					if( bearPower <= 0.792314 )
						if( VIM <= 0.561622 )
							ret := -1.000000 // sell
						if( VIM > 0.561622 )
							ret := -0.383803
					if( bearPower > 0.792314 )
						ret := 1.000000 // buy
			if( VIP_VIM > 0.94537 )
				if( bbp <= 0.427999 )
					if( VIP <= 1.52382 )
						if( VIP_VIM <= 1.01235 )
							ret := 0.700000 // buy
						if( VIP_VIM > 1.01235 )
							ret := -0.300000
					if( VIP > 1.52382 )
						if( VIP <= 1.86247 )
							ret := -0.114754
						if( VIP > 1.86247 )
							ret := -0.618182
				if( bbp > 0.427999 )
					if( bearPower <= 0.273938 )
						if( VIP <= 1.88865 )
							ret := 0.926471 // buy
						if( VIP > 1.88865 )
							ret := 0.588235
					if( bearPower > 0.273938 )
						ret := -0.333333
	
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
float op_operation = decision_tree_0_ZI_5Min_7cd42f4e(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP_VIM, VIP, VIM)

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


