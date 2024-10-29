//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: PINS_5Min_2CS0_a7fa9158 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_5Min_2CS0_a7fa9158", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_5Min_a7fa9158(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ad_mf <= 0.127579 )
		if( rsi1 <= 55.8578 )
			if( ad_mf <= -4393.25 )
				if( d_k <= 1.95118 )
					if( mf <= -0.289671 )
						if( ad_mf <= -137810 )
							ret := 0.553719
						if( ad_mf > -137810 )
							ret := 0.187279
					if( mf > -0.289671 )
						if( ad <= -244680 )
							ret := -0.146789
						if( ad > -244680 )
							ret := 0.049112
				if( d_k > 1.95118 )
					if( ad <= -312617 )
						if( rsi1 <= 52.9755 )
							ret := 0.447099
						if( rsi1 > 52.9755 )
							ret := -0.361702
					if( ad > -312617 )
						if( d <= 24.5836 )
							ret := 0.039720
						if( d > 24.5836 )
							ret := -0.072889
			if( ad_mf > -4393.25 )
				if( d_k <= 3.21889 )
					if( mf <= 0.190553 )
						if( mf <= -0.362795 )
							ret := -0.178218
						if( mf > -0.362795 )
							ret := 0.153922
					if( mf > 0.190553 )
						if( d_k <= -7.7913 )
							ret := -0.410628
						if( d_k > -7.7913 )
							ret := -0.009563
				if( d_k > 3.21889 )
					if( smoothD_d <= 69.695 )
						if( ad_mf <= 0.003531 )
							ret := 0.360932
						if( ad_mf > 0.003531 )
							ret := 0.049180
					if( smoothD_d > 69.695 )
						if( rsi1 <= 47.4868 )
							ret := 0.748000 // buy
						if( rsi1 > 47.4868 )
							ret := 0.473239
		if( rsi1 > 55.8578 )
			if( ad_mf <= -0.123266 )
				if( ad_mf <= -141851 )
					if( d_k <= -8.64995 )
						if( k <= 92.1063 )
							ret := -0.837209 // sell
						if( k > 92.1063 )
							ret := 0.000000
					if( d_k > -8.64995 )
						if( mf <= -0.381512 )
							ret := 0.857143 // buy
						if( mf > -0.381512 )
							ret := -0.231076
				if( ad_mf > -141851 )
					if( smoothD_d <= 58.9894 )
						if( mf <= 0.489853 )
							ret := -0.124381
						if( mf > 0.489853 )
							ret := 0.297297
					if( smoothD_d > 58.9894 )
						if( rsi1 <= 89.7257 )
							ret := 0.023575
						if( rsi1 > 89.7257 )
							ret := -0.666667
			if( ad_mf > -0.123266 )
				if( smoothK_k <= 91.944 )
					if( d <= 58.5688 )
						if( rsi1 <= 62.708 )
							ret := -0.262548
						if( rsi1 > 62.708 )
							ret := -0.629870
					if( d > 58.5688 )
						if( d <= 80.929 )
							ret := 0.020231
						if( d > 80.929 )
							ret := -0.400000
				if( smoothK_k > 91.944 )
					if( smoothD_d <= 80.0712 )
						if( rsi1 <= 59.4754 )
							ret := -1.000000 // sell
						if( rsi1 > 59.4754 )
							ret := -0.433333
					if( smoothD_d > 80.0712 )
						if( mf <= -0.028578 )
							ret := 0.595506
						if( mf > -0.028578 )
							ret := -0.144068
	if( ad_mf > 0.127579 )
		if( rsi1 <= 43.1589 )
			if( ad <= 1680.6 )
				if( d <= 1.12176 )
					if( mf <= -0.579635 )
						ret := 1.000000 // buy
					if( mf > -0.579635 )
						if( ad_mf <= 0.167464 )
							ret := 0.000000
						if( ad_mf > 0.167464 )
							ret := -0.761905 // sell
				if( d > 1.12176 )
					if( smoothD_d <= 50.1 )
						if( d_k <= 7.78815 )
							ret := 0.159647
						if( d_k > 7.78815 )
							ret := 0.610169
					if( smoothD_d > 50.1 )
						if( ad_mf <= 0.14763 )
							ret := -0.093750
						if( ad_mf > 0.14763 )
							ret := 0.605263
			if( ad > 1680.6 )
				if( ad <= 8434.61 )
					if( k <= 27.8964 )
						if( mf <= -0.143185 )
							ret := -0.536585
						if( mf > -0.143185 )
							ret := -0.149837
					if( k > 27.8964 )
						if( rsi1 <= 40.0641 )
							ret := -0.122905
						if( rsi1 > 40.0641 )
							ret := 0.302632
				if( ad > 8434.61 )
					if( ad_mf <= 384798 )
						if( smoothD_d <= 30.0652 )
							ret := -0.022089
						if( smoothD_d > 30.0652 )
							ret := 0.112011
					if( ad_mf > 384798 )
						if( ad <= 506745 )
							ret := -0.918919 // sell
						if( ad > 506745 )
							ret := -0.135593
		if( rsi1 > 43.1589 )
			if( ad_mf <= 5780.36 )
				if( smoothD_d <= 38.9277 )
					if( d_k <= -16.6967 )
						if( ad <= 3930.29 )
							ret := -0.694444
						if( ad > 3930.29 )
							ret := -0.111111
					if( d_k > -16.6967 )
						if( mf <= -0.453771 )
							ret := -0.696078
						if( mf > -0.453771 )
							ret := -0.237381
				if( smoothD_d > 38.9277 )
					if( d_k <= 1.2515 )
						if( ad_mf <= 5100.83 )
							ret := -0.148742
						if( ad_mf > 5100.83 )
							ret := -0.545455
					if( d_k > 1.2515 )
						if( mf <= 0.3217 )
							ret := 0.002431
						if( mf > 0.3217 )
							ret := 0.416107
			if( ad_mf > 5780.36 )
				if( ad <= 226053 )
					if( k <= 80.1849 )
						if( mf <= -0.050479 )
							ret := 0.035234
						if( mf > -0.050479 )
							ret := -0.071776
					if( k > 80.1849 )
						if( ad <= 77942.6 )
							ret := 0.064708
						if( ad > 77942.6 )
							ret := -0.099251
				if( ad > 226053 )
					if( rsi1 <= 64.9293 )
						if( d <= 29.1613 )
							ret := -0.106952
						if( d > 29.1613 )
							ret := -0.450980
					if( rsi1 > 64.9293 )
						if( ad <= 410583 )
							ret := -0.228070
						if( ad > 410583 )
							ret := 0.218750
	
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
float op_operation = decision_tree_0_PINS_5Min_a7fa9158(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


