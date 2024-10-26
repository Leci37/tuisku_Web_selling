//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: ADAUSDT_1Hour_2SV0_5f139e6f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_1Hour_2SV0_5f139e6f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_1Hour_5f139e6f(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 42.3387 )
		if( VIP_VIM <= -0.162534 )
			if( rsi1 <= 31.2738 )
				if( VIP_VIM <= -0.44825 )
					if( rsi1 <= 24.0174 )
						if( d_k <= -8.37699 )
							ret := 0.300971
						if( d_k > -8.37699 )
							ret := -0.225013
					if( rsi1 > 24.0174 )
						if( VIP <= 0.734561 )
							ret := 0.329773
						if( VIP > 0.734561 )
							ret := -0.035273
				if( VIP_VIM > -0.44825 )
					if( rsi1 <= 26.1664 )
						if( d <= 15.8164 )
							ret := -0.486948
						if( d > 15.8164 )
							ret := -0.711082 // sell
					if( rsi1 > 26.1664 )
						if( VIM <= 1.12549 )
							ret := -0.577933
						if( VIM > 1.12549 )
							ret := -0.225806
			if( rsi1 > 31.2738 )
				if( VIP_VIM <= -0.346761 )
					if( rsi1 <= 37.0904 )
						if( VIP <= 0.721251 )
							ret := 0.653061
						if( VIP > 0.721251 )
							ret := 0.169355
					if( rsi1 > 37.0904 )
						if( VIP <= 0.835767 )
							ret := 0.590535
						if( VIP > 0.835767 )
							ret := 0.129032
				if( VIP_VIM > -0.346761 )
					if( rsi1 <= 38.9727 )
						if( VIM <= 1.13312 )
							ret := -0.240918
						if( VIM > 1.13312 )
							ret := -0.007899
					if( rsi1 > 38.9727 )
						if( VIP <= 0.869 )
							ret := 0.394415
						if( VIP > 0.869 )
							ret := 0.092444
		if( VIP_VIM > -0.162534 )
			if( VIP_VIM <= -0.093376 )
				if( rsi1 <= 35.5282 )
					if( d_k <= 6.09904 )
						if( VIP <= 0.951634 )
							ret := -0.504545
						if( VIP > 0.951634 )
							ret := -0.236842
					if( d_k > 6.09904 )
						if( rsi1 <= 30.271 )
							ret := -0.843243 // sell
						if( rsi1 > 30.271 )
							ret := -0.560000
				if( rsi1 > 35.5282 )
					if( smoothD_d <= 82.0925 )
						if( smoothK_k <= 27.6442 )
							ret := -0.145355
						if( smoothK_k > 27.6442 )
							ret := -0.341917
					if( smoothD_d > 82.0925 )
						if( k <= 94.4719 )
							ret := 0.439024
						if( k > 94.4719 )
							ret := -0.714286 // sell
			if( VIP_VIM > -0.093376 )
				if( d <= 41.6697 )
					if( rsi1 <= 39.4704 )
						if( d <= 38.8843 )
							ret := -0.588523
						if( d > 38.8843 )
							ret := -0.171429
					if( rsi1 > 39.4704 )
						if( VIP_VIM <= 0.029445 )
							ret := -0.274869
						if( VIP_VIM > 0.029445 )
							ret := -0.583784
				if( d > 41.6697 )
					if( rsi1 <= 41.6063 )
						if( VIM <= 1.03541 )
							ret := -0.765560 // sell
						if( VIM > 1.03541 )
							ret := -0.579767
					if( rsi1 > 41.6063 )
						if( VIP_VIM <= -0.053752 )
							ret := -0.021739
						if( VIP_VIM > -0.053752 )
							ret := -0.584507
	if( rsi1 > 42.3387 )
		if( d_k <= 1.17575 )
			if( rsi1 <= 63.9779 )
				if( VIP_VIM <= -0.166765 )
					if( VIP_VIM <= -0.266881 )
						if( rsi1 <= 44.9029 )
							ret := 0.516923
						if( rsi1 > 44.9029 )
							ret := 0.702703 // buy
					if( VIP_VIM > -0.266881 )
						if( rsi1 <= 46.0778 )
							ret := 0.106358
						if( rsi1 > 46.0778 )
							ret := 0.508790
				if( VIP_VIM > -0.166765 )
					if( VIM <= 0.953714 )
						if( rsi1 <= 56.9479 )
							ret := -0.297056
						if( rsi1 > 56.9479 )
							ret := 0.006034
					if( VIM > 0.953714 )
						if( rsi1 <= 53.1859 )
							ret := -0.006450
						if( rsi1 > 53.1859 )
							ret := 0.344290
			if( rsi1 > 63.9779 )
				if( VIP <= 1.11353 )
					if( VIP_VIM <= 0.124853 )
						if( VIP <= 1.01634 )
							ret := 0.761589 // buy
						if( VIP > 1.01634 )
							ret := 0.610052
					if( VIP_VIM > 0.124853 )
						if( rsi1 <= 73.8404 )
							ret := 0.405872
						if( rsi1 > 73.8404 )
							ret := 0.778846 // buy
				if( VIP > 1.11353 )
					if( rsi1 <= 75.738 )
						if( VIM <= 0.818104 )
							ret := -0.003731
						if( VIM > 0.818104 )
							ret := 0.228762
					if( rsi1 > 75.738 )
						if( d_k <= -9.80504 )
							ret := 0.211838
						if( d_k > -9.80504 )
							ret := 0.466636
		if( d_k > 1.17575 )
			if( VIP_VIM <= 0.002587 )
				if( VIM <= 1.06503 )
					if( rsi1 <= 46.3306 )
						if( smoothK_k <= 0.47654 )
							ret := 0.429530
						if( smoothK_k > 0.47654 )
							ret := -0.124524
					if( rsi1 > 46.3306 )
						if( rsi1 <= 52.6428 )
							ret := 0.190610
						if( rsi1 > 52.6428 )
							ret := 0.554054
				if( VIM > 1.06503 )
					if( smoothK_k <= 82.9024 )
						if( rsi1 <= 47.8429 )
							ret := 0.368534
						if( rsi1 > 47.8429 )
							ret := 0.709220 // buy
					if( smoothK_k > 82.9024 )
						if( VIP <= 0.932283 )
							ret := 0.818182 // buy
						if( VIP > 0.932283 )
							ret := -0.500000
			if( VIP_VIM > 0.002587 )
				if( rsi1 <= 57.7275 )
					if( VIM <= 0.912649 )
						if( VIP <= 1.03652 )
							ret := 0.115044
						if( VIP > 1.03652 )
							ret := -0.536755
					if( VIM > 0.912649 )
						if( rsi1 <= 49.763 )
							ret := -0.281876
						if( rsi1 > 49.763 )
							ret := -0.028295
				if( rsi1 > 57.7275 )
					if( VIP_VIM <= 0.251244 )
						if( VIP <= 1.12348 )
							ret := 0.296251
						if( VIP > 1.12348 )
							ret := 0.008798
					if( VIP_VIM > 0.251244 )
						if( rsi1 <= 64.1696 )
							ret := -0.295652
						if( rsi1 > 64.1696 )
							ret := 0.068943
	
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
float op_operation = decision_tree_0_ADAUSDT_1Hour_5f139e6f(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


