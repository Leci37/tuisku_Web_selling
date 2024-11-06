//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: PTON_15Min_2TV0_fc02d4a7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_15Min_2TV0_fc02d4a7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_15Min_fc02d4a7(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -0.00047 )
		if( ema13 <= -4.41912 )
			if( ema3 <= 114.357 )
				if( tema <= 82.4725 )
					if( tema <= 59.4675 )
						ret := -0.850000 // sell
					if( tema > 59.4675 )
						ret := -1.000000 // sell
				if( tema > 82.4725 )
					if( ema3 <= 95.0065 )
						ret := -0.583333
					if( ema3 > 95.0065 )
						ret := -1.000000 // sell
			if( ema3 > 114.357 )
				if( VIP_VIM <= -0.727274 )
					ret := 0.631579
				if( VIP_VIM > -0.727274 )
					if( ema2 <= 118.691 )
						ret := -0.727273 // sell
					if( ema2 > 118.691 )
						ret := -0.600000
		if( ema13 > -4.41912 )
			if( ema3 <= 3.05174 )
				if( VIP <= 1.6046 )
					if( ema2 <= 3.01818 )
						if( VIP_VIM <= -0.145267 )
							if( VIM <= 1.30976 )
								if( ema1 <= 2.91571 )
									ret := 0.750000 // buy
								if( ema1 > 2.91571 )
									ret := -0.078125
							if( VIM > 1.30976 )
								if( tema <= 2.91468 )
									ret := 0.766667 // buy
								if( tema > 2.91468 )
									ret := 0.363636
						if( VIP_VIM > -0.145267 )
							if( ema1 <= 2.9686 )
								if( ema3 <= 2.93593 )
									ret := 0.583333
								if( ema3 > 2.93593 )
									ret := 0.972222 // buy
							if( ema1 > 2.9686 )
								if( ema1 <= 2.98804 )
									ret := 0.384615
								if( ema1 > 2.98804 )
									ret := 0.083333
					if( ema2 > 3.01818 )
						if( ema12 <= -0.007271 )
							ret := 0.384615
						if( ema12 > -0.007271 )
							if( VIP <= 1.08619 )
								ret := 0.571429
							if( VIP > 1.08619 )
								ret := 1.000000 // buy
				if( VIP > 1.6046 )
					ret := -0.866667 // sell
			if( ema3 > 3.05174 )
				if( ema13 <= -0.531074 )
					if( ema1 <= 40.0077 )
						if( ema3 <= 20.0038 )
							if( tema <= 6.24988 )
								if( VIM <= 1.35627 )
									ret := 0.818182 // buy
								if( VIM > 1.35627 )
									ret := -0.666667
							if( tema > 6.24988 )
								if( VIM <= 1.19509 )
									ret := 0.250000
								if( VIM > 1.19509 )
									ret := 0.862385 // buy
						if( ema3 > 20.0038 )
							if( ema13 <= -0.694143 )
								if( ema13 <= -1.85306 )
									ret := -0.608696
								if( ema13 > -1.85306 )
									ret := 0.457784
							if( ema13 > -0.694143 )
								if( ema1 <= 24.389 )
									ret := -0.459459
								if( ema1 > 24.389 )
									ret := 0.179954
					if( ema1 > 40.0077 )
						if( tema <= 41.9102 )
							if( ema13 <= -0.812141 )
								if( ema2 <= 41.8014 )
									ret := -0.600000
								if( ema2 > 41.8014 )
									ret := -0.962264 // sell
							if( ema13 > -0.812141 )
								if( ema13 <= -0.642322 )
									ret := 0.450000
								if( ema13 > -0.642322 )
									ret := -0.653846
						if( tema > 41.9102 )
							if( ema12 <= -0.909599 )
								if( ema1 <= 148.246 )
									ret := 0.248632
								if( ema1 > 148.246 )
									ret := -0.317829
							if( ema12 > -0.909599 )
								if( ema3 <= 115.056 )
									ret := 0.087879
								if( ema3 > 115.056 )
									ret := -0.091151
				if( ema13 > -0.531074 )
					if( ema1 <= 9.25034 )
						if( ema1 <= 9.01634 )
							if( VIP_VIM <= -0.130511 )
								if( tema <= 4.54965 )
									ret := 0.113450
								if( tema > 4.54965 )
									ret := -0.039041
							if( VIP_VIM > -0.130511 )
								if( VIM <= 3.52303 )
									ret := 0.128339
								if( VIM > 3.52303 )
									ret := 0.688525
						if( ema1 > 9.01634 )
							if( ema1 <= 9.11963 )
								if( ema2 <= 9.06576 )
									ret := 0.033333
								if( ema2 > 9.06576 )
									ret := 0.699634
							if( ema1 > 9.11963 )
								if( ema13 <= -0.209039 )
									ret := -0.263158
								if( ema13 > -0.209039 )
									ret := 0.400794
					if( ema1 > 9.25034 )
						if( tema <= 9.20753 )
							if( VIM <= 1.15711 )
								if( ema13 <= -0.08059 )
									ret := -1.000000 // sell
								if( ema13 > -0.08059 )
									ret := -0.875000 // sell
							if( VIM > 1.15711 )
								if( VIP_VIM <= -0.765711 )
									ret := -0.810811 // sell
								if( VIP_VIM > -0.765711 )
									ret := -0.266667
						if( tema > 9.20753 )
							if( VIM <= 5.53537 )
								if( ema1 <= 31.6075 )
									ret := 0.024227
								if( ema1 > 31.6075 )
									ret := -0.033692
							if( VIM > 5.53537 )
								if( VIP_VIM <= 0.04902 )
									ret := 0.829268 // buy
								if( VIP_VIM > 0.04902 )
									ret := 0.272727
	if( ema12 > -0.00047 )
		if( ema3 <= 3.04278 )
			if( tema <= 2.96141 )
				if( ema12 <= 0.005403 )
					if( ema12 <= 0.001258 )
						ret := 0.866667 // buy
					if( ema12 > 0.001258 )
						ret := 1.000000 // buy
				if( ema12 > 0.005403 )
					if( VIP <= 1.36597 )
						ret := 0.769231 // buy
					if( VIP > 1.36597 )
						ret := 0.600000
			if( tema > 2.96141 )
				if( VIP <= 2.18458 )
					if( VIM <= 0.875835 )
						if( ema12 <= 0.039179 )
							if( ema2 <= 3.04764 )
								if( ema3 <= 2.94666 )
									ret := 0.703704 // buy
								if( ema3 > 2.94666 )
									ret := 0.139535
							if( ema2 > 3.04764 )
								ret := -0.764706 // sell
						if( ema12 > 0.039179 )
							if( ema12 <= 0.042491 )
								ret := 1.000000 // buy
							if( ema12 > 0.042491 )
								ret := 0.727273 // buy
					if( VIM > 0.875835 )
						if( ema3 <= 3.01603 )
							if( ema12 <= 0.020387 )
								if( tema <= 3.00398 )
									ret := 0.857143 // buy
								if( tema > 3.00398 )
									ret := 0.069767
							if( ema12 > 0.020387 )
								ret := -0.555556
						if( ema3 > 3.01603 )
							if( VIP <= 1.3734 )
								if( tema <= 3.05953 )
									ret := 0.788462 // buy
								if( tema > 3.05953 )
									ret := 0.250000
							if( VIP > 1.3734 )
								if( VIP_VIM <= -0.200343 )
									ret := 0.777778 // buy
								if( VIP_VIM > -0.200343 )
									ret := 1.000000 // buy
				if( VIP > 2.18458 )
					if( ema1 <= 2.96676 )
						ret := -0.500000
					if( ema1 > 2.96676 )
						ret := -0.937500 // sell
		if( ema3 > 3.04278 )
			if( ema12 <= 0.512849 )
				if( VIP <= 1.29239 )
					if( ema2 <= 3.12699 )
						if( VIM <= 0.880233 )
							if( ema12 <= 0.013386 )
								ret := 0.538462
							if( ema12 > 0.013386 )
								ret := -0.466667
						if( VIM > 0.880233 )
							if( ema12 <= 0.001169 )
								ret := -0.133333
							if( ema12 > 0.001169 )
								if( VIP <= 1.24124 )
									ret := -0.867769 // sell
								if( VIP > 1.24124 )
									ret := -0.470588
					if( ema2 > 3.12699 )
						if( ema12 <= 0.284273 )
							if( VIM <= 0.67203 )
								if( VIP_VIM <= 0.44731 )
									ret := 0.555556
								if( VIP_VIM > 0.44731 )
									ret := -0.422819
							if( VIM > 0.67203 )
								if( VIM <= 0.680724 )
									ret := 0.756098 // buy
								if( VIM > 0.680724 )
									ret := -0.004350
						if( ema12 > 0.284273 )
							if( VIM <= 0.759447 )
								if( tema <= 78.3153 )
									ret := 0.172161
								if( tema > 78.3153 )
									ret := -0.416667
							if( VIM > 0.759447 )
								if( ema13 <= 0.594956 )
									ret := -0.306652
								if( ema13 > 0.594956 )
									ret := -0.088875
				if( VIP > 1.29239 )
					if( VIP_VIM <= -0.058691 )
						if( VIM <= 1.73028 )
							if( ema1 <= 9.38905 )
								if( ema3 <= 4.55326 )
									ret := -0.187500
								if( ema3 > 4.55326 )
									ret := -0.721239 // sell
							if( ema1 > 9.38905 )
								if( VIM <= 1.47312 )
									ret := -0.089552
								if( VIM > 1.47312 )
									ret := -0.432039
						if( VIM > 1.73028 )
							if( ema12 <= 0.007417 )
								if( VIP_VIM <= -0.217578 )
									ret := -0.504630
								if( VIP_VIM > -0.217578 )
									ret := 0.066667
							if( ema12 > 0.007417 )
								if( ema3 <= 10.6625 )
									ret := 0.144404
								if( ema3 > 10.6625 )
									ret := -0.186411
					if( VIP_VIM > -0.058691 )
						if( ema1 <= 3.98466 )
							if( ema12 <= 0.005881 )
								if( VIP_VIM <= 0.198524 )
									ret := 0.200000
								if( VIP_VIM > 0.198524 )
									ret := -0.210938
							if( ema12 > 0.005881 )
								if( ema3 <= 3.63978 )
									ret := -0.374517
								if( ema3 > 3.63978 )
									ret := -0.788462 // sell
						if( ema1 > 3.98466 )
							if( tema <= 4.38169 )
								if( VIP_VIM <= 0.367817 )
									ret := 0.465753
								if( VIP_VIM > 0.367817 )
									ret := -0.131579
							if( tema > 4.38169 )
								if( ema3 <= 4.48459 )
									ret := -0.484848
								if( ema3 > 4.48459 )
									ret := -0.104590
			if( ema12 > 0.512849 )
				if( ema12 <= 0.993984 )
					if( ema2 <= 20.6594 )
						if( ema12 <= 0.585139 )
							ret := 1.000000 // buy
						if( ema12 > 0.585139 )
							if( VIM <= 0.679015 )
								ret := -0.111111
							if( VIM > 0.679015 )
								ret := 1.000000 // buy
					if( ema2 > 20.6594 )
						if( ema1 <= 29.0463 )
							if( VIP <= 1.11446 )
								ret := 0.636364
							if( VIP > 1.11446 )
								if( VIM <= 0.823963 )
									ret := -0.821053 // sell
								if( VIM > 0.823963 )
									ret := -0.250000
						if( ema1 > 29.0463 )
							if( VIP <= 1.22613 )
								if( ema3 <= 29.6913 )
									ret := 0.888889 // buy
								if( ema3 > 29.6913 )
									ret := 0.021968
							if( VIP > 1.22613 )
								if( tema <= 47.9294 )
									ret := 0.534799
								if( tema > 47.9294 )
									ret := 0.153439
				if( ema12 > 0.993984 )
					if( ema2 <= 112.961 )
						if( ema1 <= 109.157 )
							if( VIP <= 1.05534 )
								ret := 0.789474 // buy
							if( VIP > 1.05534 )
								if( ema3 <= 100.272 )
									ret := 0.112903
								if( ema3 > 100.272 )
									ret := -0.420765
						if( ema1 > 109.157 )
							if( ema2 <= 111.238 )
								if( tema <= 112.424 )
									ret := 0.250000
								if( tema > 112.424 )
									ret := 0.808219 // buy
							if( ema2 > 111.238 )
								if( VIM <= 0.689452 )
									ret := 0.410256
								if( VIM > 0.689452 )
									ret := -0.466667
					if( ema2 > 112.961 )
						if( tema <= 151.14 )
							if( ema3 <= 120.128 )
								if( tema <= 118.951 )
									ret := -0.581081
								if( tema > 118.951 )
									ret := 0.134021
							if( ema3 > 120.128 )
								if( VIP_VIM <= 0.457158 )
									ret := -0.430769
								if( VIP_VIM > 0.457158 )
									ret := -0.820513 // sell
						if( tema > 151.14 )
							if( ema12 <= 1.21124 )
								if( VIM <= 0.791086 )
									ret := -0.472222
								if( VIM > 0.791086 )
									ret := 0.272727
							if( ema12 > 1.21124 )
								if( ema2 <= 157.208 )
									ret := 0.100000
								if( ema2 > 157.208 )
									ret := 0.722222 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3



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
float op_operation = decision_tree_0_PTON_15Min_fc02d4a7(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


