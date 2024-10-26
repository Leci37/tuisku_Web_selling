//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: XLMUSDT_30Min_2BM0_00d06228 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_2BM0_00d06228", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_00d06228(bbp, bullPower, BBPower_Color, bearPower, bbm, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= 0.015568 )
		if( MFI <= 20.1531 )
			if( Typical_Price <= 0.26511 )
				if( Positive_Money_Flow_Sum <= 1.14719e+06 )
					if( Typical_Price <= 0.181984 )
						if( Negative_Money_Flow <= 73077.1 )
							if( Negative_Money_Flow_Sum <= 4.11246e+06 )
								if( bullPower <= 0.000339 )
									ret := -0.015823
								if( bullPower > 0.000339 )
									ret := -0.642857
							if( Negative_Money_Flow_Sum > 4.11246e+06 )
								if( bearPower <= -0.00203 )
									ret := 0.575342
								if( bearPower > -0.00203 )
									ret := -0.131579
						if( Negative_Money_Flow > 73077.1 )
							if( Negative_Money_Flow <= 2.50963e+06 )
								if( bearPower <= -0.007569 )
									ret := -0.687500
								if( bearPower > -0.007569 )
									ret := 0.178067
							if( Negative_Money_Flow > 2.50963e+06 )
								if( bullPower <= -0.00182 )
									ret := 0.555556
								if( bullPower > -0.00182 )
									ret := 1.000000 // buy
					if( Typical_Price > 0.181984 )
						if( Money_Flow_Ratio <= 0.181331 )
							if( MFI_High <= -72.6214 )
								ret := -0.823529 // sell
							if( MFI_High > -72.6214 )
								if( Typical_Price <= 0.186099 )
									ret := -0.631579
								if( Typical_Price > 0.186099 )
									ret := 0.139535
						if( Money_Flow_Ratio > 0.181331 )
							if( Negative_Money_Flow <= 696829 )
								if( bullPower <= -0.00023 )
									ret := -0.488095
								if( bullPower > -0.00023 )
									ret := 0.052632
							if( Negative_Money_Flow > 696829 )
								ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 1.14719e+06 )
					if( bbm <= 0.003919 )
						if( Negative_Money_Flow <= 242295 )
							if( Negative_Money_Flow_Sum <= 1.33273e+07 )
								if( MFI_High <= -65.0529 )
									ret := -0.238095
								if( MFI_High > -65.0529 )
									ret := 0.628205
							if( Negative_Money_Flow_Sum > 1.33273e+07 )
								ret := -0.857143 // sell
						if( Negative_Money_Flow > 242295 )
							if( bbp <= -0.00724 )
								if( Negative_Money_Flow_Sum <= 1.61192e+07 )
									ret := 0.904762 // buy
								if( Negative_Money_Flow_Sum > 1.61192e+07 )
									ret := 0.000000
							if( bbp > -0.00724 )
								if( bbp <= -0.005646 )
									ret := 0.111111
								if( bbp > -0.005646 )
									ret := 0.660000
					if( bbm > 0.003919 )
						if( Negative_Money_Flow <= 1.16134e+06 )
							if( Money_Flow_Ratio <= 0.210818 )
								if( bbp <= -0.009598 )
									ret := -0.269231
								if( bbp > -0.009598 )
									ret := 0.866667 // buy
							if( Money_Flow_Ratio > 0.210818 )
								if( Positive_Money_Flow_Sum <= 2.96462e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 2.96462e+06 )
									ret := 0.888889 // buy
						if( Negative_Money_Flow > 1.16134e+06 )
							if( MFI <= 18.4646 )
								if( Money_Flow_Ratio <= 0.127195 )
									ret := 0.720000 // buy
								if( Money_Flow_Ratio > 0.127195 )
									ret := 0.955882 // buy
							if( MFI > 18.4646 )
								if( bbm <= 0.006043 )
									ret := 0.750000 // buy
								if( bbm > 0.006043 )
									ret := -0.181818
			if( Typical_Price > 0.26511 )
				if( Positive_Money_Flow <= 1.95668e+06 )
					if( Positive_Money_Flow_Sum <= 3.55001e+06 )
						if( Positive_Money_Flow_Sum <= 3.15712e+06 )
							if( Money_Flow_Ratio <= 0.216889 )
								if( bearPower <= -0.005657 )
									ret := -0.370690
								if( bearPower > -0.005657 )
									ret := 0.147541
							if( Money_Flow_Ratio > 0.216889 )
								if( Negative_Money_Flow <= 816338 )
									ret := 0.583333
								if( Negative_Money_Flow > 816338 )
									ret := 0.240000
						if( Positive_Money_Flow_Sum > 3.15712e+06 )
							if( Negative_Money_Flow <= 2.11075e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 2.11075e+06 )
								if( Negative_Money_Flow_Sum <= 2.83205e+07 )
									ret := -0.444444
								if( Negative_Money_Flow_Sum > 2.83205e+07 )
									ret := -0.714286 // sell
					if( Positive_Money_Flow_Sum > 3.55001e+06 )
						if( bbm <= 0.004868 )
							if( MFI <= 18.4804 )
								if( bearPower <= -0.007755 )
									ret := -0.740741 // sell
								if( bearPower > -0.007755 )
									ret := 0.100000
							if( MFI > 18.4804 )
								ret := 0.090909
						if( bbm > 0.004868 )
							if( bbp <= -0.024475 )
								if( Raw_Money_Flow <= 7.21145e+06 )
									ret := -0.095238
								if( Raw_Money_Flow > 7.21145e+06 )
									ret := 0.518519
							if( bbp > -0.024475 )
								if( bullPower <= -0.004518 )
									ret := 0.304348
								if( bullPower > -0.004518 )
									ret := 0.714286 // buy
				if( Positive_Money_Flow > 1.95668e+06 )
					if( Raw_Money_Flow <= 7.6953e+06 )
						if( Money_Flow_Ratio <= 0.158799 )
							ret := -0.900000 // sell
						if( Money_Flow_Ratio > 0.158799 )
							ret := -1.000000 // sell
					if( Raw_Money_Flow > 7.6953e+06 )
						ret := 0.714286 // buy
		if( MFI > 20.1531 )
			if( Positive_Money_Flow <= 39900.8 )
				if( Negative_Money_Flow_Sum <= 6.08485e+06 )
					if( Negative_Money_Flow_Sum <= 5.31984e+06 )
						if( bullPower <= -0.003455 )
							if( Raw_Money_Flow <= 704232 )
								ret := 0.466667
							if( Raw_Money_Flow > 704232 )
								ret := 1.000000 // buy
						if( bullPower > -0.003455 )
							if( Money_Flow_Ratio <= 5.71246 )
								if( Positive_Money_Flow_Sum <= 9.38507e+06 )
									ret := 0.003162
								if( Positive_Money_Flow_Sum > 9.38507e+06 )
									ret := 0.200000
							if( Money_Flow_Ratio > 5.71246 )
								if( Raw_Money_Flow <= 93763 )
									ret := -0.016807
								if( Raw_Money_Flow > 93763 )
									ret := 0.429577
					if( Negative_Money_Flow_Sum > 5.31984e+06 )
						if( bearPower <= -0.003323 )
							if( bearPower <= -0.008089 )
								ret := -0.900000 // sell
							if( bearPower > -0.008089 )
								if( MFI <= 28.887 )
									ret := 0.516667
								if( MFI > 28.887 )
									ret := -0.060465
						if( bearPower > -0.003323 )
							if( Negative_Money_Flow <= 234006 )
								ret := -0.888889 // sell
							if( Negative_Money_Flow > 234006 )
								if( Negative_Money_Flow_Sum <= 5.61669e+06 )
									ret := -0.310458
								if( Negative_Money_Flow_Sum > 5.61669e+06 )
									ret := -0.044843
				if( Negative_Money_Flow_Sum > 6.08485e+06 )
					if( Money_Flow_Ratio <= 0.373638 )
						if( Negative_Money_Flow_Sum <= 1.20669e+07 )
							if( bearPower <= -0.011123 )
								if( Positive_Money_Flow_Sum <= 3.00082e+06 )
									ret := -0.960000 // sell
								if( Positive_Money_Flow_Sum > 3.00082e+06 )
									ret := -0.300000
							if( bearPower > -0.011123 )
								if( Negative_Money_Flow <= 2.17638e+06 )
									ret := 0.147887
								if( Negative_Money_Flow > 2.17638e+06 )
									ret := 0.771429 // buy
						if( Negative_Money_Flow_Sum > 1.20669e+07 )
							if( Negative_Money_Flow_Sum <= 1.82518e+07 )
								if( Negative_Money_Flow <= 788868 )
									ret := 0.113208
								if( Negative_Money_Flow > 788868 )
									ret := 0.602151
							if( Negative_Money_Flow_Sum > 1.82518e+07 )
								if( MFI_Low <= 6.71065 )
									ret := 0.183299
								if( MFI_Low > 6.71065 )
									ret := 0.739130 // buy
					if( Money_Flow_Ratio > 0.373638 )
						if( Typical_Price <= 0.656093 )
							if( Positive_Money_Flow_Sum <= 4.6747e+07 )
								if( Positive_Money_Flow_Sum <= 4.56436e+07 )
									ret := 0.068465
								if( Positive_Money_Flow_Sum > 4.56436e+07 )
									ret := -0.701493 // sell
							if( Positive_Money_Flow_Sum > 4.6747e+07 )
								if( Positive_Money_Flow_Sum <= 5.82711e+07 )
									ret := 0.610315
								if( Positive_Money_Flow_Sum > 5.82711e+07 )
									ret := 0.160900
						if( Typical_Price > 0.656093 )
							if( Positive_Money_Flow_Sum <= 1.8908e+08 )
								if( bullPower <= 0.010715 )
									ret := -0.625850
								if( bullPower > 0.010715 )
									ret := 0.120000
							if( Positive_Money_Flow_Sum > 1.8908e+08 )
								ret := 1.000000 // buy
			if( Positive_Money_Flow > 39900.8 )
				if( bbp <= 0.00431 )
					if( bbm <= 0.029014 )
						if( bearPower <= -0.022127 )
							if( bbp <= -0.036525 )
								if( Negative_Money_Flow_Sum <= 4.63461e+07 )
									ret := -0.900000 // sell
								if( Negative_Money_Flow_Sum > 4.63461e+07 )
									ret := -0.169492
							if( bbp > -0.036525 )
								if( bbm <= 0.020072 )
									ret := 0.835616 // buy
								if( bbm > 0.020072 )
									ret := 0.000000
						if( bearPower > -0.022127 )
							if( MFI_High <= -52.8615 )
								if( MFI_Low <= 3.13941 )
									ret := -0.043127
								if( MFI_Low > 3.13941 )
									ret := -0.166419
							if( MFI_High > -52.8615 )
								if( Positive_Money_Flow_Sum <= 1.25136e+08 )
									ret := -0.016635
								if( Positive_Money_Flow_Sum > 1.25136e+08 )
									ret := 0.846154 // buy
					if( bbm > 0.029014 )
						if( Raw_Money_Flow <= 1.07781e+07 )
							ret := 0.500000
						if( Raw_Money_Flow > 1.07781e+07 )
							if( Positive_Money_Flow <= 1.38384e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 1.38384e+07 )
								ret := 0.900000 // buy
				if( bbp > 0.00431 )
					if( Negative_Money_Flow_Sum <= 5.68852e+07 )
						if( MFI_Low <= 39.7045 )
							if( MFI_Low <= 27.1787 )
								if( Raw_Money_Flow <= 2.41727e+06 )
									ret := -0.038298
								if( Raw_Money_Flow > 2.41727e+06 )
									ret := -0.571429
							if( MFI_Low > 27.1787 )
								if( Typical_Price <= 0.597501 )
									ret := 0.142157
								if( Typical_Price > 0.597501 )
									ret := 0.660377
						if( MFI_Low > 39.7045 )
							if( Typical_Price <= 0.2292 )
								if( Negative_Money_Flow_Sum <= 238527 )
									ret := 0.547619
								if( Negative_Money_Flow_Sum > 238527 )
									ret := -0.295989
							if( Typical_Price > 0.2292 )
								if( MFI_Low <= 43.0768 )
									ret := -0.347921
								if( MFI_Low > 43.0768 )
									ret := -0.029679
					if( Negative_Money_Flow_Sum > 5.68852e+07 )
						if( MFI_Low <= 25.2267 )
							if( Positive_Money_Flow <= 7.52783e+06 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 7.52783e+06 )
								ret := -0.882353 // sell
						if( MFI_Low > 25.2267 )
							if( Raw_Money_Flow <= 8.45655e+06 )
								if( bbp <= 0.007257 )
									ret := 1.000000 // buy
								if( bbp > 0.007257 )
									ret := -0.225806
							if( Raw_Money_Flow > 8.45655e+06 )
								if( bearPower <= -0.003928 )
									ret := -0.714286 // sell
								if( bearPower > -0.003928 )
									ret := -1.000000 // sell
	if( bbp > 0.015568 )
		if( Raw_Money_Flow <= 1.34357e+07 )
			if( bullPower <= 0.015197 )
				if( MFI_High <= 6.84455 )
					if( Money_Flow_Ratio <= 3.40165 )
						if( MFI_High <= -9.68651 )
							if( Money_Flow_Ratio <= 0.913289 )
								if( Raw_Money_Flow <= 4.39265e+06 )
									ret := -0.428571
								if( Raw_Money_Flow > 4.39265e+06 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.913289 )
								if( Raw_Money_Flow <= 6.74728e+06 )
									ret := -0.379791
								if( Raw_Money_Flow > 6.74728e+06 )
									ret := 0.413043
						if( MFI_High > -9.68651 )
							if( Typical_Price <= 0.200018 )
								ret := -0.882353 // sell
							if( Typical_Price > 0.200018 )
								if( Negative_Money_Flow <= 3.1368e+06 )
									ret := 0.081081
								if( Negative_Money_Flow > 3.1368e+06 )
									ret := 0.714286 // buy
					if( Money_Flow_Ratio > 3.40165 )
						if( Money_Flow_Ratio <= 5.03249 )
							if( MFI_Low <= 59.0103 )
								if( MFI_High <= -2.32587 )
									ret := -1.000000 // sell
								if( MFI_High > -2.32587 )
									ret := -0.694444
							if( MFI_Low > 59.0103 )
								if( Positive_Money_Flow_Sum <= 2.21021e+07 )
									ret := 0.294118
								if( Positive_Money_Flow_Sum > 2.21021e+07 )
									ret := -0.447619
						if( Money_Flow_Ratio > 5.03249 )
							if( Negative_Money_Flow_Sum <= 6.24243e+06 )
								if( bbp <= 0.0198 )
									ret := -0.888889 // sell
								if( bbp > 0.0198 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 6.24243e+06 )
								ret := -0.650000
				if( MFI_High > 6.84455 )
					if( bbp <= 0.016059 )
						ret := -0.812500 // sell
					if( bbp > 0.016059 )
						if( Money_Flow_Ratio <= 7.1835 )
							ret := 0.722222 // buy
						if( Money_Flow_Ratio > 7.1835 )
							if( Positive_Money_Flow <= 3.47327e+06 )
								if( Typical_Price <= 0.29285 )
									ret := 0.851852 // buy
								if( Typical_Price > 0.29285 )
									ret := -0.100000
							if( Positive_Money_Flow > 3.47327e+06 )
								ret := -0.352941
			if( bullPower > 0.015197 )
				if( bbm <= 0.007932 )
					if( Positive_Money_Flow_Sum <= 2.27377e+07 )
						if( MFI_High <= 0.000213 )
							ret := 0.785714 // buy
						if( MFI_High > 0.000213 )
							ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 2.27377e+07 )
						if( Typical_Price <= 0.53817 )
							if( Typical_Price <= 0.449898 )
								if( Typical_Price <= 0.387985 )
									ret := -0.187500
								if( Typical_Price > 0.387985 )
									ret := 0.416667
							if( Typical_Price > 0.449898 )
								ret := -0.545455
						if( Typical_Price > 0.53817 )
							ret := 0.850000 // buy
				if( bbm > 0.007932 )
					if( Positive_Money_Flow_Sum <= 1.33306e+08 )
						if( MFI <= 80.4914 )
							if( MFI <= 65.8872 )
								if( bearPower <= 0.011581 )
									ret := -0.294702
								if( bearPower > 0.011581 )
									ret := 0.642857
							if( MFI > 65.8872 )
								if( Positive_Money_Flow_Sum <= 8.70739e+07 )
									ret := 0.033435
								if( Positive_Money_Flow_Sum > 8.70739e+07 )
									ret := 0.614815
						if( MFI > 80.4914 )
							if( MFI_Low <= 74.273 )
								if( Typical_Price <= 0.397148 )
									ret := -0.254545
								if( Typical_Price > 0.397148 )
									ret := -0.612500
							if( MFI_Low > 74.273 )
								ret := 0.583333
					if( Positive_Money_Flow_Sum > 1.33306e+08 )
						if( Raw_Money_Flow <= 1.24133e+07 )
							if( bbm <= 0.011458 )
								ret := -0.529412
							if( bbm > 0.011458 )
								if( bbm <= 0.017004 )
									ret := -1.000000 // sell
								if( bbm > 0.017004 )
									ret := -0.812500 // sell
						if( Raw_Money_Flow > 1.24133e+07 )
							ret := 0.181818
		if( Raw_Money_Flow > 1.34357e+07 )
			if( Negative_Money_Flow <= 1.69272e+07 )
				if( Typical_Price <= 0.647412 )
					if( Money_Flow_Ratio <= 2.54859 )
						if( bullPower <= 0.019283 )
							ret := 0.000000
						if( bullPower > 0.019283 )
							if( Raw_Money_Flow <= 1.63827e+07 )
								if( Positive_Money_Flow <= 1.51178e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 1.51178e+07 )
									ret := -0.785714 // sell
							if( Raw_Money_Flow > 1.63827e+07 )
								if( bbp <= 0.030394 )
									ret := -0.055556
								if( bbp > 0.030394 )
									ret := -0.657895
					if( Money_Flow_Ratio > 2.54859 )
						if( Positive_Money_Flow_Sum <= 1.7704e+08 )
							if( MFI <= 79.9653 )
								if( Typical_Price <= 0.256659 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.256659 )
									ret := 0.000000
							if( MFI > 79.9653 )
								if( Negative_Money_Flow_Sum <= 2.08538e+07 )
									ret := -0.735294 // sell
								if( Negative_Money_Flow_Sum > 2.08538e+07 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.7704e+08 )
							if( bbm <= 0.026613 )
								ret := 0.900000 // buy
							if( bbm > 0.026613 )
								ret := -0.400000
				if( Typical_Price > 0.647412 )
					if( Positive_Money_Flow <= 2.75623e+07 )
						if( bbm <= 0.019894 )
							ret := -0.733333 // sell
						if( bbm > 0.019894 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow > 2.75623e+07 )
						if( bearPower <= 0.020214 )
							ret := -0.500000
						if( bearPower > 0.020214 )
							ret := -0.894737 // sell
			if( Negative_Money_Flow > 1.69272e+07 )
				if( Positive_Money_Flow_Sum <= 8.63783e+07 )
					ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 8.63783e+07 )
					if( MFI_High <= -7.56682 )
						if( Negative_Money_Flow <= 2.07235e+07 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow > 2.07235e+07 )
							if( Money_Flow_Ratio <= 1.90869 )
								if( bullPower <= 0.029387 )
									ret := 0.800000 // buy
								if( bullPower > 0.029387 )
									ret := 0.272727
							if( Money_Flow_Ratio > 1.90869 )
								ret := -0.636364
					if( MFI_High > -7.56682 )
						ret := 0.692308
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_XLMUSDT_30Min_00d06228(bbp, bullPower, BBPower_Color, bearPower, bbm, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)

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


