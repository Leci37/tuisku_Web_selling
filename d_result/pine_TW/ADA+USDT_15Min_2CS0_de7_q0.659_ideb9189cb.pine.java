//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: ADAUSDT_15Min_2CS0_eb9189cb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_15Min_2CS0_eb9189cb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_15Min_eb9189cb(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( k <= 47.4565 )
		if( smoothK_k <= 18.7583 )
			if( mf <= -0.133169 )
				if( rsi1 <= 29.2552 )
					if( ad_mf <= -3.40636e+06 )
						if( mf <= -0.366169 )
							if( d_k <= -2.90908 )
								ret := -0.600000
							if( d_k > -2.90908 )
								ret := 0.851064 // buy
						if( mf > -0.366169 )
							if( mf <= -0.180534 )
								ret := -0.092593
							if( mf > -0.180534 )
								ret := 0.428571
					if( ad_mf > -3.40636e+06 )
						if( mf <= -0.146237 )
							if( ad_mf <= 1.07255e+06 )
								ret := -0.357838
							if( ad_mf > 1.07255e+06 )
								ret := -0.011364
						if( mf > -0.146237 )
							if( mf <= -0.135244 )
								ret := -0.592157
							if( mf > -0.135244 )
								ret := 0.000000
				if( rsi1 > 29.2552 )
					if( ad_mf <= -927533 )
						if( smoothD_d <= 1.03767 )
							if( smoothK_k <= -1.60206 )
								ret := -0.041667
							if( smoothK_k > -1.60206 )
								ret := -0.571429
						if( smoothD_d > 1.03767 )
							if( smoothK_k <= -0.028691 )
								ret := 0.603175
							if( smoothK_k > -0.028691 )
								ret := 0.099617
					if( ad_mf > -927533 )
						if( ad_mf <= 1.46305e+06 )
							if( mf <= -0.214268 )
								ret := -0.037281
							if( mf > -0.214268 )
								ret := -0.238367
						if( ad_mf > 1.46305e+06 )
							if( rsi1 <= 32.1341 )
								ret := 0.509804
							if( rsi1 > 32.1341 )
								ret := 0.037975
			if( mf > -0.133169 )
				if( rsi1 <= 45.4023 )
					if( mf <= -0.011194 )
						if( rsi1 <= 32.997 )
							if( d_k <= -0.044803 )
								ret := -0.553810
							if( d_k > -0.044803 )
								ret := -0.485974
						if( rsi1 > 32.997 )
							if( d_k <= -10.8771 )
								ret := 0.666667
							if( d_k > -10.8771 )
								ret := -0.266996
					if( mf > -0.011194 )
						if( rsi1 <= 32.7259 )
							if( smoothD_d <= -1.99528 )
								ret := -0.511530
							if( smoothD_d > -1.99528 )
								ret := -0.648704
						if( rsi1 > 32.7259 )
							if( ad_mf <= 158569 )
								ret := -0.424069
							if( ad_mf > 158569 )
								ret := -0.556535
				if( rsi1 > 45.4023 )
					if( ad_mf <= 1.21734e+06 )
						if( rsi1 <= 63.3406 )
							if( rsi1 <= 48.9118 )
								ret := -0.255924
							if( rsi1 > 48.9118 )
								ret := -0.099927
						if( rsi1 > 63.3406 )
							if( ad_mf <= -427313 )
								ret := 0.408889
							if( ad_mf > -427313 )
								ret := 0.113333
					if( ad_mf > 1.21734e+06 )
						if( smoothD_d <= 9.31284 )
							if( d_k <= -0.169266 )
								ret := -0.677570
							if( d_k > -0.169266 )
								ret := -0.441860
						if( smoothD_d > 9.31284 )
							if( mf <= 0.119632 )
								ret := -0.050926
							if( mf > 0.119632 )
								ret := -0.441718
		if( smoothK_k > 18.7583 )
			if( ad_mf <= -594048 )
				if( smoothK_k <= 32.5965 )
					if( rsi1 <= 53.7399 )
						if( d <= 21.7064 )
							if( d_k <= -6.89269 )
								ret := -0.365044
							if( d_k > -6.89269 )
								ret := -0.052083
						if( d > 21.7064 )
							if( ad_mf <= -7.10172e+06 )
								ret := 0.629630
							if( ad_mf > -7.10172e+06 )
								ret := -0.085213
					if( rsi1 > 53.7399 )
						if( rsi1 <= 69.68 )
							if( smoothD_d <= 37.1424 )
								ret := 0.364985
							if( smoothD_d > 37.1424 )
								ret := -0.028169
						if( rsi1 > 69.68 )
							if( smoothK_k <= 23.3311 )
								ret := 0.571429
							if( smoothK_k > 23.3311 )
								ret := 0.956522 // buy
				if( smoothK_k > 32.5965 )
					if( ad_mf <= -3.88605e+06 )
						if( ad_mf <= -4.70148e+06 )
							if( rsi1 <= 20.6618 )
								ret := 1.000000 // buy
							if( rsi1 > 20.6618 )
								ret := 0.125000
						if( ad_mf > -4.70148e+06 )
							if( k <= 46.1614 )
								ret := 0.647541
							if( k > 46.1614 )
								ret := -0.250000
					if( ad_mf > -3.88605e+06 )
						if( rsi1 <= 35.9759 )
							if( d <= 37.6816 )
								ret := 0.064189
							if( d > 37.6816 )
								ret := -0.240000
						if( rsi1 > 35.9759 )
							if( smoothD_d <= 43.8607 )
								ret := 0.248830
							if( smoothD_d > 43.8607 )
								ret := 0.104141
			if( ad_mf > -594048 )
				if( smoothK_k <= 35.6424 )
					if( ad_mf <= 128018 )
						if( ad_mf <= -591866 )
							ret := -1.000000 // sell
						if( ad_mf > -591866 )
							if( rsi1 <= 47.4471 )
								ret := -0.293285
							if( rsi1 > 47.4471 )
								ret := 0.062561
					if( ad_mf > 128018 )
						if( rsi1 <= 50.9118 )
							if( d_k <= 2.7612 )
								ret := -0.251092
							if( d_k > 2.7612 )
								ret := -0.496950
						if( rsi1 > 50.9118 )
							if( rsi1 <= 66.4354 )
								ret := -0.170518
							if( rsi1 > 66.4354 )
								ret := 0.200692
				if( smoothK_k > 35.6424 )
					if( ad_mf <= -0.131003 )
						if( rsi1 <= 49.0099 )
							if( smoothD_d <= 37.1507 )
								ret := -0.017986
							if( smoothD_d > 37.1507 )
								ret := -0.289333
						if( rsi1 > 49.0099 )
							if( d_k <= 6.00585 )
								ret := 0.255673
							if( d_k > 6.00585 )
								ret := 0.003012
					if( ad_mf > -0.131003 )
						if( rsi1 <= 48.0182 )
							if( d_k <= 0.579259 )
								ret := -0.128028
							if( d_k > 0.579259 )
								ret := -0.472808
						if( rsi1 > 48.0182 )
							if( ad_mf <= 1.69817e+06 )
								ret := 0.017128
							if( ad_mf > 1.69817e+06 )
								ret := -0.254854
	if( k > 47.4565 )
		if( d <= 79.6427 )
			if( rsi1 <= 54.2709 )
				if( smoothK_k <= 65.9167 )
					if( ad_mf <= -133709 )
						if( ad <= -7.37517e+06 )
							if( mf <= -0.009402 )
								ret := 0.861111 // buy
							if( mf > -0.009402 )
								ret := -0.333333
						if( ad > -7.37517e+06 )
							if( ad_mf <= -636996 )
								ret := 0.134615
							if( ad_mf > -636996 )
								ret := 0.006661
					if( ad_mf > -133709 )
						if( smoothD_d <= 56.1814 )
							if( d_k <= -0.947198 )
								ret := -0.043663
							if( d_k > -0.947198 )
								ret := -0.257426
						if( smoothD_d > 56.1814 )
							if( rsi1 <= 48.0337 )
								ret := -0.364644
							if( rsi1 > 48.0337 )
								ret := -0.133710
				if( smoothK_k > 65.9167 )
					if( ad <= -397998 )
						if( ad <= -4.12019e+06 )
							if( k <= 73.1319 )
								ret := 0.482759
							if( k > 73.1319 )
								ret := 0.887324 // buy
						if( ad > -4.12019e+06 )
							if( ad <= -4.06768e+06 )
								ret := -1.000000 // sell
							if( ad > -4.06768e+06 )
								ret := 0.258973
					if( ad > -397998 )
						if( rsi1 <= 45.6148 )
							if( rsi1 <= 36.7977 )
								ret := -0.248603
							if( rsi1 > 36.7977 )
								ret := -0.033725
						if( rsi1 > 45.6148 )
							if( d_k <= 6.02799 )
								ret := 0.154043
							if( d_k > 6.02799 )
								ret := -0.220000
			if( rsi1 > 54.2709 )
				if( d_k <= -5.20515 )
					if( ad_mf <= -39406.1 )
						if( smoothD_d <= 46.8512 )
							if( k <= 59.9447 )
								ret := 0.310547
							if( k > 59.9447 )
								ret := 0.488571
						if( smoothD_d > 46.8512 )
							if( ad <= -1.78906e+06 )
								ret := 0.301980
							if( ad > -1.78906e+06 )
								ret := 0.601081
					if( ad_mf > -39406.1 )
						if( ad <= 2.65273e+06 )
							if( smoothK_k <= 59.1972 )
								ret := 0.225055
							if( smoothK_k > 59.1972 )
								ret := 0.376162
						if( ad > 2.65273e+06 )
							if( d <= 72.0753 )
								ret := -0.048159
							if( d > 72.0753 )
								ret := 0.494118
				if( d_k > -5.20515 )
					if( ad <= 682385 )
						if( rsi1 <= 60.9836 )
							if( mf <= 0.016198 )
								ret := 0.287722
							if( mf > 0.016198 )
								ret := 0.075235
						if( rsi1 > 60.9836 )
							if( ad <= 643127 )
								ret := 0.366095
							if( ad > 643127 )
								ret := 0.728571 // buy
					if( ad > 682385 )
						if( rsi1 <= 70.5977 )
							if( d_k <= 1.83032 )
								ret := 0.091080
							if( d_k > 1.83032 )
								ret := -0.097087
						if( rsi1 > 70.5977 )
							if( mf <= 0.126389 )
								ret := 0.072848
							if( mf > 0.126389 )
								ret := 0.353604
		if( d > 79.6427 )
			if( rsi1 <= 58.0529 )
				if( k <= 83.09 )
					if( k <= 82.4048 )
						if( ad <= -244815 )
							if( d_k <= 6.0093 )
								ret := 0.369748
							if( d_k > 6.0093 )
								ret := 0.144330
						if( ad > -244815 )
							if( k <= 79.1272 )
								ret := -0.037823
							if( k > 79.1272 )
								ret := 0.136442
					if( k > 82.4048 )
						if( ad_mf <= -2.44346e+06 )
							if( smoothD_d <= 84.0275 )
								ret := -1.000000 // sell
							if( smoothD_d > 84.0275 )
								ret := -0.833333 // sell
						if( ad_mf > -2.44346e+06 )
							if( ad_mf <= -303447 )
								ret := 0.352941
							if( ad_mf > -303447 )
								ret := -0.088000
				if( k > 83.09 )
					if( rsi1 <= 45.8657 )
						if( ad <= -2.48879e+06 )
							if( mf <= -0.242129 )
								ret := 0.848485 // buy
							if( mf > -0.242129 )
								ret := 0.454545
						if( ad > -2.48879e+06 )
							if( ad <= 1.55528e+06 )
								ret := 0.068412
							if( ad > 1.55528e+06 )
								ret := 0.470588
					if( rsi1 > 45.8657 )
						if( ad <= -206404 )
							if( smoothK_k <= 83.0851 )
								ret := 0.228346
							if( smoothK_k > 83.0851 )
								ret := 0.442728
						if( ad > -206404 )
							if( ad_mf <= 5.90913e+06 )
								ret := 0.192692
							if( ad_mf > 5.90913e+06 )
								ret := 0.622222
			if( rsi1 > 58.0529 )
				if( mf <= -0.001072 )
					if( d_k <= 4.96426 )
						if( rsi1 <= 67.5702 )
							if( smoothD_d <= 94.6767 )
								ret := 0.491165
							if( smoothD_d > 94.6767 )
								ret := 0.264151
						if( rsi1 > 67.5702 )
							if( d_k <= -0.003631 )
								ret := 0.652542
							if( d_k > -0.003631 )
								ret := 0.552104
					if( d_k > 4.96426 )
						if( mf <= -0.001988 )
							if( ad <= -4.4888e+06 )
								ret := -0.555556
							if( ad > -4.4888e+06 )
								ret := 0.386330
						if( mf > -0.001988 )
							ret := 1.000000 // buy
				if( mf > -0.001072 )
					if( rsi1 <= 74.3908 )
						if( smoothK_k <= 96.9767 )
							if( smoothD_d <= 81.5292 )
								ret := 0.284314
							if( smoothD_d > 81.5292 )
								ret := 0.372601
						if( smoothK_k > 96.9767 )
							if( ad_mf <= -270267 )
								ret := 0.450000
							if( ad_mf > -270267 )
								ret := 0.117117
					if( rsi1 > 74.3908 )
						if( rsi1 <= 81.8726 )
							if( smoothK_k <= 96.999 )
								ret := 0.503249
							if( smoothK_k > 96.999 )
								ret := 0.291096
						if( rsi1 > 81.8726 )
							if( rsi1 <= 82.2743 )
								ret := 0.810000 // buy
							if( rsi1 > 82.2743 )
								ret := 0.571752
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_ADAUSDT_15Min_eb9189cb(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


