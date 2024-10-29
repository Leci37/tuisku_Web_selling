//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: ADAUSDT_15Min_2ST0_8683acfb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_15Min_2ST0_8683acfb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_15Min_8683acfb(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothK_k <= 38.455 )
		if( rsi1 <= 48.3628 )
			if( smoothK_k <= 9.93224 )
				if( rsi1 <= 27.751 )
					if( smoothD_d <= -1.53149 )
						if( ema2 <= 0.619506 )
							if( ema3 <= 0.43857 )
								ret := -0.701505 // sell
							if( ema3 > 0.43857 )
								ret := -0.573295
						if( ema2 > 0.619506 )
							if( ema13 <= -0.003436 )
								ret := 0.522388
							if( ema13 > -0.003436 )
								ret := -0.777778 // sell
					if( smoothD_d > -1.53149 )
						if( smoothK_k <= 2.31047 )
							if( ema12 <= -0.00129 )
								ret := -0.083183
							if( ema12 > -0.00129 )
								ret := -0.712022 // sell
						if( smoothK_k > 2.31047 )
							if( rsi1 <= 22.3866 )
								ret := -0.656039
							if( rsi1 > 22.3866 )
								ret := -0.428571
				if( rsi1 > 27.751 )
					if( ema12 <= -4e-05 )
						if( ema12 <= -0.001121 )
							if( d_k <= -2.90025 )
								ret := -0.319930
							if( d_k > -2.90025 )
								ret := 0.148284
						if( ema12 > -0.001121 )
							if( ema1 <= 0.483341 )
								ret := -0.221718
							if( ema1 > 0.483341 )
								ret := -0.451167
					if( ema12 > -4e-05 )
						if( rsi1 <= 41.4128 )
							if( ema3 <= 0.259857 )
								ret := -0.229299
							if( ema3 > 0.259857 )
								ret := -0.766152 // sell
						if( rsi1 > 41.4128 )
							if( ema12 <= 0.000506 )
								ret := -0.197870
							if( ema12 > 0.000506 )
								ret := -0.681575
			if( smoothK_k > 9.93224 )
				if( ema12 <= 3e-06 )
					if( d_k <= -4.99781 )
						if( rsi1 <= 32.6081 )
							if( ema13 <= -0.006033 )
								ret := -0.197761
							if( ema13 > -0.006033 )
								ret := -0.523646
						if( rsi1 > 32.6081 )
							if( smoothD_d <= 18.3974 )
								ret := -0.210392
							if( smoothD_d > 18.3974 )
								ret := 0.072907
					if( d_k > -4.99781 )
						if( ema12 <= -0.000622 )
							if( rsi1 <= 32.8111 )
								ret := -0.160515
							if( rsi1 > 32.8111 )
								ret := 0.167855
						if( ema12 > -0.000622 )
							if( rsi1 <= 35.6616 )
								ret := -0.475296
							if( rsi1 > 35.6616 )
								ret := -0.129630
				if( ema12 > 3e-06 )
					if( ema12 <= 0.000526 )
						if( d <= 18.9753 )
							if( rsi1 <= 44.4423 )
								ret := -0.739857 // sell
							if( rsi1 > 44.4423 )
								ret := -0.432143
						if( d > 18.9753 )
							if( smoothD_d <= 59.84 )
								ret := -0.426024
							if( smoothD_d > 59.84 )
								ret := 0.152174
					if( ema12 > 0.000526 )
						if( ema13 <= 0.009615 )
							if( tema <= 0.779785 )
								ret := -0.773384 // sell
							if( tema > 0.779785 )
								ret := 0.571429
						if( ema13 > 0.009615 )
							ret := 1.000000 // buy
		if( rsi1 > 48.3628 )
			if( ema13 <= 0.001349 )
				if( ema12 <= 0.000332 )
					if( smoothK_k <= 15.2471 )
						if( ema13 <= 0.001251 )
							if( rsi1 <= 56.5315 )
								ret := -0.017691
							if( rsi1 > 56.5315 )
								ret := 0.276190
						if( ema13 > 0.001251 )
							if( smoothD_d <= 3.8714 )
								ret := 0.363636
							if( smoothD_d > 3.8714 )
								ret := 0.812500 // buy
					if( smoothK_k > 15.2471 )
						if( ema12 <= -0.000495 )
							if( d_k <= 12.2461 )
								ret := 0.498623
							if( d_k > 12.2461 )
								ret := -0.413793
						if( ema12 > -0.000495 )
							if( rsi1 <= 50.0015 )
								ret := -0.022018
							if( rsi1 > 50.0015 )
								ret := 0.219953
				if( ema12 > 0.000332 )
					if( ema13 <= 0.00052 )
						if( smoothD_d <= 29.1392 )
							if( d_k <= -8.90374 )
								ret := -0.611111
							if( d_k > -8.90374 )
								ret := -0.931034 // sell
						if( smoothD_d > 29.1392 )
							if( ema13 <= 0.000259 )
								ret := -0.800000 // sell
							if( ema13 > 0.000259 )
								ret := -0.260870
					if( ema13 > 0.00052 )
						if( rsi1 <= 53.9195 )
							if( rsi1 <= 48.6213 )
								ret := -0.600000
							if( rsi1 > 48.6213 )
								ret := -0.191041
						if( rsi1 > 53.9195 )
							if( ema12 <= 0.000533 )
								ret := 0.077075
							if( ema12 > 0.000533 )
								ret := -0.123563
			if( ema13 > 0.001349 )
				if( ema12 <= 0.000778 )
					if( smoothD_d <= 26.9976 )
						if( smoothK_k <= -2.15239 )
							if( rsi1 <= 54.9541 )
								ret := 0.705128 // buy
							if( rsi1 > 54.9541 )
								ret := 0.000000
						if( smoothK_k > -2.15239 )
							if( smoothK_k <= 13.4975 )
								ret := -0.100791
							if( smoothK_k > 13.4975 )
								ret := 0.080000
					if( smoothD_d > 26.9976 )
						if( smoothD_d <= 54.0602 )
							if( k <= 22.5738 )
								ret := 0.000000
							if( k > 22.5738 )
								ret := 0.425606
						if( smoothD_d > 54.0602 )
							if( d_k <= 21.0732 )
								ret := -0.916667 // sell
							if( d_k > 21.0732 )
								ret := -0.235294
				if( ema12 > 0.000778 )
					if( ema12 <= 0.003079 )
						if( ema13 <= 0.00494 )
							if( ema13 <= 0.002293 )
								ret := -0.289039
							if( ema13 > 0.002293 )
								ret := -0.099478
						if( ema13 > 0.00494 )
							if( ema13 <= 0.006742 )
								ret := 0.071247
							if( ema13 > 0.006742 )
								ret := 0.495652
					if( ema12 > 0.003079 )
						if( rsi1 <= 64.0502 )
							if( ema2 <= 0.542039 )
								ret := -0.612756
							if( ema2 > 0.542039 )
								ret := -0.369863
						if( rsi1 > 64.0502 )
							if( ema13 <= 0.006216 )
								ret := -0.560976
							if( ema13 > 0.006216 )
								ret := 0.062500
	if( smoothK_k > 38.455 )
		if( rsi1 <= 62.0708 )
			if( ema12 <= -0.00053 )
				if( rsi1 <= 45.4763 )
					if( smoothD_d <= 87.9393 )
						if( ema12 <= -0.001539 )
							if( rsi1 <= 35.4846 )
								ret := -0.065687
							if( rsi1 > 35.4846 )
								ret := 0.312770
						if( ema12 > -0.001539 )
							if( ema3 <= 0.453278 )
								ret := -0.043625
							if( ema3 > 0.453278 )
								ret := -0.276999
					if( smoothD_d > 87.9393 )
						if( ema12 <= -0.001911 )
							if( rsi1 <= 33.5782 )
								ret := -0.210526
							if( rsi1 > 33.5782 )
								ret := 0.680851
						if( ema12 > -0.001911 )
							if( rsi1 <= 43.1057 )
								ret := -0.068493
							if( rsi1 > 43.1057 )
								ret := 0.368421
				if( rsi1 > 45.4763 )
					if( d_k <= -25.9458 )
						if( smoothK_k <= 67.2442 )
							if( rsi1 <= 60.3935 )
								ret := -0.333333
							if( rsi1 > 60.3935 )
								ret := 1.000000 // buy
						if( smoothK_k > 67.2442 )
							if( ema12 <= -0.002673 )
								ret := 0.741935 // buy
							if( ema12 > -0.002673 )
								ret := 0.280303
					if( d_k > -25.9458 )
						if( rsi1 <= 52.3265 )
							if( rsi1 <= 48.9896 )
								ret := 0.395751
							if( rsi1 > 48.9896 )
								ret := 0.549053
						if( rsi1 > 52.3265 )
							if( ema2 <= 0.766149 )
								ret := 0.755626 // buy
							if( ema2 > 0.766149 )
								ret := -0.058824
			if( ema12 > -0.00053 )
				if( d <= 77.3709 )
					if( rsi1 <= 47.2218 )
						if( tema <= 0.387359 )
							if( ema12 <= 0.000118 )
								ret := -0.195080
							if( ema12 > 0.000118 )
								ret := -0.607509
						if( tema > 0.387359 )
							if( rsi1 <= 42.6637 )
								ret := -0.625213
							if( rsi1 > 42.6637 )
								ret := -0.366834
					if( rsi1 > 47.2218 )
						if( ema13 <= 0.000771 )
							if( ema12 <= 0.000352 )
								ret := 0.142759
							if( ema12 > 0.000352 )
								ret := -0.278306
						if( ema13 > 0.000771 )
							if( rsi1 <= 59.4719 )
								ret := -0.194659
							if( rsi1 > 59.4719 )
								ret := 0.007246
				if( d > 77.3709 )
					if( ema12 <= 0.000204 )
						if( ema13 <= -0.001044 )
							if( smoothK_k <= 78.4752 )
								ret := -0.359788
							if( smoothK_k > 78.4752 )
								ret := 0.039460
						if( ema13 > -0.001044 )
							if( rsi1 <= 52.4156 )
								ret := -0.011527
							if( rsi1 > 52.4156 )
								ret := 0.348730
					if( ema12 > 0.000204 )
						if( smoothK_k <= 94.4628 )
							if( rsi1 <= 56.7833 )
								ret := -0.165222
							if( rsi1 > 56.7833 )
								ret := 0.056320
						if( smoothK_k > 94.4628 )
							if( ema12 <= 0.001002 )
								ret := -0.191489
							if( ema12 > 0.001002 )
								ret := -0.698413
		if( rsi1 > 62.0708 )
			if( ema12 <= 0.000952 )
				if( ema13 <= -7.9e-05 )
					if( ema12 <= -0.00027 )
						if( ema12 <= -0.000766 )
							if( smoothK_k <= 95.9024 )
								ret := 0.889552 // buy
							if( smoothK_k > 95.9024 )
								ret := 0.967647 // buy
						if( ema12 > -0.000766 )
							if( d_k <= -19.0515 )
								ret := 0.640449
							if( d_k > -19.0515 )
								ret := 0.837867 // buy
					if( ema12 > -0.00027 )
						if( d <= 93.9493 )
							if( ema12 <= 7.1e-05 )
								ret := 0.596282
							if( ema12 > 7.1e-05 )
								ret := 0.215311
						if( d > 93.9493 )
							if( d_k <= 2.71894 )
								ret := 0.689930
							if( d_k > 2.71894 )
								ret := 0.883041 // buy
				if( ema13 > -7.9e-05 )
					if( rsi1 <= 73.6868 )
						if( ema2 <= 0.268421 )
							if( d_k <= 3.31409 )
								ret := 0.094262
							if( d_k > 3.31409 )
								ret := 0.246429
						if( ema2 > 0.268421 )
							if( ema12 <= 0.000286 )
								ret := 0.618234
							if( ema12 > 0.000286 )
								ret := 0.375966
					if( rsi1 > 73.6868 )
						if( ema3 <= 0.266313 )
							if( rsi1 <= 87.5057 )
								ret := 0.275862
							if( rsi1 > 87.5057 )
								ret := 0.693878
						if( ema3 > 0.266313 )
							if( smoothK_k <= 93.8344 )
								ret := 0.680294
							if( smoothK_k > 93.8344 )
								ret := 0.795524 // buy
			if( ema12 > 0.000952 )
				if( ema12 <= 0.002372 )
					if( rsi1 <= 74.1486 )
						if( rsi1 <= 64.9778 )
							if( d_k <= 6.17421 )
								ret := -0.105649
							if( d_k > 6.17421 )
								ret := 0.242424
						if( rsi1 > 64.9778 )
							if( ema1 <= 0.521008 )
								ret := 0.171024
							if( ema1 > 0.521008 )
								ret := 0.467202
					if( rsi1 > 74.1486 )
						if( rsi1 <= 83.0807 )
							if( smoothK_k <= 96.3136 )
								ret := 0.503953
							if( smoothK_k > 96.3136 )
								ret := 0.193846
						if( rsi1 > 83.0807 )
							if( d_k <= 2.19353 )
								ret := 0.830325 // buy
							if( d_k > 2.19353 )
								ret := 0.442857
				if( ema12 > 0.002372 )
					if( rsi1 <= 77.5494 )
						if( d_k <= 6.7466 )
							if( d_k <= -17.1061 )
								ret := 0.370787
							if( d_k > -17.1061 )
								ret := -0.117050
						if( d_k > 6.7466 )
							if( d <= 77.5025 )
								ret := -0.059701
							if( d > 77.5025 )
								ret := 0.437023
					if( rsi1 > 77.5494 )
						if( ema3 <= 0.57958 )
							if( rsi1 <= 88.1535 )
								ret := 0.260684
							if( rsi1 > 88.1535 )
								ret := 0.621469
						if( ema3 > 0.57958 )
							if( ema13 <= 0.02084 )
								ret := 0.651724
							if( ema13 > 0.02084 )
								ret := -0.400000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ADAUSDT_15Min_8683acfb(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


