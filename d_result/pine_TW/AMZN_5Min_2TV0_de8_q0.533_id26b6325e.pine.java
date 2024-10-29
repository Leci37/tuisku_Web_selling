//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: AMZN_5Min_2TV0_26b6325e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_5Min_2TV0_26b6325e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_5Min_26b6325e(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tema <= 128.387 )
		if( ema12 <= 0.162557 )
			if( ema12 <= -1.78951 )
				if( VIP <= 0.622925 )
					ret := -0.250000
				if( VIP > 0.622925 )
					ret := -1.000000 // sell
			if( ema12 > -1.78951 )
				if( tema <= 104.113 )
					if( ema13 <= -0.094584 )
						if( ema1 <= 103.873 )
							if( VIP <= 0.757293 )
								if( ema13 <= -0.566974 )
									ret := 0.850000 // buy
								if( ema13 > -0.566974 )
									ret := 0.375000
							if( VIP > 0.757293 )
								if( VIM <= 1.24603 )
									ret := -0.455285
								if( VIM > 1.24603 )
									ret := 0.700000 // buy
						if( ema1 > 103.873 )
							if( ema13 <= -0.432203 )
								if( ema12 <= -0.265281 )
									ret := 0.583333
								if( ema12 > -0.265281 )
									ret := -0.916667 // sell
							if( ema13 > -0.432203 )
								if( VIP_VIM <= -0.119594 )
									ret := 0.723077 // buy
								if( VIP_VIM > -0.119594 )
									ret := 0.090909
					if( ema13 > -0.094584 )
						if( ema13 <= 0.303024 )
							if( VIM <= 0.891183 )
								if( tema <= 101.709 )
									ret := 0.000000
								if( tema > 101.709 )
									ret := 0.738636 // buy
							if( VIM > 0.891183 )
								if( ema13 <= -0.007887 )
									ret := 0.522222
								if( ema13 > -0.007887 )
									ret := 0.120690
						if( ema13 > 0.303024 )
							ret := -0.750000 // sell
				if( tema > 104.113 )
					if( ema1 <= 106.48 )
						if( tema <= 105.459 )
							if( ema3 <= 105.243 )
								if( VIP_VIM <= -0.166808 )
									ret := 0.258621
								if( VIP_VIM > -0.166808 )
									ret := -0.186301
							if( ema3 > 105.243 )
								if( ema13 <= -0.232995 )
									ret := 0.764151 // buy
								if( ema13 > -0.232995 )
									ret := 0.328571
						if( tema > 105.459 )
							if( ema13 <= 0.15136 )
								if( ema13 <= -0.225175 )
									ret := -0.645833
								if( ema13 > -0.225175 )
									ret := -0.058939
							if( ema13 > 0.15136 )
								if( VIP <= 1.11435 )
									ret := -0.172414
								if( VIP > 1.11435 )
									ret := -0.867925 // sell
					if( ema1 > 106.48 )
						if( ema3 <= 110.712 )
							if( ema12 <= -0.3085 )
								if( ema13 <= -0.562143 )
									ret := 0.102041
								if( ema13 > -0.562143 )
									ret := -0.954545 // sell
							if( ema12 > -0.3085 )
								if( ema13 <= 0.156722 )
									ret := 0.405882
								if( ema13 > 0.156722 )
									ret := 0.134328
						if( ema3 > 110.712 )
							if( ema2 <= 112.247 )
								if( ema13 <= -0.164916 )
									ret := -0.587302
								if( ema13 > -0.164916 )
									ret := -0.016393
							if( ema2 > 112.247 )
								if( ema1 <= 112.707 )
									ret := 0.649123
								if( ema1 > 112.707 )
									ret := 0.124353
		if( ema12 > 0.162557 )
			if( ema3 <= 111.051 )
				if( tema <= 103.128 )
					if( VIP <= 1.19701 )
						ret := 1.000000 // buy
					if( VIP > 1.19701 )
						ret := 0.500000
				if( tema > 103.128 )
					if( ema12 <= 0.299192 )
						if( VIP <= 1.02527 )
							ret := 1.000000 // buy
						if( VIP > 1.02527 )
							if( ema1 <= 106.07 )
								if( VIP <= 1.3179 )
									ret := -0.800000 // sell
								if( VIP > 1.3179 )
									ret := -0.111111
							if( ema1 > 106.07 )
								if( ema13 <= 0.594625 )
									ret := -0.398438
								if( ema13 > 0.594625 )
									ret := 0.166667
					if( ema12 > 0.299192 )
						if( VIP_VIM <= 0.361828 )
							if( ema1 <= 104.075 )
								ret := -1.000000 // sell
							if( ema1 > 104.075 )
								if( ema3 <= 108.041 )
									ret := 0.914286 // buy
								if( ema3 > 108.041 )
									ret := -0.250000
						if( VIP_VIM > 0.361828 )
							if( ema12 <= 0.477847 )
								if( ema1 <= 104.374 )
									ret := -0.727273 // sell
								if( ema1 > 104.374 )
									ret := 0.075000
							if( ema12 > 0.477847 )
								if( VIP_VIM <= 0.671081 )
									ret := -0.965517 // sell
								if( VIP_VIM > 0.671081 )
									ret := -0.611111
			if( ema3 > 111.051 )
				if( ema2 <= 111.984 )
					if( tema <= 112.18 )
						ret := 0.250000
					if( tema > 112.18 )
						if( ema3 <= 111.608 )
							ret := 1.000000 // buy
						if( ema3 > 111.608 )
							ret := 0.750000 // buy
				if( ema2 > 111.984 )
					if( ema12 <= 0.491935 )
						if( tema <= 126.256 )
							if( VIM <= 0.767445 )
								if( VIP <= 1.46735 )
									ret := -0.410480
								if( VIP > 1.46735 )
									ret := 0.423077
							if( VIM > 0.767445 )
								if( ema3 <= 121.556 )
									ret := 0.060976
								if( ema3 > 121.556 )
									ret := 0.407666
						if( tema > 126.256 )
							if( ema12 <= 0.352659 )
								if( VIP <= 1.24149 )
									ret := -0.536458
								if( VIP > 1.24149 )
									ret := 0.043860
							if( ema12 > 0.352659 )
								if( VIP_VIM <= 0.603202 )
									ret := 0.689655
								if( VIP_VIM > 0.603202 )
									ret := 0.095238
					if( ema12 > 0.491935 )
						if( ema13 <= 1.48833 )
							if( VIP_VIM <= 1.0101 )
								if( VIP_VIM <= 0.270793 )
									ret := 0.300000
								if( VIP_VIM > 0.270793 )
									ret := 0.942308 // buy
							if( VIP_VIM > 1.0101 )
								ret := -0.500000
						if( ema13 > 1.48833 )
							if( tema <= 125.008 )
								if( ema12 <= 0.867452 )
									ret := -0.500000
								if( ema12 > 0.867452 )
									ret := -0.950000 // sell
							if( tema > 125.008 )
								if( ema12 <= 1.20748 )
									ret := -0.500000
								if( ema12 > 1.20748 )
									ret := 1.000000 // buy
	if( tema > 128.387 )
		if( ema1 <= 128.624 )
			if( VIM <= 0.694044 )
				if( tema <= 128.847 )
					if( ema1 <= 128.213 )
						if( ema1 <= 128.173 )
							ret := 1.000000 // buy
						if( ema1 > 128.173 )
							ret := 0.500000
					if( ema1 > 128.213 )
						ret := 1.000000 // buy
				if( tema > 128.847 )
					if( VIM <= 0.582335 )
						ret := 0.000000
					if( VIM > 0.582335 )
						ret := -1.000000 // sell
			if( VIM > 0.694044 )
				if( ema13 <= 0.836984 )
					if( VIP_VIM <= 0.557178 )
						if( ema1 <= 128.507 )
							if( ema2 <= 128.48 )
								if( ema3 <= 128.286 )
									ret := -0.601156
								if( ema3 > 128.286 )
									ret := 0.333333
							if( ema2 > 128.48 )
								if( VIP_VIM <= -0.140261 )
									ret := -0.666667
								if( VIP_VIM > -0.140261 )
									ret := -1.000000 // sell
						if( ema1 > 128.507 )
							if( ema13 <= 0.111786 )
								if( ema3 <= 128.868 )
									ret := -0.267857
								if( ema3 > 128.868 )
									ret := -1.000000 // sell
							if( ema13 > 0.111786 )
								if( VIP <= 1.08786 )
									ret := 0.875000 // buy
								if( VIP > 1.08786 )
									ret := -0.279070
					if( VIP_VIM > 0.557178 )
						if( ema13 <= 0.242639 )
							if( ema12 <= 0.092224 )
								ret := 0.500000
							if( ema12 > 0.092224 )
								if( ema13 <= 0.185576 )
									ret := 1.000000 // buy
								if( ema13 > 0.185576 )
									ret := 0.666667
						if( ema13 > 0.242639 )
							if( VIP_VIM <= 0.665868 )
								if( ema12 <= 0.178304 )
									ret := -0.166667
								if( ema12 > 0.178304 )
									ret := 0.500000
							if( VIP_VIM > 0.665868 )
								ret := -0.800000 // sell
				if( ema13 > 0.836984 )
					if( ema2 <= 127.888 )
						if( tema <= 129.018 )
							ret := 0.500000
						if( tema > 129.018 )
							ret := -0.800000 // sell
					if( ema2 > 127.888 )
						ret := 1.000000 // buy
		if( ema1 > 128.624 )
			if( ema2 <= 129.093 )
				if( ema13 <= -0.332111 )
					if( VIP_VIM <= -0.684695 )
						ret := 0.000000
					if( VIP_VIM > -0.684695 )
						if( tema <= 128.495 )
							ret := 0.000000
						if( tema > 128.495 )
							ret := -1.000000 // sell
				if( ema13 > -0.332111 )
					if( ema12 <= 0.037341 )
						if( VIP <= 0.833098 )
							if( VIP <= 0.816567 )
								ret := 0.000000
							if( VIP > 0.816567 )
								ret := -0.800000 // sell
						if( VIP > 0.833098 )
							if( ema1 <= 128.91 )
								if( VIM <= 0.98985 )
									ret := 0.626667
								if( VIM > 0.98985 )
									ret := 0.248276
							if( ema1 > 128.91 )
								if( ema1 <= 129.057 )
									ret := 0.723404 // buy
								if( ema1 > 129.057 )
									ret := 0.000000
					if( ema12 > 0.037341 )
						if( ema3 <= 128.523 )
							if( VIM <= 0.775512 )
								if( tema <= 128.931 )
									ret := 1.000000 // buy
								if( tema > 128.931 )
									ret := -0.531250
							if( VIM > 0.775512 )
								if( VIM <= 0.825906 )
									ret := 0.857143 // buy
								if( VIM > 0.825906 )
									ret := 0.396825
						if( ema3 > 128.523 )
							if( ema1 <= 129.028 )
								if( ema13 <= 0.123102 )
									ret := 0.130435
								if( ema13 > 0.123102 )
									ret := -0.454545
							if( ema1 > 129.028 )
								if( VIM <= 0.862518 )
									ret := -0.157895
								if( VIM > 0.862518 )
									ret := 0.477612
			if( ema2 > 129.093 )
				if( ema2 <= 131.543 )
					if( VIP <= 1.06649 )
						if( ema2 <= 130.29 )
							if( ema1 <= 130.138 )
								if( ema12 <= 0.016413 )
									ret := 0.023572
								if( ema12 > 0.016413 )
									ret := -0.364078
							if( ema1 > 130.138 )
								if( VIP <= 0.929496 )
									ret := 0.631579
								if( VIP > 0.929496 )
									ret := 0.191304
						if( ema2 > 130.29 )
							if( ema1 <= 130.566 )
								if( ema1 <= 130.331 )
									ret := -0.319767
								if( ema1 > 130.331 )
									ret := -0.767635 // sell
							if( ema1 > 130.566 )
								if( VIP_VIM <= -0.367313 )
									ret := -0.717172 // sell
								if( VIP_VIM > -0.367313 )
									ret := -0.043841
					if( VIP > 1.06649 )
						if( ema12 <= 0.36132 )
							if( ema13 <= 0.361836 )
								if( ema2 <= 131.195 )
									ret := 0.062420
								if( ema2 > 131.195 )
									ret := -0.321101
							if( ema13 > 0.361836 )
								if( VIP <= 1.1878 )
									ret := 0.076923
								if( VIP > 1.1878 )
									ret := 0.448718
						if( ema12 > 0.36132 )
							if( ema3 <= 129.576 )
								if( ema3 <= 129.461 )
									ret := -0.260870
								if( ema3 > 129.461 )
									ret := 0.888889 // buy
							if( ema3 > 129.576 )
								if( ema3 <= 130.68 )
									ret := -0.983333 // sell
								if( ema3 > 130.68 )
									ret := -0.750000 // sell
				if( ema2 > 131.543 )
					if( ema13 <= -0.067716 )
						if( ema13 <= -1.0236 )
							if( VIP_VIM <= -0.845303 )
								if( ema2 <= 175.466 )
									ret := 0.033333
								if( ema2 > 175.466 )
									ret := 0.693878
							if( VIP_VIM > -0.845303 )
								if( ema2 <= 164.39 )
									ret := -0.417840
								if( ema2 > 164.39 )
									ret := -0.064897
						if( ema13 > -1.0236 )
							if( tema <= 198.138 )
								if( ema3 <= 198.194 )
									ret := 0.072515
								if( ema3 > 198.194 )
									ret := 0.577778
							if( tema > 198.138 )
								if( tema <= 199.42 )
									ret := -0.593023
								if( tema > 199.42 )
									ret := 0.135135
					if( ema13 > -0.067716 )
						if( ema2 <= 131.698 )
							if( ema1 <= 131.94 )
								if( VIP_VIM <= -0.009371 )
									ret := 0.071429
								if( VIP_VIM > -0.009371 )
									ret := 0.679487
							if( ema1 > 131.94 )
								ret := -1.000000 // sell
						if( ema2 > 131.698 )
							if( ema13 <= 1.63121 )
								if( ema12 <= 0.472952 )
									ret := 0.023457
								if( ema12 > 0.472952 )
									ret := 0.177268
							if( ema13 > 1.63121 )
								if( ema2 <= 165.713 )
									ret := 0.086538
								if( ema2 > 165.713 )
									ret := -0.543307
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AMZN_5Min_26b6325e(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


