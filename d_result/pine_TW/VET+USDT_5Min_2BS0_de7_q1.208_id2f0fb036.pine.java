//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: VETUSDT_5Min_2BS0_2f0fb036 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_5Min_2BS0_2f0fb036", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_5Min_2f0fb036(bbp, bullPower, BBPower_Color, bearPower, bbm, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( d <= 52.4221 )
		if( rsi1 <= 44.8708 )
			if( rsi1 <= 35.7142 )
				if( bbm <= 2e-05 )
					if( bullPower <= 9e-06 )
						if( rsi1 <= 9.76191 )
							if( smoothD_d <= -0.916708 )
								ret := -0.760000 // sell
							if( smoothD_d > -0.916708 )
								ret := -0.066667
						if( rsi1 > 9.76191 )
							if( k <= 11.4515 )
								ret := -0.075949
							if( k > 11.4515 )
								ret := -0.203679
					if( bullPower > 9e-06 )
						if( d_k <= -4.93682 )
							if( smoothK_k <= 12.6019 )
								ret := -0.666667
							if( smoothK_k > 12.6019 )
								ret := -0.382353
						if( d_k > -4.93682 )
							if( rsi1 <= 24.9972 )
								ret := -0.391509
							if( rsi1 > 24.9972 )
								ret := -0.197211
				if( bbm > 2e-05 )
					if( rsi1 <= 28.5714 )
						if( bbp <= 5.9e-05 )
							if( d_k <= -2.26754 )
								ret := -0.794803 // sell
							if( d_k > -2.26754 )
								ret := -0.625083
						if( bbp > 5.9e-05 )
							if( k <= 0.000336 )
								ret := -0.701693 // sell
							if( k > 0.000336 )
								ret := -0.844589 // sell
					if( rsi1 > 28.5714 )
						if( smoothK_k <= 3.54133 )
							if( bbp <= 8.3e-05 )
								ret := -0.009871
							if( bbp > 8.3e-05 )
								ret := -0.559024
						if( smoothK_k > 3.54133 )
							if( bullPower <= 2.4e-05 )
								ret := -0.513761
							if( bullPower > 2.4e-05 )
								ret := -0.723666 // sell
			if( rsi1 > 35.7142 )
				if( k <= 24.4954 )
					if( rsi1 <= 39.5533 )
						if( bearPower <= 5e-06 )
							if( d_k <= -3.03775 )
								ret := -0.289559
							if( d_k > -3.03775 )
								ret := 0.021984
						if( bearPower > 5e-06 )
							if( k <= 4.80765 )
								ret := -0.311475
							if( k > 4.80765 )
								ret := -0.606466
					if( rsi1 > 39.5533 )
						if( bullPower <= 9.2e-05 )
							if( BBPower_Color <= 0.5 )
								ret := 0.260504
							if( BBPower_Color > 0.5 )
								ret := -0.082945
						if( bullPower > 9.2e-05 )
							if( BBPower_Color <= 0.5 )
								ret := 0.400000
							if( BBPower_Color > 0.5 )
								ret := -0.259406
				if( k > 24.4954 )
					if( bullPower <= 2.5e-05 )
						if( k <= 47.2148 )
							if( d_k <= -0.714516 )
								ret := -0.258613
							if( d_k > -0.714516 )
								ret := 0.086168
						if( k > 47.2148 )
							if( bbm <= 4e-05 )
								ret := -0.201299
							if( bbm > 4e-05 )
								ret := -0.511672
					if( bullPower > 2.5e-05 )
						if( bearPower <= -0.000275 )
							if( smoothK_k <= 43.2345 )
								ret := 0.673077
							if( smoothK_k > 43.2345 )
								ret := -0.542857
						if( bearPower > -0.000275 )
							if( d_k <= 6.76699 )
								ret := -0.705340 // sell
							if( d_k > 6.76699 )
								ret := -0.330757
		if( rsi1 > 44.8708 )
			if( rsi1 <= 53.4906 )
				if( d_k <= -3.70178 )
					if( bbp <= 2.2e-05 )
						if( k <= 40.8692 )
							if( bullPower <= -6e-06 )
								ret := 0.493298
							if( bullPower > -6e-06 )
								ret := 0.115764
						if( k > 40.8692 )
							if( bbm <= 0.000352 )
								ret := -0.235630
							if( bbm > 0.000352 )
								ret := 0.394366
					if( bbp > 2.2e-05 )
						if( smoothK_k <= 24.8409 )
							if( BBPower_Color <= 0.5 )
								ret := 0.575758
							if( BBPower_Color > 0.5 )
								ret := -0.217617
						if( smoothK_k > 24.8409 )
							if( bbm <= 5e-05 )
								ret := -0.371134
							if( bbm > 5e-05 )
								ret := -0.611253
				if( d_k > -3.70178 )
					if( BBPower_Color <= 0.5 )
						if( bbm <= 5.2e-05 )
							if( k <= 45.2133 )
								ret := 0.216176
							if( k > 45.2133 )
								ret := -0.131868
						if( bbm > 5.2e-05 )
							if( d_k <= -2.01029 )
								ret := 0.198198
							if( d_k > -2.01029 )
								ret := 0.637621
					if( BBPower_Color > 0.5 )
						if( k <= 12.8263 )
							if( bbp <= 0.000356 )
								ret := 0.313125
							if( bbp > 0.000356 )
								ret := -0.013783
						if( k > 12.8263 )
							if( bullPower <= 0.000117 )
								ret := 0.025957
							if( bullPower > 0.000117 )
								ret := -0.296379
			if( rsi1 > 53.4906 )
				if( rsi1 <= 61.5389 )
					if( k <= 36.2334 )
						if( d_k <= -1.37822 )
							if( BBPower_Color <= 0.5 )
								ret := 0.726079 // buy
							if( BBPower_Color > 0.5 )
								ret := 0.185969
						if( d_k > -1.37822 )
							if( bbm <= 3e-05 )
								ret := 0.261618
							if( bbm > 3e-05 )
								ret := 0.562922
					if( k > 36.2334 )
						if( bbp <= 0.000125 )
							if( BBPower_Color <= 0.5 )
								ret := 0.408991
							if( BBPower_Color > 0.5 )
								ret := -0.005768
						if( bbp > 0.000125 )
							if( BBPower_Color <= 0.5 )
								ret := 0.118644
							if( BBPower_Color > 0.5 )
								ret := -0.503320
				if( rsi1 > 61.5389 )
					if( bbm <= 4e-05 )
						if( bbm <= 2e-05 )
							if( smoothD_d <= 13.4446 )
								ret := 0.494382
							if( smoothD_d > 13.4446 )
								ret := 0.181384
						if( bbm > 2e-05 )
							if( bbm <= 3e-05 )
								ret := 0.974026 // buy
							if( bbm > 3e-05 )
								ret := 0.424550
					if( bbm > 4e-05 )
						if( smoothK_k <= 48.5297 )
							if( smoothK_k <= 16.9301 )
								ret := 0.811594 // buy
							if( smoothK_k > 16.9301 )
								ret := 0.718866 // buy
						if( smoothK_k > 48.5297 )
							if( BBPower_Color <= 0.5 )
								ret := 0.751323 // buy
							if( BBPower_Color > 0.5 )
								ret := 0.208178
	if( d > 52.4221 )
		if( rsi1 <= 55.0003 )
			if( d_k <= 0.953265 )
				if( rsi1 <= 48.4777 )
					if( rsi1 <= 39.9988 )
						if( bbm <= 3e-05 )
							if( bullPower <= 1.1e-05 )
								ret := -0.331361
							if( bullPower > 1.1e-05 )
								ret := -0.695652
						if( bbm > 3e-05 )
							if( bearPower <= -0.000625 )
								ret := -0.368132
							if( bearPower > -0.000625 )
								ret := -0.767026 // sell
					if( rsi1 > 39.9988 )
						if( k <= 67.8586 )
							if( bbp <= -8e-05 )
								ret := 0.095745
							if( bbp > -8e-05 )
								ret := -0.442890
						if( k > 67.8586 )
							if( bbp <= -0.000356 )
								ret := -0.313536
							if( bbp > -0.000356 )
								ret := -0.562472
				if( rsi1 > 48.4777 )
					if( bullPower <= 2.2e-05 )
						if( d <= 84.1919 )
							if( d_k <= -12.7744 )
								ret := -0.156570
							if( d_k > -12.7744 )
								ret := 0.168245
						if( d > 84.1919 )
							if( bbp <= -0.000385 )
								ret := -0.013002
							if( bbp > -0.000385 )
								ret := -0.325753
					if( bullPower > 2.2e-05 )
						if( rsi1 <= 49.9984 )
							if( bullPower <= 4.5e-05 )
								ret := -0.611765
							if( bullPower > 4.5e-05 )
								ret := -0.839572 // sell
						if( rsi1 > 49.9984 )
							if( bbm <= 4e-05 )
								ret := -0.191617
							if( bbm > 4e-05 )
								ret := -0.512774
			if( d_k > 0.953265 )
				if( rsi1 <= 47.0098 )
					if( smoothD_d <= 89.5367 )
						if( bullPower <= 2.9e-05 )
							if( bullPower <= -8.5e-05 )
								ret := -0.057789
							if( bullPower > -8.5e-05 )
								ret := -0.299284
						if( bullPower > 2.9e-05 )
							if( d_k <= 17.6988 )
								ret := -0.631759
							if( d_k > 17.6988 )
								ret := -0.321678
					if( smoothD_d > 89.5367 )
						if( bbm <= 0.000437 )
							if( bbm <= 3e-05 )
								ret := -0.219178
							if( bbm > 3e-05 )
								ret := -0.758916 // sell
						if( bbm > 0.000437 )
							if( bearPower <= -0.00063 )
								ret := 0.666667
							if( bearPower > -0.00063 )
								ret := -0.666667
				if( rsi1 > 47.0098 )
					if( smoothD_d <= 72.6381 )
						if( BBPower_Color <= 0.5 )
							if( rsi1 <= 50.0059 )
								ret := 0.342029
							if( rsi1 > 50.0059 )
								ret := 0.586096
						if( BBPower_Color > 0.5 )
							if( smoothK_k <= 43.8898 )
								ret := 0.270588
							if( smoothK_k > 43.8898 )
								ret := -0.160532
					if( smoothD_d > 72.6381 )
						if( bbp <= -0.000143 )
							if( smoothD_d <= 89.0424 )
								ret := 0.392732
							if( smoothD_d > 89.0424 )
								ret := 0.014970
						if( bbp > -0.000143 )
							if( k <= 63.6833 )
								ret := 0.264214
							if( k > 63.6833 )
								ret := -0.207410
		if( rsi1 > 55.0003 )
			if( smoothK_k <= 72.3761 )
				if( rsi1 <= 62.521 )
					if( bearPower <= -3.1e-05 )
						if( bbm <= 0.000273 )
							if( d_k <= -13.674 )
								ret := 0.160000
							if( d_k > -13.674 )
								ret := 0.660307
						if( bbm > 0.000273 )
							if( d <= 68.2075 )
								ret := -0.056075
							if( d > 68.2075 )
								ret := 0.453608
					if( bearPower > -3.1e-05 )
						if( k <= 59.6627 )
							if( k <= 46.9879 )
								ret := 0.566372
							if( k > 46.9879 )
								ret := 0.353872
						if( k > 59.6627 )
							if( smoothD_d <= 60.3093 )
								ret := -0.244186
							if( smoothD_d > 60.3093 )
								ret := 0.191612
				if( rsi1 > 62.521 )
					if( BBPower_Color <= 0.5 )
						if( bbm <= 4e-05 )
							if( rsi1 <= 66.681 )
								ret := 0.526042
							if( rsi1 > 66.681 )
								ret := 0.761364 // buy
						if( bbm > 4e-05 )
							if( d_k <= -6.66451 )
								ret := 0.753894 // buy
							if( d_k > -6.66451 )
								ret := 0.899071 // buy
					if( BBPower_Color > 0.5 )
						if( bbm <= 4e-05 )
							if( rsi1 <= 74.2396 )
								ret := 0.267559
							if( rsi1 > 74.2396 )
								ret := 0.520755
						if( bbm > 4e-05 )
							if( d_k <= -5.8338 )
								ret := 0.257143
							if( d_k > -5.8338 )
								ret := 0.737600 // buy
			if( smoothK_k > 72.3761 )
				if( BBPower_Color <= 0.5 )
					if( d_k <= -6.83446 )
						if( rsi1 <= 67.3485 )
							if( bearPower <= -8.6e-05 )
								ret := 0.310262
							if( bearPower > -8.6e-05 )
								ret := -0.024145
						if( rsi1 > 67.3485 )
							if( bbm <= 3e-05 )
								ret := 0.274336
							if( bbm > 3e-05 )
								ret := 0.701519 // buy
					if( d_k > -6.83446 )
						if( bbm <= 3e-05 )
							if( rsi1 <= 69.2683 )
								ret := 0.137203
							if( rsi1 > 69.2683 )
								ret := 0.468177
						if( bbm > 3e-05 )
							if( rsi1 <= 65.9341 )
								ret := 0.314719
							if( rsi1 > 65.9341 )
								ret := 0.778685 // buy
				if( BBPower_Color > 0.5 )
					if( d_k <= -6.58014 )
						if( bearPower <= 0.000214 )
							if( rsi1 <= 76.4962 )
								ret := -0.071970
							if( rsi1 > 76.4962 )
								ret := 0.469287
						if( bearPower > 0.000214 )
							ret := -1.000000 // sell
					if( d_k > -6.58014 )
						if( bullPower <= 6.6e-05 )
							if( rsi1 <= 72.5095 )
								ret := 0.071113
							if( rsi1 > 72.5095 )
								ret := 0.469595
						if( bullPower > 6.6e-05 )
							if( bbm <= 5e-05 )
								ret := 0.238748
							if( bbm > 5e-05 )
								ret := 0.489357
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_VETUSDT_5Min_2f0fb036(bbp, bullPower, BBPower_Color, bearPower, bbm, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


