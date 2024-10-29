//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: MELI_15Min_2SV0_d75a23c7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_2SV0_d75a23c7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_d75a23c7(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( d <= 99.8844 )
		if( VIP_VIM <= 0.491787 )
			if( d <= 0.544206 )
				if( VIM <= 1.44457 )
					if( VIP <= 0.738662 )
						if( d_k <= 0.246489 )
							if( smoothD_d <= -2.96902 )
								if( rsi1 <= 21.4215 )
									ret := 0.435484
								if( rsi1 > 21.4215 )
									ret := -0.333333
							if( smoothD_d > -2.96902 )
								if( VIP_VIM <= -0.73677 )
									ret := 0.555556
								if( VIP_VIM > -0.73677 )
									ret := 0.867647 // buy
						if( d_k > 0.246489 )
							if( VIP <= 0.715428 )
								ret := -0.818182 // sell
							if( VIP > 0.715428 )
								ret := 0.333333
					if( VIP > 0.738662 )
						if( d_k <= 0.130369 )
							if( VIP <= 0.83456 )
								if( VIM <= 1.24825 )
									ret := -0.240964
								if( VIM > 1.24825 )
									ret := 0.096000
							if( VIP > 0.83456 )
								if( rsi1 <= 35.5415 )
									ret := 0.497758
								if( rsi1 > 35.5415 )
									ret := 0.216931
						if( d_k > 0.130369 )
							if( rsi1 <= 48.1553 )
								if( VIP <= 0.773104 )
									ret := 0.571429
								if( VIP > 0.773104 )
									ret := -0.073529
							if( rsi1 > 48.1553 )
								if( d_k <= 0.25813 )
									ret := -1.000000 // sell
								if( d_k > 0.25813 )
									ret := -0.666667
				if( VIM > 1.44457 )
					if( VIP <= 1.56225 )
						if( smoothK_k <= -1.96704 )
							if( rsi1 <= 0.138393 )
								if( rsi1 <= 0.000434 )
									ret := 0.181818
								if( rsi1 > 0.000434 )
									ret := 1.000000 // buy
							if( rsi1 > 0.138393 )
								if( VIP <= 0.426822 )
									ret := -0.916667 // sell
								if( VIP > 0.426822 )
									ret := -0.203187
						if( smoothK_k > -1.96704 )
							ret := 0.714286 // buy
					if( VIP > 1.56225 )
						if( d_k <= -0.017892 )
							ret := 0.181818
						if( d_k > -0.017892 )
							ret := 0.906250 // buy
			if( d > 0.544206 )
				if( VIM <= 1.19641 )
					if( d <= 55.8997 )
						if( d <= 55.4745 )
							if( k <= 15.0896 )
								if( rsi1 <= 52.4104 )
									ret := 0.040439
								if( rsi1 > 52.4104 )
									ret := -0.127446
							if( k > 15.0896 )
								if( smoothD_d <= 5.36498 )
									ret := 0.435583
								if( smoothD_d > 5.36498 )
									ret := 0.051259
						if( d > 55.4745 )
							if( rsi1 <= 66.674 )
								if( smoothK_k <= 34.968 )
									ret := -0.125000
								if( smoothK_k > 34.968 )
									ret := 0.562500
							if( rsi1 > 66.674 )
								ret := -0.357143
					if( d > 55.8997 )
						if( smoothK_k <= 76.7804 )
							if( d <= 83.384 )
								if( rsi1 <= 68.1907 )
									ret := -0.016283
								if( rsi1 > 68.1907 )
									ret := -0.266294
							if( d > 83.384 )
								if( smoothD_d <= 84.1489 )
									ret := -0.309429
								if( smoothD_d > 84.1489 )
									ret := -0.026667
						if( smoothK_k > 76.7804 )
							if( VIP_VIM <= -0.214363 )
								if( d <= 99.0553 )
									ret := -0.202284
								if( d > 99.0553 )
									ret := 0.750000 // buy
							if( VIP_VIM > -0.214363 )
								if( k <= 93.7174 )
									ret := 0.056777
								if( k > 93.7174 )
									ret := -0.010065
				if( VIM > 1.19641 )
					if( d_k <= 31.7403 )
						if( VIP <= 0.822952 )
							if( k <= 50.1429 )
								if( d_k <= -20.6426 )
									ret := -0.750000 // sell
								if( d_k > -20.6426 )
									ret := -0.022908
							if( k > 50.1429 )
								if( smoothK_k <= 51.6761 )
									ret := 0.654135
								if( smoothK_k > 51.6761 )
									ret := 0.102740
						if( VIP > 0.822952 )
							if( d <= 99.3512 )
								if( VIP <= 0.823913 )
									ret := -0.725490 // sell
								if( VIP > 0.823913 )
									ret := -0.078980
							if( d > 99.3512 )
								if( VIP <= 1.40002 )
									ret := 0.973684 // buy
								if( VIP > 1.40002 )
									ret := 0.264706
					if( d_k > 31.7403 )
						if( VIP_VIM <= -0.470175 )
							ret := 1.000000 // buy
						if( VIP_VIM > -0.470175 )
							if( rsi1 <= 37.1434 )
								if( rsi1 <= 26.2744 )
									ret := 0.833333 // buy
								if( rsi1 > 26.2744 )
									ret := 1.000000 // buy
							if( rsi1 > 37.1434 )
								ret := 0.000000
		if( VIP_VIM > 0.491787 )
			if( d <= 89.6386 )
				if( d_k <= 20.2426 )
					if( d <= 14.2757 )
						if( VIP_VIM <= 0.596717 )
							if( VIM <= 0.763255 )
								if( VIP <= 1.26956 )
									ret := 1.000000 // buy
								if( VIP > 1.26956 )
									ret := 0.695652
							if( VIM > 0.763255 )
								if( d_k <= 2.19733 )
									ret := 0.074074
								if( d_k > 2.19733 )
									ret := 0.923077 // buy
						if( VIP_VIM > 0.596717 )
							if( d_k <= -0.433112 )
								ret := 0.318182
							if( d_k > -0.433112 )
								if( VIP <= 1.35322 )
									ret := -0.250000
								if( VIP > 1.35322 )
									ret := 0.000000
					if( d > 14.2757 )
						if( VIM <= 0.700867 )
							if( rsi1 <= 79.4722 )
								if( smoothD_d <= 63.5284 )
									ret := -0.047945
								if( smoothD_d > 63.5284 )
									ret := 0.229560
							if( rsi1 > 79.4722 )
								if( d_k <= -17.1123 )
									ret := 0.343750
								if( d_k > -17.1123 )
									ret := -0.128696
						if( VIM > 0.700867 )
							if( VIP_VIM <= 0.784659 )
								if( smoothD_d <= 33.6292 )
									ret := -0.174074
								if( smoothD_d > 33.6292 )
									ret := 0.155939
							if( VIP_VIM > 0.784659 )
								if( VIP <= 1.76406 )
									ret := 0.094737
								if( VIP > 1.76406 )
									ret := 0.699301
				if( d_k > 20.2426 )
					if( d_k <= 25.6659 )
						if( VIP_VIM <= 0.571805 )
							if( rsi1 <= 70.9711 )
								if( smoothK_k <= 40.4599 )
									ret := 0.117647
								if( smoothK_k > 40.4599 )
									ret := 0.625000
							if( rsi1 > 70.9711 )
								ret := -0.222222
						if( VIP_VIM > 0.571805 )
							if( rsi1 <= 72.0532 )
								if( VIP <= 1.50254 )
									ret := 0.720000 // buy
								if( VIP > 1.50254 )
									ret := 0.978723 // buy
							if( rsi1 > 72.0532 )
								if( smoothK_k <= 29.1377 )
									ret := 0.500000
								if( smoothK_k > 29.1377 )
									ret := 0.250000
					if( d_k > 25.6659 )
						if( VIP <= 1.47995 )
							if( rsi1 <= 75.354 )
								ret := 0.000000
							if( rsi1 > 75.354 )
								ret := -0.533333
						if( VIP > 1.47995 )
							if( d <= 55.5848 )
								ret := 0.888889 // buy
							if( d > 55.5848 )
								ret := 0.416667
			if( d > 89.6386 )
				if( rsi1 <= 91.008 )
					if( VIM <= 1.0365 )
						if( VIP_VIM <= 1.07591 )
							if( k <= 82.1338 )
								if( VIM <= 0.750819 )
									ret := 0.057143
								if( VIM > 0.750819 )
									ret := 0.750000 // buy
							if( k > 82.1338 )
								if( k <= 84.9314 )
									ret := -0.248000
								if( k > 84.9314 )
									ret := 0.006341
						if( VIP_VIM > 1.07591 )
							ret := -0.869565 // sell
					if( VIM > 1.0365 )
						if( smoothK_k <= 91.5833 )
							if( VIP_VIM <= 0.575521 )
								if( d <= 93.5353 )
									ret := -0.777778 // sell
								if( d > 93.5353 )
									ret := -0.944444 // sell
							if( VIP_VIM > 0.575521 )
								if( d <= 93.2731 )
									ret := 0.222222
								if( d > 93.2731 )
									ret := -0.708333 // sell
						if( smoothK_k > 91.5833 )
							if( rsi1 <= 87.0777 )
								if( VIM <= 1.13822 )
									ret := -0.480000
								if( VIM > 1.13822 )
									ret := 0.347826
							if( rsi1 > 87.0777 )
								ret := -0.700000 // sell
				if( rsi1 > 91.008 )
					if( d <= 92.3284 )
						if( k <= 90.8909 )
							if( d <= 90.5232 )
								ret := -0.888889 // sell
							if( d > 90.5232 )
								ret := -1.000000 // sell
						if( k > 90.8909 )
							ret := -0.454545
					if( d > 92.3284 )
						if( rsi1 <= 91.8626 )
							if( smoothD_d <= 92.6316 )
								ret := -0.800000 // sell
							if( smoothD_d > 92.6316 )
								if( smoothD_d <= 95.1254 )
									ret := -0.285714
								if( smoothD_d > 95.1254 )
									ret := -0.638298
						if( rsi1 > 91.8626 )
							if( rsi1 <= 91.9257 )
								ret := 0.833333 // buy
							if( rsi1 > 91.9257 )
								if( VIM <= 0.628578 )
									ret := -0.270833
								if( VIM > 0.628578 )
									ret := 0.114583
	if( d > 99.8844 )
		if( VIP <= 1.41532 )
			if( VIP_VIM <= 0.790212 )
				if( d <= 99.9932 )
					if( VIM <= 1.10453 )
						if( d <= 99.9066 )
							ret := -0.750000 // sell
						if( d > 99.9066 )
							if( VIM <= 0.852607 )
								if( rsi1 <= 78.8589 )
									ret := -0.333333
								if( rsi1 > 78.8589 )
									ret := 0.590909
							if( VIM > 0.852607 )
								ret := -0.600000
					if( VIM > 1.10453 )
						ret := 0.882353 // buy
				if( d > 99.9932 )
					if( smoothK_k <= 96.9994 )
						ret := -1.000000 // sell
					if( smoothK_k > 96.9994 )
						if( VIM <= 0.961997 )
							ret := -0.192488
						if( VIM > 0.961997 )
							if( VIP_VIM <= 0.09046 )
								if( VIM <= 1.06532 )
									ret := -0.666667
								if( VIM > 1.06532 )
									ret := -0.121212
							if( VIP_VIM > 0.09046 )
								if( VIM <= 1.10032 )
									ret := -0.636364
								if( VIM > 1.10032 )
									ret := -1.000000 // sell
			if( VIP_VIM > 0.790212 )
				ret := 0.571429
		if( VIP > 1.41532 )
			if( rsi1 <= 97.4558 )
				if( smoothD_d <= 96.9853 )
					if( smoothD_d <= 96.9494 )
						if( VIP_VIM <= 0.792024 )
							ret := -0.642857
						if( VIP_VIM > 0.792024 )
							ret := -0.315789
					if( smoothD_d > 96.9494 )
						if( smoothK_k <= 96.9543 )
							if( k <= 99.9189 )
								ret := -1.000000 // sell
							if( k > 99.9189 )
								ret := -0.900000 // sell
						if( smoothK_k > 96.9543 )
							ret := -0.625000
				if( smoothD_d > 96.9853 )
					if( VIP_VIM <= 0.537288 )
						if( rsi1 <= 79.255 )
							ret := -0.692308
						if( rsi1 > 79.255 )
							ret := -0.944444 // sell
					if( VIP_VIM > 0.537288 )
						if( VIP <= 1.52112 )
							ret := -0.301205
						if( VIP > 1.52112 )
							if( rsi1 <= 93.2692 )
								if( VIM <= 0.718232 )
									ret := -0.300000
								if( VIM > 0.718232 )
									ret := -0.692308
							if( rsi1 > 93.2692 )
								ret := -1.000000 // sell
			if( rsi1 > 97.4558 )
				ret := 0.888889 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")

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
float op_operation = decision_tree_0_MELI_15Min_d75a23c7(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


