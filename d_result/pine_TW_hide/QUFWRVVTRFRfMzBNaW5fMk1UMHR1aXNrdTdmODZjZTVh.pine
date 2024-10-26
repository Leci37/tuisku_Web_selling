//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: AAVEUSDT_30Min_2MT0_7f86ce5a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_2MT0_7f86ce5a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_7f86ce5a(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema1 <= 85.0446 )
		if( Negative_Money_Flow <= 60499.1 )
			if( ema1 <= 49.1707 )
				if( Raw_Money_Flow <= 32239.2 )
					if( MFI_High <= -50.156 )
						if( Typical_Price <= 38.8095 )
							if( Negative_Money_Flow <= 25657.8 )
								if( Typical_Price <= 29.7937 )
									ret := 0.000000
								if( Typical_Price > 29.7937 )
									ret := -0.285714
							if( Negative_Money_Flow > 25657.8 )
								ret := -0.900000 // sell
						if( Typical_Price > 38.8095 )
							if( Typical_Price <= 42.1301 )
								ret := 0.700000 // buy
							if( Typical_Price > 42.1301 )
								ret := 1.000000 // buy
					if( MFI_High > -50.156 )
						if( Raw_Money_Flow <= 12437.9 )
							if( ema12 <= 0.086986 )
								if( Positive_Money_Flow <= 5493.34 )
									ret := -0.444444
								if( Positive_Money_Flow > 5493.34 )
									ret := 0.242424
							if( ema12 > 0.086986 )
								ret := 0.600000
						if( Raw_Money_Flow > 12437.9 )
							if( Positive_Money_Flow <= 14693.2 )
								if( MFI_Low <= 26.9555 )
									ret := -0.606838
								if( MFI_Low > 26.9555 )
									ret := -0.043478
							if( Positive_Money_Flow > 14693.2 )
								if( Positive_Money_Flow_Sum <= 702430 )
									ret := -0.710744 // sell
								if( Positive_Money_Flow_Sum > 702430 )
									ret := 0.571429
				if( Raw_Money_Flow > 32239.2 )
					if( Money_Flow_Ratio <= 4.95557 )
						if( Typical_Price <= 38.9942 )
							if( ema13 <= -0.530395 )
								if( ema12 <= -0.304603 )
									ret := 0.126437
								if( ema12 > -0.304603 )
									ret := -0.756757 // sell
							if( ema13 > -0.530395 )
								if( ema3 <= 38.1214 )
									ret := 0.244068
								if( ema3 > 38.1214 )
									ret := 0.840000 // buy
						if( Typical_Price > 38.9942 )
							if( Negative_Money_Flow <= 49039.9 )
								if( Negative_Money_Flow_Sum <= 642846 )
									ret := -0.441176
								if( Negative_Money_Flow_Sum > 642846 )
									ret := 0.054688
							if( Negative_Money_Flow > 49039.9 )
								if( MFI_Low <= 22.2911 )
									ret := 0.200000
								if( MFI_Low > 22.2911 )
									ret := 1.000000 // buy
					if( Money_Flow_Ratio > 4.95557 )
						if( ema1 <= 41.8696 )
							ret := -0.916667 // sell
						if( ema1 > 41.8696 )
							ret := -1.000000 // sell
			if( ema1 > 49.1707 )
				if( ema12 <= 1.16149 )
					if( MFI_High <= -39.5277 )
						if( MFI_Low <= 13.9152 )
							if( Raw_Money_Flow <= 844586 )
								if( Negative_Money_Flow_Sum <= 8.40237e+06 )
									ret := 0.027945
								if( Negative_Money_Flow_Sum > 8.40237e+06 )
									ret := -0.492754
							if( Raw_Money_Flow > 844586 )
								if( ema3 <= 65.426 )
									ret := 1.000000 // buy
								if( ema3 > 65.426 )
									ret := 0.054054
						if( MFI_Low > 13.9152 )
							if( Negative_Money_Flow_Sum <= 7.10112e+06 )
								if( Raw_Money_Flow <= 223719 )
									ret := -0.102308
								if( Raw_Money_Flow > 223719 )
									ret := -0.330000
							if( Negative_Money_Flow_Sum > 7.10112e+06 )
								if( Negative_Money_Flow_Sum <= 8.51682e+06 )
									ret := 0.673913
								if( Negative_Money_Flow_Sum > 8.51682e+06 )
									ret := -0.074074
					if( MFI_High > -39.5277 )
						if( Positive_Money_Flow <= 922592 )
							if( Raw_Money_Flow <= 75869.2 )
								if( ema13 <= 0.12172 )
									ret := -0.017084
								if( ema13 > 0.12172 )
									ret := 0.112580
							if( Raw_Money_Flow > 75869.2 )
								if( Money_Flow_Ratio <= 9.48054 )
									ret := 0.125947
								if( Money_Flow_Ratio > 9.48054 )
									ret := -0.228814
						if( Positive_Money_Flow > 922592 )
							if( Positive_Money_Flow_Sum <= 1.03575e+07 )
								if( Raw_Money_Flow <= 956298 )
									ret := -0.560976
								if( Raw_Money_Flow > 956298 )
									ret := -0.010593
							if( Positive_Money_Flow_Sum > 1.03575e+07 )
								if( MFI_Low <= 60.2262 )
									ret := -0.863636 // sell
								if( MFI_Low > 60.2262 )
									ret := -0.555556
				if( ema12 > 1.16149 )
					if( Typical_Price <= 85.683 )
						if( Negative_Money_Flow_Sum <= 1.32665e+06 )
							if( MFI_Low <= 71.004 )
								if( MFI_High <= 6.88644 )
									ret := -0.216216
								if( MFI_High > 6.88644 )
									ret := 0.658537
							if( MFI_Low > 71.004 )
								if( MFI_High <= 15.801 )
									ret := -0.395349
								if( MFI_High > 15.801 )
									ret := 0.777778 // buy
						if( Negative_Money_Flow_Sum > 1.32665e+06 )
							if( MFI <= 80.1883 )
								if( Negative_Money_Flow_Sum <= 7.16063e+06 )
									ret := -0.527473
								if( Negative_Money_Flow_Sum > 7.16063e+06 )
									ret := 0.458333
							if( MFI > 80.1883 )
								if( ema13 <= 4.00014 )
									ret := -0.882353 // sell
								if( ema13 > 4.00014 )
									ret := -0.400000
					if( Typical_Price > 85.683 )
						if( ema13 <= 2.74903 )
							if( Money_Flow_Ratio <= 2.81508 )
								ret := 0.300000
							if( Money_Flow_Ratio > 2.81508 )
								ret := 0.700000 // buy
						if( ema13 > 2.74903 )
							ret := -0.181818
		if( Negative_Money_Flow > 60499.1 )
			if( ema13 <= -1.12663 )
				if( tema <= 84.3213 )
					if( Positive_Money_Flow <= 83919.6 )
						if( MFI <= 20.2711 )
							if( ema2 <= 80.7732 )
								if( tema <= 75.7252 )
									ret := 0.094937
								if( tema > 75.7252 )
									ret := -0.418182
							if( ema2 > 80.7732 )
								if( ema12 <= -1.41746 )
									ret := 0.788462 // buy
								if( ema12 > -1.41746 )
									ret := 0.101449
						if( MFI > 20.2711 )
							if( Negative_Money_Flow <= 2.19944e+06 )
								if( Money_Flow_Ratio <= 0.333272 )
									ret := 0.588477
								if( Money_Flow_Ratio > 0.333272 )
									ret := 0.292359
							if( Negative_Money_Flow > 2.19944e+06 )
								if( Raw_Money_Flow <= 2.67195e+06 )
									ret := -0.300000
								if( Raw_Money_Flow > 2.67195e+06 )
									ret := -0.923077 // sell
					if( Positive_Money_Flow > 83919.6 )
						ret := -0.619048
				if( tema > 84.3213 )
					ret := -0.650000
			if( ema13 > -1.12663 )
				if( MFI_Low <= 54.368 )
					if( MFI_High <= -14.9297 )
						if( Positive_Money_Flow_Sum <= 2.37962e+06 )
							if( Negative_Money_Flow <= 401123 )
								if( ema2 <= 81.1075 )
									ret := 0.045193
								if( ema2 > 81.1075 )
									ret := 0.183071
							if( Negative_Money_Flow > 401123 )
								if( Negative_Money_Flow <= 619844 )
									ret := -0.299712
								if( Negative_Money_Flow > 619844 )
									ret := 0.030488
						if( Positive_Money_Flow_Sum > 2.37962e+06 )
							if( ema13 <= 1.79935 )
								if( tema <= 83.8867 )
									ret := 0.239173
								if( tema > 83.8867 )
									ret := -0.211382
							if( ema13 > 1.79935 )
								if( Raw_Money_Flow <= 1.25384e+06 )
									ret := -0.367347
								if( Raw_Money_Flow > 1.25384e+06 )
									ret := 0.944444 // buy
					if( MFI_High > -14.9297 )
						if( Negative_Money_Flow_Sum <= 1.34059e+06 )
							if( Typical_Price <= 72.8081 )
								if( Negative_Money_Flow <= 468016 )
									ret := 0.201465
								if( Negative_Money_Flow > 468016 )
									ret := 0.933333 // buy
							if( Typical_Price > 72.8081 )
								if( MFI <= 70.8902 )
									ret := -0.135135
								if( MFI > 70.8902 )
									ret := 0.189189
						if( Negative_Money_Flow_Sum > 1.34059e+06 )
							if( ema3 <= 61.4579 )
								if( Positive_Money_Flow_Sum <= 5.56654e+06 )
									ret := 0.153846
								if( Positive_Money_Flow_Sum > 5.56654e+06 )
									ret := 0.937500 // buy
							if( ema3 > 61.4579 )
								if( ema2 <= 72.6043 )
									ret := -0.162651
								if( ema2 > 72.6043 )
									ret := -0.450000
				if( MFI_Low > 54.368 )
					if( ema1 <= 37.422 )
						ret := 0.952381 // buy
					if( ema1 > 37.422 )
						if( ema13 <= 1.23088 )
							if( MFI_High <= -2.74143 )
								if( Positive_Money_Flow_Sum <= 4.87053e+06 )
									ret := 0.428571
								if( Positive_Money_Flow_Sum > 4.87053e+06 )
									ret := -0.307692
							if( MFI_High > -2.74143 )
								if( MFI <= 85.6074 )
									ret := -0.080986
								if( MFI > 85.6074 )
									ret := 0.369565
						if( ema13 > 1.23088 )
							if( ema12 <= 1.70205 )
								if( MFI <= 75.7815 )
									ret := 0.851852 // buy
								if( MFI > 75.7815 )
									ret := 0.425121
							if( ema12 > 1.70205 )
								if( ema12 <= 2.01463 )
									ret := -0.772727 // sell
								if( ema12 > 2.01463 )
									ret := -0.050000
	if( ema1 > 85.0446 )
		if( Positive_Money_Flow_Sum <= 6.80207e+07 )
			if( Negative_Money_Flow_Sum <= 2.70674e+07 )
				if( Raw_Money_Flow <= 618942 )
					if( ema1 <= 122.02 )
						if( MFI_Low <= 68.5295 )
							if( ema13 <= -0.246391 )
								if( Positive_Money_Flow_Sum <= 660261 )
									ret := -0.099350
								if( Positive_Money_Flow_Sum > 660261 )
									ret := 0.055461
							if( ema13 > -0.246391 )
								if( Positive_Money_Flow <= 487397 )
									ret := -0.030691
								if( Positive_Money_Flow > 487397 )
									ret := -0.228464
						if( MFI_Low > 68.5295 )
							if( MFI_Low <= 70.791 )
								if( ema3 <= 99.9019 )
									ret := 0.750000 // buy
								if( ema3 > 99.9019 )
									ret := 0.000000
							if( MFI_Low > 70.791 )
								if( ema3 <= 96.1635 )
									ret := -0.074074
								if( ema3 > 96.1635 )
									ret := 0.782609 // buy
					if( ema1 > 122.02 )
						if( ema12 <= 3.17892 )
							if( ema13 <= -0.113849 )
								if( Negative_Money_Flow_Sum <= 2.27173e+07 )
									ret := -0.031717
								if( Negative_Money_Flow_Sum > 2.27173e+07 )
									ret := -0.880000 // sell
							if( ema13 > -0.113849 )
								if( MFI_Low <= 64.1987 )
									ret := -0.129032
								if( MFI_Low > 64.1987 )
									ret := 0.284000
						if( ema12 > 3.17892 )
							if( Positive_Money_Flow_Sum <= 6.85892e+06 )
								ret := 0.142857
							if( Positive_Money_Flow_Sum > 6.85892e+06 )
								if( Money_Flow_Ratio <= 5.45039 )
									ret := -0.532468
								if( Money_Flow_Ratio > 5.45039 )
									ret := -0.797101 // sell
				if( Raw_Money_Flow > 618942 )
					if( ema12 <= 7.13817 )
						if( tema <= 381.712 )
							if( Positive_Money_Flow_Sum <= 2.1476e+07 )
								if( ema3 <= 120.956 )
									ret := -0.066757
								if( ema3 > 120.956 )
									ret := 0.047050
							if( Positive_Money_Flow_Sum > 2.1476e+07 )
								if( Money_Flow_Ratio <= 1.49642 )
									ret := -0.456897
								if( Money_Flow_Ratio > 1.49642 )
									ret := -0.146984
						if( tema > 381.712 )
							if( MFI_Low <= 33.3644 )
								if( ema12 <= -1.98633 )
									ret := -0.059978
								if( ema12 > -1.98633 )
									ret := -0.215164
							if( MFI_Low > 33.3644 )
								if( Negative_Money_Flow <= 3.0923e+06 )
									ret := -0.036388
								if( Negative_Money_Flow > 3.0923e+06 )
									ret := 0.298851
					if( ema12 > 7.13817 )
						if( ema1 <= 369.611 )
							if( Negative_Money_Flow_Sum <= 1.66025e+07 )
								if( Typical_Price <= 293.375 )
									ret := 0.826923 // buy
								if( Typical_Price > 293.375 )
									ret := 0.414508
							if( Negative_Money_Flow_Sum > 1.66025e+07 )
								if( ema2 <= 320.268 )
									ret := 0.730769 // buy
								if( ema2 > 320.268 )
									ret := 1.000000 // buy
						if( ema1 > 369.611 )
							if( MFI_Low <= 46.3055 )
								if( MFI_High <= -17.4895 )
									ret := 0.600000
								if( MFI_High > -17.4895 )
									ret := 0.960000 // buy
							if( MFI_Low > 46.3055 )
								if( Typical_Price <= 467.308 )
									ret := -0.112450
								if( Typical_Price > 467.308 )
									ret := 0.211382
			if( Negative_Money_Flow_Sum > 2.70674e+07 )
				if( Typical_Price <= 344.119 )
					if( ema3 <= 195.935 )
						ret := -0.666667
					if( ema3 > 195.935 )
						if( ema13 <= 3.37768 )
							if( Negative_Money_Flow_Sum <= 4.66533e+07 )
								if( Negative_Money_Flow_Sum <= 3.20355e+07 )
									ret := 0.335938
								if( Negative_Money_Flow_Sum > 3.20355e+07 )
									ret := 0.836134 // buy
							if( Negative_Money_Flow_Sum > 4.66533e+07 )
								if( tema <= 254.581 )
									ret := 1.000000 // buy
								if( tema > 254.581 )
									ret := -0.093023
						if( ema13 > 3.37768 )
							if( MFI <= 43.8227 )
								ret := 0.846154 // buy
							if( MFI > 43.8227 )
								if( ema3 <= 281.026 )
									ret := -0.777778 // sell
								if( ema3 > 281.026 )
									ret := 0.071429
				if( Typical_Price > 344.119 )
					if( Positive_Money_Flow <= 4.03251e+06 )
						if( ema12 <= -20.0392 )
							ret := 1.000000 // buy
						if( ema12 > -20.0392 )
							if( Negative_Money_Flow <= 1.10357e+06 )
								if( Positive_Money_Flow_Sum <= 1.55836e+07 )
									ret := -0.644928
								if( Positive_Money_Flow_Sum > 1.55836e+07 )
									ret := -0.080597
							if( Negative_Money_Flow > 1.10357e+06 )
								if( MFI <= 57.8617 )
									ret := 0.079275
								if( MFI > 57.8617 )
									ret := -0.805556 // sell
					if( Positive_Money_Flow > 4.03251e+06 )
						if( Raw_Money_Flow <= 8.7401e+06 )
							if( MFI_High <= -27.9805 )
								if( ema12 <= -12.5588 )
									ret := 0.975610 // buy
								if( ema12 > -12.5588 )
									ret := 0.294574
							if( MFI_High > -27.9805 )
								if( ema1 <= 425.086 )
									ret := 0.727273 // buy
								if( ema1 > 425.086 )
									ret := 0.978723 // buy
						if( Raw_Money_Flow > 8.7401e+06 )
							if( Typical_Price <= 532.788 )
								ret := 0.272727
							if( Typical_Price > 532.788 )
								if( ema3 <= 610.022 )
									ret := -1.000000 // sell
								if( ema3 > 610.022 )
									ret := -0.800000 // sell
		if( Positive_Money_Flow_Sum > 6.80207e+07 )
			if( Typical_Price <= 212.85 )
				ret := 0.933333 // buy
			if( Typical_Price > 212.85 )
				if( Raw_Money_Flow <= 8.55959e+06 )
					if( tema <= 614.552 )
						if( tema <= 420.157 )
							if( MFI_High <= -19.9846 )
								ret := -1.000000 // sell
							if( MFI_High > -19.9846 )
								if( MFI <= 89.3274 )
									ret := 0.185185
								if( MFI > 89.3274 )
									ret := -0.842105 // sell
						if( tema > 420.157 )
							if( ema12 <= -11.7967 )
								ret := -0.200000
							if( ema12 > -11.7967 )
								if( MFI_High <= -2.84456 )
									ret := -0.756757 // sell
								if( MFI_High > -2.84456 )
									ret := -0.983333 // sell
					if( tema > 614.552 )
						if( MFI_High <= -36.1273 )
							ret := 1.000000 // buy
						if( MFI_High > -36.1273 )
							if( ema13 <= 21.3941 )
								ret := -0.750000 // sell
							if( ema13 > 21.3941 )
								ret := 0.647059
				if( Raw_Money_Flow > 8.55959e+06 )
					if( Positive_Money_Flow <= 1.12829e+07 )
						if( ema1 <= 570.706 )
							if( tema <= 476.765 )
								if( Negative_Money_Flow_Sum <= 1.24068e+08 )
									ret := 0.461538
								if( Negative_Money_Flow_Sum > 1.24068e+08 )
									ret := -1.000000 // sell
							if( tema > 476.765 )
								if( Positive_Money_Flow_Sum <= 1.30004e+08 )
									ret := 0.538462
								if( Positive_Money_Flow_Sum > 1.30004e+08 )
									ret := 1.000000 // buy
						if( ema1 > 570.706 )
							if( Negative_Money_Flow <= 9.02436e+06 )
								ret := 0.176471
							if( Negative_Money_Flow > 9.02436e+06 )
								if( ema12 <= -0.534891 )
									ret := -0.111111
								if( ema12 > -0.534891 )
									ret := -0.777778 // sell
					if( Positive_Money_Flow > 1.12829e+07 )
						if( ema13 <= 28.3478 )
							if( ema2 <= 417.794 )
								ret := -0.733333 // sell
							if( ema2 > 417.794 )
								if( ema12 <= 8.06745 )
									ret := -0.545455
								if( ema12 > 8.06745 )
									ret := 0.269231
						if( ema13 > 28.3478 )
							if( Positive_Money_Flow <= 2.08742e+07 )
								ret := -0.875000 // sell
							if( Positive_Money_Flow > 2.08742e+07 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AAVEUSDT_30Min_7f86ce5a(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


