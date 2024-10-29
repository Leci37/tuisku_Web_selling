//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: MATICUSDT_1Min_2BS0_6d17a872 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_1Min_2BS0_6d17a872", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_1Min_6d17a872(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothK_k <= 44.2646 )
		if( rsi1 <= 42.8407 )
			if( bbp <= 0.000103 )
				if( rsi1 <= 30.767 )
					if( bullPower <= -0.000961 )
						if( rsi1 <= 18.0709 )
							if( rsi1 <= 12.8949 )
								ret := -0.738928 // sell
							if( rsi1 > 12.8949 )
								ret := -0.538717
						if( rsi1 > 18.0709 )
							if( rsi1 <= 27.1726 )
								ret := -0.234144
							if( rsi1 > 27.1726 )
								ret := 0.161379
					if( bullPower > -0.000961 )
						if( rsi1 <= 24.9892 )
							if( rsi1 <= 21.0518 )
								ret := -0.767188 // sell
							if( rsi1 > 21.0518 )
								ret := -0.661693
						if( rsi1 > 24.9892 )
							if( bbm <= 0.0003 )
								ret := -0.350622
							if( bbm > 0.0003 )
								ret := -0.608106
				if( rsi1 > 30.767 )
					if( bbp <= -0.001278 )
						if( bullPower <= -0.000962 )
							if( k <= 0.455813 )
								ret := -0.375000
							if( k > 0.455813 )
								ret := 0.518634
						if( bullPower > -0.000962 )
							if( bullPower <= -0.00045 )
								ret := 0.146655
							if( bullPower > -0.00045 )
								ret := -0.042956
					if( bbp > -0.001278 )
						if( bullPower <= -0.000104 )
							if( smoothK_k <= 11.6934 )
								ret := -0.067838
							if( smoothK_k > 11.6934 )
								ret := -0.240049
						if( bullPower > -0.000104 )
							if( rsi1 <= 37.499 )
								ret := -0.545951
							if( rsi1 > 37.499 )
								ret := -0.306013
			if( bbp > 0.000103 )
				if( bullPower <= 0.000475 )
					if( BBPower_Color <= 0.5 )
						if( d_k <= 29.5377 )
							if( bbm <= 0.000462 )
								ret := -0.947750 // sell
							if( bbm > 0.000462 )
								ret := -0.844720 // sell
						if( d_k > 29.5377 )
							if( smoothK_k <= 4.20107 )
								ret := 1.000000 // buy
							if( smoothK_k > 4.20107 )
								ret := -0.500000
					if( BBPower_Color > 0.5 )
						if( rsi1 <= 35.7124 )
							if( rsi1 <= 28.5712 )
								ret := -0.789181 // sell
							if( rsi1 > 28.5712 )
								ret := -0.659679
						if( rsi1 > 35.7124 )
							if( smoothK_k <= -0.278459 )
								ret := -0.216146
							if( smoothK_k > -0.278459 )
								ret := -0.537352
				if( bullPower > 0.000475 )
					if( bbm <= 0.0002 )
						if( bbm <= 0.0001 )
							if( smoothD_d <= -0.538941 )
								ret := -0.647059
							if( smoothD_d > -0.538941 )
								ret := -0.365854
						if( bbm > 0.0001 )
							if( bbm <= 0.0002 )
								ret := -1.000000 // sell
							if( bbm > 0.0002 )
								ret := -0.577093
					if( bbm > 0.0002 )
						if( d_k <= 17.1959 )
							if( rsi1 <= 35.9997 )
								ret := -0.882918 // sell
							if( rsi1 > 35.9997 )
								ret := -0.794037 // sell
						if( d_k > 17.1959 )
							if( rsi1 <= 38.0841 )
								ret := -0.825702 // sell
							if( rsi1 > 38.0841 )
								ret := -0.528455
		if( rsi1 > 42.8407 )
			if( BBPower_Color <= 0.5 )
				if( bullPower <= -6.7e-05 )
					if( bbm <= 0.0002 )
						if( rsi1 <= 52.2005 )
							if( bullPower <= -0.000206 )
								ret := 0.216138
							if( bullPower > -0.000206 )
								ret := 0.059946
						if( rsi1 > 52.2005 )
							if( bbp <= -0.0004 )
								ret := 0.492958
							if( bbp > -0.0004 )
								ret := 0.147541
					if( bbm > 0.0002 )
						if( rsi1 <= 48.7187 )
							if( bbp <= -0.001653 )
								ret := 0.680519
							if( bbp > -0.001653 )
								ret := 0.375179
						if( rsi1 > 48.7187 )
							if( k <= 12.1382 )
								ret := 0.438144
							if( k > 12.1382 )
								ret := 0.727729 // buy
				if( bullPower > -6.7e-05 )
					if( bbp <= -0.00031 )
						if( d_k <= -6.5511 )
							if( rsi1 <= 51.2159 )
								ret := -0.111878
							if( rsi1 > 51.2159 )
								ret := 0.605505
						if( d_k > -6.5511 )
							if( smoothK_k <= -2.99015 )
								ret := 0.112150
							if( smoothK_k > -2.99015 )
								ret := 0.411830
					if( bbp > -0.00031 )
						if( d_k <= -2.93154 )
							if( smoothD_d <= 22.4033 )
								ret := -0.056034
							if( smoothD_d > 22.4033 )
								ret := 0.179819
						if( d_k > -2.93154 )
							if( rsi1 <= 53.3386 )
								ret := 0.011505
							if( rsi1 > 53.3386 )
								ret := 0.599871
			if( BBPower_Color > 0.5 )
				if( bbp <= 0.000968 )
					if( d <= 53.6691 )
						if( rsi1 <= 53.5421 )
							if( bullPower <= 0.000446 )
								ret := -0.154488
							if( bullPower > 0.000446 )
								ret := -0.407434
						if( rsi1 > 53.5421 )
							if( rsi1 <= 61.9299 )
								ret := 0.123681
							if( rsi1 > 61.9299 )
								ret := 0.461231
					if( d > 53.6691 )
						if( rsi1 <= 47.9819 )
							if( k <= 28.3245 )
								ret := 0.666667
							if( k > 28.3245 )
								ret := -0.289796
						if( rsi1 > 47.9819 )
							if( bbm <= 0.0005 )
								ret := 0.225331
							if( bbm > 0.0005 )
								ret := 0.435484
				if( bbp > 0.000968 )
					if( rsi1 <= 61.9716 )
						if( bbp <= 0.001539 )
							if( d_k <= -0.101525 )
								ret := -0.605396
							if( d_k > -0.101525 )
								ret := -0.282739
						if( bbp > 0.001539 )
							if( rsi1 <= 56.1208 )
								ret := -0.717483 // sell
							if( rsi1 > 56.1208 )
								ret := -0.408298
					if( rsi1 > 61.9716 )
						if( rsi1 <= 68.208 )
							if( bullPower <= 0.001601 )
								ret := 0.237878
							if( bullPower > 0.001601 )
								ret := -0.241525
						if( rsi1 > 68.208 )
							if( smoothK_k <= -1.27257 )
								ret := -0.311475
							if( smoothK_k > -1.27257 )
								ret := 0.518763
	if( smoothK_k > 44.2646 )
		if( rsi1 <= 55.0085 )
			if( bbp <= -0.000509 )
				if( bbp <= -0.001013 )
					if( d_k <= -8.44116 )
						if( d_k <= -20.5842 )
							if( rsi1 <= 44.7102 )
								ret := -0.325678
							if( rsi1 > 44.7102 )
								ret := 0.319202
						if( d_k > -20.5842 )
							if( smoothK_k <= 57.7909 )
								ret := -0.034553
							if( smoothK_k > 57.7909 )
								ret := 0.171293
					if( d_k > -8.44116 )
						if( rsi1 <= 40.1209 )
							if( bearPower <= -0.002596 )
								ret := 0.243023
							if( bearPower > -0.002596 )
								ret := -0.223556
						if( rsi1 > 40.1209 )
							if( bullPower <= -0.0005 )
								ret := 0.714704 // buy
							if( bullPower > -0.0005 )
								ret := 0.490442
				if( bbp > -0.001013 )
					if( rsi1 <= 42.078 )
						if( bbm <= 0.0003 )
							if( bbm <= 0.0002 )
								ret := -0.136445
							if( bbm > 0.0002 )
								ret := -0.331887
						if( bbm > 0.0003 )
							if( rsi1 <= 37.8367 )
								ret := -0.625981
							if( rsi1 > 37.8367 )
								ret := -0.382217
					if( rsi1 > 42.078 )
						if( rsi1 <= 48.4994 )
							if( d_k <= 5.99798 )
								ret := -0.054432
							if( d_k > 5.99798 )
								ret := 0.425150
						if( rsi1 > 48.4994 )
							if( d_k <= -4.70715 )
								ret := 0.207291
							if( d_k > -4.70715 )
								ret := 0.549420
			if( bbp > -0.000509 )
				if( rsi1 <= 47.8256 )
					if( bearPower <= 7.9e-05 )
						if( bullPower <= 0.000349 )
							if( rsi1 <= 43.4757 )
								ret := -0.451327
							if( rsi1 > 43.4757 )
								ret := -0.218174
						if( bullPower > 0.000349 )
							if( d_k <= 23.1841 )
								ret := -0.632959
							if( d_k > 23.1841 )
								ret := 0.166667
					if( bearPower > 7.9e-05 )
						if( bbm <= 0.000201 )
							if( bullPower <= 0.000344 )
								ret := -0.269841
							if( bullPower > 0.000344 )
								ret := -0.549550
						if( bbm > 0.000201 )
							if( d_k <= -9.10539 )
								ret := -0.422222
							if( d_k > -9.10539 )
								ret := -0.806134 // sell
				if( rsi1 > 47.8256 )
					if( bbp <= 0.000299 )
						if( k <= 68.5477 )
							if( smoothD_d <= 51.7662 )
								ret := -0.020349
							if( smoothD_d > 51.7662 )
								ret := 0.336012
						if( k > 68.5477 )
							if( bbp <= -0.000204 )
								ret := 0.094730
							if( bbp > -0.000204 )
								ret := -0.111199
					if( bbp > 0.000299 )
						if( bbp <= 0.001081 )
							if( d_k <= 0.909584 )
								ret := -0.414922
							if( d_k > 0.909584 )
								ret := -0.209524
						if( bbp > 0.001081 )
							if( bbp <= 0.00606 )
								ret := -0.612069
							if( bbp > 0.00606 )
								ret := 1.000000 // buy
		if( rsi1 > 55.0085 )
			if( BBPower_Color <= 0.5 )
				if( bbm <= 0.000201 )
					if( bbm <= 0.0001 )
						if( d <= 82.9435 )
							if( rsi1 <= 60.0292 )
								ret := 0.043689
							if( rsi1 > 60.0292 )
								ret := 0.236715
						if( d > 82.9435 )
							if( bullPower <= 5.1e-05 )
								ret := 0.285008
							if( bullPower > 5.1e-05 )
								ret := 1.000000 // buy
					if( bbm > 0.0001 )
						if( bbm <= 0.0002 )
							if( d_k <= 12.3911 )
								ret := 0.962963 // buy
							if( d_k > 12.3911 )
								ret := 0.333333
						if( bbm > 0.0002 )
							if( rsi1 <= 67.4166 )
								ret := 0.297537
							if( rsi1 > 67.4166 )
								ret := 0.545627
				if( bbm > 0.000201 )
					if( rsi1 <= 63.6366 )
						if( bbp <= -0.000444 )
							if( d_k <= -17.4995 )
								ret := 0.584563
							if( d_k > -17.4995 )
								ret := 0.794624 // buy
						if( bbp > -0.000444 )
							if( smoothK_k <= 80.3778 )
								ret := 0.647791
							if( smoothK_k > 80.3778 )
								ret := 0.432725
					if( rsi1 > 63.6366 )
						if( bbm <= 0.0003 )
							if( bbm <= 0.0003 )
								ret := 0.967828 // buy
							if( bbm > 0.0003 )
								ret := 0.542396
						if( bbm > 0.0003 )
							if( bbm <= 0.0004 )
								ret := 0.975791 // buy
							if( bbm > 0.0004 )
								ret := 0.846921 // buy
			if( BBPower_Color > 0.5 )
				if( rsi1 <= 66.6683 )
					if( bbp <= 0.001164 )
						if( rsi1 <= 59.2623 )
							if( bullPower <= 0.000387 )
								ret := 0.099927
							if( bullPower > 0.000387 )
								ret := -0.080898
						if( rsi1 > 59.2623 )
							if( d_k <= -1.66292 )
								ret := 0.117021
							if( d_k > -1.66292 )
								ret := 0.361792
					if( bbp > 0.001164 )
						if( bearPower <= 0.000629 )
							if( d_k <= 6.06134 )
								ret := -0.196768
							if( d_k > 6.06134 )
								ret := 0.059908
						if( bearPower > 0.000629 )
							if( k <= 85.2635 )
								ret := -0.449608
							if( k > 85.2635 )
								ret := -0.146264
				if( rsi1 > 66.6683 )
					if( bearPower <= 0.000624 )
						if( rsi1 <= 75.0002 )
							if( bbm <= 0.0003 )
								ret := 0.298839
							if( bbm > 0.0003 )
								ret := 0.620018
						if( rsi1 > 75.0002 )
							if( d <= 89.071 )
								ret := 0.612950
							if( d > 89.071 )
								ret := 0.746194 // buy
					if( bearPower > 0.000624 )
						if( bullPower <= 0.002382 )
							if( smoothD_d <= 96.0365 )
								ret := 0.430564
							if( smoothD_d > 96.0365 )
								ret := 0.666065
						if( bullPower > 0.002382 )
							if( d <= 94.7635 )
								ret := 0.185835
							if( d > 94.7635 )
								ret := 0.376344
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_MATICUSDT_1Min_6d17a872(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


