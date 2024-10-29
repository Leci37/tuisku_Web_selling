//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: MATICUSDT_1Min_2MS0_c3a03273 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_1Min_2MS0_c3a03273", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_1Min_c3a03273(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 48.6576 )
		if( rsi1 <= 38.0949 )
			if( Money_Flow_Ratio <= 0.332143 )
				if( rsi1 <= 27.2694 )
					if( Typical_Price <= 0.639587 )
						if( Negative_Money_Flow_Sum <= 6.07989e+06 )
							if( Negative_Money_Flow_Sum <= 111796 )
								ret := -0.455943
							if( Negative_Money_Flow_Sum > 111796 )
								ret := -0.664891
						if( Negative_Money_Flow_Sum > 6.07989e+06 )
							if( Negative_Money_Flow <= 1.15296e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 1.15296e+06 )
								ret := 0.285714
					if( Typical_Price > 0.639587 )
						if( rsi1 <= 19.9949 )
							if( d_k <= 0.014603 )
								ret := -0.195652
							if( d_k > 0.014603 )
								ret := -0.415584
						if( rsi1 > 19.9949 )
							if( Positive_Money_Flow_Sum <= 317526 )
								ret := -0.101911
							if( Positive_Money_Flow_Sum > 317526 )
								ret := 0.574468
				if( rsi1 > 27.2694 )
					if( Typical_Price <= 0.570417 )
						if( Positive_Money_Flow <= 9.12313 )
							if( rsi1 <= 35.0003 )
								ret := -0.257282
							if( rsi1 > 35.0003 )
								ret := 0.060336
						if( Positive_Money_Flow > 9.12313 )
							if( Raw_Money_Flow <= 261401 )
								ret := -0.510258
							if( Raw_Money_Flow > 261401 )
								ret := 0.592593
					if( Typical_Price > 0.570417 )
						if( Raw_Money_Flow <= 36806.6 )
							if( MFI_Low <= -11.9385 )
								ret := 0.397436
							if( MFI_Low > -11.9385 )
								ret := -0.037351
						if( Raw_Money_Flow > 36806.6 )
							if( smoothK_k <= 2.90948 )
								ret := -0.305085
							if( smoothK_k > 2.90948 )
								ret := 0.442402
			if( Money_Flow_Ratio > 0.332143 )
				if( Typical_Price <= 0.683345 )
					if( rsi1 <= 33.3267 )
						if( Typical_Price <= 0.3848 )
							if( Negative_Money_Flow_Sum <= 280449 )
								ret := -0.280000
							if( Negative_Money_Flow_Sum > 280449 )
								ret := -0.717391 // sell
						if( Typical_Price > 0.3848 )
							if( k <= 0.000277 )
								ret := -0.487880
							if( k > 0.000277 )
								ret := -0.690937
					if( rsi1 > 33.3267 )
						if( rsi1 <= 33.3335 )
							if( Money_Flow_Ratio <= 0.888998 )
								ret := -0.106691
							if( Money_Flow_Ratio > 0.888998 )
								ret := -0.283662
						if( rsi1 > 33.3335 )
							if( Positive_Money_Flow <= 74.2541 )
								ret := -0.443907
							if( Positive_Money_Flow > 74.2541 )
								ret := -0.629022
				if( Typical_Price > 0.683345 )
					if( Raw_Money_Flow <= 58585.9 )
						if( Positive_Money_Flow_Sum <= 79495.7 )
							if( Negative_Money_Flow_Sum <= 164017 )
								ret := -0.103571
							if( Negative_Money_Flow_Sum > 164017 )
								ret := 0.201754
						if( Positive_Money_Flow_Sum > 79495.7 )
							if( Negative_Money_Flow_Sum <= 925190 )
								ret := -0.260155
							if( Negative_Money_Flow_Sum > 925190 )
								ret := 0.703704 // buy
					if( Raw_Money_Flow > 58585.9 )
						if( Positive_Money_Flow_Sum <= 1.92155e+06 )
							if( MFI <= 31.6669 )
								ret := -0.288889
							if( MFI > 31.6669 )
								ret := -0.563422
						if( Positive_Money_Flow_Sum > 1.92155e+06 )
							if( d_k <= 0.127998 )
								ret := 0.925926 // buy
							if( d_k > 0.127998 )
								ret := -0.250000
		if( rsi1 > 38.0949 )
			if( Money_Flow_Ratio <= 0.420728 )
				if( Negative_Money_Flow <= 11773.6 )
					if( Typical_Price <= 0.545025 )
						if( rsi1 <= 42.2581 )
							if( d_k <= -2.5298 )
								ret := -0.363636
							if( d_k > -2.5298 )
								ret := -0.111437
						if( rsi1 > 42.2581 )
							if( d_k <= -3.0866 )
								ret := -0.097519
							if( d_k > -3.0866 )
								ret := 0.204030
					if( Typical_Price > 0.545025 )
						if( d_k <= 2.1401 )
							if( rsi1 <= 42.8743 )
								ret := 0.155738
							if( rsi1 > 42.8743 )
								ret := 0.371741
						if( d_k > 2.1401 )
							if( Positive_Money_Flow_Sum <= 119296 )
								ret := 0.059740
							if( Positive_Money_Flow_Sum > 119296 )
								ret := -0.259259
				if( Negative_Money_Flow > 11773.6 )
					if( MFI_Low <= -0.014144 )
						if( Raw_Money_Flow <= 68557.6 )
							if( d_k <= -15.2786 )
								ret := 0.148305
							if( d_k > -15.2786 )
								ret := 0.539773
						if( Raw_Money_Flow > 68557.6 )
							if( d_k <= 14.3737 )
								ret := 0.766372 // buy
							if( d_k > 14.3737 )
								ret := -0.250000
					if( MFI_Low > -0.014144 )
						if( d_k <= -6.42843 )
							if( Typical_Price <= 0.506686 )
								ret := -0.267442
							if( Typical_Price > 0.506686 )
								ret := 0.322660
						if( d_k > -6.42843 )
							if( rsi1 <= 46.7286 )
								ret := 0.323887
							if( rsi1 > 46.7286 )
								ret := 0.681818
			if( Money_Flow_Ratio > 0.420728 )
				if( MFI_High <= -20.1292 )
					if( Positive_Money_Flow <= 191.199 )
						if( rsi1 <= 42.1318 )
							if( Typical_Price <= 0.630911 )
								ret := -0.238495
							if( Typical_Price > 0.630911 )
								ret := -0.040909
						if( rsi1 > 42.1318 )
							if( MFI <= 44.2687 )
								ret := 0.109086
							if( MFI > 44.2687 )
								ret := -0.041710
					if( Positive_Money_Flow > 191.199 )
						if( Typical_Price <= 0.612543 )
							if( rsi1 <= 45.4528 )
								ret := -0.427245
							if( rsi1 > 45.4528 )
								ret := -0.187323
						if( Typical_Price > 0.612543 )
							if( Money_Flow_Ratio <= 0.975032 )
								ret := -0.018013
							if( Money_Flow_Ratio > 0.975032 )
								ret := -0.236448
				if( MFI_High > -20.1292 )
					if( Positive_Money_Flow <= 391.849 )
						if( rsi1 <= 45.4461 )
							if( Typical_Price <= 0.435313 )
								ret := -0.246964
							if( Typical_Price > 0.435313 )
								ret := -0.443313
						if( rsi1 > 45.4461 )
							if( MFI <= 66.8251 )
								ret := -0.055788
							if( MFI > 66.8251 )
								ret := -0.258384
					if( Positive_Money_Flow > 391.849 )
						if( d_k <= 11.8545 )
							if( Typical_Price <= 0.686956 )
								ret := -0.619620
							if( Typical_Price > 0.686956 )
								ret := -0.244505
						if( d_k > 11.8545 )
							if( Typical_Price <= 0.537709 )
								ret := -0.257925
							if( Typical_Price > 0.537709 )
								ret := -0.588727
	if( rsi1 > 48.6576 )
		if( rsi1 <= 60.0007 )
			if( Money_Flow_Ratio <= 1.52894 )
				if( Negative_Money_Flow <= 74.221 )
					if( MFI_Low <= 29.122 )
						if( rsi1 <= 55.5581 )
							if( MFI_High <= -56.5762 )
								ret := 0.387097
							if( MFI_High > -56.5762 )
								ret := 0.137682
						if( rsi1 > 55.5581 )
							if( Negative_Money_Flow_Sum <= 111643 )
								ret := 0.247962
							if( Negative_Money_Flow_Sum > 111643 )
								ret := 0.494484
					if( MFI_Low > 29.122 )
						if( MFI_Low <= 37.4401 )
							if( Positive_Money_Flow <= 6785.93 )
								ret := 0.046329
							if( Positive_Money_Flow > 6785.93 )
								ret := 0.162592
						if( MFI_Low > 37.4401 )
							if( rsi1 <= 56.3636 )
								ret := -0.117512
							if( rsi1 > 56.3636 )
								ret := 0.180851
				if( Negative_Money_Flow > 74.221 )
					if( MFI_Low <= 12.1242 )
						if( Negative_Money_Flow_Sum <= 116460 )
							if( d_k <= -15.3919 )
								ret := 0.164875
							if( d_k > -15.3919 )
								ret := 0.484828
						if( Negative_Money_Flow_Sum > 116460 )
							if( Typical_Price <= 0.6947 )
								ret := 0.668657
							if( Typical_Price > 0.6947 )
								ret := 0.247059
					if( MFI_Low > 12.1242 )
						if( rsi1 <= 52.3813 )
							if( MFI <= 44.4181 )
								ret := 0.298005
							if( MFI > 44.4181 )
								ret := 0.165315
						if( rsi1 > 52.3813 )
							if( Typical_Price <= 0.688197 )
								ret := 0.505536
							if( Typical_Price > 0.688197 )
								ret := 0.189759
			if( Money_Flow_Ratio > 1.52894 )
				if( Positive_Money_Flow <= 4456.13 )
					if( rsi1 <= 54.0108 )
						if( Money_Flow_Ratio <= 3.10968 )
							if( d_k <= -4.30254 )
								ret := -0.166927
							if( d_k > -4.30254 )
								ret := 0.026465
						if( Money_Flow_Ratio > 3.10968 )
							if( Typical_Price <= 0.521233 )
								ret := -0.094053
							if( Typical_Price > 0.521233 )
								ret := -0.349338
					if( rsi1 > 54.0108 )
						if( MFI_High <= 3.12038 )
							if( Typical_Price <= 0.666467 )
								ret := 0.223949
							if( Typical_Price > 0.666467 )
								ret := -0.020595
						if( MFI_High > 3.12038 )
							if( Typical_Price <= 0.569817 )
								ret := -0.012844
							if( Typical_Price > 0.569817 )
								ret := -0.284211
				if( Positive_Money_Flow > 4456.13 )
					if( Money_Flow_Ratio <= 3.37819 )
						if( rsi1 <= 54.4936 )
							if( Positive_Money_Flow_Sum <= 2.12968e+06 )
								ret := -0.241784
							if( Positive_Money_Flow_Sum > 2.12968e+06 )
								ret := 0.488889
						if( rsi1 > 54.4936 )
							if( Money_Flow_Ratio <= 1.90465 )
								ret := 0.094361
							if( Money_Flow_Ratio > 1.90465 )
								ret := -0.136420
					if( Money_Flow_Ratio > 3.37819 )
						if( Positive_Money_Flow <= 18820.2 )
							if( Positive_Money_Flow_Sum <= 634112 )
								ret := -0.342167
							if( Positive_Money_Flow_Sum > 634112 )
								ret := 0.396825
						if( Positive_Money_Flow > 18820.2 )
							if( d_k <= 11.3732 )
								ret := -0.596078
							if( d_k > 11.3732 )
								ret := -0.339833
		if( rsi1 > 60.0007 )
			if( Typical_Price <= 0.642685 )
				if( rsi1 <= 66.6669 )
					if( MFI <= 69.6007 )
						if( rsi1 <= 66.6662 )
							if( Negative_Money_Flow_Sum <= 109143 )
								ret := 0.510069
							if( Negative_Money_Flow_Sum > 109143 )
								ret := 0.670893
						if( rsi1 > 66.6662 )
							if( Negative_Money_Flow_Sum <= 84452.7 )
								ret := 0.102467
							if( Negative_Money_Flow_Sum > 84452.7 )
								ret := 0.317333
					if( MFI > 69.6007 )
						if( Positive_Money_Flow <= 9852.83 )
							if( MFI_High <= 7.50424 )
								ret := 0.374442
							if( MFI_High > 7.50424 )
								ret := 0.046875
						if( Positive_Money_Flow > 9852.83 )
							if( d_k <= 5.9437 )
								ret := -0.172603
							if( d_k > 5.9437 )
								ret := 0.154788
				if( rsi1 > 66.6669 )
					if( Negative_Money_Flow_Sum <= 37057.7 )
						if( rsi1 <= 75.0064 )
							if( Typical_Price <= 0.556183 )
								ret := 0.483694
							if( Typical_Price > 0.556183 )
								ret := 0.223862
						if( rsi1 > 75.0064 )
							if( k <= 99.9966 )
								ret := 0.651268
							if( k > 99.9966 )
								ret := 0.394273
					if( Negative_Money_Flow_Sum > 37057.7 )
						if( smoothK_k <= 96.9995 )
							if( smoothD_d <= 45.4153 )
								ret := 0.546505
							if( smoothD_d > 45.4153 )
								ret := 0.745243 // buy
						if( smoothK_k > 96.9995 )
							if( rsi1 <= 81.2815 )
								ret := 0.479443
							if( rsi1 > 81.2815 )
								ret := 0.659605
			if( Typical_Price > 0.642685 )
				if( MFI_High <= -15.4883 )
					if( Negative_Money_Flow_Sum <= 134925 )
						if( d_k <= -1.59368 )
							if( Typical_Price <= 0.68488 )
								ret := 0.525223
							if( Typical_Price > 0.68488 )
								ret := 0.264925
						if( d_k > -1.59368 )
							if( rsi1 <= 72.7642 )
								ret := 0.148867
							if( rsi1 > 72.7642 )
								ret := 0.322115
					if( Negative_Money_Flow_Sum > 134925 )
						if( Typical_Price <= 0.6847 )
							if( rsi1 <= 62.0409 )
								ret := 0.389474
							if( rsi1 > 62.0409 )
								ret := 0.723077 // buy
						if( Typical_Price > 0.6847 )
							if( Negative_Money_Flow_Sum <= 646647 )
								ret := 0.346970
							if( Negative_Money_Flow_Sum > 646647 )
								ret := 0.728070 // buy
				if( MFI_High > -15.4883 )
					if( rsi1 <= 71.23 )
						if( Money_Flow_Ratio <= 8.45843 )
							if( d_k <= 1.42426 )
								ret := 0.123288
							if( d_k > 1.42426 )
								ret := -0.062714
						if( Money_Flow_Ratio > 8.45843 )
							if( d_k <= 15.2505 )
								ret := -0.390977
							if( d_k > 15.2505 )
								ret := -0.813953 // sell
					if( rsi1 > 71.23 )
						if( Typical_Price <= 0.688617 )
							if( Negative_Money_Flow_Sum <= 65262.1 )
								ret := 0.233141
							if( Negative_Money_Flow_Sum > 65262.1 )
								ret := 0.575758
						if( Typical_Price > 0.688617 )
							if( d_k <= 5.77948 )
								ret := 0.173405
							if( d_k > 5.77948 )
								ret := -0.147059
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_MATICUSDT_1Min_c3a03273(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


