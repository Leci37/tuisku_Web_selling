//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: GME_15Min_2ST0_74414954 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_2ST0_74414954", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_74414954(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= 0.020077 )
		if( d_k <= 15.129 )
			if( k <= 5.48989 )
				if( tema <= 4.86275 )
					if( ema13 <= -0.045586 )
						if( tema <= 4.21234 )
							if( rsi1 <= 21.8324 )
								if( ema2 <= 3.98561 )
									ret := 0.590909
								if( ema2 > 3.98561 )
									ret := 0.088889
							if( rsi1 > 21.8324 )
								if( d <= 0.183587 )
									ret := 0.500000
								if( d > 0.183587 )
									ret := -0.333333
						if( tema > 4.21234 )
							if( ema1 <= 4.51134 )
								if( k <= 0.491337 )
									ret := 0.333333
								if( k > 0.491337 )
									ret := 0.844828 // buy
							if( ema1 > 4.51134 )
								if( d <= 5.12353 )
									ret := 0.096491
								if( d > 5.12353 )
									ret := 0.666667
					if( ema13 > -0.045586 )
						if( tema <= 4.79264 )
							if( ema13 <= 0.01645 )
								if( rsi1 <= 31.838 )
									ret := 0.220339
								if( rsi1 > 31.838 )
									ret := 0.734637 // buy
							if( ema13 > 0.01645 )
								if( ema12 <= 0.007292 )
									ret := -0.458333
								if( ema12 > 0.007292 )
									ret := 0.454545
						if( tema > 4.79264 )
							ret := -0.176471
				if( tema > 4.86275 )
					if( rsi1 <= 13.6939 )
						if( d <= 3.43511 )
							if( smoothK_k <= -2.56948 )
								if( smoothD_d <= -2.54404 )
									ret := -0.214022
								if( smoothD_d > -2.54404 )
									ret := 0.151515
							if( smoothK_k > -2.56948 )
								if( ema12 <= -0.143821 )
									ret := -0.440580
								if( ema12 > -0.143821 )
									ret := 0.126984
						if( d > 3.43511 )
							if( ema12 <= -2.17051 )
								if( ema12 <= -3.68027 )
									ret := -0.117647
								if( ema12 > -3.68027 )
									ret := 0.849057 // buy
							if( ema12 > -2.17051 )
								if( k <= 1.87332 )
									ret := -0.140187
								if( k > 1.87332 )
									ret := 0.353846
					if( rsi1 > 13.6939 )
						if( ema3 <= 220.82 )
							if( ema3 <= 218.705 )
								if( ema3 <= 197.359 )
									ret := 0.101177
								if( ema3 > 197.359 )
									ret := 0.366120
							if( ema3 > 218.705 )
								if( d_k <= 0.952494 )
									ret := -0.269231
								if( d_k > 0.952494 )
									ret := -0.782609 // sell
						if( ema3 > 220.82 )
							if( ema3 <= 268.665 )
								if( rsi1 <= 40.323 )
									ret := 0.773810 // buy
								if( rsi1 > 40.323 )
									ret := 0.235294
							if( ema3 > 268.665 )
								if( ema1 <= 274.72 )
									ret := -0.823529 // sell
								if( ema1 > 274.72 )
									ret := 0.629032
			if( k > 5.48989 )
				if( ema3 <= 153.998 )
					if( k <= 99.8038 )
						if( ema3 <= 4.13039 )
							if( ema13 <= -0.03674 )
								if( d <= 12.6794 )
									ret := 0.480315
								if( d > 12.6794 )
									ret := -0.036753
							if( ema13 > -0.03674 )
								if( rsi1 <= 50.7754 )
									ret := 0.348288
								if( rsi1 > 50.7754 )
									ret := 0.109602
						if( ema3 > 4.13039 )
							if( ema1 <= 122.879 )
								if( ema13 <= -19.9093 )
									ret := -0.812500 // sell
								if( ema13 > -19.9093 )
									ret := 0.015404
							if( ema1 > 122.879 )
								if( smoothK_k <= 5.89524 )
									ret := -0.276451
								if( smoothK_k > 5.89524 )
									ret := 0.212806
					if( k > 99.8038 )
						if( smoothD_d <= 78.4101 )
							if( ema1 <= 12.7699 )
								if( ema1 <= 4.50967 )
									ret := -0.400000
								if( ema1 > 4.50967 )
									ret := 0.076923
							if( ema1 > 12.7699 )
								if( ema3 <= 16.55 )
									ret := -0.869565 // sell
								if( ema3 > 16.55 )
									ret := -0.460000
						if( smoothD_d > 78.4101 )
							if( tema <= 5.29818 )
								if( ema3 <= 4.94647 )
									ret := -0.272727
								if( ema3 > 4.94647 )
									ret := -1.000000 // sell
							if( tema > 5.29818 )
								if( ema1 <= 20.7842 )
									ret := 0.112022
								if( ema1 > 20.7842 )
									ret := -0.111111
				if( ema3 > 153.998 )
					if( d <= 92.562 )
						if( d_k <= -3.42252 )
							if( ema2 <= 257.834 )
								if( ema2 <= 223.241 )
									ret := -0.021388
								if( ema2 > 223.241 )
									ret := -0.438735
							if( ema2 > 257.834 )
								if( d <= 21.2192 )
									ret := -0.184615
								if( d > 21.2192 )
									ret := 0.554795
						if( d_k > -3.42252 )
							if( ema12 <= -13.4614 )
								if( ema1 <= 292.985 )
									ret := 1.000000 // buy
								if( ema1 > 292.985 )
									ret := 0.368421
							if( ema12 > -13.4614 )
								if( ema1 <= 258.868 )
									ret := -0.148904
								if( ema1 > 258.868 )
									ret := -0.518771
					if( d > 92.562 )
						if( tema <= 205.855 )
							if( tema <= 160.083 )
								if( ema3 <= 156.902 )
									ret := 0.111111
								if( ema3 > 156.902 )
									ret := 0.868852 // buy
							if( tema > 160.083 )
								if( ema2 <= 176.802 )
									ret := 0.035714
								if( ema2 > 176.802 )
									ret := -0.337209
						if( tema > 205.855 )
							if( ema2 <= 222.655 )
								if( ema13 <= -1.39761 )
									ret := 0.500000
								if( ema13 > -1.39761 )
									ret := 0.863636 // buy
							if( ema2 > 222.655 )
								ret := 1.000000 // buy
		if( d_k > 15.129 )
			if( ema12 <= -8.03293 )
				ret := 1.000000 // buy
			if( ema12 > -8.03293 )
				if( d_k <= 17.4562 )
					if( ema12 <= 0.0165 )
						if( ema1 <= 4.40368 )
							if( ema12 <= -0.018672 )
								if( tema <= 4.18746 )
									ret := 0.727273 // buy
								if( tema > 4.18746 )
									ret := -0.272727
							if( ema12 > -0.018672 )
								if( smoothD_d <= 60.9198 )
									ret := 0.800000 // buy
								if( smoothD_d > 60.9198 )
									ret := 0.500000
						if( ema1 > 4.40368 )
							if( ema2 <= 198.056 )
								if( ema13 <= -0.658138 )
									ret := -0.012422
								if( ema13 > -0.658138 )
									ret := 0.237425
							if( ema2 > 198.056 )
								if( smoothD_d <= 33.318 )
									ret := 0.965517 // buy
								if( smoothD_d > 33.318 )
									ret := 0.348837
					if( ema12 > 0.0165 )
						if( rsi1 <= 55.2335 )
							if( ema3 <= 20.109 )
								ret := -0.166667
							if( ema3 > 20.109 )
								ret := 0.263158
						if( rsi1 > 55.2335 )
							if( ema12 <= 0.018572 )
								ret := -0.500000
							if( ema12 > 0.018572 )
								ret := -0.833333 // sell
				if( d_k > 17.4562 )
					if( ema2 <= 221.633 )
						if( rsi1 <= 10.5866 )
							if( rsi1 <= 7.63657 )
								ret := 0.888889 // buy
							if( rsi1 > 7.63657 )
								ret := 0.700000 // buy
						if( rsi1 > 10.5866 )
							if( ema3 <= 4.04774 )
								if( smoothD_d <= 59.7646 )
									ret := 0.060606
								if( smoothD_d > 59.7646 )
									ret := 0.619048
							if( ema3 > 4.04774 )
								if( smoothK_k <= 2.03322 )
									ret := 0.264108
								if( smoothK_k > 2.03322 )
									ret := 0.041253
					if( ema2 > 221.633 )
						if( k <= 35.6807 )
							if( d <= 32.1572 )
								ret := -1.000000 // sell
							if( d > 32.1572 )
								if( k <= 19.058 )
									ret := 0.666667
								if( k > 19.058 )
									ret := -0.913043 // sell
						if( k > 35.6807 )
							ret := 0.071429
	if( ema12 > 0.020077 )
		if( tema <= 329.805 )
			if( k <= 40.8157 )
				if( tema <= 309.601 )
					if( d_k <= 8.01285 )
						if( k <= 23.7629 )
							if( smoothK_k <= -2.97175 )
								if( smoothD_d <= -2.93779 )
									ret := 0.157895
								if( smoothD_d > -2.93779 )
									ret := -0.256684
							if( smoothK_k > -2.97175 )
								if( d <= 6.4734 )
									ret := 0.176471
								if( d > 6.4734 )
									ret := 0.025184
						if( k > 23.7629 )
							if( ema13 <= 0.109448 )
								if( d <= 12.3223 )
									ret := 0.555556
								if( d > 12.3223 )
									ret := -0.198735
							if( ema13 > 0.109448 )
								if( d <= 36.1523 )
									ret := -0.031364
								if( d > 36.1523 )
									ret := 0.244389
					if( d_k > 8.01285 )
						if( rsi1 <= 47.883 )
							if( tema <= 128.566 )
								if( ema1 <= 4.61554 )
									ret := -0.846154 // sell
								if( ema1 > 4.61554 )
									ret := 0.121864
							if( tema > 128.566 )
								if( rsi1 <= 38.3734 )
									ret := 0.352941
								if( rsi1 > 38.3734 )
									ret := -0.397727
						if( rsi1 > 47.883 )
							if( k <= 27.3342 )
								if( rsi1 <= 67.6894 )
									ret := 0.132335
								if( rsi1 > 67.6894 )
									ret := -0.193939
							if( k > 27.3342 )
								if( d <= 52.9326 )
									ret := 0.385598
								if( d > 52.9326 )
									ret := -0.002041
				if( tema > 309.601 )
					ret := -1.000000 // sell
			if( k > 40.8157 )
				if( d_k <= 8.25648 )
					if( ema2 <= 5.42194 )
						if( smoothD_d <= 64.0905 )
							if( rsi1 <= 58.9097 )
								if( ema2 <= 4.4186 )
									ret := 0.252427
								if( ema2 > 4.4186 )
									ret := -0.441176
							if( rsi1 > 58.9097 )
								if( ema13 <= 0.038681 )
									ret := 0.103896
								if( ema13 > 0.038681 )
									ret := -0.622824
						if( smoothD_d > 64.0905 )
							if( ema1 <= 3.27686 )
								if( d_k <= -0.1563 )
									ret := -0.200000
								if( d_k > -0.1563 )
									ret := 0.950000 // buy
							if( ema1 > 3.27686 )
								if( d_k <= 2.77947 )
									ret := -0.246867
								if( d_k > 2.77947 )
									ret := 0.051282
					if( ema2 > 5.42194 )
						if( ema3 <= 176.904 )
							if( ema13 <= 0.431307 )
								if( ema3 <= 172.095 )
									ret := -0.092009
								if( ema3 > 172.095 )
									ret := 0.720000 // buy
							if( ema13 > 0.431307 )
								if( ema3 <= 11.3783 )
									ret := 0.833333 // buy
								if( ema3 > 11.3783 )
									ret := -0.025032
						if( ema3 > 176.904 )
							if( ema3 <= 238.143 )
								if( ema12 <= 5.05675 )
									ret := -0.233425
								if( ema12 > 5.05675 )
									ret := -0.776596 // sell
							if( ema3 > 238.143 )
								if( ema3 <= 249.179 )
									ret := 0.600000
								if( ema3 > 249.179 )
									ret := -0.058824
				if( d_k > 8.25648 )
					if( ema3 <= 13.6052 )
						if( rsi1 <= 48.7322 )
							if( ema12 <= 0.02693 )
								ret := -0.800000 // sell
							if( ema12 > 0.02693 )
								ret := -0.500000
						if( rsi1 > 48.7322 )
							if( ema13 <= 0.482796 )
								if( ema3 <= 4.75023 )
									ret := 0.000000
								if( ema3 > 4.75023 )
									ret := 0.350717
							if( ema13 > 0.482796 )
								if( smoothK_k <= 54.1793 )
									ret := 0.100000
								if( smoothK_k > 54.1793 )
									ret := -0.785714 // sell
					if( ema3 > 13.6052 )
						if( k <= 80.143 )
							if( ema12 <= 1.79837 )
								if( d <= 65.3141 )
									ret := -0.180822
								if( d > 65.3141 )
									ret := -0.019971
							if( ema12 > 1.79837 )
								if( k <= 45.8092 )
									ret := 0.758621 // buy
								if( k > 45.8092 )
									ret := 0.152824
						if( k > 80.143 )
							if( smoothD_d <= 89.5482 )
								if( smoothK_k <= 78.5657 )
									ret := 0.454545
								if( smoothK_k > 78.5657 )
									ret := -0.029851
							if( smoothD_d > 89.5482 )
								if( ema2 <= 175.307 )
									ret := 0.666667
								if( ema2 > 175.307 )
									ret := 0.000000
		if( tema > 329.805 )
			if( smoothD_d <= 92.4699 )
				if( tema <= 346.698 )
					if( ema12 <= 8.12679 )
						ret := -1.000000 // sell
					if( ema12 > 8.12679 )
						if( d_k <= -0.346549 )
							ret := -1.000000 // sell
						if( d_k > -0.346549 )
							ret := -0.500000
				if( tema > 346.698 )
					ret := -1.000000 // sell
			if( smoothD_d > 92.4699 )
				if( ema13 <= 36.7895 )
					ret := -0.200000
				if( ema13 > 36.7895 )
					if( smoothD_d <= 94.073 )
						ret := 1.000000 // buy
					if( smoothD_d > 94.073 )
						ret := 0.176471
	
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
float op_operation = decision_tree_0_GME_15Min_74414954(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


