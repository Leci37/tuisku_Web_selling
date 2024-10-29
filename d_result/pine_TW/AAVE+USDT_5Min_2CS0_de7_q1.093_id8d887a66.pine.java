//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: AAVEUSDT_5Min_2CS0_8d887a66 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_5Min_2CS0_8d887a66", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_5Min_8d887a66(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=7, max_features=0.65, min_samples_leaf=4,min_samples_split=5, random_state=843828734)
	if( d_k <= 0.059624 )
		if( smoothK_k <= 5.35525 )
			if( k <= 3.70804 )
				if( rsi1 <= 38.171 )
					if( rsi1 <= 28.4616 )
						if( d_k <= -1.48319 )
							if( ad_mf <= -23.6032 )
								ret := -0.077670
							if( ad_mf > -23.6032 )
								ret := -0.512821
						if( d_k > -1.48319 )
							if( mf <= 0.121589 )
								ret := -0.628249
							if( mf > 0.121589 )
								ret := -0.329412
					if( rsi1 > 28.4616 )
						if( smoothK_k <= -2.36892 )
							if( d <= 0.00189 )
								ret := -0.338983
							if( d > 0.00189 )
								ret := -0.818792 // sell
						if( smoothK_k > -2.36892 )
							if( d_k <= -0.174805 )
								ret := -0.204082
							if( d_k > -0.174805 )
								ret := -0.587302
				if( rsi1 > 38.171 )
					if( d <= 0.118059 )
						if( mf <= 0.071841 )
							if( rsi1 <= 51.4361 )
								ret := -0.630137
							if( rsi1 > 51.4361 )
								ret := 0.125000
						if( mf > 0.071841 )
							if( rsi1 <= 52.8657 )
								ret := -0.190083
							if( rsi1 > 52.8657 )
								ret := 0.214286
					if( d > 0.118059 )
						if( d <= 0.173601 )
							if( ad_mf <= -174.69 )
								ret := 0.000000
							if( ad_mf > -174.69 )
								ret := 1.000000 // buy
						if( d > 0.173601 )
							if( rsi1 <= 52.8378 )
								ret := -0.129784
							if( rsi1 > 52.8378 )
								ret := 0.421875
			if( k > 3.70804 )
				if( rsi1 <= 30.7913 )
					if( ad <= 245.686 )
						if( d <= 5.42812 )
							if( smoothK_k <= 1.64031 )
								ret := -0.393617
							if( smoothK_k > 1.64031 )
								ret := -0.038560
						if( d > 5.42812 )
							if( ad_mf <= -234.741 )
								ret := -0.130435
							if( ad_mf > -234.741 )
								ret := -0.593137
					if( ad > 245.686 )
						if( rsi1 <= 21.6735 )
							if( rsi1 <= 14.7928 )
								ret := -0.800000 // sell
							if( rsi1 > 14.7928 )
								ret := -0.151899
						if( rsi1 > 21.6735 )
							if( mf <= -0.183115 )
								ret := -0.400000
							if( mf > -0.183115 )
								ret := -0.814815 // sell
				if( rsi1 > 30.7913 )
					if( ad_mf <= 17.1518 )
						if( rsi1 <= 48.4853 )
							if( rsi1 <= 47.807 )
								ret := 0.118846
							if( rsi1 > 47.807 )
								ret := -0.400000
						if( rsi1 > 48.4853 )
							if( smoothK_k <= 2.61434 )
								ret := 0.157895
							if( smoothK_k > 2.61434 )
								ret := 0.472527
					if( ad_mf > 17.1518 )
						if( d_k <= -1.68049 )
							if( k <= 5.53214 )
								ret := 0.293103
							if( k > 5.53214 )
								ret := -0.083102
						if( d_k > -1.68049 )
							if( rsi1 <= 56.9582 )
								ret := -0.418440
							if( rsi1 > 56.9582 )
								ret := 0.576923
		if( smoothK_k > 5.35525 )
			if( rsi1 <= 52.8002 )
				if( d_k <= -6.3993 )
					if( ad_mf <= -82.0748 )
						if( k <= 62.2125 )
							if( rsi1 <= 31.141 )
								ret := 0.449571
							if( rsi1 > 31.141 )
								ret := 0.679626
						if( k > 62.2125 )
							if( rsi1 <= 36.4927 )
								ret := -0.030508
							if( rsi1 > 36.4927 )
								ret := 0.472337
					if( ad_mf > -82.0748 )
						if( rsi1 <= 33.7182 )
							if( smoothD_d <= 12.9702 )
								ret := 0.337329
							if( smoothD_d > 12.9702 )
								ret := -0.224739
						if( rsi1 > 33.7182 )
							if( smoothD_d <= 38.0434 )
								ret := 0.427463
							if( smoothD_d > 38.0434 )
								ret := 0.112593
				if( d_k > -6.3993 )
					if( ad_mf <= 2.44145 )
						if( rsi1 <= 32.1074 )
							if( ad <= -858.5 )
								ret := 0.308943
							if( ad > -858.5 )
								ret := -0.180116
						if( rsi1 > 32.1074 )
							if( smoothD_d <= 16.4006 )
								ret := 0.397332
							if( smoothD_d > 16.4006 )
								ret := 0.143463
					if( ad_mf > 2.44145 )
						if( rsi1 <= 40.824 )
							if( d <= 14.2475 )
								ret := -0.208506
							if( d > 14.2475 )
								ret := -0.420189
						if( rsi1 > 40.824 )
							if( smoothK_k <= 32.544 )
								ret := 0.103363
							if( smoothK_k > 32.544 )
								ret := -0.197825
			if( rsi1 > 52.8002 )
				if( ad_mf <= -40.1817 )
					if( ad_mf <= -219.452 )
						if( ad_mf <= -5484.29 )
							if( d <= 60.2455 )
								ret := -1.000000 // sell
							if( d > 60.2455 )
								ret := 0.555556
						if( ad_mf > -5484.29 )
							if( ad_mf <= -984.716 )
								ret := 0.781962 // buy
							if( ad_mf > -984.716 )
								ret := 0.664682
					if( ad_mf > -219.452 )
						if( d_k <= -10.9174 )
							if( ad_mf <= -148.868 )
								ret := 0.506775
							if( ad_mf > -148.868 )
								ret := 0.726129 // buy
						if( d_k > -10.9174 )
							if( rsi1 <= 64.2219 )
								ret := 0.420508
							if( rsi1 > 64.2219 )
								ret := 0.675431
				if( ad_mf > -40.1817 )
					if( d_k <= -12.6947 )
						if( smoothD_d <= 34.7009 )
							if( mf <= 0.353263 )
								ret := 0.722413 // buy
							if( mf > 0.353263 )
								ret := 0.170213
						if( smoothD_d > 34.7009 )
							if( rsi1 <= 63.5049 )
								ret := 0.472308
							if( rsi1 > 63.5049 )
								ret := 0.677009
					if( d_k > -12.6947 )
						if( k <= 98.3752 )
							if( rsi1 <= 63.7878 )
								ret := 0.249912
							if( rsi1 > 63.7878 )
								ret := 0.533647
						if( k > 98.3752 )
							if( ad <= 71.2749 )
								ret := 0.484979
							if( ad > 71.2749 )
								ret := 0.656845
	if( d_k > 0.059624 )
		if( rsi1 <= 57.1416 )
			if( rsi1 <= 38.1942 )
				if( d_k <= 16.6637 )
					if( rsi1 <= 28.1463 )
						if( rsi1 <= 24.9974 )
							if( ad_mf <= -106.691 )
								ret := -0.778732 // sell
							if( ad_mf > -106.691 )
								ret := -0.680958
						if( rsi1 > 24.9974 )
							if( ad_mf <= 153.58 )
								ret := -0.593779
							if( ad_mf > 153.58 )
								ret := -0.763441 // sell
					if( rsi1 > 28.1463 )
						if( k <= 93.3024 )
							if( ad_mf <= 38.8596 )
								ret := -0.458555
							if( ad_mf > 38.8596 )
								ret := -0.638585
						if( k > 93.3024 )
							if( ad_mf <= -827.951 )
								ret := 0.875000 // buy
							if( ad_mf > -827.951 )
								ret := 0.000000
				if( d_k > 16.6637 )
					if( ad_mf <= 219.554 )
						if( rsi1 <= 31.7303 )
							if( rsi1 <= 23.5835 )
								ret := -0.854922 // sell
							if( rsi1 > 23.5835 )
								ret := -0.754893 // sell
						if( rsi1 > 31.7303 )
							if( mf <= -0.329088 )
								ret := -0.065217
							if( mf > -0.329088 )
								ret := -0.680046
					if( ad_mf > 219.554 )
						if( rsi1 <= 21.3783 )
							if( d <= 44.1278 )
								ret := 0.000000
							if( d > 44.1278 )
								ret := -0.875000 // sell
						if( rsi1 > 21.3783 )
							if( mf <= 0.249227 )
								ret := -0.917910 // sell
							if( mf > 0.249227 )
								ret := -0.692308
			if( rsi1 > 38.1942 )
				if( d_k <= 6.7922 )
					if( ad_mf <= 20.1496 )
						if( k <= 3.86461 )
							if( ad <= -262.901 )
								ret := -0.474126
							if( ad > -262.901 )
								ret := -0.215551
						if( k > 3.86461 )
							if( smoothD_d <= 67.3576 )
								ret := 0.061545
							if( smoothD_d > 67.3576 )
								ret := -0.166004
					if( ad_mf > 20.1496 )
						if( ad_mf <= 375.586 )
							if( k <= 31.6156 )
								ret := -0.283349
							if( k > 31.6156 )
								ret := -0.392094
						if( ad_mf > 375.586 )
							if( smoothD_d <= 94.6311 )
								ret := -0.541084
							if( smoothD_d > 94.6311 )
								ret := 0.194805
				if( d_k > 6.7922 )
					if( ad <= 80.544 )
						if( d <= 47.1646 )
							if( mf <= 0.038907 )
								ret := -0.198765
							if( mf > 0.038907 )
								ret := -0.431491
						if( d > 47.1646 )
							if( d_k <= 14.9037 )
								ret := -0.405755
							if( d_k > 14.9037 )
								ret := -0.612003
					if( ad > 80.544 )
						if( d <= 51.8461 )
							if( rsi1 <= 51.3773 )
								ret := -0.635110
							if( rsi1 > 51.3773 )
								ret := -0.383268
						if( d > 51.8461 )
							if( mf <= -0.114297 )
								ret := -0.500000
							if( mf > -0.114297 )
								ret := -0.783903 // sell
		if( rsi1 > 57.1416 )
			if( ad <= 56.3778 )
				if( rsi1 <= 66.2852 )
					if( d_k <= 7.72319 )
						if( d <= 90.481 )
							if( ad <= -65.4315 )
								ret := 0.364583
							if( ad > -65.4315 )
								ret := 0.113147
						if( d > 90.481 )
							if( d_k <= 2.66606 )
								ret := 0.199753
							if( d_k > 2.66606 )
								ret := -0.110256
					if( d_k > 7.72319 )
						if( smoothD_d <= 53.5421 )
							if( d_k <= 17.4634 )
								ret := 0.260000
							if( d_k > 17.4634 )
								ret := -0.148699
						if( smoothD_d > 53.5421 )
							if( d_k <= 11.5568 )
								ret := -0.220101
							if( d_k > 11.5568 )
								ret := -0.560735
				if( rsi1 > 66.2852 )
					if( d_k <= 4.97426 )
						if( k <= 80.9949 )
							if( ad <= -189.901 )
								ret := 0.793991 // buy
							if( ad > -189.901 )
								ret := 0.600343
						if( k > 80.9949 )
							if( rsi1 <= 75.1676 )
								ret := 0.221661
							if( rsi1 > 75.1676 )
								ret := 0.518400
					if( d_k > 4.97426 )
						if( d <= 87.2506 )
							if( ad_mf <= -128.792 )
								ret := 0.371207
							if( ad_mf > -128.792 )
								ret := 0.115702
						if( d > 87.2506 )
							if( d <= 95.5078 )
								ret := -0.419732
							if( d > 95.5078 )
								ret := 0.075758
			if( ad > 56.3778 )
				if( k <= 94.5877 )
					if( d_k <= 6.80322 )
						if( smoothD_d <= 78.7107 )
							if( rsi1 <= 66.1232 )
								ret := 0.016313
							if( rsi1 > 66.1232 )
								ret := 0.356718
						if( smoothD_d > 78.7107 )
							if( rsi1 <= 80.452 )
								ret := -0.281218
							if( rsi1 > 80.452 )
								ret := 0.201493
					if( d_k > 6.80322 )
						if( d <= 67.8889 )
							if( ad <= 288.431 )
								ret := -0.046481
							if( ad > 288.431 )
								ret := -0.498049
						if( d > 67.8889 )
							if( d_k <= 10.3239 )
								ret := -0.499225
							if( d_k > 10.3239 )
								ret := -0.735393 // sell
				if( k > 94.5877 )
					if( rsi1 <= 63.7043 )
						if( k <= 98.6876 )
							if( smoothK_k <= 95.007 )
								ret := -0.147679
							if( smoothK_k > 95.007 )
								ret := -0.709677 // sell
						if( k > 98.6876 )
							if( d_k <= 0.409077 )
								ret := 0.166667
							if( d_k > 0.409077 )
								ret := 0.750000 // buy
					if( rsi1 > 63.7043 )
						if( k <= 97.9519 )
							if( d_k <= 1.18474 )
								ret := 0.388759
							if( d_k > 1.18474 )
								ret := 0.129741
						if( k > 97.9519 )
							if( rsi1 <= 80.8669 )
								ret := 0.465054
							if( rsi1 > 80.8669 )
								ret := 0.785714 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AAVEUSDT_5Min_8d887a66(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


