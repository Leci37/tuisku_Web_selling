//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: SOLUSDT_15Min_2MT0_e9ef3b38 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_15Min_2MT0_e9ef3b38", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_15Min_e9ef3b38(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow <= 721977 )
		if( Negative_Money_Flow_Sum <= 1.27503e+06 )
			if( ema13 <= 0.025864 )
				if( Negative_Money_Flow <= 5230.45 )
					if( Positive_Money_Flow_Sum <= 817352 )
						if( Typical_Price <= 12.1033 )
							if( ema13 <= -0.003959 )
								if( Positive_Money_Flow_Sum <= 703257 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 703257 )
									ret := -0.300000
							if( ema13 > -0.003959 )
								ret := -0.666667
						if( Typical_Price > 12.1033 )
							ret := 0.000000
					if( Positive_Money_Flow_Sum > 817352 )
						if( ema13 <= -0.036885 )
							if( ema3 <= 19.714 )
								ret := 0.809524 // buy
							if( ema3 > 19.714 )
								ret := 0.230769
						if( ema13 > -0.036885 )
							if( MFI <= 47.103 )
								if( tema <= 18.6588 )
									ret := 0.833333 // buy
								if( tema > 18.6588 )
									ret := 0.300000
							if( MFI > 47.103 )
								if( tema <= 10.2786 )
									ret := -0.333333
								if( tema > 10.2786 )
									ret := 0.081349
				if( Negative_Money_Flow > 5230.45 )
					if( Negative_Money_Flow_Sum <= 252454 )
						ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 252454 )
						if( Money_Flow_Ratio <= 0.784558 )
							if( ema1 <= 14.6482 )
								if( ema3 <= 13.6674 )
									ret := 0.095238
								if( ema3 > 13.6674 )
									ret := 1.000000 // buy
							if( ema1 > 14.6482 )
								if( Money_Flow_Ratio <= 0.73658 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.73658 )
									ret := -0.111111
						if( Money_Flow_Ratio > 0.784558 )
							if( ema2 <= 10.903 )
								ret := 0.400000
							if( ema2 > 10.903 )
								if( ema12 <= -0.015255 )
									ret := -0.576923
								if( ema12 > -0.015255 )
									ret := -0.071599
			if( ema13 > 0.025864 )
				if( tema <= 9.99747 )
					if( Positive_Money_Flow_Sum <= 1.81677e+06 )
						ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.81677e+06 )
						ret := 0.333333
				if( tema > 9.99747 )
					if( ema12 <= 0.072538 )
						if( ema13 <= 0.094396 )
							if( ema1 <= 12.2852 )
								if( Positive_Money_Flow_Sum <= 1.85936e+06 )
									ret := 0.272727
								if( Positive_Money_Flow_Sum > 1.85936e+06 )
									ret := -0.530303
							if( ema1 > 12.2852 )
								if( ema1 <= 19.0118 )
									ret := 0.256522
								if( ema1 > 19.0118 )
									ret := 0.110959
						if( ema13 > 0.094396 )
							if( ema3 <= 20.408 )
								if( tema <= 14.4254 )
									ret := 0.100000
								if( tema > 14.4254 )
									ret := 0.760331 // buy
							if( ema3 > 20.408 )
								if( Money_Flow_Ratio <= 6.23224 )
									ret := -0.166667
								if( Money_Flow_Ratio > 6.23224 )
									ret := 0.615385
					if( ema12 > 0.072538 )
						if( Money_Flow_Ratio <= 27.9379 )
							if( ema3 <= 13.4336 )
								if( Positive_Money_Flow <= 1.15914e+06 )
									ret := 0.785714 // buy
								if( Positive_Money_Flow > 1.15914e+06 )
									ret := 0.333333
							if( ema3 > 13.4336 )
								if( ema2 <= 14.9181 )
									ret := -0.730769 // sell
								if( ema2 > 14.9181 )
									ret := -0.076471
						if( Money_Flow_Ratio > 27.9379 )
							if( Raw_Money_Flow <= 4.35007e+06 )
								if( ema12 <= 0.201227 )
									ret := 0.764706 // buy
								if( ema12 > 0.201227 )
									ret := -0.400000
							if( Raw_Money_Flow > 4.35007e+06 )
								ret := 1.000000 // buy
		if( Negative_Money_Flow_Sum > 1.27503e+06 )
			if( ema12 <= 0.830957 )
				if( Negative_Money_Flow_Sum <= 1.96344e+08 )
					if( ema2 <= 53.0689 )
						if( Money_Flow_Ratio <= 6.68847 )
							if( ema1 <= 50.8786 )
								if( Negative_Money_Flow_Sum <= 5.01626e+07 )
									ret := -0.032421
								if( Negative_Money_Flow_Sum > 5.01626e+07 )
									ret := -0.373188
							if( ema1 > 50.8786 )
								if( MFI_High <= -8.89853 )
									ret := -0.194030
								if( MFI_High > -8.89853 )
									ret := -0.581081
						if( Money_Flow_Ratio > 6.68847 )
							if( Positive_Money_Flow_Sum <= 5.85888e+07 )
								if( Positive_Money_Flow_Sum <= 5.75606e+07 )
									ret := 0.229703
								if( Positive_Money_Flow_Sum > 5.75606e+07 )
									ret := 0.954545 // buy
							if( Positive_Money_Flow_Sum > 5.85888e+07 )
								if( Positive_Money_Flow_Sum <= 6.45693e+07 )
									ret := -0.727273 // sell
								if( Positive_Money_Flow_Sum > 6.45693e+07 )
									ret := 0.046512
					if( ema2 > 53.0689 )
						if( Positive_Money_Flow <= 2.95779e+07 )
							if( MFI_High <= 7.09296 )
								if( MFI_High <= 5.74209 )
									ret := 0.004518
								if( MFI_High > 5.74209 )
									ret := 0.492308
							if( MFI_High > 7.09296 )
								if( ema12 <= 0.724153 )
									ret := -0.533981
								if( ema12 > 0.724153 )
									ret := 0.022222
						if( Positive_Money_Flow > 2.95779e+07 )
							if( MFI_Low <= 18.4237 )
								ret := -1.000000 // sell
							if( MFI_Low > 18.4237 )
								if( Positive_Money_Flow_Sum <= 2.22252e+08 )
									ret := 0.680672
								if( Positive_Money_Flow_Sum > 2.22252e+08 )
									ret := -0.846154 // sell
				if( Negative_Money_Flow_Sum > 1.96344e+08 )
					if( Negative_Money_Flow_Sum <= 2.81241e+08 )
						if( Positive_Money_Flow_Sum <= 2.13171e+08 )
							if( MFI <= 34.2088 )
								if( Negative_Money_Flow_Sum <= 2.14001e+08 )
									ret := -0.588235
								if( Negative_Money_Flow_Sum > 2.14001e+08 )
									ret := 0.797980 // buy
							if( MFI > 34.2088 )
								if( ema12 <= -0.567817 )
									ret := 0.933333 // buy
								if( ema12 > -0.567817 )
									ret := 0.513514
						if( Positive_Money_Flow_Sum > 2.13171e+08 )
							if( ema12 <= 0.042517 )
								if( tema <= 178.089 )
									ret := -0.777778 // sell
								if( tema > 178.089 )
									ret := -0.636364
							if( ema12 > 0.042517 )
								ret := 0.176471
					if( Negative_Money_Flow_Sum > 2.81241e+08 )
						if( ema3 <= 141.183 )
							if( Negative_Money_Flow_Sum <= 4.02077e+08 )
								if( ema2 <= 126.27 )
									ret := 0.454545
								if( ema2 > 126.27 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.02077e+08 )
								if( ema12 <= -1.62743 )
									ret := 1.000000 // buy
								if( ema12 > -1.62743 )
									ret := 0.200000
						if( ema3 > 141.183 )
							if( MFI_High <= -44.6785 )
								if( ema1 <= 176.034 )
									ret := 0.470588
								if( ema1 > 176.034 )
									ret := -0.631579
							if( MFI_High > -44.6785 )
								if( MFI <= 38.0142 )
									ret := -0.600000
								if( MFI > 38.0142 )
									ret := -0.942857 // sell
			if( ema12 > 0.830957 )
				if( ema13 <= 5.14909 )
					if( Positive_Money_Flow_Sum <= 2.4547e+08 )
						if( tema <= 194.784 )
							if( Money_Flow_Ratio <= 1.31713 )
								if( ema13 <= 2.43567 )
									ret := 0.388889
								if( ema13 > 2.43567 )
									ret := -0.450000
							if( Money_Flow_Ratio > 1.31713 )
								if( Negative_Money_Flow_Sum <= 3.5405e+07 )
									ret := -0.296329
								if( Negative_Money_Flow_Sum > 3.5405e+07 )
									ret := -0.091613
						if( tema > 194.784 )
							if( Positive_Money_Flow_Sum <= 1.27178e+08 )
								ret := -0.666667
							if( Positive_Money_Flow_Sum > 1.27178e+08 )
								if( Positive_Money_Flow <= 2.43204e+07 )
									ret := -0.800000 // sell
								if( Positive_Money_Flow > 2.43204e+07 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 2.4547e+08 )
						if( Positive_Money_Flow <= 1.71543e+07 )
							if( MFI_High <= -2.58804 )
								ret := -0.636364
							if( MFI_High > -2.58804 )
								ret := 0.500000
						if( Positive_Money_Flow > 1.71543e+07 )
							if( tema <= 126.652 )
								ret := -0.100000
							if( tema > 126.652 )
								if( ema13 <= 2.08307 )
									ret := -0.604651
								if( ema13 > 2.08307 )
									ret := -0.923077 // sell
				if( ema13 > 5.14909 )
					if( Typical_Price <= 168.05 )
						ret := -0.545455
					if( Typical_Price > 168.05 )
						if( MFI_Low <= 61.3204 )
							ret := 0.200000
						if( MFI_Low > 61.3204 )
							ret := 1.000000 // buy
	if( Negative_Money_Flow > 721977 )
		if( MFI_High <= -47.0463 )
			if( ema12 <= -1.4324 )
				if( ema3 <= 191.293 )
					if( ema3 <= 59.1079 )
						ret := -0.714286 // sell
					if( ema3 > 59.1079 )
						if( ema1 <= 138.703 )
							if( Negative_Money_Flow <= 1.93109e+07 )
								if( Money_Flow_Ratio <= 0.314906 )
									ret := 0.159420
								if( Money_Flow_Ratio > 0.314906 )
									ret := 0.967742 // buy
							if( Negative_Money_Flow > 1.93109e+07 )
								if( tema <= 129.093 )
									ret := 0.897959 // buy
								if( tema > 129.093 )
									ret := 0.680000
						if( ema1 > 138.703 )
							if( Typical_Price <= 159.999 )
								if( Negative_Money_Flow_Sum <= 1.46287e+08 )
									ret := 0.730769 // buy
								if( Negative_Money_Flow_Sum > 1.46287e+08 )
									ret := -0.051613
							if( Typical_Price > 159.999 )
								if( ema12 <= -1.90948 )
									ret := 0.313131
								if( ema12 > -1.90948 )
									ret := 0.763636 // buy
				if( ema3 > 191.293 )
					if( Raw_Money_Flow <= 4.16147e+07 )
						if( tema <= 186.565 )
							ret := -1.000000 // sell
						if( tema > 186.565 )
							ret := -0.166667
					if( Raw_Money_Flow > 4.16147e+07 )
						ret := 0.363636
			if( ema12 > -1.4324 )
				if( MFI_Low <= -8.62087 )
					if( Positive_Money_Flow_Sum <= 1.48501e+07 )
						if( MFI_Low <= -16.0983 )
							if( Negative_Money_Flow_Sum <= 4.35574e+07 )
								if( Negative_Money_Flow <= 3.20143e+06 )
									ret := -0.454545
								if( Negative_Money_Flow > 3.20143e+06 )
									ret := 0.444444
							if( Negative_Money_Flow_Sum > 4.35574e+07 )
								ret := -0.782609 // sell
						if( MFI_Low > -16.0983 )
							if( Money_Flow_Ratio <= 0.094746 )
								if( ema13 <= -1.34933 )
									ret := -0.202381
								if( ema13 > -1.34933 )
									ret := 0.194631
							if( Money_Flow_Ratio > 0.094746 )
								if( Negative_Money_Flow_Sum <= 1.02118e+07 )
									ret := 0.379310
								if( Negative_Money_Flow_Sum > 1.02118e+07 )
									ret := -0.247492
					if( Positive_Money_Flow_Sum > 1.48501e+07 )
						if( ema12 <= -1.1089 )
							ret := -1.000000 // sell
						if( ema12 > -1.1089 )
							ret := -0.111111
				if( MFI_Low > -8.62087 )
					if( MFI <= 15.4464 )
						if( Negative_Money_Flow <= 4.48238e+06 )
							if( ema3 <= 23.581 )
								if( MFI_High <= -68.1117 )
									ret := -0.500000
								if( MFI_High > -68.1117 )
									ret := 0.218274
							if( ema3 > 23.581 )
								if( ema12 <= -1.06893 )
									ret := -0.352941
								if( ema12 > -1.06893 )
									ret := 0.520107
						if( Negative_Money_Flow > 4.48238e+06 )
							if( ema13 <= -0.663016 )
								if( tema <= 144.398 )
									ret := 0.445026
								if( tema > 144.398 )
									ret := -0.125000
							if( ema13 > -0.663016 )
								if( Typical_Price <= 40.6746 )
									ret := -0.581395
								if( Typical_Price > 40.6746 )
									ret := 0.312500
					if( MFI > 15.4464 )
						if( ema2 <= 199.086 )
							if( Typical_Price <= 13.4792 )
								if( Raw_Money_Flow <= 1.09369e+06 )
									ret := 0.102564
								if( Raw_Money_Flow > 1.09369e+06 )
									ret := 0.606383
							if( Typical_Price > 13.4792 )
								if( ema2 <= 33.6667 )
									ret := 0.126984
								if( ema2 > 33.6667 )
									ret := 0.051271
						if( ema2 > 199.086 )
							if( ema3 <= 202.397 )
								ret := -1.000000 // sell
							if( ema3 > 202.397 )
								ret := -0.600000
		if( MFI_High > -47.0463 )
			if( Typical_Price <= 39.8993 )
				if( MFI_High <= -1.53153 )
					if( Raw_Money_Flow <= 2.07423e+07 )
						if( MFI_High <= -12.4263 )
							if( ema12 <= 0.319231 )
								if( ema1 <= 39.8371 )
									ret := 0.067381
								if( ema1 > 39.8371 )
									ret := 0.629032
							if( ema12 > 0.319231 )
								if( ema13 <= 0.957225 )
									ret := 0.651685
								if( ema13 > 0.957225 )
									ret := -0.250000
						if( MFI_High > -12.4263 )
							if( MFI_Low <= 49.9498 )
								if( Positive_Money_Flow_Sum <= 3.92581e+07 )
									ret := -0.125326
								if( Positive_Money_Flow_Sum > 3.92581e+07 )
									ret := -0.912281 // sell
							if( MFI_Low > 49.9498 )
								if( tema <= 29.0875 )
									ret := -0.098187
								if( tema > 29.0875 )
									ret := 0.156818
					if( Raw_Money_Flow > 2.07423e+07 )
						ret := -1.000000 // sell
				if( MFI_High > -1.53153 )
					if( MFI_High <= 5.17678 )
						if( ema2 <= 34.3615 )
							if( Positive_Money_Flow_Sum <= 3.89708e+07 )
								if( Negative_Money_Flow <= 835661 )
									ret := 0.551020
								if( Negative_Money_Flow > 835661 )
									ret := 0.215447
							if( Positive_Money_Flow_Sum > 3.89708e+07 )
								if( ema13 <= 0.613334 )
									ret := -0.625000
								if( ema13 > 0.613334 )
									ret := 0.016129
						if( ema2 > 34.3615 )
							if( Typical_Price <= 35.6325 )
								ret := 1.000000 // buy
							if( Typical_Price > 35.6325 )
								if( Negative_Money_Flow <= 1.4317e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 1.4317e+06 )
									ret := 0.521739
					if( MFI_High > 5.17678 )
						if( Money_Flow_Ratio <= 9.43266 )
							if( Negative_Money_Flow <= 869675 )
								ret := 0.100000
							if( Negative_Money_Flow > 869675 )
								if( Negative_Money_Flow <= 1.05354e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 1.05354e+06 )
									ret := 0.708333 // buy
						if( Money_Flow_Ratio > 9.43266 )
							if( tema <= 22.8083 )
								ret := 0.666667
							if( tema > 22.8083 )
								ret := -0.785714 // sell
			if( Typical_Price > 39.8993 )
				if( Raw_Money_Flow <= 757747 )
					if( ema13 <= -0.070285 )
						if( MFI <= 38.1765 )
							ret := 0.200000
						if( MFI > 38.1765 )
							ret := -0.153846
					if( ema13 > -0.070285 )
						if( MFI_High <= -16.1326 )
							if( Positive_Money_Flow_Sum <= 9.03978e+06 )
								if( ema12 <= 0.047454 )
									ret := 0.967742 // buy
								if( ema12 > 0.047454 )
									ret := 0.700000 // buy
							if( Positive_Money_Flow_Sum > 9.03978e+06 )
								ret := 0.466667
						if( MFI_High > -16.1326 )
							ret := 0.210526
				if( Raw_Money_Flow > 757747 )
					if( Positive_Money_Flow_Sum <= 1.3347e+07 )
						if( Raw_Money_Flow <= 918218 )
							if( MFI_Low <= 22.0866 )
								if( Negative_Money_Flow <= 811039 )
									ret := -0.468750
								if( Negative_Money_Flow > 811039 )
									ret := 0.232558
							if( MFI_Low > 22.0866 )
								if( ema12 <= -0.059002 )
									ret := -0.285714
								if( ema12 > -0.059002 )
									ret := 0.422078
						if( Raw_Money_Flow > 918218 )
							if( MFI <= 67.4278 )
								if( Raw_Money_Flow <= 8.67576e+06 )
									ret := -0.145023
								if( Raw_Money_Flow > 8.67576e+06 )
									ret := 0.833333 // buy
							if( MFI > 67.4278 )
								if( ema2 <= 49.9133 )
									ret := -0.863636 // sell
								if( ema2 > 49.9133 )
									ret := -0.090909
					if( Positive_Money_Flow_Sum > 1.3347e+07 )
						if( Negative_Money_Flow_Sum <= 1.72219e+08 )
							if( MFI <= 77.3764 )
								if( ema12 <= 2.99398 )
									ret := 0.005632
								if( ema12 > 2.99398 )
									ret := 0.967742 // buy
							if( MFI > 77.3764 )
								if( MFI_High <= 4.27636 )
									ret := -0.118750
								if( MFI_High > 4.27636 )
									ret := -0.358974
						if( Negative_Money_Flow_Sum > 1.72219e+08 )
							if( ema12 <= -0.514794 )
								if( ema2 <= 176.342 )
									ret := -0.240000
								if( ema2 > 176.342 )
									ret := 0.355372
							if( ema12 > -0.514794 )
								if( Positive_Money_Flow_Sum <= 1.19743e+08 )
									ret := 0.172414
								if( Positive_Money_Flow_Sum > 1.19743e+08 )
									ret := -0.651042
	
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
float op_operation = decision_tree_0_SOLUSDT_15Min_e9ef3b38(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)

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


