//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: AFRM_1Min_2MV0_2b2859d6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2MV0_2b2859d6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_2b2859d6(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIP_VIM <= 0.254268 )
		if( Positive_Money_Flow_Sum <= 236943 )
			if( VIM <= 2.59209 )
				if( Negative_Money_Flow <= 781.218 )
					if( Negative_Money_Flow_Sum <= 596773 )
						if( VIP_VIM <= -0.250366 )
							if( Negative_Money_Flow_Sum <= 541831 )
								if( VIP <= 1.98611 )
									ret := -0.100917
								if( VIP > 1.98611 )
									ret := 0.482759
							if( Negative_Money_Flow_Sum > 541831 )
								if( VIM <= 1.66681 )
									ret := 0.333333
								if( VIM > 1.66681 )
									ret := 0.838710 // buy
						if( VIP_VIM > -0.250366 )
							if( Raw_Money_Flow <= 35469.5 )
								if( Negative_Money_Flow_Sum <= 437500 )
									ret := 0.053333
								if( Negative_Money_Flow_Sum > 437500 )
									ret := -0.529412
							if( Raw_Money_Flow > 35469.5 )
								if( Raw_Money_Flow <= 98240.9 )
									ret := -0.570093
								if( Raw_Money_Flow > 98240.9 )
									ret := 0.190476
					if( Negative_Money_Flow_Sum > 596773 )
						if( Money_Flow_Ratio <= 0.060564 )
							if( MFI_Low <= -18.2112 )
								ret := 0.000000
							if( MFI_Low > -18.2112 )
								ret := 0.454545
						if( Money_Flow_Ratio > 0.060564 )
							if( Money_Flow_Ratio <= 0.094698 )
								ret := -0.866667 // sell
							if( Money_Flow_Ratio > 0.094698 )
								if( VIP <= 1.23831 )
									ret := 0.120000
								if( VIP > 1.23831 )
									ret := -0.609524
				if( Negative_Money_Flow > 781.218 )
					if( Positive_Money_Flow_Sum <= 193955 )
						if( Typical_Price <= 35.3846 )
							if( Money_Flow_Ratio <= 2.18181 )
								if( Typical_Price <= 22.4335 )
									ret := 0.833333 // buy
								if( Typical_Price > 22.4335 )
									ret := -0.038846
							if( Money_Flow_Ratio > 2.18181 )
								ret := 0.882353 // buy
						if( Typical_Price > 35.3846 )
							if( VIP_VIM <= -0.865298 )
								if( Negative_Money_Flow_Sum <= 696631 )
									ret := -0.433333
								if( Negative_Money_Flow_Sum > 696631 )
									ret := 0.552632
							if( VIP_VIM > -0.865298 )
								if( MFI_Low <= 2.98484 )
									ret := 0.649123
								if( MFI_Low > 2.98484 )
									ret := 0.333333
					if( Positive_Money_Flow_Sum > 193955 )
						if( Positive_Money_Flow_Sum <= 222563 )
							if( Negative_Money_Flow_Sum <= 283480 )
								if( VIP <= 1.58735 )
									ret := 0.571429
								if( VIP > 1.58735 )
									ret := 0.925000 // buy
							if( Negative_Money_Flow_Sum > 283480 )
								if( Negative_Money_Flow_Sum <= 318086 )
									ret := -0.615385
								if( Negative_Money_Flow_Sum > 318086 )
									ret := 0.422330
						if( Positive_Money_Flow_Sum > 222563 )
							if( Negative_Money_Flow_Sum <= 1.58194e+06 )
								if( Raw_Money_Flow <= 74854.3 )
									ret := -0.012987
								if( Raw_Money_Flow > 74854.3 )
									ret := 0.692308
							if( Negative_Money_Flow_Sum > 1.58194e+06 )
								if( Typical_Price <= 30.9669 )
									ret := -0.913043 // sell
								if( Typical_Price > 30.9669 )
									ret := 0.000000
			if( VIM > 2.59209 )
				if( MFI_High <= -49.1368 )
					if( Negative_Money_Flow <= 37.2783 )
						if( MFI <= 18.4106 )
							if( Positive_Money_Flow <= 4448.03 )
								if( MFI <= 17.3988 )
									ret := 0.208333
								if( MFI > 17.3988 )
									ret := -0.500000
							if( Positive_Money_Flow > 4448.03 )
								if( MFI_High <= -67.1466 )
									ret := -0.470588
								if( MFI_High > -67.1466 )
									ret := -0.188119
						if( MFI > 18.4106 )
							if( VIP_VIM <= 0.007806 )
								if( MFI_High <= -52.6504 )
									ret := 0.367299
								if( MFI_High > -52.6504 )
									ret := 0.060465
							if( VIP_VIM > 0.007806 )
								if( VIM <= 7.57592 )
									ret := -0.095238
								if( VIM > 7.57592 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow > 37.2783 )
						if( Negative_Money_Flow_Sum <= 169955 )
							if( Positive_Money_Flow_Sum <= 13001 )
								ret := -0.153846
							if( Positive_Money_Flow_Sum > 13001 )
								if( Positive_Money_Flow_Sum <= 39398.2 )
									ret := 0.834356 // buy
								if( Positive_Money_Flow_Sum > 39398.2 )
									ret := 0.512821
						if( Negative_Money_Flow_Sum > 169955 )
							if( Raw_Money_Flow <= 6181.28 )
								if( Money_Flow_Ratio <= 0.406767 )
									ret := 0.489209
								if( Money_Flow_Ratio > 0.406767 )
									ret := 0.882353 // buy
							if( Raw_Money_Flow > 6181.28 )
								if( MFI_Low <= 7.82725 )
									ret := 0.226514
								if( MFI_Low > 7.82725 )
									ret := 0.626016
				if( MFI_High > -49.1368 )
					if( Positive_Money_Flow <= 453.235 )
						if( VIP_VIM <= -1.48577 )
							if( MFI_High <= -48.4118 )
								ret := 0.666667
							if( MFI_High > -48.4118 )
								if( Positive_Money_Flow_Sum <= 67892.1 )
									ret := -0.567568
								if( Positive_Money_Flow_Sum > 67892.1 )
									ret := 0.008475
						if( VIP_VIM > -1.48577 )
							if( Raw_Money_Flow <= 109328 )
								if( VIP <= 2.53945 )
									ret := 0.550000
								if( VIP > 2.53945 )
									ret := 0.291288
							if( Raw_Money_Flow > 109328 )
								if( Negative_Money_Flow_Sum <= 221836 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 221836 )
									ret := -0.756757 // sell
					if( Positive_Money_Flow > 453.235 )
						if( MFI <= 47.6291 )
							if( VIP <= 4.19594 )
								if( Typical_Price <= 29.0103 )
									ret := 0.469697
								if( Typical_Price > 29.0103 )
									ret := -0.140000
							if( VIP > 4.19594 )
								if( Raw_Money_Flow <= 5338.51 )
									ret := -0.670807
								if( Raw_Money_Flow > 5338.51 )
									ret := -0.194836
						if( MFI > 47.6291 )
							if( Positive_Money_Flow_Sum <= 196266 )
								if( VIP_VIM <= -1.01124 )
									ret := 0.483516
								if( VIP_VIM > -1.01124 )
									ret := 0.032012
							if( Positive_Money_Flow_Sum > 196266 )
								if( Positive_Money_Flow_Sum <= 232619 )
									ret := -0.632184
								if( Positive_Money_Flow_Sum > 232619 )
									ret := 0.285714
		if( Positive_Money_Flow_Sum > 236943 )
			if( MFI_Low <= -0.268765 )
				if( Positive_Money_Flow <= 408971 )
					if( Raw_Money_Flow <= 4.94111e+06 )
						if( VIM <= 1.35456 )
							if( Typical_Price <= 37.1809 )
								if( Positive_Money_Flow_Sum <= 2.04674e+06 )
									ret := -0.146238
								if( Positive_Money_Flow_Sum > 2.04674e+06 )
									ret := 0.212963
							if( Typical_Price > 37.1809 )
								if( Raw_Money_Flow <= 532599 )
									ret := 0.015544
								if( Raw_Money_Flow > 532599 )
									ret := -0.452083
						if( VIM > 1.35456 )
							if( Raw_Money_Flow <= 343136 )
								if( VIP_VIM <= -0.629548 )
									ret := -0.187919
								if( VIP_VIM > -0.629548 )
									ret := 0.091324
							if( Raw_Money_Flow > 343136 )
								if( Negative_Money_Flow_Sum <= 1.42252e+07 )
									ret := 0.197644
								if( Negative_Money_Flow_Sum > 1.42252e+07 )
									ret := -0.288000
					if( Raw_Money_Flow > 4.94111e+06 )
						if( Positive_Money_Flow_Sum <= 1.86913e+06 )
							if( Negative_Money_Flow_Sum <= 8.93285e+06 )
								if( Money_Flow_Ratio <= 0.109996 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.109996 )
									ret := 0.933333 // buy
							if( Negative_Money_Flow_Sum > 8.93285e+06 )
								if( Money_Flow_Ratio <= 0.083137 )
									ret := -0.545455
								if( Money_Flow_Ratio > 0.083137 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.86913e+06 )
							if( VIP <= 0.800407 )
								if( Negative_Money_Flow_Sum <= 4.14035e+07 )
									ret := 0.885714 // buy
								if( Negative_Money_Flow_Sum > 4.14035e+07 )
									ret := -0.187500
							if( VIP > 0.800407 )
								if( MFI_High <= -65.6391 )
									ret := 0.312500
								if( MFI_High > -65.6391 )
									ret := -0.900000 // sell
				if( Positive_Money_Flow > 408971 )
					if( MFI_Low <= -11.9639 )
						if( VIP <= 0.660897 )
							ret := -1.000000 // sell
						if( VIP > 0.660897 )
							if( MFI_Low <= -14.4162 )
								ret := 0.071429
							if( MFI_Low > -14.4162 )
								ret := 0.777778 // buy
					if( MFI_Low > -11.9639 )
						if( VIM <= 1.36259 )
							if( Typical_Price <= 30.0266 )
								if( Positive_Money_Flow_Sum <= 1.22056e+06 )
									ret := -0.272727
								if( Positive_Money_Flow_Sum > 1.22056e+06 )
									ret := 0.660000
							if( Typical_Price > 30.0266 )
								if( VIP_VIM <= -0.597033 )
									ret := -0.449438
								if( VIP_VIM > -0.597033 )
									ret := 0.138122
						if( VIM > 1.36259 )
							if( Typical_Price <= 29.4636 )
								if( Positive_Money_Flow <= 514143 )
									ret := 0.400000
								if( Positive_Money_Flow > 514143 )
									ret := 0.942857 // buy
							if( Typical_Price > 29.4636 )
								if( Negative_Money_Flow_Sum <= 6.07718e+06 )
									ret := -0.181818
								if( Negative_Money_Flow_Sum > 6.07718e+06 )
									ret := 0.449612
			if( MFI_Low > -0.268765 )
				if( Money_Flow_Ratio <= 1.54181 )
					if( Positive_Money_Flow_Sum <= 1.00177e+07 )
						if( Positive_Money_Flow_Sum <= 8.76386e+06 )
							if( VIP_VIM <= -0.392503 )
								if( Raw_Money_Flow <= 1.21177e+06 )
									ret := 0.034294
								if( Raw_Money_Flow > 1.21177e+06 )
									ret := 0.251724
							if( VIP_VIM > -0.392503 )
								if( VIM <= 1.12904 )
									ret := 0.029218
								if( VIM > 1.12904 )
									ret := -0.068688
						if( Positive_Money_Flow_Sum > 8.76386e+06 )
							if( Negative_Money_Flow <= 1.57378e+06 )
								if( Negative_Money_Flow_Sum <= 1.04489e+07 )
									ret := -0.102857
								if( Negative_Money_Flow_Sum > 1.04489e+07 )
									ret := -0.481793
							if( Negative_Money_Flow > 1.57378e+06 )
								if( VIP_VIM <= -0.26593 )
									ret := -0.171875
								if( VIP_VIM > -0.26593 )
									ret := 0.622642
					if( Positive_Money_Flow_Sum > 1.00177e+07 )
						if( Typical_Price <= 44.8858 )
							if( Positive_Money_Flow_Sum <= 2.32316e+07 )
								if( Money_Flow_Ratio <= 1.31917 )
									ret := 0.026211
								if( Money_Flow_Ratio > 1.31917 )
									ret := 0.481894
							if( Positive_Money_Flow_Sum > 2.32316e+07 )
								if( Negative_Money_Flow_Sum <= 3.14731e+07 )
									ret := 0.256410
								if( Negative_Money_Flow_Sum > 3.14731e+07 )
									ret := 0.554795
						if( Typical_Price > 44.8858 )
							if( MFI <= 42.5939 )
								if( Money_Flow_Ratio <= 0.420949 )
									ret := -0.263158
								if( Money_Flow_Ratio > 0.420949 )
									ret := 0.587302
							if( MFI > 42.5939 )
								if( VIP_VIM <= -0.255364 )
									ret := 0.315789
								if( VIP_VIM > -0.255364 )
									ret := -0.384328
				if( Money_Flow_Ratio > 1.54181 )
					if( VIP_VIM <= 0.236802 )
						if( VIM <= 193.651 )
							if( Negative_Money_Flow <= 3.6888e+06 )
								if( Raw_Money_Flow <= 2.69296e+06 )
									ret := -0.041084
								if( Raw_Money_Flow > 2.69296e+06 )
									ret := -0.266497
							if( Negative_Money_Flow > 3.6888e+06 )
								if( Typical_Price <= 38.632 )
									ret := -0.700000 // sell
								if( Typical_Price > 38.632 )
									ret := 0.886792 // buy
						if( VIM > 193.651 )
							ret := -1.000000 // sell
					if( VIP_VIM > 0.236802 )
						if( Raw_Money_Flow <= 3.81506e+06 )
							if( Positive_Money_Flow <= 139180 )
								if( Typical_Price <= 32.9362 )
									ret := -0.148718
								if( Typical_Price > 32.9362 )
									ret := 0.131737
							if( Positive_Money_Flow > 139180 )
								if( Positive_Money_Flow_Sum <= 1.60603e+06 )
									ret := -0.470588
								if( Positive_Money_Flow_Sum > 1.60603e+06 )
									ret := 0.297872
						if( Raw_Money_Flow > 3.81506e+06 )
							if( VIP_VIM <= 0.242018 )
								ret := 0.300000
							if( VIP_VIM > 0.242018 )
								ret := 1.000000 // buy
	if( VIP_VIM > 0.254268 )
		if( Positive_Money_Flow_Sum <= 65851.2 )
			if( VIM <= 24.2013 )
				if( Positive_Money_Flow <= 2966.48 )
					if( Positive_Money_Flow_Sum <= 55899.2 )
						if( Money_Flow_Ratio <= 0.304937 )
							if( VIP_VIM <= 0.710039 )
								ret := 0.904762 // buy
							if( VIP_VIM > 0.710039 )
								ret := 0.500000
						if( Money_Flow_Ratio > 0.304937 )
							if( Typical_Price <= 30.8783 )
								if( VIP_VIM <= 0.767845 )
									ret := 0.888889 // buy
								if( VIP_VIM > 0.767845 )
									ret := 0.200000
							if( Typical_Price > 30.8783 )
								ret := 0.050000
					if( Positive_Money_Flow_Sum > 55899.2 )
						if( Negative_Money_Flow_Sum <= 220945 )
							if( VIM <= 5.13688 )
								ret := 0.600000
							if( VIM > 5.13688 )
								if( Raw_Money_Flow <= 14656.4 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 14656.4 )
									ret := 0.888889 // buy
						if( Negative_Money_Flow_Sum > 220945 )
							ret := 0.285714
				if( Positive_Money_Flow > 2966.48 )
					if( VIP_VIM <= 0.399509 )
						ret := -0.533333
					if( VIP_VIM > 0.399509 )
						if( MFI_Low <= 14.2969 )
							if( Positive_Money_Flow_Sum <= 58021.6 )
								ret := 0.400000
							if( Positive_Money_Flow_Sum > 58021.6 )
								ret := 0.666667
						if( MFI_Low > 14.2969 )
							if( VIP_VIM <= 0.970588 )
								ret := -0.700000 // sell
							if( VIP_VIM > 0.970588 )
								ret := 0.100000
			if( VIM > 24.2013 )
				if( Money_Flow_Ratio <= 0.952382 )
					ret := -0.066667
				if( Money_Flow_Ratio > 0.952382 )
					ret := -0.444444
		if( Positive_Money_Flow_Sum > 65851.2 )
			if( Negative_Money_Flow_Sum <= 4.13053e+07 )
				if( Typical_Price <= 32.7313 )
					if( VIM <= 1.19434 )
						if( Negative_Money_Flow_Sum <= 185552 )
							if( VIM <= 0.668501 )
								if( VIP_VIM <= 1.02099 )
									ret := 0.354839
								if( VIP_VIM > 1.02099 )
									ret := -0.608696
							if( VIM > 0.668501 )
								if( Positive_Money_Flow_Sum <= 459020 )
									ret := 0.233083
								if( Positive_Money_Flow_Sum > 459020 )
									ret := 0.512000
						if( Negative_Money_Flow_Sum > 185552 )
							if( Raw_Money_Flow <= 2.45139e+06 )
								if( VIM <= 0.691618 )
									ret := -0.159134
								if( VIM > 0.691618 )
									ret := -0.043381
							if( Raw_Money_Flow > 2.45139e+06 )
								if( MFI_Low <= 71.0948 )
									ret := -0.437500
								if( MFI_Low > 71.0948 )
									ret := 0.526316
					if( VIM > 1.19434 )
						if( Negative_Money_Flow <= 2605.21 )
							if( MFI_Low <= 67.333 )
								if( Positive_Money_Flow <= 92135.6 )
									ret := -0.203593
								if( Positive_Money_Flow > 92135.6 )
									ret := -0.532847
							if( MFI_Low > 67.333 )
								if( VIP_VIM <= 0.881383 )
									ret := -0.309278
								if( VIP_VIM > 0.881383 )
									ret := -0.750000 // sell
						if( Negative_Money_Flow > 2605.21 )
							if( MFI <= 91.6468 )
								if( Negative_Money_Flow_Sum <= 156963 )
									ret := 0.120664
								if( Negative_Money_Flow_Sum > 156963 )
									ret := -0.154982
							if( MFI > 91.6468 )
								if( Positive_Money_Flow_Sum <= 636512 )
									ret := -0.850000 // sell
								if( Positive_Money_Flow_Sum > 636512 )
									ret := -0.366667
				if( Typical_Price > 32.7313 )
					if( MFI <= 99.1795 )
						if( Positive_Money_Flow_Sum <= 491727 )
							if( VIM <= 1.76541 )
								if( MFI <= 61.723 )
									ret := 0.067010
								if( MFI > 61.723 )
									ret := -0.352201
							if( VIM > 1.76541 )
								if( Negative_Money_Flow <= 25.5741 )
									ret := 0.008820
								if( Negative_Money_Flow > 25.5741 )
									ret := 0.315007
						if( Positive_Money_Flow_Sum > 491727 )
							if( Positive_Money_Flow <= 133975 )
								if( Positive_Money_Flow_Sum <= 1.01606e+06 )
									ret := -0.389831
								if( Positive_Money_Flow_Sum > 1.01606e+06 )
									ret := -0.025826
							if( Positive_Money_Flow > 133975 )
								if( MFI <= 58.3411 )
									ret := -0.259947
								if( MFI > 58.3411 )
									ret := 0.029164
					if( MFI > 99.1795 )
						if( VIM <= 0.950259 )
							if( MFI_High <= 19.3236 )
								ret := 1.000000 // buy
							if( MFI_High > 19.3236 )
								ret := 0.846154 // buy
						if( VIM > 0.950259 )
							ret := 0.555556
			if( Negative_Money_Flow_Sum > 4.13053e+07 )
				if( MFI_High <= -21.72 )
					if( Positive_Money_Flow <= 2032.47 )
						ret := -0.111111
					if( Positive_Money_Flow > 2032.47 )
						ret := -0.476190
				if( MFI_High > -21.72 )
					if( Positive_Money_Flow_Sum <= 1.50069e+08 )
						ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.50069e+08 )
						ret := -0.692308
	
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
float op_operation = decision_tree_0_AFRM_1Min_2b2859d6(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)

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


