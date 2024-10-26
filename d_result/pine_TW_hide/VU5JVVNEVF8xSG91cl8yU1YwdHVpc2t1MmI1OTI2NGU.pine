//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: UNIUSDT_1Hour_2SV0_2b59264e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_1Hour_2SV0_2b59264e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_1Hour_2b59264e(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= -0.968775 )
		if( rsi1 <= 49.8517 )
			if( VIP <= 0.942304 )
				if( rsi1 <= 41.1643 )
					if( VIM <= 1.12235 )
						if( VIP_VIM <= -0.193946 )
							ret := -0.103448
						if( VIP_VIM > -0.193946 )
							ret := -0.381395
					if( VIM > 1.12235 )
						if( rsi1 <= 33.3337 )
							ret := 0.002985
						if( rsi1 > 33.3337 )
							ret := 0.294604
				if( rsi1 > 41.1643 )
					if( VIP_VIM <= -0.20436 )
						if( VIP_VIM <= -0.349337 )
							ret := 0.752022 // buy
						if( VIP_VIM > -0.349337 )
							ret := 0.480169
					if( VIP_VIM > -0.20436 )
						if( VIM <= 1.0255 )
							ret := -0.569620
						if( VIM > 1.0255 )
							ret := 0.231752
			if( VIP > 0.942304 )
				if( rsi1 <= 45.522 )
					if( smoothK_k <= 92.8488 )
						if( smoothD_d <= 52.0482 )
							ret := -0.361360
						if( smoothD_d > 52.0482 )
							ret := -0.603774
					if( smoothK_k > 92.8488 )
						ret := 0.375000
				if( rsi1 > 45.522 )
					if( VIM <= 1.02158 )
						if( smoothK_k <= 48.4794 )
							ret := -0.177340
						if( smoothK_k > 48.4794 )
							ret := -0.512281
					if( VIM > 1.02158 )
						if( smoothD_d <= 62.8559 )
							ret := -0.054968
						if( smoothD_d > 62.8559 )
							ret := 0.227513
		if( rsi1 > 49.8517 )
			if( VIP_VIM <= -0.019744 )
				if( rsi1 <= 51.8973 )
					if( VIP_VIM <= -0.13128 )
						if( d <= 50.5227 )
							ret := 0.672199
						if( d > 50.5227 )
							ret := 0.349593
					if( VIP_VIM > -0.13128 )
						if( d_k <= -14.7836 )
							ret := -0.269841
						if( d_k > -14.7836 )
							ret := 0.259475
				if( rsi1 > 51.8973 )
					if( smoothD_d <= 48.8938 )
						if( rsi1 <= 56.7709 )
							ret := 0.595525
						if( rsi1 > 56.7709 )
							ret := 0.831081 // buy
					if( smoothD_d > 48.8938 )
						if( smoothK_k <= 61.6444 )
							ret := 0.052632
						if( smoothK_k > 61.6444 )
							ret := 0.512101
			if( VIP_VIM > -0.019744 )
				if( VIP_VIM <= 0.30206 )
					if( rsi1 <= 59.7113 )
						if( VIP_VIM <= 0.102761 )
							ret := 0.128005
						if( VIP_VIM > 0.102761 )
							ret := -0.271845
					if( rsi1 > 59.7113 )
						if( VIP_VIM <= 0.210097 )
							ret := 0.515129
						if( VIP_VIM > 0.210097 )
							ret := 0.286268
				if( VIP_VIM > 0.30206 )
					if( rsi1 <= 73.9474 )
						if( smoothK_k <= 89.8735 )
							ret := -0.298326
						if( smoothK_k > 89.8735 )
							ret := 0.086154
					if( rsi1 > 73.9474 )
						if( VIP <= 1.20031 )
							ret := 0.524272
						if( VIP > 1.20031 )
							ret := 0.182461
	if( d_k > -0.968775 )
		if( smoothK_k <= 89.0203 )
			if( rsi1 <= 42.7901 )
				if( VIM <= 1.05469 )
					if( d_k <= 14.3948 )
						if( k <= 44.971 )
							ret := -0.418754
						if( k > 44.971 )
							ret := -0.653207
					if( d_k > 14.3948 )
						if( VIP <= 0.876894 )
							ret := -0.270833
						if( VIP > 0.876894 )
							ret := -0.723792 // sell
				if( VIM > 1.05469 )
					if( rsi1 <= 28.02 )
						if( VIP_VIM <= -0.39834 )
							ret := -0.364030
						if( VIP_VIM > -0.39834 )
							ret := -0.615744
					if( rsi1 > 28.02 )
						if( VIP_VIM <= -0.227987 )
							ret := -0.005005
						if( VIP_VIM > -0.227987 )
							ret := -0.308391
			if( rsi1 > 42.7901 )
				if( VIP <= 1.02201 )
					if( rsi1 <= 53.7157 )
						if( VIP <= 0.967355 )
							ret := 0.294756
						if( VIP > 0.967355 )
							ret := 0.025210
					if( rsi1 > 53.7157 )
						if( smoothK_k <= 13.8225 )
							ret := 0.909091 // buy
						if( smoothK_k > 13.8225 )
							ret := 0.603933
				if( VIP > 1.02201 )
					if( rsi1 <= 52.6406 )
						if( VIM <= 0.931758 )
							ret := -0.588192
						if( VIM > 0.931758 )
							ret := -0.213611
					if( rsi1 > 52.6406 )
						if( VIP_VIM <= 0.256763 )
							ret := 0.160266
						if( VIP_VIM > 0.256763 )
							ret := -0.147312
		if( smoothK_k > 89.0203 )
			if( d_k <= 0.975758 )
				if( rsi1 <= 82.4742 )
					if( rsi1 <= 61.2929 )
						if( d_k <= 0.129012 )
							ret := 0.238806
						if( d_k > 0.129012 )
							ret := -0.197183
					if( rsi1 > 61.2929 )
						if( VIM <= 0.858464 )
							ret := 0.101124
						if( VIM > 0.858464 )
							ret := 0.556962
				if( rsi1 > 82.4742 )
					if( VIP_VIM <= 0.611297 )
						if( rsi1 <= 89.1496 )
							ret := 0.887006 // buy
						if( rsi1 > 89.1496 )
							ret := 0.545455
					if( VIP_VIM > 0.611297 )
						if( d <= 98.1226 )
							ret := -0.205128
						if( d > 98.1226 )
							ret := 0.507576
			if( d_k > 0.975758 )
				if( smoothD_d <= 93.33 )
					if( rsi1 <= 45.1257 )
						if( k <= 92.8924 )
							ret := -0.125000
						if( k > 92.8924 )
							ret := -1.000000 // sell
					if( rsi1 > 45.1257 )
						if( VIM <= 0.742305 )
							ret := -0.040816
						if( VIM > 0.742305 )
							ret := 0.462963
				if( smoothD_d > 93.33 )
					if( rsi1 <= 61.331 )
						if( d_k <= 4.37654 )
							ret := -0.498099
						if( d_k > 4.37654 )
							ret := 0.545455
					if( rsi1 > 61.331 )
						if( VIP <= 1.19035 )
							ret := 0.211180
						if( VIP > 1.19035 )
							ret := -0.280303
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_UNIUSDT_1Hour_2b59264e(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)

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


