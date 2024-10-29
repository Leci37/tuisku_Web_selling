//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: MATICUSDT_1Min_2SV0_09373ff1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_1Min_2SV0_09373ff1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_1Min_09373ff1(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=7, max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( smoothK_k <= 44.2646 )
		if( rsi1 <= 42.8406 )
			if( d <= 3.96799 )
				if( VIM <= 1.22926 )
					if( VIP <= 1.06315 )
						if( d_k <= 0.186613 )
							if( smoothK_k <= -2.1877 )
								ret := -0.744331 // sell
							if( smoothK_k > -2.1877 )
								ret := -0.637662
						if( d_k > 0.186613 )
							if( rsi1 <= 31.2498 )
								ret := -0.700726 // sell
							if( rsi1 > 31.2498 )
								ret := -0.175857
					if( VIP > 1.06315 )
						if( d_k <= 0.718152 )
							if( VIP_VIM <= 0.856848 )
								ret := -0.784306 // sell
							if( VIP_VIM > 0.856848 )
								ret := -0.560000
						if( d_k > 0.718152 )
							if( smoothD_d <= -0.725114 )
								ret := -0.585470
							if( smoothD_d > -0.725114 )
								ret := -0.721598 // sell
				if( VIM > 1.22926 )
					if( smoothK_k <= 0.925603 )
						if( rsi1 <= 16.6538 )
							if( VIP <= 0.596473 )
								ret := -0.477169
							if( VIP > 0.596473 )
								ret := -0.784574 // sell
						if( rsi1 > 16.6538 )
							if( rsi1 <= 22.9888 )
								ret := -0.369343
							if( rsi1 > 22.9888 )
								ret := -0.061224
					if( smoothK_k > 0.925603 )
						if( rsi1 <= 22.6962 )
							if( VIP <= 0.556187 )
								ret := 0.369048
							if( VIP > 0.556187 )
								ret := -0.559172
						if( rsi1 > 22.6962 )
							if( VIP <= 0.710939 )
								ret := 0.494898
							if( VIP > 0.710939 )
								ret := 0.049383
			if( d > 3.96799 )
				if( smoothK_k <= 16.1105 )
					if( rsi1 <= 30.7687 )
						if( rsi1 <= 20.8324 )
							if( VIP <= 0.696082 )
								ret := -0.538786
							if( VIP > 0.696082 )
								ret := -0.797734 // sell
						if( rsi1 > 20.8324 )
							if( VIM <= 1.25713 )
								ret := -0.654352
							if( VIM > 1.25713 )
								ret := -0.090546
					if( rsi1 > 30.7687 )
						if( d_k <= 29.779 )
							if( VIM <= 1.07928 )
								ret := -0.538455
							if( VIM > 1.07928 )
								ret := -0.001609
						if( d_k > 29.779 )
							if( smoothK_k <= 2.49434 )
								ret := 0.487179
							if( smoothK_k > 2.49434 )
								ret := -0.279070
				if( smoothK_k > 16.1105 )
					if( VIM <= 1.14252 )
						if( d_k <= -0.810764 )
							if( rsi1 <= 37.495 )
								ret := -0.764348 // sell
							if( rsi1 > 37.495 )
								ret := -0.591837
						if( d_k > -0.810764 )
							if( smoothD_d <= 67.9963 )
								ret := -0.516140
							if( smoothD_d > 67.9963 )
								ret := 0.125000
					if( VIM > 1.14252 )
						if( rsi1 <= 33.2971 )
							if( d <= 32.5242 )
								ret := -0.472204
							if( d > 32.5242 )
								ret := -0.354776
						if( rsi1 > 33.2971 )
							if( d_k <= -5.05973 )
								ret := 0.027990
							if( d_k > -5.05973 )
								ret := 0.177966
		if( rsi1 > 42.8406 )
			if( VIM <= 0.97038 )
				if( rsi1 <= 56.246 )
					if( d_k <= -2.99777 )
						if( rsi1 <= 49.9035 )
							if( rsi1 <= 49.2324 )
								ret := -0.707402 // sell
							if( rsi1 > 49.2324 )
								ret := -0.980392 // sell
						if( rsi1 > 49.9035 )
							if( VIP_VIM <= 0.147633 )
								ret := 0.063181
							if( VIP_VIM > 0.147633 )
								ret := -0.446220
					if( d_k > -2.99777 )
						if( VIP <= 1.16477 )
							if( k <= 13.4857 )
								ret := 0.036777
							if( k > 13.4857 )
								ret := -0.185132
						if( VIP > 1.16477 )
							if( rsi1 <= 49.9946 )
								ret := -0.540944
							if( rsi1 > 49.9946 )
								ret := -0.332901
				if( rsi1 > 56.246 )
					if( smoothD_d <= 22.3859 )
						if( rsi1 <= 66.6791 )
							if( d <= 14.5108 )
								ret := 0.134293
							if( d > 14.5108 )
								ret := -0.059423
						if( rsi1 > 66.6791 )
							if( smoothK_k <= -1.4723 )
								ret := -0.172414
							if( smoothK_k > -1.4723 )
								ret := 0.497682
					if( smoothD_d > 22.3859 )
						if( VIP <= 1.1727 )
							if( VIP_VIM <= 0.347236 )
								ret := 0.483373
							if( VIP_VIM > 0.347236 )
								ret := 0.178218
						if( VIP > 1.1727 )
							if( rsi1 <= 67.8575 )
								ret := 0.023972
							if( rsi1 > 67.8575 )
								ret := 0.511791
			if( VIM > 0.97038 )
				if( rsi1 <= 52.1918 )
					if( VIP_VIM <= -0.144676 )
						if( d_k <= -13.487 )
							if( VIP_VIM <= -0.345873 )
								ret := 0.441781
							if( VIP_VIM > -0.345873 )
								ret := 0.017456
						if( d_k > -13.487 )
							if( VIP_VIM <= -0.268821 )
								ret := 0.546594
							if( VIP_VIM > -0.268821 )
								ret := 0.367500
					if( VIP_VIM > -0.144676 )
						if( VIM <= 1.04598 )
							if( k <= 18.2365 )
								ret := 0.128638
							if( k > 18.2365 )
								ret := -0.113968
						if( VIM > 1.04598 )
							if( d_k <= -10.2427 )
								ret := -0.258427
							if( d_k > -10.2427 )
								ret := 0.183002
				if( rsi1 > 52.1918 )
					if( VIM <= 1.00003 )
						if( VIM <= 0.999987 )
							if( VIM <= 0.988778 )
								ret := 0.446078
							if( VIM > 0.988778 )
								ret := 0.767956 // buy
						if( VIM > 0.999987 )
							if( k <= 35.0279 )
								ret := 0.056338
							if( k > 35.0279 )
								ret := 0.271845
					if( VIM > 1.00003 )
						if( smoothD_d <= 49.3952 )
							if( VIP <= 0.999915 )
								ret := 0.688853
							if( VIP > 0.999915 )
								ret := 0.420268
						if( smoothD_d > 49.3952 )
							if( d <= 61.2574 )
								ret := 0.838028 // buy
							if( d > 61.2574 )
								ret := 0.470588
	if( smoothK_k > 44.2646 )
		if( smoothD_d <= 80.9476 )
			if( rsi1 <= 49.1354 )
				if( d_k <= -20.5852 )
					if( VIP_VIM <= -0.466288 )
						if( rsi1 <= 36.8138 )
							if( smoothK_k <= 50.3715 )
								ret := -0.707317 // sell
							if( smoothK_k > 50.3715 )
								ret := -0.346565
						if( rsi1 > 36.8138 )
							if( rsi1 <= 46.8939 )
								ret := -0.054252
							if( rsi1 > 46.8939 )
								ret := 0.378378
					if( VIP_VIM > -0.466288 )
						if( d <= 56.1387 )
							if( smoothK_k <= 68.8464 )
								ret := -0.466822
							if( smoothK_k > 68.8464 )
								ret := -0.218605
						if( d > 56.1387 )
							if( d <= 75.5986 )
								ret := -0.631841
							if( d > 75.5986 )
								ret := -0.264706
				if( d_k > -20.5852 )
					if( rsi1 <= 40.4566 )
						if( VIP <= 0.750428 )
							if( rsi1 <= 31.6675 )
								ret := -0.399250
							if( rsi1 > 31.6675 )
								ret := 0.211000
						if( VIP > 0.750428 )
							if( VIP <= 0.863654 )
								ret := -0.368554
							if( VIP > 0.863654 )
								ret := -0.577937
					if( rsi1 > 40.4566 )
						if( VIP_VIM <= -0.192095 )
							if( k <= 76.3432 )
								ret := 0.339382
							if( k > 76.3432 )
								ret := 0.065012
						if( VIP_VIM > -0.192095 )
							if( VIM <= 0.999443 )
								ret := -0.537696
							if( VIM > 0.999443 )
								ret := -0.271002
			if( rsi1 > 49.1354 )
				if( VIM <= 1.00001 )
					if( VIM <= 0.875029 )
						if( VIM <= 0.735336 )
							if( rsi1 <= 71.3752 )
								ret := -0.312664
							if( rsi1 > 71.3752 )
								ret := 0.386271
						if( VIM > 0.735336 )
							if( rsi1 <= 66.671 )
								ret := -0.151757
							if( rsi1 > 66.671 )
								ret := 0.573876
					if( VIM > 0.875029 )
						if( rsi1 <= 58.826 )
							if( VIM <= 0.931936 )
								ret := -0.231410
							if( VIM > 0.931936 )
								ret := -0.000301
						if( rsi1 > 58.826 )
							if( VIM <= 0.999957 )
								ret := 0.539213
							if( VIM > 0.999957 )
								ret := 0.195980
				if( VIM > 1.00001 )
					if( rsi1 <= 55.0174 )
						if( d_k <= -5.35198 )
							if( VIM <= 1.08695 )
								ret := -0.152768
							if( VIM > 1.08695 )
								ret := 0.363438
						if( d_k > -5.35198 )
							if( smoothD_d <= 75.3629 )
								ret := 0.436451
							if( smoothD_d > 75.3629 )
								ret := 0.594373
					if( rsi1 > 55.0174 )
						if( VIP_VIM <= -0.141049 )
							if( d_k <= -15.745 )
								ret := 0.537463
							if( d_k > -15.745 )
								ret := 0.690185
						if( VIP_VIM > -0.141049 )
							if( rsi1 <= 62.6524 )
								ret := 0.433209
							if( rsi1 > 62.6524 )
								ret := 0.667241
		if( smoothD_d > 80.9476 )
			if( rsi1 <= 55.6075 )
				if( VIP_VIM <= -0.076747 )
					if( VIP_VIM <= -0.311357 )
						if( VIP <= 0.653614 )
							if( rsi1 <= 30.3653 )
								ret := -0.552795
							if( rsi1 > 30.3653 )
								ret := 0.483051
						if( VIP > 0.653614 )
							if( k <= 96.1219 )
								ret := 0.260590
							if( k > 96.1219 )
								ret := 0.100840
					if( VIP_VIM > -0.311357 )
						if( rsi1 <= 47.8031 )
							if( smoothK_k <= 63.0292 )
								ret := 0.476190
							if( smoothK_k > 63.0292 )
								ret := -0.286535
						if( rsi1 > 47.8031 )
							if( k <= 89.9076 )
								ret := 0.434168
							if( k > 89.9076 )
								ret := 0.168478
				if( VIP_VIM > -0.076747 )
					if( smoothK_k <= 65.1445 )
						if( d_k <= 16.9467 )
							ret := 1.000000 // buy
						if( d_k > 16.9467 )
							if( k <= 67.6455 )
								ret := 0.376471
							if( k > 67.6455 )
								ret := -0.666667
					if( smoothK_k > 65.1445 )
						if( VIM <= 0.959969 )
							if( VIP <= 1.08352 )
								ret := -0.382429
							if( VIP > 1.08352 )
								ret := -0.586648
						if( VIM > 0.959969 )
							if( smoothK_k <= 74.4934 )
								ret := 0.090909
							if( smoothK_k > 74.4934 )
								ret := -0.216845
			if( rsi1 > 55.6075 )
				if( VIP_VIM <= 0.228373 )
					if( VIM <= 1 )
						if( d_k <= -3.27466 )
							if( VIM <= 0.999958 )
								ret := 0.447447
							if( VIM > 0.999958 )
								ret := 0.164286
						if( d_k > -3.27466 )
							if( smoothD_d <= 93.4591 )
								ret := 0.568590
							if( smoothD_d > 93.4591 )
								ret := 0.696429
					if( VIM > 1 )
						if( rsi1 <= 64.5572 )
							if( k <= 99.3512 )
								ret := 0.658913
							if( k > 99.3512 )
								ret := 0.466814
						if( rsi1 > 64.5572 )
							if( d_k <= -1.96733 )
								ret := 0.721484 // buy
							if( d_k > -1.96733 )
								ret := 0.794494 // buy
				if( VIP_VIM > 0.228373 )
					if( rsi1 <= 70.6988 )
						if( VIM <= 0.816131 )
							if( smoothK_k <= 92.7322 )
								ret := -0.214216
							if( smoothK_k > 92.7322 )
								ret := 0.057823
						if( VIM > 0.816131 )
							if( smoothK_k <= 74.6246 )
								ret := 0.461140
							if( smoothK_k > 74.6246 )
								ret := 0.112574
					if( rsi1 > 70.6988 )
						if( VIM <= 0.677183 )
							if( k <= 98.2647 )
								ret := 0.267851
							if( k > 98.2647 )
								ret := 0.449757
						if( VIM > 0.677183 )
							if( rsi1 <= 80.0012 )
								ret := 0.549155
							if( rsi1 > 80.0012 )
								ret := 0.798018 // buy
	
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
float op_operation = decision_tree_0_MATICUSDT_1Min_09373ff1(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


