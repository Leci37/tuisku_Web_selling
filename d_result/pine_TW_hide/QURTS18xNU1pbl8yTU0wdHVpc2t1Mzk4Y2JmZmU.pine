//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: ADSK_15Min_2MM0_398cbffe Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_2MM0_398cbffe", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_398cbffe(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( Raw_Money_Flow <= 1.43809e+06 )
		if( Positive_Money_Flow_Sum <= 1.29649e+08 )
			if( Short_Long_Diff <= -1.68976 )
				if( Negative_Money_Flow <= 92854 )
					if( Typical_Price <= 244.79 )
						if( Typical_Price <= 190.36 )
							if( MFI <= 12.352 )
								ret := 0.565217
							if( MFI > 12.352 )
								ret := -0.358209
						if( Typical_Price > 190.36 )
							if( Short_Long_Diff <= -1.78805 )
								ret := -0.692308
							if( Short_Long_Diff > -1.78805 )
								ret := 0.181818
					if( Typical_Price > 244.79 )
						if( MFI <= 14.4367 )
							if( Negative_Money_Flow_Sum <= 2.80482e+08 )
								ret := -0.678571
							if( Negative_Money_Flow_Sum > 2.80482e+08 )
								ret := 0.125000
						if( MFI > 14.4367 )
							if( Typical_Price <= 292.527 )
								ret := 0.576271
							if( Typical_Price > 292.527 )
								ret := -0.750000 // sell
				if( Negative_Money_Flow > 92854 )
					if( Negative_Money_Flow_Sum <= 2.99118e+07 )
						if( Positive_Money_Flow_Sum <= 1.27583e+07 )
							if( Short_Long_Diff <= -2.63254 )
								ret := -0.600000
							if( Short_Long_Diff > -2.63254 )
								ret := 0.714286 // buy
						if( Positive_Money_Flow_Sum > 1.27583e+07 )
							if( Short_MA <= 171.154 )
								ret := -1.000000 // sell
							if( Short_MA > 171.154 )
								ret := -0.714286 // sell
					if( Negative_Money_Flow_Sum > 2.99118e+07 )
						if( Money_Flow_Ratio <= 0.069264 )
							if( Negative_Money_Flow_Sum <= 3.39023e+08 )
								ret := -0.666667
							if( Negative_Money_Flow_Sum > 3.39023e+08 )
								ret := 0.285714
						if( Money_Flow_Ratio > 0.069264 )
							if( Short_MA <= 220.356 )
								ret := 0.756757 // buy
							if( Short_MA > 220.356 )
								ret := 0.264151
			if( Short_Long_Diff > -1.68976 )
				if( Negative_Money_Flow <= 15075.6 )
					if( Positive_Money_Flow_Sum <= 1.0368e+08 )
						if( Negative_Money_Flow_Sum <= 3.36431e+08 )
							if( Short_MA <= 73.8161 )
								ret := -0.923077 // sell
							if( Short_MA > 73.8161 )
								ret := 0.115598
						if( Negative_Money_Flow_Sum > 3.36431e+08 )
							if( Long_MA <= 189.971 )
								ret := 0.318182
							if( Long_MA > 189.971 )
								ret := 0.810811 // buy
					if( Positive_Money_Flow_Sum > 1.0368e+08 )
						if( Short_Long_Diff <= 0.285153 )
							if( Long_MA <= 249.097 )
								ret := -0.334615
							if( Long_MA > 249.097 )
								ret := 0.142857
						if( Short_Long_Diff > 0.285153 )
							if( Raw_Money_Flow <= 52698 )
								ret := -0.244186
							if( Raw_Money_Flow > 52698 )
								ret := 0.401316
				if( Negative_Money_Flow > 15075.6 )
					if( MFI_High <= -69.4861 )
						if( Short_Long_Diff <= -0.382072 )
							if( Negative_Money_Flow_Sum <= 2.62803e+08 )
								ret := 0.242105
							if( Negative_Money_Flow_Sum > 2.62803e+08 )
								ret := 0.705882 // buy
						if( Short_Long_Diff > -0.382072 )
							if( MFI_High <= -71.9535 )
								ret := 0.621622
							if( MFI_High > -71.9535 )
								ret := 0.956522 // buy
					if( MFI_High > -69.4861 )
						if( Money_Flow_Ratio <= 1.71782 )
							if( Negative_Money_Flow_Sum <= 8.0719e+07 )
								ret := 0.060096
							if( Negative_Money_Flow_Sum > 8.0719e+07 )
								ret := 0.289673
						if( Money_Flow_Ratio > 1.71782 )
							if( Raw_Money_Flow <= 312671 )
								ret := 0.258621
							if( Raw_Money_Flow > 312671 )
								ret := 0.636905
		if( Positive_Money_Flow_Sum > 1.29649e+08 )
			if( Negative_Money_Flow <= 1644.74 )
				if( Negative_Money_Flow_Sum <= 1.52394e+07 )
					if( MFI_High <= 18.0246 )
						if( Positive_Money_Flow_Sum <= 1.65818e+08 )
							if( Short_Long_Diff <= 0.502473 )
								ret := -0.714286 // sell
							if( Short_Long_Diff > 0.502473 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.65818e+08 )
							if( Money_Flow_Ratio <= 22.9045 )
								ret := 0.000000
							if( Money_Flow_Ratio > 22.9045 )
								ret := -0.833333 // sell
					if( MFI_High > 18.0246 )
						if( Positive_Money_Flow_Sum <= 2.90277e+08 )
							ret := 0.714286 // buy
						if( Positive_Money_Flow_Sum > 2.90277e+08 )
							ret := -0.142857
				if( Negative_Money_Flow_Sum > 1.52394e+07 )
					if( Negative_Money_Flow_Sum <= 2.26595e+07 )
						if( Short_Long_Diff <= 0.548777 )
							if( Positive_Money_Flow <= 36911.3 )
								ret := 0.181818
							if( Positive_Money_Flow > 36911.3 )
								ret := 0.787879 // buy
						if( Short_Long_Diff > 0.548777 )
							if( Negative_Money_Flow_Sum <= 2.22496e+07 )
								ret := -0.204082
							if( Negative_Money_Flow_Sum > 2.22496e+07 )
								ret := 0.818182 // buy
					if( Negative_Money_Flow_Sum > 2.26595e+07 )
						if( Typical_Price <= 107.8 )
							if( Short_Long_Diff <= 0.091898 )
								ret := 0.375000
							if( Short_Long_Diff > 0.091898 )
								ret := 1.000000 // buy
						if( Typical_Price > 107.8 )
							if( Negative_Money_Flow_Sum <= 2.64521e+07 )
								ret := -0.661290
							if( Negative_Money_Flow_Sum > 2.64521e+07 )
								ret := -0.191230
			if( Negative_Money_Flow > 1644.74 )
				if( Negative_Money_Flow_Sum <= 8.83964e+07 )
					if( Positive_Money_Flow_Sum <= 4.00042e+08 )
						if( Negative_Money_Flow_Sum <= 8.20293e+07 )
							if( Raw_Money_Flow <= 40104.6 )
								ret := -0.140000
							if( Raw_Money_Flow > 40104.6 )
								ret := 0.158940
						if( Negative_Money_Flow_Sum > 8.20293e+07 )
							if( MFI <= 63.7238 )
								ret := -0.933333 // sell
							if( MFI > 63.7238 )
								ret := -0.352941
					if( Positive_Money_Flow_Sum > 4.00042e+08 )
						if( Typical_Price <= 227.843 )
							ret := 0.416667
						if( Typical_Price > 227.843 )
							if( Money_Flow_Ratio <= 11.8769 )
								ret := -0.714286 // sell
							if( Money_Flow_Ratio > 11.8769 )
								ret := -0.966667 // sell
				if( Negative_Money_Flow_Sum > 8.83964e+07 )
					if( Long_MA <= 139.556 )
						if( Short_MA <= 134.206 )
							if( Negative_Money_Flow <= 60490.7 )
								ret := 0.857143 // buy
							if( Negative_Money_Flow > 60490.7 )
								ret := 0.125000
						if( Short_MA > 134.206 )
							if( Typical_Price <= 140.103 )
								ret := -0.300000
							if( Typical_Price > 140.103 )
								ret := -1.000000 // sell
					if( Long_MA > 139.556 )
						if( MFI_Low <= 48.367 )
							if( Positive_Money_Flow_Sum <= 1.90774e+08 )
								ret := 0.413043
							if( Positive_Money_Flow_Sum > 1.90774e+08 )
								ret := 0.868421 // buy
						if( MFI_Low > 48.367 )
							if( Short_Long_Diff <= 2.43484 )
								ret := 0.280000
							if( Short_Long_Diff > 2.43484 )
								ret := -0.875000 // sell
	if( Raw_Money_Flow > 1.43809e+06 )
		if( Long_MA <= 240.76 )
			if( MFI <= 52.5822 )
				if( Positive_Money_Flow_Sum <= 4.45823e+07 )
					if( Raw_Money_Flow <= 5.36516e+06 )
						if( Negative_Money_Flow_Sum <= 3.701e+07 )
							if( Short_Long_Diff <= -0.381173 )
								ret := -0.255014
							if( Short_Long_Diff > -0.381173 )
								ret := -0.028674
						if( Negative_Money_Flow_Sum > 3.701e+07 )
							if( Typical_Price <= 181.708 )
								ret := -0.017469
							if( Typical_Price > 181.708 )
								ret := 0.114796
					if( Raw_Money_Flow > 5.36516e+06 )
						if( Short_MA <= 78.4583 )
							if( Money_Flow_Ratio <= 0.262083 )
								ret := -0.766667 // sell
							if( Money_Flow_Ratio > 0.262083 )
								ret := -0.170732
						if( Short_MA > 78.4583 )
							if( Negative_Money_Flow_Sum <= 2.98267e+08 )
								ret := 0.103919
							if( Negative_Money_Flow_Sum > 2.98267e+08 )
								ret := -0.214286
				if( Positive_Money_Flow_Sum > 4.45823e+07 )
					if( Negative_Money_Flow_Sum <= 3.3084e+08 )
						if( Negative_Money_Flow_Sum <= 2.4019e+08 )
							if( MA_Cross <= 0.531434 )
								ret := -0.042273
							if( MA_Cross > 0.531434 )
								ret := 0.252847
						if( Negative_Money_Flow_Sum > 2.4019e+08 )
							if( Raw_Money_Flow <= 1.44062e+08 )
								ret := 0.272727
							if( Raw_Money_Flow > 1.44062e+08 )
								ret := -0.600000
					if( Negative_Money_Flow_Sum > 3.3084e+08 )
						if( Typical_Price <= 217.034 )
							if( Money_Flow_Ratio <= 0.146284 )
								ret := 0.055556
							if( Money_Flow_Ratio > 0.146284 )
								ret := -0.579787
						if( Typical_Price > 217.034 )
							if( MFI_Low <= -0.618204 )
								ret := 0.857143 // buy
							if( MFI_Low > -0.618204 )
								ret := 0.000000
			if( MFI > 52.5822 )
				if( Negative_Money_Flow_Sum <= 1.43537e+08 )
					if( Negative_Money_Flow_Sum <= 8.38882e+07 )
						if( Positive_Money_Flow <= 4.95395e+06 )
							if( Money_Flow_Ratio <= 2.5827 )
								ret := 0.025261
							if( Money_Flow_Ratio > 2.5827 )
								ret := 0.113351
						if( Positive_Money_Flow > 4.95395e+06 )
							if( Negative_Money_Flow_Sum <= 2.55962e+07 )
								ret := 0.038448
							if( Negative_Money_Flow_Sum > 2.55962e+07 )
								ret := 0.147534
					if( Negative_Money_Flow_Sum > 8.38882e+07 )
						if( MA_Cross <= 16.1785 )
							if( Money_Flow_Ratio <= 1.48573 )
								ret := 0.109804
							if( Money_Flow_Ratio > 1.48573 )
								ret := -0.152053
						if( MA_Cross > 16.1785 )
							if( Raw_Money_Flow <= 1.32621e+07 )
								ret := -0.881356 // sell
							if( Raw_Money_Flow > 1.32621e+07 )
								ret := -0.176471
				if( Negative_Money_Flow_Sum > 1.43537e+08 )
					if( Raw_Money_Flow <= 2.78989e+07 )
						if( Short_Long_Diff <= -2.34332 )
							ret := -0.500000
						if( Short_Long_Diff > -2.34332 )
							if( Positive_Money_Flow_Sum <= 3.58696e+08 )
								ret := 0.668317
							if( Positive_Money_Flow_Sum > 3.58696e+08 )
								ret := 0.142857
					if( Raw_Money_Flow > 2.78989e+07 )
						if( Positive_Money_Flow_Sum <= 6.38251e+08 )
							if( Short_Long_Diff <= 0.860732 )
								ret := 0.250000
							if( Short_Long_Diff > 0.860732 )
								ret := -0.672727
						if( Positive_Money_Flow_Sum > 6.38251e+08 )
							if( Negative_Money_Flow_Sum <= 1.84076e+08 )
								ret := 0.285714
							if( Negative_Money_Flow_Sum > 1.84076e+08 )
								ret := 0.904762 // buy
		if( Long_MA > 240.76 )
			if( Money_Flow_Ratio <= 0.060394 )
				if( Negative_Money_Flow_Sum <= 1.88861e+08 )
					if( Short_Long_Diff <= -1.73841 )
						if( Negative_Money_Flow <= 9.29219e+06 )
							ret := 0.285714
						if( Negative_Money_Flow > 9.29219e+06 )
							ret := 0.857143 // buy
					if( Short_Long_Diff > -1.73841 )
						if( Short_MA <= 293.35 )
							ret := 0.166667
						if( Short_MA > 293.35 )
							ret := -0.400000
				if( Negative_Money_Flow_Sum > 1.88861e+08 )
					if( Short_MA <= 258.642 )
						if( Money_Flow_Ratio <= 0.040094 )
							if( MFI <= 1.79852 )
								ret := 0.100000
							if( MFI > 1.79852 )
								ret := 0.666667
						if( Money_Flow_Ratio > 0.040094 )
							if( Negative_Money_Flow_Sum <= 2.21662e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.21662e+08 )
								ret := -0.111111
					if( Short_MA > 258.642 )
						if( Positive_Money_Flow_Sum <= 8.491e+06 )
							if( Short_MA <= 293.904 )
								ret := -0.827586 // sell
							if( Short_MA > 293.904 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 8.491e+06 )
							if( Positive_Money_Flow_Sum <= 1.0512e+07 )
								ret := -0.222222
							if( Positive_Money_Flow_Sum > 1.0512e+07 )
								ret := -0.695652
			if( Money_Flow_Ratio > 0.060394 )
				if( Negative_Money_Flow_Sum <= 3.99435e+08 )
					if( Negative_Money_Flow <= 6.10768e+07 )
						if( Short_Long_Diff <= 3.23544 )
							if( Negative_Money_Flow_Sum <= 1.9264e+08 )
								ret := 0.005895
							if( Negative_Money_Flow_Sum > 1.9264e+08 )
								ret := -0.142012
						if( Short_Long_Diff > 3.23544 )
							if( Positive_Money_Flow_Sum <= 3.73445e+08 )
								ret := -0.293860
							if( Positive_Money_Flow_Sum > 3.73445e+08 )
								ret := 0.764706 // buy
					if( Negative_Money_Flow > 6.10768e+07 )
						if( Negative_Money_Flow_Sum <= 3.27735e+08 )
							if( Raw_Money_Flow <= 1.45465e+08 )
								ret := 0.347826
							if( Raw_Money_Flow > 1.45465e+08 )
								ret := -0.615385
						if( Negative_Money_Flow_Sum > 3.27735e+08 )
							ret := -0.875000 // sell
				if( Negative_Money_Flow_Sum > 3.99435e+08 )
					if( Negative_Money_Flow_Sum <= 6.44533e+08 )
						if( Typical_Price <= 258.357 )
							if( Money_Flow_Ratio <= 0.114565 )
								ret := 0.857143 // buy
							if( Money_Flow_Ratio > 0.114565 )
								ret := 1.000000 // buy
						if( Typical_Price > 258.357 )
							if( Long_MA <= 268.942 )
								ret := 0.241379
							if( Long_MA > 268.942 )
								ret := 0.707317 // buy
					if( Negative_Money_Flow_Sum > 6.44533e+08 )
						if( Typical_Price <= 278.689 )
							if( Positive_Money_Flow_Sum <= 3.5864e+08 )
								ret := 0.705882 // buy
							if( Positive_Money_Flow_Sum > 3.5864e+08 )
								ret := -0.375000
						if( Typical_Price > 278.689 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_ADSK_15Min_398cbffe(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


