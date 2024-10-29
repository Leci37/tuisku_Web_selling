//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: ATOMUSDT_15Min_2ST0_2a7f29bc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_2ST0_2a7f29bc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_2a7f29bc(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( smoothK_k <= 29.2106 )
		if( ema12 <= -0.035043 )
			if( rsi1 <= 33.4148 )
				if( ema12 <= -0.065939 )
					if( ema12 <= -0.145422 )
						if( k <= 4.3764 )
							if( d_k <= 0.018585 )
								ret := -0.125000
							if( d_k > 0.018585 )
								ret := 0.308057
						if( k > 4.3764 )
							if( smoothK_k <= 5.50049 )
								ret := 0.666667
							if( smoothK_k > 5.50049 )
								ret := 0.385965
					if( ema12 > -0.145422 )
						if( smoothK_k <= 19.1247 )
							if( rsi1 <= 20.5881 )
								ret := -0.181939
							if( rsi1 > 20.5881 )
								ret := 0.090784
						if( smoothK_k > 19.1247 )
							if( k <= 29.7634 )
								ret := 0.343931
							if( k > 29.7634 )
								ret := -0.114583
				if( ema12 > -0.065939 )
					if( rsi1 <= 20.3196 )
						if( ema12 <= -0.059942 )
							if( d_k <= 10.5589 )
								ret := -0.306122
							if( d_k > 10.5589 )
								ret := 0.857143 // buy
						if( ema12 > -0.059942 )
							if( d_k <= -0.001377 )
								ret := -0.757143 // sell
							if( d_k > -0.001377 )
								ret := -0.505929
					if( rsi1 > 20.3196 )
						if( smoothK_k <= 0.559141 )
							if( ema12 <= -0.047061 )
								ret := 0.351351
							if( ema12 > -0.047061 )
								ret := 0.015873
						if( smoothK_k > 0.559141 )
							if( d_k <= 19.3611 )
								ret := -0.271482
							if( d_k > 19.3611 )
								ret := 0.413793
			if( rsi1 > 33.4148 )
				if( tema <= 12.2852 )
					if( k <= 18.6654 )
						if( ema12 <= -0.141905 )
							if( smoothD_d <= 3.82565 )
								ret := -0.266667
							if( smoothD_d > 3.82565 )
								ret := -1.000000 // sell
						if( ema12 > -0.141905 )
							if( rsi1 <= 35.563 )
								ret := 0.005128
							if( rsi1 > 35.563 )
								ret := 0.254606
					if( k > 18.6654 )
						if( d_k <= -13.7156 )
							if( ema3 <= 10.5585 )
								ret := 0.222222
							if( ema3 > 10.5585 )
								ret := -0.777778 // sell
						if( d_k > -13.7156 )
							if( rsi1 <= 39.4339 )
								ret := 0.400000
							if( rsi1 > 39.4339 )
								ret := 0.645320
				if( tema > 12.2852 )
					if( d_k <= -5.00936 )
						if( tema <= 18.2352 )
							if( d_k <= -7.3998 )
								ret := -0.056000
							if( d_k > -7.3998 )
								ret := -0.466667
						if( tema > 18.2352 )
							if( ema13 <= -0.17442 )
								ret := 0.000000
							if( ema13 > -0.17442 )
								ret := 0.812500 // buy
					if( d_k > -5.00936 )
						if( ema12 <= -0.19229 )
							ret := -1.000000 // sell
						if( ema12 > -0.19229 )
							if( d <= 5.09307 )
								ret := 0.516556
							if( d > 5.09307 )
								ret := 0.149385
		if( ema12 > -0.035043 )
			if( rsi1 <= 38.7974 )
				if( ema12 <= -0.0069 )
					if( rsi1 <= 27.0526 )
						if( d <= 12.5456 )
							if( ema3 <= 11.8401 )
								ret := -0.676594
							if( ema3 > 11.8401 )
								ret := -0.390000
						if( d > 12.5456 )
							if( d <= 31.138 )
								ret := -0.378168
							if( d > 31.138 )
								ret := -0.654676
					if( rsi1 > 27.0526 )
						if( d_k <= -2.06697 )
							if( k <= 26.1138 )
								ret := -0.451636
							if( k > 26.1138 )
								ret := -0.172043
						if( d_k > -2.06697 )
							if( rsi1 <= 34.0644 )
								ret := -0.279588
							if( rsi1 > 34.0644 )
								ret := -0.033981
				if( ema12 > -0.0069 )
					if( rsi1 <= 30.8953 )
						if( ema3 <= 6.35398 )
							if( ema3 <= 4.26557 )
								ret := -0.714286 // sell
							if( ema3 > 4.26557 )
								ret := -0.885630 // sell
						if( ema3 > 6.35398 )
							if( ema12 <= 0.003705 )
								ret := -0.667323
							if( ema12 > 0.003705 )
								ret := -0.876744 // sell
					if( rsi1 > 30.8953 )
						if( ema12 <= 0.004458 )
							if( tema <= 6.40029 )
								ret := -0.598194
							if( tema > 6.40029 )
								ret := -0.409160
						if( ema12 > 0.004458 )
							if( smoothK_k <= -2.99892 )
								ret := -0.618421
							if( smoothK_k > -2.99892 )
								ret := -0.759169 // sell
			if( rsi1 > 38.7974 )
				if( ema12 <= 0.007121 )
					if( d <= 18.3708 )
						if( rsi1 <= 41.1303 )
							if( d_k <= 11.8757 )
								ret := -0.231547
							if( d_k > 11.8757 )
								ret := 0.545455
						if( rsi1 > 41.1303 )
							if( d_k <= -1.67384 )
								ret := -0.078401
							if( d_k > -1.67384 )
								ret := 0.091136
					if( d > 18.3708 )
						if( ema12 <= -0.013186 )
							if( tema <= 13.8493 )
								ret := 0.344910
							if( tema > 13.8493 )
								ret := -0.257732
						if( ema12 > -0.013186 )
							if( rsi1 <= 47.2402 )
								ret := -0.066195
							if( rsi1 > 47.2402 )
								ret := 0.243825
				if( ema12 > 0.007121 )
					if( rsi1 <= 52.9218 )
						if( rsi1 <= 47.8788 )
							if( ema12 <= 0.012831 )
								ret := -0.387778
							if( ema12 > 0.012831 )
								ret := -0.642157
						if( rsi1 > 47.8788 )
							if( ema12 <= 0.021408 )
								ret := -0.118327
							if( ema12 > 0.021408 )
								ret := -0.460613
					if( rsi1 > 52.9218 )
						if( ema12 <= 0.074725 )
							if( rsi1 <= 62.6856 )
								ret := -0.017451
							if( rsi1 > 62.6856 )
								ret := 0.195740
						if( ema12 > 0.074725 )
							if( rsi1 <= 72.1547 )
								ret := -0.415054
							if( rsi1 > 72.1547 )
								ret := 0.368421
	if( smoothK_k > 29.2106 )
		if( rsi1 <= 67.6556 )
			if( ema12 <= -0.005305 )
				if( rsi1 <= 46.2096 )
					if( ema12 <= -0.035689 )
						if( rsi1 <= 38.2789 )
							if( ema12 <= -0.123682 )
								ret := 0.455243
							if( ema12 > -0.123682 )
								ret := 0.034505
						if( rsi1 > 38.2789 )
							if( ema3 <= 12.142 )
								ret := 0.488682
							if( ema3 > 12.142 )
								ret := 0.169896
					if( ema12 > -0.035689 )
						if( rsi1 <= 36.8022 )
							if( smoothK_k <= 34.6021 )
								ret := -0.145833
							if( smoothK_k > 34.6021 )
								ret := -0.330405
						if( rsi1 > 36.8022 )
							if( d_k <= 8.2292 )
								ret := 0.006275
							if( d_k > 8.2292 )
								ret := 0.231511
				if( rsi1 > 46.2096 )
					if( ema12 <= -0.018614 )
						if( ema2 <= 11.5733 )
							if( rsi1 <= 55.3872 )
								ret := 0.648469
							if( rsi1 > 55.3872 )
								ret := 0.816216 // buy
						if( ema2 > 11.5733 )
							if( ema12 <= -0.038282 )
								ret := 0.607407
							if( ema12 > -0.038282 )
								ret := 0.236332
					if( ema12 > -0.018614 )
						if( rsi1 <= 55.406 )
							if( ema3 <= 6.19687 )
								ret := 0.487751
							if( ema3 > 6.19687 )
								ret := 0.196795
						if( rsi1 > 55.406 )
							if( ema13 <= -0.05063 )
								ret := 0.095238
							if( ema13 > -0.05063 )
								ret := 0.610837
			if( ema12 > -0.005305 )
				if( d <= 83.6987 )
					if( rsi1 <= 52.8858 )
						if( ema12 <= 0.016819 )
							if( rsi1 <= 41.3437 )
								ret := -0.465517
							if( rsi1 > 41.3437 )
								ret := -0.138162
						if( ema12 > 0.016819 )
							if( d_k <= -13.848 )
								ret := 0.111111
							if( d_k > -13.848 )
								ret := -0.482759
					if( rsi1 > 52.8858 )
						if( ema12 <= 0.019234 )
							if( ema1 <= 14.104 )
								ret := 0.186747
							if( ema1 > 14.104 )
								ret := -0.201149
						if( ema12 > 0.019234 )
							if( ema12 <= 0.04733 )
								ret := -0.025511
							if( ema12 > 0.04733 )
								ret := -0.211268
				if( d > 83.6987 )
					if( rsi1 <= 59.3771 )
						if( ema12 <= 0.006957 )
							if( ema13 <= -0.013724 )
								ret := -0.007782
							if( ema13 > -0.013724 )
								ret := 0.172633
						if( ema12 > 0.006957 )
							if( d <= 91.8042 )
								ret := 0.039761
							if( d > 91.8042 )
								ret := -0.251082
					if( rsi1 > 59.3771 )
						if( ema3 <= 12.314 )
							if( smoothK_k <= 95.9152 )
								ret := 0.351335
							if( smoothK_k > 95.9152 )
								ret := -0.047035
						if( ema3 > 12.314 )
							if( ema13 <= -0.002555 )
								ret := 0.341772
							if( ema13 > -0.002555 )
								ret := -0.136531
		if( rsi1 > 67.6556 )
			if( ema12 <= 0.050696 )
				if( ema12 <= 0.003538 )
					if( rsi1 <= 71.5715 )
						if( ema12 <= -0.004835 )
							if( d <= 99.9996 )
								ret := 0.853521 // buy
							if( d > 99.9996 )
								ret := 0.473684
						if( ema12 > -0.004835 )
							if( ema13 <= 0.002206 )
								ret := 0.531977
							if( ema13 > 0.002206 )
								ret := 0.850467 // buy
					if( rsi1 > 71.5715 )
						if( d <= 99.4601 )
							if( ema13 <= -0.003011 )
								ret := 0.731959 // buy
							if( ema13 > -0.003011 )
								ret := 0.833333 // buy
						if( d > 99.4601 )
							if( ema1 <= 10.6574 )
								ret := 0.919598 // buy
							if( ema1 > 10.6574 )
								ret := 0.750000 // buy
				if( ema12 > 0.003538 )
					if( rsi1 <= 74.8591 )
						if( rsi1 <= 70.573 )
							if( tema <= 6.13818 )
								ret := 0.599222
							if( tema > 6.13818 )
								ret := 0.255341
						if( rsi1 > 70.573 )
							if( ema1 <= 12.6309 )
								ret := 0.476553
							if( ema1 > 12.6309 )
								ret := 0.192090
					if( rsi1 > 74.8591 )
						if( ema2 <= 11.6795 )
							if( k <= 88.2898 )
								ret := 0.513264
							if( k > 88.2898 )
								ret := 0.682496
						if( ema2 > 11.6795 )
							if( ema12 <= 0.043421 )
								ret := 0.406780
							if( ema12 > 0.043421 )
								ret := 0.000000
			if( ema12 > 0.050696 )
				if( ema3 <= 12.323 )
					if( ema12 <= 0.114824 )
						if( rsi1 <= 88.5547 )
							if( rsi1 <= 75.0054 )
								ret := 0.132062
							if( rsi1 > 75.0054 )
								ret := 0.306294
						if( rsi1 > 88.5547 )
							if( ema3 <= 9.89236 )
								ret := 0.851852 // buy
							if( ema3 > 9.89236 )
								ret := 0.539823
					if( ema12 > 0.114824 )
						if( smoothD_d <= 92.0302 )
							if( smoothK_k <= 66.8564 )
								ret := -0.124183
							if( smoothK_k > 66.8564 )
								ret := 0.388535
						if( smoothD_d > 92.0302 )
							if( d_k <= -0.158019 )
								ret := 0.166667
							if( d_k > -0.158019 )
								ret := -0.386364
				if( ema3 > 12.323 )
					if( d_k <= 11.1424 )
						if( ema13 <= 0.292435 )
							if( d_k <= -14.7779 )
								ret := -0.518519
							if( d_k > -14.7779 )
								ret := -0.034598
						if( ema13 > 0.292435 )
							if( ema1 <= 14.034 )
								ret := -0.118421
							if( ema1 > 14.034 )
								ret := -0.661417
					if( d_k > 11.1424 )
						if( ema3 <= 12.7752 )
							ret := -0.300000
						if( ema3 > 12.7752 )
							if( d <= 87.5339 )
								ret := 0.491228
							if( d > 87.5339 )
								ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_ATOMUSDT_15Min_2a7f29bc(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


