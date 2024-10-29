//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: AVAXUSDT_30Min_2CS0_54f32069 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_2CS0_54f32069", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_54f32069(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( k <= 37.291 )
		if( d_k <= -2.91752 )
			if( smoothD_d <= 6.87309 )
				if( d <= 4.90824 )
					if( mf <= 0.143694 )
						if( mf <= 0.092829 )
							if( ad_mf <= -128959 )
								ret := -0.689655
							if( ad_mf > -128959 )
								ret := -0.377163
						if( mf > 0.092829 )
							if( smoothK_k <= 7.28783 )
								ret := -0.670330
							if( smoothK_k > 7.28783 )
								ret := -0.230769
					if( mf > 0.143694 )
						if( ad_mf <= -2621.51 )
							if( k <= 7.16152 )
								ret := -0.160000
							if( k > 7.16152 )
								ret := 0.250000
						if( ad_mf > -2621.51 )
							if( d_k <= -3.69604 )
								ret := -0.244898
							if( d_k > -3.69604 )
								ret := -0.583333
				if( d > 4.90824 )
					if( rsi1 <= 41.7469 )
						if( ad <= -258914 )
							if( ad_mf <= -354273 )
								ret := 1.000000 // buy
							if( ad_mf > -354273 )
								ret := 0.750000 // buy
						if( ad > -258914 )
							if( ad_mf <= 37520.6 )
								ret := -0.339318
							if( ad_mf > 37520.6 )
								ret := -0.633663
					if( rsi1 > 41.7469 )
						if( mf <= 0.261579 )
							if( ad_mf <= 2036.28 )
								ret := 0.288889
							if( ad_mf > 2036.28 )
								ret := -0.122222
						if( mf > 0.261579 )
							if( ad_mf <= -92793.6 )
								ret := -1.000000 // sell
							if( ad_mf > -92793.6 )
								ret := -0.300000
			if( smoothD_d > 6.87309 )
				if( ad_mf <= -22935 )
					if( rsi1 <= 33.1098 )
						if( mf <= -0.069262 )
							if( ad_mf <= -275591 )
								ret := 1.000000 // buy
							if( ad_mf > -275591 )
								ret := -0.033113
						if( mf > -0.069262 )
							if( smoothK_k <= 19.9632 )
								ret := -0.735294 // sell
							if( smoothK_k > 19.9632 )
								ret := -0.128205
					if( rsi1 > 33.1098 )
						if( smoothK_k <= 15.6928 )
							if( mf <= 0.21426 )
								ret := 0.057692
							if( mf > 0.21426 )
								ret := 0.666667
						if( smoothK_k > 15.6928 )
							if( rsi1 <= 52.3994 )
								ret := 0.381432
							if( rsi1 > 52.3994 )
								ret := 0.635714
				if( ad_mf > -22935 )
					if( d_k <= -6.68492 )
						if( ad_mf <= -22163.2 )
							if( smoothK_k <= 31.0705 )
								ret := -0.608696
							if( smoothK_k > 31.0705 )
								ret := 0.250000
						if( ad_mf > -22163.2 )
							if( smoothK_k <= 28.4249 )
								ret := 0.084906
							if( smoothK_k > 28.4249 )
								ret := 0.182556
					if( d_k > -6.68492 )
						if( ad_mf <= 24581.9 )
							if( rsi1 <= 40.0087 )
								ret := -0.301994
							if( rsi1 > 40.0087 )
								ret := 0.255713
						if( ad_mf > 24581.9 )
							if( rsi1 <= 45.2453 )
								ret := -0.404255
							if( rsi1 > 45.2453 )
								ret := 0.114833
		if( d_k > -2.91752 )
			if( rsi1 <= 45.2305 )
				if( rsi1 <= 36.4752 )
					if( mf <= -0.152599 )
						if( rsi1 <= 20.4098 )
							if( mf <= -0.291281 )
								ret := -0.346154
							if( mf > -0.291281 )
								ret := -0.728880 // sell
						if( rsi1 > 20.4098 )
							if( ad_mf <= -101582 )
								ret := -0.556701
							if( ad_mf > -101582 )
								ret := -0.272593
					if( mf > -0.152599 )
						if( ad_mf <= 12216.1 )
							if( ad <= -6289.17 )
								ret := -0.672519
							if( ad > -6289.17 )
								ret := -0.513901
						if( ad_mf > 12216.1 )
							if( d_k <= 0.177561 )
								ret := -0.615000
							if( d_k > 0.177561 )
								ret := -0.785621 // sell
				if( rsi1 > 36.4752 )
					if( d_k <= 4.02685 )
						if( ad_mf <= 18775.5 )
							if( mf <= -0.074685 )
								ret := 0.043046
							if( mf > -0.074685 )
								ret := -0.286342
						if( ad_mf > 18775.5 )
							if( ad <= 47812.1 )
								ret := -0.453252
							if( ad > 47812.1 )
								ret := -0.744548 // sell
					if( d_k > 4.02685 )
						if( d_k <= 6.86062 )
							if( ad <= 11412.1 )
								ret := -0.373571
							if( ad > 11412.1 )
								ret := -0.682584
						if( d_k > 6.86062 )
							if( smoothD_d <= 55.6225 )
								ret := -0.599821
							if( smoothD_d > 55.6225 )
								ret := -0.311111
			if( rsi1 > 45.2305 )
				if( ad <= 18009 )
					if( smoothK_k <= 9.40283 )
						if( rsi1 <= 53.5379 )
							if( ad <= -32353.5 )
								ret := -0.444444
							if( ad > -32353.5 )
								ret := -0.192340
						if( rsi1 > 53.5379 )
							if( k <= 4.22302 )
								ret := -0.175258
							if( k > 4.22302 )
								ret := 0.069272
					if( smoothK_k > 9.40283 )
						if( rsi1 <= 57.4655 )
							if( smoothD_d <= 27.906 )
								ret := 0.048595
							if( smoothD_d > 27.906 )
								ret := -0.261229
						if( rsi1 > 57.4655 )
							if( d_k <= 11.199 )
								ret := 0.395210
							if( d_k > 11.199 )
								ret := -0.097665
				if( ad > 18009 )
					if( mf <= 0.066931 )
						if( d_k <= 6.96935 )
							if( ad_mf <= 28588.6 )
								ret := 0.180451
							if( ad_mf > 28588.6 )
								ret := -0.224638
						if( d_k > 6.96935 )
							if( rsi1 <= 57.7033 )
								ret := -0.590278
							if( rsi1 > 57.7033 )
								ret := 0.065217
					if( mf > 0.066931 )
						if( ad <= 30634.8 )
							if( rsi1 <= 49.9889 )
								ret := -0.674033
							if( rsi1 > 49.9889 )
								ret := -0.208723
						if( ad > 30634.8 )
							if( d_k <= 3.86785 )
								ret := -0.410753
							if( d_k > 3.86785 )
								ret := -0.603336
	if( k > 37.291 )
		if( d_k <= 2.37265 )
			if( rsi1 <= 54.5733 )
				if( rsi1 <= 39.0799 )
					if( ad <= -33421.9 )
						if( mf <= -0.145256 )
							if( ad <= -180242 )
								ret := 0.803279 // buy
							if( ad > -180242 )
								ret := 0.259036
						if( mf > -0.145256 )
							if( smoothD_d <= 33.7576 )
								ret := 0.313953
							if( smoothD_d > 33.7576 )
								ret := -0.173333
					if( ad > -33421.9 )
						if( d_k <= -8.14287 )
							if( d <= 22.127 )
								ret := 0.375000
							if( d > 22.127 )
								ret := -0.130724
						if( d_k > -8.14287 )
							if( ad_mf <= 7729.72 )
								ret := -0.172256
							if( ad_mf > 7729.72 )
								ret := -0.478400
				if( rsi1 > 39.0799 )
					if( ad <= -18397.4 )
						if( mf <= -0.015227 )
							if( smoothD_d <= 33.9355 )
								ret := 0.678284
							if( smoothD_d > 33.9355 )
								ret := 0.539698
						if( mf > -0.015227 )
							if( d_k <= -7.44271 )
								ret := 0.495298
							if( d_k > -7.44271 )
								ret := 0.134454
					if( ad > -18397.4 )
						if( mf <= 0.005641 )
							if( rsi1 <= 46.9289 )
								ret := 0.059395
							if( rsi1 > 46.9289 )
								ret := 0.309893
						if( mf > 0.005641 )
							if( smoothD_d <= 45.9396 )
								ret := 0.161466
							if( smoothD_d > 45.9396 )
								ret := -0.064870
			if( rsi1 > 54.5733 )
				if( ad_mf <= -22570.5 )
					if( mf <= 0.040028 )
						if( rsi1 <= 56.1225 )
							if( mf <= 0.006896 )
								ret := 0.643172
							if( mf > 0.006896 )
								ret := 0.281250
						if( rsi1 > 56.1225 )
							if( rsi1 <= 74.2199 )
								ret := 0.740079 // buy
							if( rsi1 > 74.2199 )
								ret := 0.866883 // buy
					if( mf > 0.040028 )
						if( rsi1 <= 63.637 )
							if( d <= 93.1116 )
								ret := 0.532258
							if( d > 93.1116 )
								ret := -0.034483
						if( rsi1 > 63.637 )
							if( mf <= 0.191065 )
								ret := 0.763862 // buy
							if( mf > 0.191065 )
								ret := 0.574627
				if( ad_mf > -22570.5 )
					if( k <= 91.1818 )
						if( d_k <= -5.82505 )
							if( ad_mf <= 21880 )
								ret := 0.506765
							if( ad_mf > 21880 )
								ret := 0.656233
						if( d_k > -5.82505 )
							if( ad <= 21839.4 )
								ret := 0.294505
							if( ad > 21839.4 )
								ret := 0.435133
					if( k > 91.1818 )
						if( ad_mf <= 11888.3 )
							if( mf <= 0.124628 )
								ret := 0.570866
							if( mf > 0.124628 )
								ret := 0.365696
						if( ad_mf > 11888.3 )
							if( d_k <= -0.000273 )
								ret := 0.692244
							if( d_k > -0.000273 )
								ret := 0.570812
		if( d_k > 2.37265 )
			if( rsi1 <= 55.3972 )
				if( ad_mf <= 14621.5 )
					if( d <= 88.6584 )
						if( d_k <= 7.0352 )
							if( rsi1 <= 47.5347 )
								ret := -0.328732
							if( rsi1 > 47.5347 )
								ret := -0.094624
						if( d_k > 7.0352 )
							if( rsi1 <= 48.8311 )
								ret := -0.457993
							if( rsi1 > 48.8311 )
								ret := -0.250820
					if( d > 88.6584 )
						if( ad <= 4221.75 )
							if( smoothK_k <= 87.4103 )
								ret := -0.018868
							if( smoothK_k > 87.4103 )
								ret := 0.194690
						if( ad > 4221.75 )
							if( d_k <= 2.51982 )
								ret := 0.500000
							if( d_k > 2.51982 )
								ret := -0.216049
				if( ad_mf > 14621.5 )
					if( k <= 83.7079 )
						if( ad_mf <= 47940.4 )
							if( rsi1 <= 48.1171 )
								ret := -0.613682
							if( rsi1 > 48.1171 )
								ret := -0.393897
						if( ad_mf > 47940.4 )
							if( d_k <= 4.26318 )
								ret := -0.488889
							if( d_k > 4.26318 )
								ret := -0.668000
					if( k > 83.7079 )
						if( ad_mf <= 34462.6 )
							if( ad <= 14966.2 )
								ret := -0.875000 // sell
							if( ad > 14966.2 )
								ret := 0.065217
						if( ad_mf > 34462.6 )
							if( d_k <= 4.86465 )
								ret := -0.205128
							if( d_k > 4.86465 )
								ret := -0.568627
			if( rsi1 > 55.3972 )
				if( rsi1 <= 64.3507 )
					if( ad_mf <= 29679.4 )
						if( k <= 79.5791 )
							if( d_k <= 7.51074 )
								ret := 0.091908
							if( d_k > 7.51074 )
								ret := -0.055113
						if( k > 79.5791 )
							if( mf <= 0.127779 )
								ret := 0.237158
							if( mf > 0.127779 )
								ret := -0.062500
					if( ad_mf > 29679.4 )
						if( mf <= -0.014128 )
							if( ad <= 31272.7 )
								ret := -1.000000 // sell
							if( ad > 31272.7 )
								ret := 0.266667
						if( mf > -0.014128 )
							if( smoothK_k <= 85.148 )
								ret := -0.430283
							if( smoothK_k > 85.148 )
								ret := 0.208955
				if( rsi1 > 64.3507 )
					if( d_k <= 11.2943 )
						if( mf <= 0.323341 )
							if( rsi1 <= 70.5913 )
								ret := 0.259098
							if( rsi1 > 70.5913 )
								ret := 0.453723
						if( mf > 0.323341 )
							if( ad_mf <= 81243.2 )
								ret := 0.094595
							if( ad_mf > 81243.2 )
								ret := -0.423423
					if( d_k > 11.2943 )
						if( ad <= 138434 )
							if( ad <= 125342 )
								ret := 0.099112
							if( ad > 125342 )
								ret := 0.944444 // buy
						if( ad > 138434 )
							if( ad <= 203705 )
								ret := -0.903846 // sell
							if( ad > 203705 )
								ret := -0.159091
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_54f32069(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


