//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: DOTUSDT_30Min_2SV0_8d6c2b5b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_2SV0_8d6c2b5b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_8d6c2b5b(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 52.9466 )
		if( d_k <= -2.95498 )
			if( rsi1 <= 31.6878 )
				if( VIP_VIM <= -0.389451 )
					if( rsi1 <= 21.7109 )
						if( VIP_VIM <= -0.722539 )
							if( d_k <= -7.5823 )
								ret := 0.462963
							if( d_k > -7.5823 )
								ret := -0.081967
						if( VIP_VIM > -0.722539 )
							if( smoothD_d <= 2.54197 )
								ret := -0.740741 // sell
							if( smoothD_d > 2.54197 )
								ret := -0.468354
					if( rsi1 > 21.7109 )
						if( VIP_VIM <= -0.565416 )
							if( d <= 3.42603 )
								ret := -0.764706 // sell
							if( d > 3.42603 )
								ret := 0.175559
						if( VIP_VIM > -0.565416 )
							if( d <= 43.15 )
								ret := -0.077551
							if( d > 43.15 )
								ret := -0.401198
				if( VIP_VIM > -0.389451 )
					if( VIP <= 0.904585 )
						if( rsi1 <= 29.2453 )
							if( d <= 45.2536 )
								ret := -0.633218
							if( d > 45.2536 )
								ret := -0.153846
						if( rsi1 > 29.2453 )
							if( VIM <= 1.16044 )
								ret := -0.528455
							if( VIM > 1.16044 )
								ret := -0.094737
					if( VIP > 0.904585 )
						if( d <= 17.5406 )
							if( rsi1 <= 25.9055 )
								ret := -0.917808 // sell
							if( rsi1 > 25.9055 )
								ret := -0.739362 // sell
						if( d > 17.5406 )
							if( VIP_VIM <= -0.150851 )
								ret := 0.000000
							if( VIP_VIM > -0.150851 )
								ret := -0.500000
			if( rsi1 > 31.6878 )
				if( VIP_VIM <= -0.226243 )
					if( rsi1 <= 41.6957 )
						if( VIP <= 0.81776 )
							if( VIP <= 0.741306 )
								ret := 0.546125
							if( VIP > 0.741306 )
								ret := 0.325700
						if( VIP > 0.81776 )
							if( rsi1 <= 35.5184 )
								ret := -0.184843
							if( rsi1 > 35.5184 )
								ret := 0.040707
					if( rsi1 > 41.6957 )
						if( smoothD_d <= 5.58184 )
							if( smoothD_d <= 2.05631 )
								ret := 0.578947
							if( smoothD_d > 2.05631 )
								ret := -0.281250
						if( smoothD_d > 5.58184 )
							if( smoothD_d <= 31.7896 )
								ret := 0.651917
							if( smoothD_d > 31.7896 )
								ret := 0.491283
				if( VIP_VIM > -0.226243 )
					if( rsi1 <= 44.7943 )
						if( VIP_VIM <= -0.118357 )
							if( rsi1 <= 40.928 )
								ret := -0.242656
							if( rsi1 > 40.928 )
								ret := 0.044160
						if( VIP_VIM > -0.118357 )
							if( d <= 53.7442 )
								ret := -0.456212
							if( d > 53.7442 )
								ret := -0.051282
					if( rsi1 > 44.7943 )
						if( VIP <= 0.944675 )
							if( smoothD_d <= 84.5218 )
								ret := 0.376433
							if( smoothD_d > 84.5218 )
								ret := -0.171053
						if( VIP > 0.944675 )
							if( VIP_VIM <= 0.06623 )
								ret := 0.047456
							if( VIP_VIM > 0.06623 )
								ret := -0.266038
		if( d_k > -2.95498 )
			if( rsi1 <= 39.1303 )
				if( VIP_VIM <= -0.178654 )
					if( rsi1 <= 26.7479 )
						if( VIP_VIM <= -0.361815 )
							if( rsi1 <= 19.9993 )
								ret := -0.605263
							if( rsi1 > 19.9993 )
								ret := -0.281705
						if( VIP_VIM > -0.361815 )
							if( rsi1 <= 23.5644 )
								ret := -0.799112 // sell
							if( rsi1 > 23.5644 )
								ret := -0.613767
					if( rsi1 > 26.7479 )
						if( VIP <= 0.829141 )
							if( VIP <= 0.636275 )
								ret := 0.780488 // buy
							if( VIP > 0.636275 )
								ret := 0.016069
						if( VIP > 0.829141 )
							if( rsi1 <= 32.0496 )
								ret := -0.414246
							if( rsi1 > 32.0496 )
								ret := -0.135021
				if( VIP_VIM > -0.178654 )
					if( rsi1 <= 33.3328 )
						if( rsi1 <= 24.0476 )
							if( rsi1 <= 13.2684 )
								ret := -0.963504 // sell
							if( rsi1 > 13.2684 )
								ret := -0.779725 // sell
						if( rsi1 > 24.0476 )
							if( VIP <= 0.888377 )
								ret := -0.234043
							if( VIP > 0.888377 )
								ret := -0.696522
					if( rsi1 > 33.3328 )
						if( VIP_VIM <= -0.074969 )
							if( rsi1 <= 36.5444 )
								ret := -0.482709
							if( rsi1 > 36.5444 )
								ret := -0.257679
						if( VIP_VIM > -0.074969 )
							if( d_k <= 6.55537 )
								ret := -0.509375
							if( d_k > 6.55537 )
								ret := -0.682484
			if( rsi1 > 39.1303 )
				if( VIP_VIM <= 0.098215 )
					if( VIP <= 0.925185 )
						if( VIP <= 0.869901 )
							if( VIP_VIM <= -0.248412 )
								ret := 0.386029
							if( VIP_VIM > -0.248412 )
								ret := 0.155039
						if( VIP > 0.869901 )
							if( smoothK_k <= 87.3397 )
								ret := 0.145672
							if( smoothK_k > 87.3397 )
								ret := -0.128571
					if( VIP > 0.925185 )
						if( rsi1 <= 44.4789 )
							if( d_k <= 22.2769 )
								ret := -0.275839
							if( d_k > 22.2769 )
								ret := 0.302521
						if( rsi1 > 44.4789 )
							if( smoothK_k <= 16.5191 )
								ret := 0.165394
							if( smoothK_k > 16.5191 )
								ret := -0.061795
				if( VIP_VIM > 0.098215 )
					if( VIM <= 0.897955 )
						if( smoothD_d <= 52.123 )
							if( d_k <= 28.3471 )
								ret := -0.436290
							if( d_k > 28.3471 )
								ret := -0.827160 // sell
						if( smoothD_d > 52.123 )
							if( VIM <= 0.869053 )
								ret := -0.707692 // sell
							if( VIM > 0.869053 )
								ret := -0.543210
					if( VIM > 0.897955 )
						if( d <= 64.9015 )
							if( rsi1 <= 46.5623 )
								ret := -0.398953
							if( rsi1 > 46.5623 )
								ret := -0.158715
						if( d > 64.9015 )
							if( d_k <= 16.514 )
								ret := -0.552013
							if( d_k > 16.514 )
								ret := -0.221477
	if( rsi1 > 52.9466 )
		if( smoothK_k <= 84.8887 )
			if( d_k <= -2.67793 )
				if( VIP <= 1.03845 )
					if( VIP <= 0.944789 )
						if( d <= 65.0779 )
							if( rsi1 <= 55.5025 )
								ret := 0.639908
							if( rsi1 > 55.5025 )
								ret := 0.757192 // buy
						if( d > 65.0779 )
							if( smoothK_k <= 76.0491 )
								ret := 0.146341
							if( smoothK_k > 76.0491 )
								ret := 0.616541
					if( VIP > 0.944789 )
						if( rsi1 <= 57.143 )
							if( k <= 52.3754 )
								ret := 0.468007
							if( k > 52.3754 )
								ret := 0.233577
						if( rsi1 > 57.143 )
							if( rsi1 <= 61.5411 )
								ret := 0.529412
							if( rsi1 > 61.5411 )
								ret := 0.699609
				if( VIP > 1.03845 )
					if( rsi1 <= 60.8732 )
						if( VIP_VIM <= 0.185217 )
							if( smoothD_d <= 54.3925 )
								ret := 0.118859
							if( smoothD_d > 54.3925 )
								ret := 0.422481
						if( VIP_VIM > 0.185217 )
							if( d <= 2.87222 )
								ret := -0.760000 // sell
							if( d > 2.87222 )
								ret := -0.092958
					if( rsi1 > 60.8732 )
						if( VIP_VIM <= 0.252992 )
							if( rsi1 <= 69.3096 )
								ret := 0.394828
							if( rsi1 > 69.3096 )
								ret := 0.677804
						if( VIP_VIM > 0.252992 )
							if( rsi1 <= 71.0108 )
								ret := 0.143548
							if( rsi1 > 71.0108 )
								ret := 0.441739
			if( d_k > -2.67793 )
				if( d_k <= 9.99545 )
					if( rsi1 <= 63.9101 )
						if( VIP_VIM <= 0.135092 )
							if( smoothK_k <= 77.4265 )
								ret := 0.279349
							if( smoothK_k > 77.4265 )
								ret := 0.104982
						if( VIP_VIM > 0.135092 )
							if( VIM <= 0.859983 )
								ret := -0.202983
							if( VIM > 0.859983 )
								ret := -0.018696
					if( rsi1 > 63.9101 )
						if( rsi1 <= 71.7124 )
							if( VIP_VIM <= 0.34161 )
								ret := 0.360817
							if( VIP_VIM > 0.34161 )
								ret := 0.050912
						if( rsi1 > 71.7124 )
							if( VIP_VIM <= 0.749347 )
								ret := 0.457262
							if( VIP_VIM > 0.749347 )
								ret := -0.137931
				if( d_k > 9.99545 )
					if( rsi1 <= 61.8538 )
						if( VIM <= 0.8287 )
							if( k <= 39.0231 )
								ret := -0.404088
							if( k > 39.0231 )
								ret := -0.614695
						if( VIM > 0.8287 )
							if( VIP_VIM <= 0.161591 )
								ret := 0.221393
							if( VIP_VIM > 0.161591 )
								ret := -0.174490
					if( rsi1 > 61.8538 )
						if( VIP <= 1.20143 )
							if( k <= 70.2554 )
								ret := 0.280660
							if( k > 70.2554 )
								ret := 0.661111
						if( VIP > 1.20143 )
							if( rsi1 <= 76.87 )
								ret := -0.084328
							if( rsi1 > 76.87 )
								ret := 0.422535
		if( smoothK_k > 84.8887 )
			if( rsi1 <= 68.8559 )
				if( VIP_VIM <= 0.044252 )
					if( rsi1 <= 63.2678 )
						if( VIP <= 0.937236 )
							if( d_k <= -6.6655 )
								ret := 0.663338
							if( d_k > -6.6655 )
								ret := 0.489614
						if( VIP > 0.937236 )
							if( rsi1 <= 58.6603 )
								ret := 0.292350
							if( rsi1 > 58.6603 )
								ret := 0.468657
					if( rsi1 > 63.2678 )
						if( d_k <= 2.33704 )
							if( VIM <= 0.949747 )
								ret := 0.100000
							if( VIM > 0.949747 )
								ret := 0.684859
						if( d_k > 2.33704 )
							if( smoothD_d <= 90.8106 )
								ret := 0.000000
							if( smoothD_d > 90.8106 )
								ret := 0.403846
				if( VIP_VIM > 0.044252 )
					if( rsi1 <= 64.164 )
						if( smoothK_k <= 95.3921 )
							if( rsi1 <= 58.396 )
								ret := -0.014286
							if( rsi1 > 58.396 )
								ret := 0.205357
						if( smoothK_k > 95.3921 )
							if( VIM <= 0.97254 )
								ret := -0.365854
							if( VIM > 0.97254 )
								ret := 0.500000
					if( rsi1 > 64.164 )
						if( VIP_VIM <= 0.225131 )
							if( rsi1 <= 66.0069 )
								ret := 0.390582
							if( rsi1 > 66.0069 )
								ret := 0.587983
						if( VIP_VIM > 0.225131 )
							if( VIM <= 0.835802 )
								ret := -0.016461
							if( VIM > 0.835802 )
								ret := 0.298658
			if( rsi1 > 68.8559 )
				if( VIM <= 0.799604 )
					if( rsi1 <= 78.754 )
						if( VIM <= 0.728139 )
							if( d_k <= -2.30951 )
								ret := 0.264706
							if( d_k > -2.30951 )
								ret := -0.200000
						if( VIM > 0.728139 )
							if( rsi1 <= 77.5015 )
								ret := 0.250896
							if( rsi1 > 77.5015 )
								ret := 0.584270
					if( rsi1 > 78.754 )
						if( VIP_VIM <= 0.611121 )
							if( rsi1 <= 84.5869 )
								ret := 0.621324
							if( rsi1 > 84.5869 )
								ret := 0.833766 // buy
						if( VIP_VIM > 0.611121 )
							if( d_k <= -9.72122 )
								ret := -0.750000 // sell
							if( d_k > -9.72122 )
								ret := 0.478155
				if( VIM > 0.799604 )
					if( smoothK_k <= 92.9518 )
						if( rsi1 <= 71.4348 )
							if( smoothK_k <= 90.5288 )
								ret := 0.571429
							if( smoothK_k > 90.5288 )
								ret := 0.358491
						if( rsi1 > 71.4348 )
							if( smoothD_d <= 82.3341 )
								ret := 0.772152 // buy
							if( smoothD_d > 82.3341 )
								ret := 0.630069
					if( smoothK_k > 92.9518 )
						if( rsi1 <= 82.9643 )
							if( VIP_VIM <= 0.252014 )
								ret := 0.762743 // buy
							if( VIP_VIM > 0.252014 )
								ret := 0.613251
						if( rsi1 > 82.9643 )
							if( VIP_VIM <= 0.432729 )
								ret := 0.870813 // buy
							if( VIP_VIM > 0.432729 )
								ret := 0.333333
	
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
float op_operation = decision_tree_0_DOTUSDT_30Min_8d6c2b5b(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


