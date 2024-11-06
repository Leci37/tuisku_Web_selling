//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: TSLA_5Min_2ST0_a2c8e4df Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_5Min_2ST0_a2c8e4df", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_5Min_a2c8e4df(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 57.2201 )
		if( ema13 <= -1.43958 )
			if( tema <= 247.407 )
				if( smoothK_k <= 18.3759 )
					if( ema1 <= 242.245 )
						if( ema1 <= 220.975 )
							if( ema2 <= 213.263 )
								ret := 0.202068
							if( ema2 > 213.263 )
								ret := 0.641975
						if( ema1 > 220.975 )
							if( smoothD_d <= -0.541948 )
								ret := -0.516949
							if( smoothD_d > -0.541948 )
								ret := 0.119093
					if( ema1 > 242.245 )
						if( smoothK_k <= 0.075198 )
							if( k <= 0.190533 )
								ret := 0.692308
							if( k > 0.190533 )
								ret := 0.961538 // buy
						if( smoothK_k > 0.075198 )
							if( d <= 5.93692 )
								ret := -0.050000
							if( d > 5.93692 )
								ret := 0.684211
				if( smoothK_k > 18.3759 )
					if( ema3 <= 182.275 )
						if( ema13 <= -2.16274 )
							if( rsi1 <= 28.5237 )
								ret := 0.881579 // buy
							if( rsi1 > 28.5237 )
								ret := 0.000000
						if( ema13 > -2.16274 )
							if( smoothK_k <= 40.9603 )
								ret := -0.148649
							if( smoothK_k > 40.9603 )
								ret := 0.514286
					if( ema3 > 182.275 )
						if( tema <= 197.31 )
							if( ema13 <= -1.90798 )
								ret := -0.841270 // sell
							if( ema13 > -1.90798 )
								ret := -0.139344
						if( tema > 197.31 )
							if( ema3 <= 249.317 )
								ret := -0.026375
							if( ema3 > 249.317 )
								ret := 0.489796
			if( tema > 247.407 )
				if( ema1 <= 252.995 )
					if( k <= 7.91855 )
						if( ema1 <= 251.666 )
							if( d_k <= 0.019856 )
								ret := 0.641026
							if( d_k > 0.019856 )
								ret := -0.244898
						if( ema1 > 251.666 )
							if( smoothK_k <= 1.65247 )
								ret := -0.913043 // sell
							if( smoothK_k > 1.65247 )
								ret := 1.000000 // buy
					if( k > 7.91855 )
						if( d_k <= 0.4787 )
							if( smoothK_k <= 52.3472 )
								ret := -0.560000
							if( smoothK_k > 52.3472 )
								ret := -0.065217
						if( d_k > 0.4787 )
							if( tema <= 250.161 )
								ret := -0.886076 // sell
							if( tema > 250.161 )
								ret := -0.250000
				if( ema1 > 252.995 )
					if( ema12 <= -2.32097 )
						if( d_k <= -1.79597 )
							ret := 0.600000
						if( d_k > -1.79597 )
							if( rsi1 <= 25.9588 )
								ret := -0.972973 // sell
							if( rsi1 > 25.9588 )
								ret := -0.250000
					if( ema12 > -2.32097 )
						if( ema1 <= 270.802 )
							if( d <= 8.77482 )
								ret := -0.353698
							if( d > 8.77482 )
								ret := 0.195933
						if( ema1 > 270.802 )
							if( smoothK_k <= 6.15273 )
								ret := 0.892473 // buy
							if( smoothK_k > 6.15273 )
								ret := 0.062857
		if( ema13 > -1.43958 )
			if( ema13 <= -0.030325 )
				if( ema3 <= 146.656 )
					if( ema3 <= 141.524 )
						if( ema13 <= -0.544088 )
							if( ema12 <= -0.345018 )
								ret := 1.000000 // buy
							if( ema12 > -0.345018 )
								ret := 0.500000
						if( ema13 > -0.544088 )
							ret := 1.000000 // buy
					if( ema3 > 141.524 )
						if( ema3 <= 142.283 )
							if( rsi1 <= 44.7165 )
								ret := 0.333333
							if( rsi1 > 44.7165 )
								ret := -0.433333
						if( ema3 > 142.283 )
							if( k <= 12.2886 )
								ret := -0.272727
							if( k > 12.2886 )
								ret := 0.687500
				if( ema3 > 146.656 )
					if( rsi1 <= 14.3215 )
						if( ema12 <= -0.214196 )
							if( tema <= 263.698 )
								ret := -0.312169
							if( tema > 263.698 )
								ret := 0.461538
						if( ema12 > -0.214196 )
							if( ema1 <= 224.149 )
								ret := 0.038462
							if( ema1 > 224.149 )
								ret := 0.708333 // buy
					if( rsi1 > 14.3215 )
						if( ema1 <= 293.234 )
							if( smoothK_k <= 60.0666 )
								ret := -0.053981
							if( smoothK_k > 60.0666 )
								ret := -0.000671
						if( ema1 > 293.234 )
							if( ema13 <= -0.818003 )
								ret := -0.700000 // sell
							if( ema13 > -0.818003 )
								ret := -1.000000 // sell
			if( ema13 > -0.030325 )
				if( ema3 <= 142.596 )
					if( smoothD_d <= 14.4797 )
						ret := 0.857143 // buy
					if( smoothD_d > 14.4797 )
						if( ema13 <= 0.039284 )
							if( d_k <= -3.57598 )
								ret := -0.500000
							if( d_k > -3.57598 )
								ret := 0.000000
						if( ema13 > 0.039284 )
							if( k <= 49.0436 )
								ret := -0.750000 // sell
							if( k > 49.0436 )
								ret := -1.000000 // sell
				if( ema3 > 142.596 )
					if( ema13 <= 0.322667 )
						if( d_k <= -16.7543 )
							if( ema12 <= 0.235101 )
								ret := -0.076305
							if( ema12 > 0.235101 )
								ret := -0.685714
						if( d_k > -16.7543 )
							if( ema3 <= 152.028 )
								ret := -0.315789
							if( ema3 > 152.028 )
								ret := 0.052859
					if( ema13 > 0.322667 )
						if( ema3 <= 162.046 )
							if( smoothK_k <= 9.77258 )
								ret := 0.933333 // buy
							if( smoothK_k > 9.77258 )
								ret := 0.393617
						if( ema3 > 162.046 )
							if( ema13 <= 1.09083 )
								ret := -0.109347
							if( ema13 > 1.09083 )
								ret := 0.247024
	if( rsi1 > 57.2201 )
		if( ema13 <= 0.986155 )
			if( ema1 <= 218.049 )
				if( d <= 3.203 )
					if( tema <= 203.865 )
						if( k <= 0.502433 )
							if( ema3 <= 186.629 )
								ret := -0.545455
							if( ema3 > 186.629 )
								ret := 0.000000
						if( k > 0.502433 )
							if( ema3 <= 173.608 )
								ret := -0.500000
							if( ema3 > 173.608 )
								ret := -0.958333 // sell
					if( tema > 203.865 )
						ret := 0.600000
				if( d > 3.203 )
					if( ema2 <= 152.712 )
						if( ema1 <= 141.628 )
							if( smoothD_d <= 80.4213 )
								ret := 1.000000 // buy
							if( smoothD_d > 80.4213 )
								ret := 0.600000
						if( ema1 > 141.628 )
							if( d_k <= 6.60999 )
								ret := -0.427966
							if( d_k > 6.60999 )
								ret := 0.480000
					if( ema2 > 152.712 )
						if( tema <= 218.106 )
							if( d <= 23.0502 )
								ret := -0.059765
							if( d > 23.0502 )
								ret := 0.105982
						if( tema > 218.106 )
							if( d_k <= 1.86465 )
								ret := 0.727273 // buy
							if( d_k > 1.86465 )
								ret := -0.315789
			if( ema1 > 218.049 )
				if( k <= 5.57618 )
					if( d <= 2.77588 )
						if( d <= 2.64501 )
							ret := 0.000000
						if( d > 2.64501 )
							ret := -1.000000 // sell
					if( d > 2.77588 )
						if( ema2 <= 246.948 )
							if( d_k <= 0.492116 )
								ret := -0.750000 // sell
							if( d_k > 0.492116 )
								ret := 0.317073
						if( ema2 > 246.948 )
							if( smoothK_k <= -0.826626 )
								ret := 0.181818
							if( smoothK_k > -0.826626 )
								ret := 0.781250 // buy
				if( k > 5.57618 )
					if( tema <= 276.501 )
						if( ema2 <= 261.048 )
							if( tema <= 258.657 )
								ret := 0.004900
							if( tema > 258.657 )
								ret := 0.157514
						if( ema2 > 261.048 )
							if( smoothK_k <= 26.4326 )
								ret := -0.453901
							if( smoothK_k > 26.4326 )
								ret := -0.062456
					if( tema > 276.501 )
						if( d_k <= 0.40934 )
							if( tema <= 292.204 )
								ret := 0.362416
							if( tema > 292.204 )
								ret := -0.105263
						if( d_k > 0.40934 )
							if( tema <= 281.408 )
								ret := -0.143885
							if( tema > 281.408 )
								ret := 0.303030
		if( ema13 > 0.986155 )
			if( tema <= 262.031 )
				if( rsi1 <= 74.8662 )
					if( ema3 <= 232.332 )
						if( ema2 <= 208.325 )
							if( d <= 98.7512 )
								ret := 0.095094
							if( d > 98.7512 )
								ret := -0.807692 // sell
						if( ema2 > 208.325 )
							if( d_k <= 17.3782 )
								ret := -0.240079
							if( d_k > 17.3782 )
								ret := 0.343434
					if( ema3 > 232.332 )
						if( ema2 <= 238.307 )
							if( d <= 25.4893 )
								ret := 0.885246 // buy
							if( d > 25.4893 )
								ret := 0.311321
						if( ema2 > 238.307 )
							if( ema3 <= 246.219 )
								ret := -0.117773
							if( ema3 > 246.219 )
								ret := 0.220425
				if( rsi1 > 74.8662 )
					if( tema <= 249.043 )
						if( ema1 <= 190.224 )
							if( ema3 <= 175.871 )
								ret := 0.116667
							if( ema3 > 175.871 )
								ret := -0.362671
						if( ema1 > 190.224 )
							if( rsi1 <= 91.4384 )
								ret := 0.087793
							if( rsi1 > 91.4384 )
								ret := -0.542636
					if( tema > 249.043 )
						if( ema3 <= 257.607 )
							if( rsi1 <= 78.798 )
								ret := -0.032727
							if( rsi1 > 78.798 )
								ret := -0.449020
						if( ema3 > 257.607 )
							if( k <= 90.4671 )
								ret := 0.060606
							if( k > 90.4671 )
								ret := 0.555556
			if( tema > 262.031 )
				if( rsi1 <= 81.5252 )
					if( k <= 79.0508 )
						if( rsi1 <= 66.4076 )
							if( ema12 <= 0.630687 )
								ret := -0.233645
							if( ema12 > 0.630687 )
								ret := 0.523364
						if( rsi1 > 66.4076 )
							if( k <= 69.4718 )
								ret := -0.487805
							if( k > 69.4718 )
								ret := 0.070175
					if( k > 79.0508 )
						if( ema13 <= 2.0179 )
							if( smoothD_d <= 76.9774 )
								ret := 0.000000
							if( smoothD_d > 76.9774 )
								ret := -0.503817
						if( ema13 > 2.0179 )
							if( k <= 97.5021 )
								ret := -0.895238 // sell
							if( k > 97.5021 )
								ret := -0.633333
				if( rsi1 > 81.5252 )
					if( tema <= 275.682 )
						if( ema3 <= 265.368 )
							if( ema3 <= 262.451 )
								ret := 0.360000
							if( ema3 > 262.451 )
								ret := -0.307692
						if( ema3 > 265.368 )
							if( k <= 88.8735 )
								ret := 0.000000
							if( k > 88.8735 )
								ret := 0.810345 // buy
					if( tema > 275.682 )
						if( smoothK_k <= 94.203 )
							if( smoothD_d <= 84.3937 )
								ret := -0.294118
							if( smoothD_d > 84.3937 )
								ret := 0.142857
						if( smoothK_k > 94.203 )
							if( k <= 99.868 )
								ret := -0.812500 // sell
							if( k > 99.868 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_TSLA_5Min_a2c8e4df(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)

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


