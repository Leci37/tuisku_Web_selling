//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: ADSK_1Min_2ST0_888a1763 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_1Min_2ST0_888a1763", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_1Min_888a1763(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( d_k <= 4.73216 )
		if( ema12 <= 0.047131 )
			if( d_k <= 0.013187 )
				if( tema <= 271.806 )
					if( d <= 42.3432 )
						if( ema3 <= 271.295 )
							ret := 0.007974
						if( ema3 > 271.295 )
							ret := -0.492647
					if( d > 42.3432 )
						if( k <= 99.0714 )
							ret := -0.076943
						if( k > 99.0714 )
							ret := 0.154762
				if( tema > 271.806 )
					if( smoothD_d <= 4.02403 )
						if( tema <= 281.255 )
							ret := 0.506024
						if( tema > 281.255 )
							ret := -0.111111
					if( smoothD_d > 4.02403 )
						if( ema3 <= 272.316 )
							ret := 0.649123
						if( ema3 > 272.316 )
							ret := 0.075949
			if( d_k > 0.013187 )
				if( ema13 <= -1.37981 )
					if( rsi1 <= 18.2024 )
						if( tema <= 243.657 )
							ret := 1.000000 // buy
						if( tema > 243.657 )
							ret := -1.000000 // sell
					if( rsi1 > 18.2024 )
						ret := 1.000000 // buy
				if( ema13 > -1.37981 )
					if( ema3 <= 254.404 )
						if( ema1 <= 251.59 )
							ret := 0.067301
						if( ema1 > 251.59 )
							ret := 0.320635
					if( ema3 > 254.404 )
						if( tema <= 254.409 )
							ret := -0.623377
						if( tema > 254.409 )
							ret := -0.014218
		if( ema12 > 0.047131 )
			if( k <= 90.0173 )
				if( rsi1 <= 51.5361 )
					if( ema12 <= 0.154788 )
						if( ema13 <= 0.266855 )
							ret := 0.117470
						if( ema13 > 0.266855 )
							ret := -0.400000
					if( ema12 > 0.154788 )
						if( d_k <= -6.4063 )
							ret := -0.259259
						if( d_k > -6.4063 )
							ret := 0.742268 // buy
				if( rsi1 > 51.5361 )
					if( ema1 <= 215.483 )
						if( k <= 71.4896 )
							ret := 0.208475
						if( k > 71.4896 )
							ret := -0.062969
					if( ema1 > 215.483 )
						if( tema <= 218.833 )
							ret := -0.244313
						if( tema > 218.833 )
							ret := -0.051332
			if( k > 90.0173 )
				if( ema13 <= 0.876502 )
					if( smoothD_d <= 95.9283 )
						if( rsi1 <= 58.7438 )
							ret := -0.367188
						if( rsi1 > 58.7438 )
							ret := -0.148133
					if( smoothD_d > 95.9283 )
						if( rsi1 <= 90.9392 )
							ret := 0.235376
						if( rsi1 > 90.9392 )
							ret := -0.441176
				if( ema13 > 0.876502 )
					if( tema <= 214.579 )
						if( smoothD_d <= 81.9018 )
							ret := -1.000000 // sell
						if( smoothD_d > 81.9018 )
							ret := 0.565217
					if( tema > 214.579 )
						if( d_k <= 1.95226 )
							ret := -0.750890 // sell
						if( d_k > 1.95226 )
							ret := 0.000000
	if( d_k > 4.73216 )
		if( ema1 <= 243.163 )
			if( ema1 <= 236.564 )
				if( d <= 54.7991 )
					if( rsi1 <= 25.3951 )
						if( k <= 29.647 )
							ret := -0.231834
						if( k > 29.647 )
							ret := -0.961538 // sell
					if( rsi1 > 25.3951 )
						if( d_k <= 16.7159 )
							ret := 0.085666
						if( d_k > 16.7159 )
							ret := -0.151913
				if( d > 54.7991 )
					if( rsi1 <= 42.8097 )
						if( d <= 64.9409 )
							ret := 0.635246
						if( d > 64.9409 )
							ret := 0.181614
					if( rsi1 > 42.8097 )
						if( ema12 <= 0.312917 )
							ret := 0.033765
						if( ema12 > 0.312917 )
							ret := 0.464286
			if( ema1 > 236.564 )
				if( ema13 <= -0.413812 )
					if( ema13 <= -0.952625 )
						ret := -0.333333
					if( ema13 > -0.952625 )
						if( ema3 <= 237.449 )
							ret := -1.000000 // sell
						if( ema3 > 237.449 )
							ret := 0.788360 // buy
				if( ema13 > -0.413812 )
					if( k <= 7.62776 )
						if( d <= 8.34982 )
							ret := 0.557692
						if( d > 8.34982 )
							ret := -0.286822
					if( k > 7.62776 )
						if( d_k <= 26.7289 )
							ret := 0.223410
						if( d_k > 26.7289 )
							ret := 0.814433 // buy
		if( ema1 > 243.163 )
			if( ema3 <= 245.622 )
				if( rsi1 <= 53.4462 )
					if( ema1 <= 243.27 )
						if( ema3 <= 243.405 )
							ret := -0.956522 // sell
						if( ema3 > 243.405 )
							ret := -0.125000
					if( ema1 > 243.27 )
						if( ema13 <= -0.09767 )
							ret := -0.148387
						if( ema13 > -0.09767 )
							ret := 0.210019
				if( rsi1 > 53.4462 )
					if( d_k <= 11.8158 )
						if( tema <= 243.691 )
							ret := 0.388060
						if( tema > 243.691 )
							ret := -0.244582
					if( d_k > 11.8158 )
						if( ema13 <= 0.377388 )
							ret := -0.418750
						if( ema13 > 0.377388 )
							ret := -0.901408 // sell
			if( ema3 > 245.622 )
				if( ema12 <= 0.236542 )
					if( ema3 <= 254.509 )
						if( ema1 <= 251.927 )
							ret := 0.033522
						if( ema1 > 251.927 )
							ret := 0.259615
					if( ema3 > 254.509 )
						if( ema13 <= -0.797815 )
							ret := 0.644068
						if( ema13 > -0.797815 )
							ret := -0.033806
				if( ema12 > 0.236542 )
					if( d <= 83.4175 )
						if( rsi1 <= 64.2093 )
							ret := 0.798742 // buy
						if( rsi1 > 64.2093 )
							ret := 0.255435
					if( d > 83.4175 )
						if( k <= 79.394 )
							ret := -0.755102 // sell
						if( k > 79.394 )
							ret := 0.178571
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_ADSK_1Min_888a1763(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


