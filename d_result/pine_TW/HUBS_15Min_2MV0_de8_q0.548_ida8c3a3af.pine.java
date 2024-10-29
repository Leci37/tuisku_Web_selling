//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: HUBS_15Min_2MV0_a8c3a3af Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_2MV0_a8c3a3af", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_a8c3a3af(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Money_Flow_Ratio <= 0.686999 )
		if( VIM <= 2.17722 )
			if( MFI <= 10.0666 )
				if( VIP <= 0.609282 )
					if( Positive_Money_Flow_Sum <= 4.69452e+06 )
						if( VIM <= 1.36677 )
							if( MFI_High <= -74.1984 )
								ret := -0.857143 // sell
							if( MFI_High > -74.1984 )
								ret := -0.250000
						if( VIM > 1.36677 )
							if( Negative_Money_Flow_Sum <= 2.01156e+08 )
								if( Negative_Money_Flow_Sum <= 1.77805e+08 )
									ret := 0.491803
								if( Negative_Money_Flow_Sum > 1.77805e+08 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.01156e+08 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 4.69452e+06 )
						if( Typical_Price <= 580.587 )
							if( VIP_VIM <= -0.96721 )
								if( VIP_VIM <= -1.07155 )
									ret := -0.400000
								if( VIP_VIM > -1.07155 )
									ret := -0.900000 // sell
							if( VIP_VIM > -0.96721 )
								if( MFI_Low <= -10.7199 )
									ret := -0.246575
								if( MFI_Low > -10.7199 )
									ret := 0.800000 // buy
						if( Typical_Price > 580.587 )
							if( VIP <= 0.447738 )
								ret := 0.000000
							if( VIP > 0.447738 )
								if( VIP_VIM <= -0.874548 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.874548 )
									ret := 0.000000
				if( VIP > 0.609282 )
					if( VIM <= 1.24777 )
						if( Negative_Money_Flow_Sum <= 2.3905e+08 )
							if( Negative_Money_Flow_Sum <= 2.82173e+07 )
								if( Typical_Price <= 48.6167 )
									ret := -0.250000
								if( Typical_Price > 48.6167 )
									ret := 0.703704 // buy
							if( Negative_Money_Flow_Sum > 2.82173e+07 )
								if( Negative_Money_Flow <= 3.99638e+07 )
									ret := -0.270492
								if( Negative_Money_Flow > 3.99638e+07 )
									ret := 0.400000
						if( Negative_Money_Flow_Sum > 2.3905e+08 )
							if( VIP_VIM <= -0.079501 )
								if( Typical_Price <= 457.367 )
									ret := 1.000000 // buy
								if( Typical_Price > 457.367 )
									ret := 0.666667
							if( VIP_VIM > -0.079501 )
								if( Typical_Price <= 460.284 )
									ret := 0.000000
								if( Typical_Price > 460.284 )
									ret := 0.250000
					if( VIM > 1.24777 )
						if( Negative_Money_Flow <= 7600.4 )
							if( Negative_Money_Flow_Sum <= 3.43189e+08 )
								if( Negative_Money_Flow_Sum <= 2.15236e+08 )
									ret := 0.173913
								if( Negative_Money_Flow_Sum > 2.15236e+08 )
									ret := -0.894737 // sell
							if( Negative_Money_Flow_Sum > 3.43189e+08 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow > 7600.4 )
							if( Negative_Money_Flow_Sum <= 1.29914e+08 )
								if( Negative_Money_Flow_Sum <= 1.57161e+07 )
									ret := -0.090909
								if( Negative_Money_Flow_Sum > 1.57161e+07 )
									ret := 0.622517
							if( Negative_Money_Flow_Sum > 1.29914e+08 )
								if( Negative_Money_Flow <= 5.25229e+07 )
									ret := 0.148936
								if( Negative_Money_Flow > 5.25229e+07 )
									ret := 0.960000 // buy
			if( MFI > 10.0666 )
				if( Positive_Money_Flow_Sum <= 1.08805e+07 )
					if( Typical_Price <= 86.083 )
						if( VIP_VIM <= 0.71237 )
							if( Positive_Money_Flow_Sum <= 2.76991e+06 )
								if( VIM <= 0.981215 )
									ret := 0.533333
								if( VIM > 0.981215 )
									ret := 0.126263
							if( Positive_Money_Flow_Sum > 2.76991e+06 )
								if( Positive_Money_Flow_Sum <= 5.81214e+06 )
									ret := -0.106806
								if( Positive_Money_Flow_Sum > 5.81214e+06 )
									ret := 0.180064
						if( VIP_VIM > 0.71237 )
							ret := 1.000000 // buy
					if( Typical_Price > 86.083 )
						if( Negative_Money_Flow <= 2.78665e+06 )
							if( Negative_Money_Flow_Sum <= 5.12678e+07 )
								if( VIP_VIM <= -0.672088 )
									ret := -0.157303
								if( VIP_VIM > -0.672088 )
									ret := 0.132922
							if( Negative_Money_Flow_Sum > 5.12678e+07 )
								if( Raw_Money_Flow <= 996566 )
									ret := -0.806452 // sell
								if( Raw_Money_Flow > 996566 )
									ret := -0.071429
						if( Negative_Money_Flow > 2.78665e+06 )
							if( Typical_Price <= 342.071 )
								if( VIM <= 1.40547 )
									ret := 0.414322
								if( VIM > 1.40547 )
									ret := 0.758621 // buy
							if( Typical_Price > 342.071 )
								if( VIP_VIM <= -0.47106 )
									ret := 0.302326
								if( VIP_VIM > -0.47106 )
									ret := -0.225000
				if( Positive_Money_Flow_Sum > 1.08805e+07 )
					if( Negative_Money_Flow_Sum <= 2.25434e+08 )
						if( MFI_High <= -69.0894 )
							if( Positive_Money_Flow <= 6.89922e+06 )
								if( Raw_Money_Flow <= 2.40805e+06 )
									ret := -0.689655
								if( Raw_Money_Flow > 2.40805e+06 )
									ret := -0.197674
							if( Positive_Money_Flow > 6.89922e+06 )
								if( Money_Flow_Ratio <= 0.118997 )
									ret := 0.500000
								if( Money_Flow_Ratio > 0.118997 )
									ret := 1.000000 // buy
						if( MFI_High > -69.0894 )
							if( Positive_Money_Flow_Sum <= 7.23943e+07 )
								if( Negative_Money_Flow <= 1.06176e+08 )
									ret := 0.072900
								if( Negative_Money_Flow > 1.06176e+08 )
									ret := -0.789474 // sell
							if( Positive_Money_Flow_Sum > 7.23943e+07 )
								if( Typical_Price <= 405.52 )
									ret := -0.178862
								if( Typical_Price > 405.52 )
									ret := 0.285366
					if( Negative_Money_Flow_Sum > 2.25434e+08 )
						if( VIP <= 0.880618 )
							if( VIM <= 1.42682 )
								if( Money_Flow_Ratio <= 0.315906 )
									ret := -0.146597
								if( Money_Flow_Ratio > 0.315906 )
									ret := 0.222222
							if( VIM > 1.42682 )
								if( Negative_Money_Flow <= 2.59766e+07 )
									ret := 0.771429 // buy
								if( Negative_Money_Flow > 2.59766e+07 )
									ret := 0.133333
						if( VIP > 0.880618 )
							if( Raw_Money_Flow <= 2.10837e+06 )
								if( Typical_Price <= 811.15 )
									ret := 0.461538
								if( Typical_Price > 811.15 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 2.10837e+06 )
								if( Raw_Money_Flow <= 2.6544e+07 )
									ret := -0.575269
								if( Raw_Money_Flow > 2.6544e+07 )
									ret := 0.113636
		if( VIM > 2.17722 )
			if( MFI_High <= -48.3009 )
				if( Typical_Price <= 116.086 )
					if( VIP <= 1.59213 )
						ret := 0.800000 // buy
					if( VIP > 1.59213 )
						ret := 0.000000
				if( Typical_Price > 116.086 )
					if( Negative_Money_Flow_Sum <= 3.00942e+07 )
						ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 3.00942e+07 )
						if( Raw_Money_Flow <= 92427.6 )
							ret := 0.500000
						if( Raw_Money_Flow > 92427.6 )
							if( Money_Flow_Ratio <= 0.117754 )
								if( Negative_Money_Flow_Sum <= 1.11384e+08 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.11384e+08 )
									ret := -0.571429
							if( Money_Flow_Ratio > 0.117754 )
								if( MFI_High <= -61.6288 )
									ret := -0.916667 // sell
								if( MFI_High > -61.6288 )
									ret := -0.250000
			if( MFI_High > -48.3009 )
				if( Typical_Price <= 305.958 )
					if( VIP_VIM <= -0.189931 )
						ret := 1.000000 // buy
					if( VIP_VIM > -0.189931 )
						ret := 0.500000
				if( Typical_Price > 305.958 )
					ret := 0.200000
	if( Money_Flow_Ratio > 0.686999 )
		if( Negative_Money_Flow_Sum <= 1.9544e+08 )
			if( Raw_Money_Flow <= 1.57521e+06 )
				if( Positive_Money_Flow_Sum <= 1.57045e+08 )
					if( Raw_Money_Flow <= 74268.4 )
						if( Positive_Money_Flow_Sum <= 4.84195e+07 )
							if( Typical_Price <= 165.417 )
								if( Positive_Money_Flow_Sum <= 4.30244e+07 )
									ret := 0.284768
								if( Positive_Money_Flow_Sum > 4.30244e+07 )
									ret := -0.642857
							if( Typical_Price > 165.417 )
								if( Positive_Money_Flow_Sum <= 3.38324e+07 )
									ret := 0.223881
								if( Positive_Money_Flow_Sum > 3.38324e+07 )
									ret := 0.755725 // buy
						if( Positive_Money_Flow_Sum > 4.84195e+07 )
							if( VIP <= 1.14566 )
								if( Typical_Price <= 489.62 )
									ret := -0.480519
								if( Typical_Price > 489.62 )
									ret := 0.416667
							if( VIP > 1.14566 )
								if( VIP_VIM <= -0.051861 )
									ret := -0.454545
								if( VIP_VIM > -0.051861 )
									ret := 0.231132
					if( Raw_Money_Flow > 74268.4 )
						if( VIP_VIM <= 0.984984 )
							if( Negative_Money_Flow_Sum <= 3.10754e+06 )
								if( Positive_Money_Flow_Sum <= 1.21741e+07 )
									ret := 0.036008
								if( Positive_Money_Flow_Sum > 1.21741e+07 )
									ret := -0.223529
							if( Negative_Money_Flow_Sum > 3.10754e+06 )
								if( VIP <= 3.13472 )
									ret := 0.088958
								if( VIP > 3.13472 )
									ret := 0.954545 // buy
						if( VIP_VIM > 0.984984 )
							if( MFI_High <= 6.9987 )
								if( MFI <= 52.7742 )
									ret := 0.777778 // buy
								if( MFI > 52.7742 )
									ret := -0.363636
							if( MFI_High > 6.9987 )
								if( Negative_Money_Flow_Sum <= 677298 )
									ret := 0.400000
								if( Negative_Money_Flow_Sum > 677298 )
									ret := 0.925926 // buy
				if( Positive_Money_Flow_Sum > 1.57045e+08 )
					if( Positive_Money_Flow_Sum <= 1.81111e+08 )
						if( Negative_Money_Flow_Sum <= 1.3227e+08 )
							if( MFI_Low <= 71.4543 )
								if( VIP <= 1.27804 )
									ret := -0.282051
								if( VIP > 1.27804 )
									ret := -0.897959 // sell
							if( MFI_Low > 71.4543 )
								ret := 0.500000
						if( Negative_Money_Flow_Sum > 1.3227e+08 )
							if( Negative_Money_Flow_Sum <= 1.36695e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.36695e+08 )
								ret := 0.250000
					if( Positive_Money_Flow_Sum > 1.81111e+08 )
						if( VIM <= 0.962975 )
							if( VIP <= 1.66551 )
								if( Positive_Money_Flow <= 7780.03 )
									ret := -0.225806
								if( Positive_Money_Flow > 7780.03 )
									ret := -0.837838 // sell
							if( VIP > 1.66551 )
								ret := 0.800000 // buy
						if( VIM > 0.962975 )
							if( Typical_Price <= 798.28 )
								if( VIP_VIM <= 0.416831 )
									ret := 0.151515
								if( VIP_VIM > 0.416831 )
									ret := 0.678571
							if( Typical_Price > 798.28 )
								if( VIP <= 1.49745 )
									ret := -0.500000
								if( VIP > 1.49745 )
									ret := -1.000000 // sell
			if( Raw_Money_Flow > 1.57521e+06 )
				if( Raw_Money_Flow <= 1.89477e+07 )
					if( MFI_High <= -37.2837 )
						if( Positive_Money_Flow_Sum <= 2.49371e+07 )
							if( Positive_Money_Flow_Sum <= 8.15315e+06 )
								if( Negative_Money_Flow_Sum <= 6.16031e+06 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 6.16031e+06 )
									ret := -0.666667
							if( Positive_Money_Flow_Sum > 8.15315e+06 )
								if( Typical_Price <= 144.639 )
									ret := 0.314685
								if( Typical_Price > 144.639 )
									ret := -0.050000
						if( Positive_Money_Flow_Sum > 2.49371e+07 )
							if( Negative_Money_Flow_Sum <= 1.22315e+08 )
								if( Positive_Money_Flow_Sum <= 8.43305e+07 )
									ret := -0.246305
								if( Positive_Money_Flow_Sum > 8.43305e+07 )
									ret := 0.806452 // buy
							if( Negative_Money_Flow_Sum > 1.22315e+08 )
								if( Typical_Price <= 503.981 )
									ret := -0.848101 // sell
								if( Typical_Price > 503.981 )
									ret := 0.146341
					if( MFI_High > -37.2837 )
						if( Money_Flow_Ratio <= 1.12484 )
							if( Raw_Money_Flow <= 5.90754e+06 )
								if( VIP <= 0.908393 )
									ret := -0.091803
								if( VIP > 0.908393 )
									ret := 0.042272
							if( Raw_Money_Flow > 5.90754e+06 )
								if( Positive_Money_Flow <= 6.03252e+06 )
									ret := 0.190985
								if( Positive_Money_Flow > 6.03252e+06 )
									ret := 0.034188
						if( Money_Flow_Ratio > 1.12484 )
							if( VIP <= 1.09102 )
								if( VIM <= 1.33508 )
									ret := -0.061906
								if( VIM > 1.33508 )
									ret := 0.259740
							if( VIP > 1.09102 )
								if( Typical_Price <= 532.891 )
									ret := 0.015101
								if( Typical_Price > 532.891 )
									ret := -0.075825
				if( Raw_Money_Flow > 1.89477e+07 )
					if( Positive_Money_Flow_Sum <= 2.55491e+08 )
						if( VIM <= 1.33794 )
							if( VIP <= 0.996521 )
								if( VIM <= 0.981317 )
									ret := -0.129412
								if( VIM > 0.981317 )
									ret := 0.247238
							if( VIP > 0.996521 )
								if( VIP <= 1.44529 )
									ret := 0.020217
								if( VIP > 1.44529 )
									ret := 0.281553
						if( VIM > 1.33794 )
							if( Raw_Money_Flow <= 1.99463e+07 )
								if( Money_Flow_Ratio <= 1.25253 )
									ret := 0.375000
								if( Money_Flow_Ratio > 1.25253 )
									ret := -0.857143 // sell
							if( Raw_Money_Flow > 1.99463e+07 )
								if( MFI_Low <= 63.9765 )
									ret := 0.751773 // buy
								if( MFI_Low > 63.9765 )
									ret := -0.500000
					if( Positive_Money_Flow_Sum > 2.55491e+08 )
						if( Typical_Price <= 496.26 )
							if( Positive_Money_Flow_Sum <= 2.7391e+08 )
								if( Positive_Money_Flow_Sum <= 2.72201e+08 )
									ret := -0.444444
								if( Positive_Money_Flow_Sum > 2.72201e+08 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 2.7391e+08 )
								if( Typical_Price <= 444.722 )
									ret := -0.666667
								if( Typical_Price > 444.722 )
									ret := -1.000000 // sell
						if( Typical_Price > 496.26 )
							if( Typical_Price <= 579.527 )
								if( Typical_Price <= 565.527 )
									ret := -0.190476
								if( Typical_Price > 565.527 )
									ret := 0.758621 // buy
							if( Typical_Price > 579.527 )
								if( VIM <= 0.764584 )
									ret := 0.106383
								if( VIM > 0.764584 )
									ret := -0.684211
		if( Negative_Money_Flow_Sum > 1.9544e+08 )
			if( Negative_Money_Flow_Sum <= 4.9035e+08 )
				if( VIP <= 0.891044 )
					if( Negative_Money_Flow_Sum <= 2.2469e+08 )
						ret := 0.800000 // buy
					if( Negative_Money_Flow_Sum > 2.2469e+08 )
						if( Typical_Price <= 548.228 )
							ret := 0.000000
						if( Typical_Price > 548.228 )
							ret := -0.500000
				if( VIP > 0.891044 )
					if( Typical_Price <= 405.58 )
						ret := 0.400000
					if( Typical_Price > 405.58 )
						if( Raw_Money_Flow <= 9.7531e+06 )
							ret := 0.000000
						if( Raw_Money_Flow > 9.7531e+06 )
							if( Raw_Money_Flow <= 2.66078e+07 )
								if( Positive_Money_Flow_Sum <= 3.25309e+08 )
									ret := -0.784615 // sell
								if( Positive_Money_Flow_Sum > 3.25309e+08 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 2.66078e+07 )
								if( Raw_Money_Flow <= 4.35413e+07 )
									ret := -0.333333
								if( Raw_Money_Flow > 4.35413e+07 )
									ret := -0.843750 // sell
			if( Negative_Money_Flow_Sum > 4.9035e+08 )
				if( MFI_High <= -19.1049 )
					if( Raw_Money_Flow <= 1.29541e+08 )
						ret := 1.000000 // buy
					if( Raw_Money_Flow > 1.29541e+08 )
						ret := 0.500000
				if( MFI_High > -19.1049 )
					if( Raw_Money_Flow <= 6.87599e+07 )
						if( MFI <= 63.9046 )
							ret := 0.000000
						if( MFI > 63.9046 )
							ret := -0.500000
					if( Raw_Money_Flow > 6.87599e+07 )
						ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_HUBS_15Min_a8c3a3af(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


