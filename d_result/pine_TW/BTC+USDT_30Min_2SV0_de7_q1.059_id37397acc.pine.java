//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: BTCUSDT_30Min_2SV0_37397acc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_30Min_2SV0_37397acc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_30Min_37397acc(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=7, max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 53.08 )
		if( d_k <= -3.59249 )
			if( rsi1 <= 35.0964 )
				if( VIP_VIM <= -0.312704 )
					if( k <= 12.2477 )
						if( smoothD_d <= 4.2458 )
							if( d_k <= -6.91965 )
								ret := 0.384615
							if( d_k > -6.91965 )
								ret := -0.550769
						if( smoothD_d > 4.2458 )
							if( smoothK_k <= 8.83107 )
								ret := 0.444444
							if( smoothK_k > 8.83107 )
								ret := -0.500000
					if( k > 12.2477 )
						if( VIP_VIM <= -0.544584 )
							if( d_k <= -6.59839 )
								ret := 0.225839
							if( d_k > -6.59839 )
								ret := -0.152174
						if( VIP_VIM > -0.544584 )
							if( smoothD_d <= 73.4878 )
								ret := -0.094247
							if( smoothD_d > 73.4878 )
								ret := -0.595745
				if( VIP_VIM > -0.312704 )
					if( VIM <= 1.07551 )
						if( smoothD_d <= -0.402007 )
							if( d <= 2.11295 )
								ret := -0.800000 // sell
							if( d > 2.11295 )
								ret := -0.975610 // sell
						if( smoothD_d > -0.402007 )
							if( k <= 15.9851 )
								ret := -0.690722
							if( k > 15.9851 )
								ret := -0.838509 // sell
					if( VIM > 1.07551 )
						if( d <= 71.7875 )
							if( VIP <= 0.787113 )
								ret := 0.500000
							if( VIP > 0.787113 )
								ret := -0.605055
						if( d > 71.7875 )
							if( k <= 86.2162 )
								ret := -0.166667
							if( k > 86.2162 )
								ret := 0.857143 // buy
			if( rsi1 > 35.0964 )
				if( d_k <= -16.321 )
					if( VIP <= 0.896212 )
						if( k <= 59.0012 )
							if( VIP <= 0.803487 )
								ret := 0.640000
							if( VIP > 0.803487 )
								ret := 0.284574
						if( k > 59.0012 )
							if( smoothK_k <= 90.7359 )
								ret := 0.601845
							if( smoothK_k > 90.7359 )
								ret := 0.759494 // buy
					if( VIP > 0.896212 )
						if( smoothD_d <= 31.6313 )
							if( smoothD_d <= 29.4015 )
								ret := -0.059091
							if( smoothD_d > 29.4015 )
								ret := -0.710526 // sell
						if( smoothD_d > 31.6313 )
							if( rsi1 <= 50.4736 )
								ret := -0.079038
							if( rsi1 > 50.4736 )
								ret := 0.254237
				if( d_k > -16.321 )
					if( VIP_VIM <= -0.151728 )
						if( smoothK_k <= 52.8358 )
							if( VIP_VIM <= -0.247715 )
								ret := 0.462161
							if( VIP_VIM > -0.247715 )
								ret := 0.215047
						if( smoothK_k > 52.8358 )
							if( k <= 56.0009 )
								ret := -0.526316
							if( k > 56.0009 )
								ret := 0.204536
					if( VIP_VIM > -0.151728 )
						if( VIP_VIM <= -0.032359 )
							if( rsi1 <= 47.7872 )
								ret := -0.183060
							if( rsi1 > 47.7872 )
								ret := 0.236176
						if( VIP_VIM > -0.032359 )
							if( rsi1 <= 49.2806 )
								ret := -0.475962
							if( rsi1 > 49.2806 )
								ret := -0.063939
		if( d_k > -3.59249 )
			if( rsi1 <= 31.8147 )
				if( VIM <= 1.14077 )
					if( smoothK_k <= -2.03746 )
						if( d <= 8.51645 )
							if( rsi1 <= 22.2729 )
								ret := -0.922500 // sell
							if( rsi1 > 22.2729 )
								ret := -0.721072 // sell
						if( d > 8.51645 )
							if( d_k <= 31.1795 )
								ret := -0.918561 // sell
							if( d_k > 31.1795 )
								ret := 1.000000 // buy
					if( smoothK_k > -2.03746 )
						if( VIP <= 0.876814 )
							if( k <= 46.9254 )
								ret := -0.561962
							if( k > 46.9254 )
								ret := -0.865854 // sell
						if( VIP > 0.876814 )
							if( d <= 19.3454 )
								ret := -0.715811 // sell
							if( d > 19.3454 )
								ret := -0.839513 // sell
				if( VIM > 1.14077 )
					if( smoothD_d <= -2.74627 )
						if( smoothK_k <= -2.90513 )
							if( rsi1 <= 26.4214 )
								ret := -0.960714 // sell
							if( rsi1 > 26.4214 )
								ret := 0.363636
						if( smoothK_k > -2.90513 )
							if( VIP <= 0.580055 )
								ret := -1.000000 // sell
							if( VIP > 0.580055 )
								ret := -0.627451
					if( smoothD_d > -2.74627 )
						if( VIP <= 0.74706 )
							if( k <= 8.85859 )
								ret := -0.497020
							if( k > 8.85859 )
								ret := -0.258152
						if( VIP > 0.74706 )
							if( d <= 97.168 )
								ret := -0.517163
							if( d > 97.168 )
								ret := 0.866667 // buy
			if( rsi1 > 31.8147 )
				if( VIP_VIM <= -0.136819 )
					if( rsi1 <= 38.9289 )
						if( smoothK_k <= 72.0554 )
							if( VIM <= 1.11946 )
								ret := -0.174857
							if( VIM > 1.11946 )
								ret := 0.125705
						if( smoothK_k > 72.0554 )
							if( VIM <= 1.19147 )
								ret := -0.542056
							if( VIM > 1.19147 )
								ret := -0.040816
					if( rsi1 > 38.9289 )
						if( VIP_VIM <= -0.196555 )
							if( VIP <= 0.840119 )
								ret := 0.414239
							if( VIP > 0.840119 )
								ret := 0.221441
						if( VIP_VIM > -0.196555 )
							if( d_k <= -3.2747 )
								ret := 0.666667
							if( d_k > -3.2747 )
								ret := 0.051829
				if( VIP_VIM > -0.136819 )
					if( VIP_VIM <= 0.150837 )
						if( rsi1 <= 44.1267 )
							if( VIP_VIM <= -0.060597 )
								ret := -0.405115
							if( VIP_VIM > -0.060597 )
								ret := -0.566578
						if( rsi1 > 44.1267 )
							if( k <= 54.6637 )
								ret := -0.051795
							if( k > 54.6637 )
								ret := -0.182412
					if( VIP_VIM > 0.150837 )
						if( rsi1 <= 42.0632 )
							if( d_k <= 17.4059 )
								ret := -0.656250
							if( d_k > 17.4059 )
								ret := -0.825397 // sell
						if( rsi1 > 42.0632 )
							if( d_k <= 13.5533 )
								ret := -0.428111
							if( d_k > 13.5533 )
								ret := -0.630782
	if( rsi1 > 53.08 )
		if( d_k <= 3.21669 )
			if( VIP <= 0.999587 )
				if( d_k <= -10.5427 )
					if( rsi1 <= 61.3934 )
						if( smoothK_k <= 45.2091 )
							if( rsi1 <= 54.7258 )
								ret := 0.606061
							if( rsi1 > 54.7258 )
								ret := 0.789137 // buy
						if( smoothK_k > 45.2091 )
							if( VIP_VIM <= -0.092513 )
								ret := 0.671285
							if( VIP_VIM > -0.092513 )
								ret := 0.391969
					if( rsi1 > 61.3934 )
						if( smoothD_d <= 61.1072 )
							if( VIP_VIM <= 0.062659 )
								ret := 0.828947 // buy
							if( VIP_VIM > 0.062659 )
								ret := 0.181818
						if( smoothD_d > 61.1072 )
							if( rsi1 <= 68.0502 )
								ret := 0.663586
							if( rsi1 > 68.0502 )
								ret := 0.796562 // buy
				if( d_k > -10.5427 )
					if( rsi1 <= 65.2058 )
						if( rsi1 <= 56.4114 )
							if( d <= 55.942 )
								ret := 0.541555
							if( d > 55.942 )
								ret := 0.298491
						if( rsi1 > 56.4114 )
							if( k <= 63.3757 )
								ret := 0.727599 // buy
							if( k > 63.3757 )
								ret := 0.491554
					if( rsi1 > 65.2058 )
						if( d <= 98.2281 )
							if( VIP_VIM <= -0.056721 )
								ret := 0.619289
							if( VIP_VIM > -0.056721 )
								ret := 0.754717 // buy
						if( d > 98.2281 )
							if( VIP_VIM <= 0.163651 )
								ret := 0.832579 // buy
							if( VIP_VIM > 0.163651 )
								ret := 0.000000
			if( VIP > 0.999587 )
				if( k <= 93.6016 )
					if( d_k <= -5.7147 )
						if( VIM <= 0.897094 )
							if( rsi1 <= 71.3844 )
								ret := -0.013423
							if( rsi1 > 71.3844 )
								ret := 0.577675
						if( VIM > 0.897094 )
							if( rsi1 <= 59.4714 )
								ret := 0.124189
							if( rsi1 > 59.4714 )
								ret := 0.603168
					if( d_k > -5.7147 )
						if( rsi1 <= 59.3888 )
							if( VIM <= 0.92728 )
								ret := -0.291950
							if( VIM > 0.92728 )
								ret := 0.139823
						if( rsi1 > 59.3888 )
							if( rsi1 <= 75.3662 )
								ret := 0.290517
							if( rsi1 > 75.3662 )
								ret := 0.560596
				if( k > 93.6016 )
					if( k <= 99.8943 )
						if( rsi1 <= 65.4069 )
							if( d <= 94.648 )
								ret := 0.337029
							if( d > 94.648 )
								ret := 0.046377
						if( rsi1 > 65.4069 )
							if( rsi1 <= 79.3519 )
								ret := 0.502392
							if( rsi1 > 79.3519 )
								ret := 0.725296 // buy
					if( k > 99.8943 )
						if( smoothD_d <= 96.8485 )
							if( VIP_VIM <= 0.643491 )
								ret := 0.696273
							if( VIP_VIM > 0.643491 )
								ret := -0.500000
						if( smoothD_d > 96.8485 )
							if( k <= 99.9998 )
								ret := 0.916667 // buy
							if( k > 99.9998 )
								ret := 0.793023 // buy
		if( d_k > 3.21669 )
			if( VIP <= 1.0874 )
				if( VIP <= 1.04331 )
					if( rsi1 <= 61.5721 )
						if( VIP_VIM <= 0.124339 )
							if( rsi1 <= 53.2567 )
								ret := -0.147059
							if( rsi1 > 53.2567 )
								ret := 0.339884
						if( VIP_VIM > 0.124339 )
							if( k <= 51.6831 )
								ret := 0.294118
							if( k > 51.6831 )
								ret := -0.517857
					if( rsi1 > 61.5721 )
						if( d <= 86.2022 )
							if( smoothD_d <= 80.6312 )
								ret := 0.570000
							if( smoothD_d > 80.6312 )
								ret := 0.192308
						if( d > 86.2022 )
							if( k <= 74.5877 )
								ret := -0.666667
							if( k > 74.5877 )
								ret := 0.750000 // buy
				if( VIP > 1.04331 )
					if( rsi1 <= 61.9095 )
						if( rsi1 <= 56.2012 )
							if( k <= 49.9147 )
								ret := 0.164000
							if( k > 49.9147 )
								ret := -0.277778
						if( rsi1 > 56.2012 )
							if( VIP_VIM <= 0.202733 )
								ret := 0.196078
							if( VIP_VIM > 0.202733 )
								ret := -0.240000
					if( rsi1 > 61.9095 )
						if( rsi1 <= 67.3911 )
							if( VIM <= 0.871762 )
								ret := -0.121951
							if( VIM > 0.871762 )
								ret := 0.575916
						if( rsi1 > 67.3911 )
							if( d_k <= 3.70004 )
								ret := 0.214286
							if( d_k > 3.70004 )
								ret := 0.832335 // buy
			if( VIP > 1.0874 )
				if( smoothD_d <= 90.6685 )
					if( d_k <= 9.04985 )
						if( VIP_VIM <= 0.31596 )
							if( k <= 26.1428 )
								ret := -0.336957
							if( k > 26.1428 )
								ret := -0.010033
						if( VIP_VIM > 0.31596 )
							if( smoothK_k <= 86.6794 )
								ret := 0.084954
							if( smoothK_k > 86.6794 )
								ret := -0.666667
					if( d_k > 9.04985 )
						if( rsi1 <= 59.8999 )
							if( VIM <= 0.8547 )
								ret := -0.542208
							if( VIM > 0.8547 )
								ret := -0.203215
						if( rsi1 > 59.8999 )
							if( rsi1 <= 73.7029 )
								ret := -0.036248
							if( rsi1 > 73.7029 )
								ret := 0.342817
				if( smoothD_d > 90.6685 )
					if( rsi1 <= 65.616 )
						if( d_k <= 5.13429 )
							if( VIM <= 0.90578 )
								ret := -0.582278
							if( VIM > 0.90578 )
								ret := 0.150000
						if( d_k > 5.13429 )
							if( VIP_VIM <= 0.166223 )
								ret := 0.800000 // buy
							if( VIP_VIM > 0.166223 )
								ret := -0.022727
					if( rsi1 > 65.616 )
						if( VIP_VIM <= 0.811445 )
							if( VIP <= 1.17021 )
								ret := 0.777143 // buy
							if( VIP > 1.17021 )
								ret := 0.551181
						if( VIP_VIM > 0.811445 )
							if( VIP <= 1.41038 )
								ret := -0.526316
							if( VIP > 1.41038 )
								ret := 0.111111
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_BTCUSDT_30Min_37397acc(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


