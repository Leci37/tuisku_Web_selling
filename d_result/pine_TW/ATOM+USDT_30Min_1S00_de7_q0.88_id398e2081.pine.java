//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: ATOMUSDT_30Min_1S00_398e2081 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_30Min_1S00_398e2081", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_30Min_398e2081(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 50.8087 )
		if( d_k <= -3.64084 )
			if( rsi1 <= 33.8923 )
				if( d <= 7.45951 )
					if( d <= 4.44407 )
						if( rsi1 <= 21.5014 )
							if( d_k <= -5.2454 )
								ret := -0.642857
							if( d_k > -5.2454 )
								ret := -0.898990 // sell
						if( rsi1 > 21.5014 )
							if( d_k <= -4.17754 )
								ret := -0.511364
							if( d_k > -4.17754 )
								ret := 0.078947
					if( d > 4.44407 )
						if( smoothD_d <= 3.25246 )
							if( d_k <= -3.88045 )
								ret := -0.263830
							if( d_k > -3.88045 )
								ret := 0.291667
						if( smoothD_d > 3.25246 )
							if( rsi1 <= 25.3368 )
								ret := -0.250000
							if( rsi1 > 25.3368 )
								ret := -0.637097
				if( d > 7.45951 )
					if( d <= 26.1496 )
						if( rsi1 <= 20.3528 )
							if( smoothK_k <= 11.1189 )
								ret := 0.714286 // buy
							if( smoothK_k > 11.1189 )
								ret := -0.482234
						if( rsi1 > 20.3528 )
							if( d_k <= -4.13557 )
								ret := 0.068238
							if( d_k > -4.13557 )
								ret := -0.413793
					if( d > 26.1496 )
						if( k <= 43.349 )
							if( d_k <= -7.92681 )
								ret := -0.175758
							if( d_k > -7.92681 )
								ret := -0.482072
						if( k > 43.349 )
							if( smoothK_k <= 61.5722 )
								ret := -0.107075
							if( smoothK_k > 61.5722 )
								ret := 0.075724
			if( rsi1 > 33.8923 )
				if( d <= 12.6682 )
					if( smoothD_d <= 2.53703 )
						if( smoothK_k <= 5.19428 )
							if( k <= 6.0802 )
								ret := 0.444444
							if( k > 6.0802 )
								ret := -0.458564
						if( smoothK_k > 5.19428 )
							if( d <= 4.69257 )
								ret := 0.084211
							if( d > 4.69257 )
								ret := -0.384615
					if( smoothD_d > 2.53703 )
						if( smoothD_d <= 5.07543 )
							if( smoothK_k <= 7.3929 )
								ret := -0.315789
							if( smoothK_k > 7.3929 )
								ret := 0.196532
						if( smoothD_d > 5.07543 )
							if( rsi1 <= 43.5347 )
								ret := -0.206323
							if( rsi1 > 43.5347 )
								ret := 0.171504
				if( d > 12.6682 )
					if( k <= 98.5111 )
						if( rsi1 <= 40.3151 )
							if( d_k <= -12.9978 )
								ret := 0.304072
							if( d_k > -12.9978 )
								ret := 0.054443
						if( rsi1 > 40.3151 )
							if( d <= 74.6663 )
								ret := 0.296541
							if( d > 74.6663 )
								ret := 0.128009
					if( k > 98.5111 )
						if( d <= 91.4177 )
							if( rsi1 <= 38.1693 )
								ret := 0.250000
							if( rsi1 > 38.1693 )
								ret := 0.720524 // buy
						if( d > 91.4177 )
							if( d_k <= -4.76347 )
								ret := 0.118280
							if( d_k > -4.76347 )
								ret := 0.472727
		if( d_k > -3.64084 )
			if( rsi1 <= 32.1584 )
				if( k <= 5.38147 )
					if( rsi1 <= 18.999 )
						if( rsi1 <= 13.0725 )
							if( d_k <= 2.87316 )
								ret := -0.846774 // sell
							if( d_k > 2.87316 )
								ret := -0.952703 // sell
						if( rsi1 > 13.0725 )
							if( k <= 0.635095 )
								ret := -0.780531 // sell
							if( k > 0.635095 )
								ret := -0.667304
					if( rsi1 > 18.999 )
						if( smoothD_d <= 6.34088 )
							if( rsi1 <= 20.5981 )
								ret := -0.384615
							if( rsi1 > 20.5981 )
								ret := -0.602598
						if( smoothD_d > 6.34088 )
							if( smoothK_k <= 1.1766 )
								ret := -0.701923 // sell
							if( smoothK_k > 1.1766 )
								ret := -0.860963 // sell
				if( k > 5.38147 )
					if( d_k <= 0.128651 )
						if( d_k <= -3.23094 )
							if( d <= 6.3834 )
								ret := 0.121622
							if( d > 6.3834 )
								ret := -0.323077
						if( d_k > -3.23094 )
							if( smoothD_d <= 1.08555 )
								ret := -0.700637 // sell
							if( smoothD_d > 1.08555 )
								ret := -0.403442
					if( d_k > 0.128651 )
						if( rsi1 <= 18.4871 )
							if( d_k <= 17.9959 )
								ret := -0.753205 // sell
							if( d_k > 17.9959 )
								ret := -0.964912 // sell
						if( rsi1 > 18.4871 )
							if( smoothD_d <= 16.5555 )
								ret := -0.512774
							if( smoothD_d > 16.5555 )
								ret := -0.631742
			if( rsi1 > 32.1584 )
				if( d_k <= 4.22415 )
					if( smoothK_k <= 5.40905 )
						if( k <= 5.60091 )
							if( rsi1 <= 38.1068 )
								ret := -0.469040
							if( rsi1 > 38.1068 )
								ret := -0.263984
						if( k > 5.60091 )
							if( d_k <= -2.69807 )
								ret := 0.144068
							if( d_k > -2.69807 )
								ret := -0.299486
					if( smoothK_k > 5.40905 )
						if( rsi1 <= 43.7204 )
							if( d_k <= 2.68308 )
								ret := -0.142857
							if( d_k > 2.68308 )
								ret := -0.370270
						if( rsi1 > 43.7204 )
							if( k <= 98.7301 )
								ret := -0.030336
							if( k > 98.7301 )
								ret := 0.485915
				if( d_k > 4.22415 )
					if( smoothK_k <= 7.16567 )
						if( d <= 15.5821 )
							if( k <= 5.02283 )
								ret := -0.530888
							if( k > 5.02283 )
								ret := -0.371237
						if( d > 15.5821 )
							if( rsi1 <= 38.8824 )
								ret := -0.745628 // sell
							if( rsi1 > 38.8824 )
								ret := -0.556867
					if( smoothK_k > 7.16567 )
						if( rsi1 <= 45.3416 )
							if( d_k <= 15.3908 )
								ret := -0.441759
							if( d_k > 15.3908 )
								ret := -0.566895
						if( rsi1 > 45.3416 )
							if( d_k <= 7.61397 )
								ret := -0.160204
							if( d_k > 7.61397 )
								ret := -0.360588
	if( rsi1 > 50.8087 )
		if( k <= 73.2464 )
			if( d <= 65.7086 )
				if( smoothK_k <= 35.587 )
					if( rsi1 <= 65.1703 )
						if( d <= 31.8783 )
							if( smoothK_k <= 9.66121 )
								ret := -0.146073
							if( smoothK_k > 9.66121 )
								ret := 0.225776
						if( d > 31.8783 )
							if( rsi1 <= 56.7642 )
								ret := -0.360851
							if( rsi1 > 56.7642 )
								ret := -0.111611
					if( rsi1 > 65.1703 )
						if( smoothD_d <= 43.7544 )
							if( rsi1 <= 68.3458 )
								ret := 0.334118
							if( rsi1 > 68.3458 )
								ret := 0.522727
						if( smoothD_d > 43.7544 )
							if( rsi1 <= 71.1151 )
								ret := -0.140000
							if( rsi1 > 71.1151 )
								ret := 0.500000
				if( smoothK_k > 35.587 )
					if( d <= 45.8506 )
						if( smoothK_k <= 51.2 )
							if( d <= 34.8964 )
								ret := 0.469291
							if( d > 34.8964 )
								ret := 0.299226
						if( smoothK_k > 51.2 )
							if( rsi1 <= 52.9546 )
								ret := 0.250000
							if( rsi1 > 52.9546 )
								ret := 0.633188
					if( d > 45.8506 )
						if( k <= 53.9441 )
							if( smoothK_k <= 43.215 )
								ret := -0.136682
							if( smoothK_k > 43.215 )
								ret := 0.086030
						if( k > 53.9441 )
							if( d_k <= -12.5509 )
								ret := 0.560000
							if( d_k > -12.5509 )
								ret := 0.281545
			if( d > 65.7086 )
				if( d_k <= 8.12974 )
					if( d_k <= 2.67594 )
						if( rsi1 <= 57.7641 )
							if( d_k <= 0.376101 )
								ret := -0.315315
							if( d_k > 0.376101 )
								ret := 0.407767
						if( rsi1 > 57.7641 )
							if( smoothK_k <= 67.7032 )
								ret := 0.284211
							if( smoothK_k > 67.7032 )
								ret := 0.680952
					if( d_k > 2.67594 )
						if( k <= 66.8832 )
							if( rsi1 <= 67.4915 )
								ret := -0.258398
							if( rsi1 > 67.4915 )
								ret := 0.532609
						if( k > 66.8832 )
							if( k <= 72.6766 )
								ret := 0.174528
							if( k > 72.6766 )
								ret := -0.238095
				if( d_k > 8.12974 )
					if( rsi1 <= 71.5016 )
						if( rsi1 <= 64.1298 )
							if( k <= 56.6203 )
								ret := -0.490196
							if( k > 56.6203 )
								ret := -0.337241
						if( rsi1 > 64.1298 )
							if( d_k <= 26.361 )
								ret := -0.203103
							if( d_k > 26.361 )
								ret := 0.750000 // buy
					if( rsi1 > 71.5016 )
						if( smoothD_d <= 75.0587 )
							if( smoothD_d <= 67.4632 )
								ret := 0.000000
							if( smoothD_d > 67.4632 )
								ret := 0.605505
						if( smoothD_d > 75.0587 )
							if( smoothD_d <= 77.2494 )
								ret := -0.382353
							if( smoothD_d > 77.2494 )
								ret := 0.440476
		if( k > 73.2464 )
			if( d_k <= 3.59746 )
				if( rsi1 <= 68.1866 )
					if( d_k <= -5.07249 )
						if( rsi1 <= 57.2073 )
							if( smoothD_d <= 54.5957 )
								ret := 0.575290
							if( smoothD_d > 54.5957 )
								ret := 0.357271
						if( rsi1 > 57.2073 )
							if( d_k <= -18.0702 )
								ret := 0.684103
							if( d_k > -18.0702 )
								ret := 0.530026
					if( d_k > -5.07249 )
						if( rsi1 <= 62.1974 )
							if( k <= 97.4547 )
								ret := 0.204783
							if( k > 97.4547 )
								ret := 0.378347
						if( rsi1 > 62.1974 )
							if( rsi1 <= 63.4966 )
								ret := 0.530508
							if( rsi1 > 63.4966 )
								ret := 0.335487
				if( rsi1 > 68.1866 )
					if( k <= 96.3225 )
						if( d_k <= -5.22316 )
							if( k <= 80.5404 )
								ret := 0.728125 // buy
							if( k > 80.5404 )
								ret := 0.569727
						if( d_k > -5.22316 )
							if( rsi1 <= 81.4963 )
								ret := 0.415498
							if( rsi1 > 81.4963 )
								ret := 0.641075
					if( k > 96.3225 )
						if( d <= 99.8884 )
							if( d <= 99.2682 )
								ret := 0.660409
							if( d > 99.2682 )
								ret := 0.503240
						if( d > 99.8884 )
							if( rsi1 <= 90.1146 )
								ret := 0.781403 // buy
							if( rsi1 > 90.1146 )
								ret := 0.944882 // buy
			if( d_k > 3.59746 )
				if( d <= 94.0842 )
					if( rsi1 <= 72.8663 )
						if( k <= 86.992 )
							if( smoothD_d <= 82.0237 )
								ret := 0.105442
							if( smoothD_d > 82.0237 )
								ret := -0.071910
						if( k > 86.992 )
							if( d <= 93.3143 )
								ret := 0.372671
							if( d > 93.3143 )
								ret := -0.101124
					if( rsi1 > 72.8663 )
						if( d_k <= 5.19641 )
							if( d_k <= 4.80245 )
								ret := 0.331169
							if( d_k > 4.80245 )
								ret := 0.727273 // buy
						if( d_k > 5.19641 )
							if( rsi1 <= 84.9426 )
								ret := 0.151970
							if( rsi1 > 84.9426 )
								ret := 0.880000 // buy
				if( d > 94.0842 )
					if( rsi1 <= 55.0292 )
						if( d_k <= 4.19317 )
							if( rsi1 <= 52.6984 )
								ret := 0.857143 // buy
							if( rsi1 > 52.6984 )
								ret := 0.363636
						if( d_k > 4.19317 )
							if( smoothK_k <= 87.4817 )
								ret := 0.192982
							if( smoothK_k > 87.4817 )
								ret := -0.549296
					if( rsi1 > 55.0292 )
						if( d_k <= 5.47791 )
							if( smoothD_d <= 93.8064 )
								ret := 0.275081
							if( smoothD_d > 93.8064 )
								ret := 0.536842
						if( d_k > 5.47791 )
							if( d <= 96.7761 )
								ret := 0.613419
							if( d > 96.7761 )
								ret := 0.074074
	
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
float op_operation = decision_tree_0_ATOMUSDT_30Min_398e2081(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


