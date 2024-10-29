//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: CRSR_30Min_2CS0_0eb053cf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_30Min_2CS0_0eb053cf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_30Min_0eb053cf(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ad <= 204.186 )
		if( rsi1 <= 46.5031 )
			if( d_k <= 4.45713 )
				if( d_k <= -17.3113 )
					if( rsi1 <= 33.486 )
						if( mf <= 0.020159 )
							ret := -0.121212
						if( mf > 0.020159 )
							ret := 1.000000 // buy
					if( rsi1 > 33.486 )
						if( ad_mf <= 0.057451 )
							ret := 0.319588
						if( ad_mf > 0.057451 )
							ret := 0.769231 // buy
				if( d_k > -17.3113 )
					if( ad_mf <= -1.20577e+06 )
						ret := -1.000000 // sell
					if( ad_mf > -1.20577e+06 )
						if( ad_mf <= -78178 )
							ret := 0.276596
						if( ad_mf > -78178 )
							ret := 0.101049
			if( d_k > 4.45713 )
				if( ad <= -270.111 )
					if( ad_mf <= -415.438 )
						if( rsi1 <= 40.2191 )
							ret := 0.314881
						if( rsi1 > 40.2191 )
							ret := 0.062657
					if( ad_mf > -415.438 )
						if( mf <= -0.146265 )
							ret := -0.971429 // sell
						if( mf > -0.146265 )
							ret := 0.250000
				if( ad > -270.111 )
					if( d_k <= 7.04985 )
						if( mf <= 0.206097 )
							ret := 0.767857 // buy
						if( mf > 0.206097 )
							ret := -0.400000
					if( d_k > 7.04985 )
						if( mf <= -0.157488 )
							ret := -0.122951
						if( mf > -0.157488 )
							ret := 0.487725
		if( rsi1 > 46.5031 )
			if( d_k <= 12.5093 )
				if( ad_mf <= -303.851 )
					if( smoothK_k <= 64.6152 )
						if( smoothK_k <= 63.4911 )
							ret := 0.049443
						if( smoothK_k > 63.4911 )
							ret := 0.505618
					if( smoothK_k > 64.6152 )
						if( ad <= -322.202 )
							ret := -0.087623
						if( ad > -322.202 )
							ret := 0.863636 // buy
				if( ad_mf > -303.851 )
					if( d <= 92.7512 )
						if( mf <= 0.211103 )
							ret := -0.132137
						if( mf > 0.211103 )
							ret := -0.379562
					if( d > 92.7512 )
						if( mf <= 0.429389 )
							ret := -0.477654
						if( mf > 0.429389 )
							ret := 0.750000 // buy
			if( d_k > 12.5093 )
				if( rsi1 <= 46.6086 )
					ret := -0.823529 // sell
				if( rsi1 > 46.6086 )
					if( ad_mf <= -0.087624 )
						if( rsi1 <= 72.7306 )
							ret := 0.359356
						if( rsi1 > 72.7306 )
							ret := -0.354839
					if( ad_mf > -0.087624 )
						if( d_k <= 16.5459 )
							ret := -0.512821
						if( d_k > 16.5459 )
							ret := 0.207407
	if( ad > 204.186 )
		if( rsi1 <= 40.3175 )
			if( smoothD_d <= 51.0589 )
				if( ad_mf <= 678.85 )
					if( ad_mf <= 435.573 )
						if( mf <= -0.292246 )
							ret := -1.000000 // sell
						if( mf > -0.292246 )
							ret := -0.245283
					if( ad_mf > 435.573 )
						if( mf <= -0.568537 )
							ret := -1.000000 // sell
						if( mf > -0.568537 )
							ret := 0.808989 // buy
				if( ad_mf > 678.85 )
					if( ad_mf <= 780.775 )
						if( mf <= 0.041416 )
							ret := -0.894737 // sell
						if( mf > 0.041416 )
							ret := 0.250000
					if( ad_mf > 780.775 )
						if( mf <= 0.447723 )
							ret := -0.038526
						if( mf > 0.447723 )
							ret := -0.894737 // sell
			if( smoothD_d > 51.0589 )
				if( ad <= 4364.53 )
					if( ad <= 265.5 )
						ret := -1.000000 // sell
					if( ad > 265.5 )
						if( mf <= 0.138835 )
							ret := 0.623377
						if( mf > 0.138835 )
							ret := 0.111111
				if( ad > 4364.53 )
					if( k <= 80.0942 )
						if( ad <= 23922.4 )
							ret := 0.114286
						if( ad > 23922.4 )
							ret := 0.440678
					if( k > 80.0942 )
						if( rsi1 <= 39.5935 )
							ret := -0.023256
						if( rsi1 > 39.5935 )
							ret := -0.625000
		if( rsi1 > 40.3175 )
			if( d_k <= 12.3289 )
				if( mf <= -0.179921 )
					if( ad <= 706.986 )
						if( rsi1 <= 58.8933 )
							ret := -0.915493 // sell
						if( rsi1 > 58.8933 )
							ret := -0.360000
					if( ad > 706.986 )
						if( smoothK_k <= 96.5809 )
							ret := -0.243675
						if( smoothK_k > 96.5809 )
							ret := 0.428571
				if( mf > -0.179921 )
					if( smoothK_k <= 5.36911 )
						if( rsi1 <= 47.4892 )
							ret := -0.092715
						if( rsi1 > 47.4892 )
							ret := 0.355072
					if( smoothK_k > 5.36911 )
						if( d_k <= -28.569 )
							ret := -0.484375
						if( d_k > -28.569 )
							ret := -0.118058
			if( d_k > 12.3289 )
				if( ad_mf <= 2645.04 )
					if( mf <= -0.01208 )
						if( d_k <= 18.8797 )
							ret := 0.906250 // buy
						if( d_k > 18.8797 )
							ret := 0.142857
					if( mf > -0.01208 )
						if( ad <= 647 )
							ret := -0.083333
						if( ad > 647 )
							ret := 0.525424
				if( ad_mf > 2645.04 )
					if( rsi1 <= 59.475 )
						if( ad <= 152000 )
							ret := -0.105882
						if( ad > 152000 )
							ret := -0.894737 // sell
					if( rsi1 > 59.475 )
						if( smoothK_k <= 23.5888 )
							ret := -0.058824
						if( smoothK_k > 23.5888 )
							ret := 0.405797
	
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
float op_operation = decision_tree_0_CRSR_30Min_0eb053cf(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


