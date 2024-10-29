//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: SHOP_1Min_2MV0_edd75f56 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Min_2MV0_edd75f56", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Min_edd75f56(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIP <= 5.00694 )
		if( Negative_Money_Flow <= 2.67631 )
			if( Positive_Money_Flow_Sum <= 1.94496e+06 )
				if( MFI <= 37.8086 )
					if( Raw_Money_Flow <= 1.54982e+06 )
						if( VIP <= 3.40548 )
							if( Positive_Money_Flow <= 1.1558e+06 )
								if( Positive_Money_Flow_Sum <= 1.44306e+06 )
									ret := -0.101720
								if( Positive_Money_Flow_Sum > 1.44306e+06 )
									ret := -0.291096
							if( Positive_Money_Flow > 1.1558e+06 )
								if( VIM <= 1.60406 )
									ret := -0.555556
								if( VIM > 1.60406 )
									ret := -0.850000 // sell
						if( VIP > 3.40548 )
							if( MFI <= 25.6744 )
								if( Positive_Money_Flow <= 36.2998 )
									ret := 0.333333
								if( Positive_Money_Flow > 36.2998 )
									ret := -0.155556
							if( MFI > 25.6744 )
								if( MFI_High <= -53.4905 )
									ret := 0.812500 // buy
								if( MFI_High > -53.4905 )
									ret := 0.258503
					if( Raw_Money_Flow > 1.54982e+06 )
						ret := 1.000000 // buy
				if( MFI > 37.8086 )
					if( Raw_Money_Flow <= 192142 )
						if( Typical_Price <= 71.9597 )
							if( Positive_Money_Flow_Sum <= 467717 )
								if( Positive_Money_Flow_Sum <= 138445 )
									ret := 0.755556 // buy
								if( Positive_Money_Flow_Sum > 138445 )
									ret := -0.101584
							if( Positive_Money_Flow_Sum > 467717 )
								if( VIP_VIM <= 0.036565 )
									ret := -0.194379
								if( VIP_VIM > 0.036565 )
									ret := -0.465574
						if( Typical_Price > 71.9597 )
							if( MFI_High <= -41.2284 )
								ret := 0.062500
							if( MFI_High > -41.2284 )
								if( MFI_Low <= 22.4777 )
									ret := -0.829787 // sell
								if( MFI_Low > 22.4777 )
									ret := -0.486141
					if( Raw_Money_Flow > 192142 )
						if( Positive_Money_Flow <= 1.08447e+06 )
							if( Positive_Money_Flow_Sum <= 745864 )
								if( Positive_Money_Flow <= 383221 )
									ret := -0.329193
								if( Positive_Money_Flow > 383221 )
									ret := 0.800000 // buy
							if( Positive_Money_Flow_Sum > 745864 )
								if( Negative_Money_Flow_Sum <= 1.0452e+06 )
									ret := 0.257353
								if( Negative_Money_Flow_Sum > 1.0452e+06 )
									ret := -0.101351
						if( Positive_Money_Flow > 1.08447e+06 )
							if( Typical_Price <= 65.9627 )
								if( MFI_Low <= 48.5596 )
									ret := -0.692308
								if( MFI_Low > 48.5596 )
									ret := -0.968750 // sell
							if( Typical_Price > 65.9627 )
								ret := 0.041667
			if( Positive_Money_Flow_Sum > 1.94496e+06 )
				if( Negative_Money_Flow_Sum <= 3.52676e+07 )
					if( Positive_Money_Flow <= 3.45684e+06 )
						if( VIP_VIM <= 0.771185 )
							if( MFI_Low <= 65.3125 )
								if( MFI_High <= -21.6513 )
									ret := 0.015980
								if( MFI_High > -21.6513 )
									ret := -0.041055
							if( MFI_Low > 65.3125 )
								if( MFI_High <= 10.2661 )
									ret := -0.298535
								if( MFI_High > 10.2661 )
									ret := -0.101928
						if( VIP_VIM > 0.771185 )
							if( Positive_Money_Flow_Sum <= 2.71133e+07 )
								if( VIP_VIM <= 1.3491 )
									ret := 0.182704
								if( VIP_VIM > 1.3491 )
									ret := 0.818182 // buy
							if( Positive_Money_Flow_Sum > 2.71133e+07 )
								if( Negative_Money_Flow_Sum <= 1.00551e+06 )
									ret := -0.560000
								if( Negative_Money_Flow_Sum > 1.00551e+06 )
									ret := -0.180000
					if( Positive_Money_Flow > 3.45684e+06 )
						if( MFI_High <= -32.5335 )
							if( VIP <= 0.882107 )
								if( VIP_VIM <= -0.263253 )
									ret := -0.061947
								if( VIP_VIM > -0.263253 )
									ret := -0.688889
							if( VIP > 0.882107 )
								if( Positive_Money_Flow_Sum <= 8.81957e+06 )
									ret := -0.761905 // sell
								if( Positive_Money_Flow_Sum > 8.81957e+06 )
									ret := 0.277487
						if( MFI_High > -32.5335 )
							if( MFI_Low <= 37.0448 )
								if( Negative_Money_Flow_Sum <= 1.03837e+07 )
									ret := 0.171429
								if( Negative_Money_Flow_Sum > 1.03837e+07 )
									ret := -0.415842
							if( MFI_Low > 37.0448 )
								if( Typical_Price <= 65.4004 )
									ret := -0.221681
								if( Typical_Price > 65.4004 )
									ret := -0.114061
				if( Negative_Money_Flow_Sum > 3.52676e+07 )
					if( Positive_Money_Flow <= 2.8575e+07 )
						if( Money_Flow_Ratio <= 0.627315 )
							if( MFI <= 38.1228 )
								if( Negative_Money_Flow_Sum <= 5.36554e+07 )
									ret := -0.104623
								if( Negative_Money_Flow_Sum > 5.36554e+07 )
									ret := -0.541463
							if( MFI > 38.1228 )
								ret := 0.625000
						if( Money_Flow_Ratio > 0.627315 )
							if( Money_Flow_Ratio <= 0.730366 )
								if( VIP_VIM <= -0.245193 )
									ret := -0.870968 // sell
								if( VIP_VIM > -0.245193 )
									ret := -0.605769
							if( Money_Flow_Ratio > 0.730366 )
								if( MFI_Low <= 23.0694 )
									ret := 0.100000
								if( MFI_Low > 23.0694 )
									ret := -0.386792
					if( Positive_Money_Flow > 2.8575e+07 )
						if( VIP <= 1.22348 )
							if( Typical_Price <= 66.8102 )
								ret := 0.904762 // buy
							if( Typical_Price > 66.8102 )
								ret := 0.444444
						if( VIP > 1.22348 )
							ret := -0.916667 // sell
		if( Negative_Money_Flow > 2.67631 )
			if( Negative_Money_Flow <= 91040.5 )
				if( Money_Flow_Ratio <= 2.24948 )
					if( Positive_Money_Flow <= 430.785 )
						if( MFI_Low <= 1.14176 )
							if( VIP <= 1.20574 )
								if( Negative_Money_Flow <= 84405.8 )
									ret := 0.059701
								if( Negative_Money_Flow > 84405.8 )
									ret := 0.785714 // buy
							if( VIP > 1.20574 )
								if( MFI_High <= -65.9346 )
									ret := 0.299035
								if( MFI_High > -65.9346 )
									ret := 0.695312
						if( MFI_Low > 1.14176 )
							if( Positive_Money_Flow_Sum <= 617496 )
								if( VIM <= 1.86981 )
									ret := -0.117486
								if( VIM > 1.86981 )
									ret := 0.195565
							if( Positive_Money_Flow_Sum > 617496 )
								if( Typical_Price <= 72.474 )
									ret := 0.426288
								if( Typical_Price > 72.474 )
									ret := 0.093333
					if( Positive_Money_Flow > 430.785 )
						if( Negative_Money_Flow_Sum <= 2.58091e+06 )
							if( Positive_Money_Flow <= 26189.8 )
								if( VIP_VIM <= -0.253126 )
									ret := -0.028249
								if( VIP_VIM > -0.253126 )
									ret := -0.382716
							if( Positive_Money_Flow > 26189.8 )
								if( MFI <= 13.12 )
									ret := -0.833333 // sell
								if( MFI > 13.12 )
									ret := 0.256757
						if( Negative_Money_Flow_Sum > 2.58091e+06 )
							if( MFI <= 60.8367 )
								if( Negative_Money_Flow_Sum <= 4.04825e+07 )
									ret := 0.533333
								if( Negative_Money_Flow_Sum > 4.04825e+07 )
									ret := -0.095238
							if( MFI > 60.8367 )
								if( Positive_Money_Flow_Sum <= 4.47198e+07 )
									ret := -0.560976
								if( Positive_Money_Flow_Sum > 4.47198e+07 )
									ret := 0.833333 // buy
				if( Money_Flow_Ratio > 2.24948 )
					if( VIP_VIM <= 0.069759 )
						if( MFI_Low <= 60.6385 )
							if( MFI_High <= -0.667839 )
								if( Negative_Money_Flow_Sum <= 1.51352e+07 )
									ret := 0.360656
								if( Negative_Money_Flow_Sum > 1.51352e+07 )
									ret := -0.750000 // sell
							if( MFI_High > -0.667839 )
								ret := 0.913043 // buy
						if( MFI_Low > 60.6385 )
							if( MFI_High <= 10.46 )
								if( Typical_Price <= 71.117 )
									ret := 0.000000
								if( Typical_Price > 71.117 )
									ret := -0.583333
							if( MFI_High > 10.46 )
								if( Negative_Money_Flow_Sum <= 308462 )
									ret := 0.068966
								if( Negative_Money_Flow_Sum > 308462 )
									ret := 0.500000
					if( VIP_VIM > 0.069759 )
						if( Money_Flow_Ratio <= 2.29834 )
							if( VIP <= 2.66273 )
								ret := -0.312500
							if( VIP > 2.66273 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 2.29834 )
							if( Negative_Money_Flow_Sum <= 8.77943e+06 )
								if( MFI <= 74.801 )
									ret := -0.239796
								if( MFI > 74.801 )
									ret := 0.042386
							if( Negative_Money_Flow_Sum > 8.77943e+06 )
								if( Negative_Money_Flow_Sum <= 1.83991e+07 )
									ret := -0.337662
								if( Negative_Money_Flow_Sum > 1.83991e+07 )
									ret := -0.920000 // sell
			if( Negative_Money_Flow > 91040.5 )
				if( VIP_VIM <= -1.13559 )
					if( Raw_Money_Flow <= 139888 )
						if( VIP <= 2.20126 )
							ret := 0.666667
						if( VIP > 2.20126 )
							ret := 1.000000 // buy
					if( Raw_Money_Flow > 139888 )
						if( VIM <= 2.24309 )
							if( Raw_Money_Flow <= 405217 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 405217 )
								if( VIM <= 1.57753 )
									ret := 0.307692
								if( VIM > 1.57753 )
									ret := 0.722222 // buy
						if( VIM > 2.24309 )
							if( VIP <= 1.29852 )
								ret := -0.571429
							if( VIP > 1.29852 )
								if( MFI_High <= -58.7238 )
									ret := 0.187500
								if( MFI_High > -58.7238 )
									ret := 0.866667 // buy
				if( VIP_VIM > -1.13559 )
					if( Typical_Price <= 59.6403 )
						if( Typical_Price <= 52.2314 )
							if( Positive_Money_Flow_Sum <= 2.81576e+07 )
								if( Negative_Money_Flow_Sum <= 1.42408e+06 )
									ret := -0.466667
								if( Negative_Money_Flow_Sum > 1.42408e+06 )
									ret := 0.835616 // buy
							if( Positive_Money_Flow_Sum > 2.81576e+07 )
								ret := -0.272727
						if( Typical_Price > 52.2314 )
							if( VIM <= 0.717682 )
								if( VIP_VIM <= 0.650401 )
									ret := -0.566038
								if( VIP_VIM > 0.650401 )
									ret := -0.046512
							if( VIM > 0.717682 )
								if( Money_Flow_Ratio <= 4.29925 )
									ret := 0.106843
								if( Money_Flow_Ratio > 4.29925 )
									ret := -0.287356
					if( Typical_Price > 59.6403 )
						if( Negative_Money_Flow <= 1.37153e+06 )
							if( MFI_Low <= -13.7624 )
								if( VIP <= 1.56404 )
									ret := 0.435897
								if( VIP > 1.56404 )
									ret := 0.894737 // buy
							if( MFI_Low > -13.7624 )
								if( Raw_Money_Flow <= 139188 )
									ret := -0.172956
								if( Raw_Money_Flow > 139188 )
									ret := 0.015559
						if( Negative_Money_Flow > 1.37153e+06 )
							if( Money_Flow_Ratio <= 0.396968 )
								if( Positive_Money_Flow_Sum <= 2.47539e+07 )
									ret := -0.178761
								if( Positive_Money_Flow_Sum > 2.47539e+07 )
									ret := 0.666667
							if( Money_Flow_Ratio > 0.396968 )
								if( MFI_Low <= 9.85212 )
									ret := 0.253394
								if( MFI_Low > 9.85212 )
									ret := -0.012407
	if( VIP > 5.00694 )
		if( Positive_Money_Flow <= 267.953 )
			if( MFI <= 22.8309 )
				if( Negative_Money_Flow_Sum <= 248393 )
					if( Typical_Price <= 62.3016 )
						if( Positive_Money_Flow_Sum <= 56158.9 )
							ret := -0.100000
						if( Positive_Money_Flow_Sum > 56158.9 )
							ret := -0.700000 // sell
					if( Typical_Price > 62.3016 )
						ret := 0.200000
				if( Negative_Money_Flow_Sum > 248393 )
					if( MFI_Low <= -1.28997 )
						if( Negative_Money_Flow <= 297.105 )
							if( Negative_Money_Flow_Sum <= 388691 )
								ret := 0.428571
							if( Negative_Money_Flow_Sum > 388691 )
								if( MFI_Low <= -5.44426 )
									ret := -0.095238
								if( MFI_Low > -5.44426 )
									ret := 0.200000
						if( Negative_Money_Flow > 297.105 )
							if( Typical_Price <= 62.7523 )
								if( MFI <= 17.7677 )
									ret := 0.815217 // buy
								if( MFI > 17.7677 )
									ret := 0.181818
							if( Typical_Price > 62.7523 )
								if( Negative_Money_Flow <= 31463.4 )
									ret := 0.588785
								if( Negative_Money_Flow > 31463.4 )
									ret := 0.000000
					if( MFI_Low > -1.28997 )
						if( Negative_Money_Flow <= 16926.8 )
							if( Money_Flow_Ratio <= 0.250199 )
								ret := 0.705882 // buy
							if( Money_Flow_Ratio > 0.250199 )
								ret := 0.062500
						if( Negative_Money_Flow > 16926.8 )
							if( Typical_Price <= 64.0912 )
								if( Negative_Money_Flow_Sum <= 578823 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 578823 )
									ret := 0.846154 // buy
							if( Typical_Price > 64.0912 )
								if( Typical_Price <= 69.9896 )
									ret := 0.555556
								if( Typical_Price > 69.9896 )
									ret := 0.911765 // buy
			if( MFI > 22.8309 )
				if( VIM <= 19.3183 )
					if( VIP_VIM <= 0.806867 )
						if( Positive_Money_Flow_Sum <= 598323 )
							if( Raw_Money_Flow <= 42190.2 )
								if( VIP_VIM <= -1.32883 )
									ret := -0.177419
								if( VIP_VIM > -1.32883 )
									ret := 0.420051
							if( Raw_Money_Flow > 42190.2 )
								if( MFI <= 47.6696 )
									ret := 0.128906
								if( MFI > 47.6696 )
									ret := -0.266667
						if( Positive_Money_Flow_Sum > 598323 )
							if( Raw_Money_Flow <= 15045.7 )
								if( VIM <= 7.32058 )
									ret := -0.437500
								if( VIM > 7.32058 )
									ret := 0.294118
							if( Raw_Money_Flow > 15045.7 )
								if( VIP_VIM <= -0.525658 )
									ret := 0.473684
								if( VIP_VIM > -0.525658 )
									ret := 0.756410 // buy
					if( VIP_VIM > 0.806867 )
						if( MFI <= 48.4228 )
							if( Raw_Money_Flow <= 16513.6 )
								ret := 0.647059
							if( Raw_Money_Flow > 16513.6 )
								if( MFI_Low <= 12.6743 )
									ret := -0.916667 // sell
								if( MFI_Low > 12.6743 )
									ret := -0.575758
						if( MFI > 48.4228 )
							if( MFI_High <= -29.1177 )
								ret := 0.772727 // buy
							if( MFI_High > -29.1177 )
								if( Money_Flow_Ratio <= 1.17828 )
									ret := -0.529412
								if( Money_Flow_Ratio > 1.17828 )
									ret := 0.222727
				if( VIM > 19.3183 )
					if( Negative_Money_Flow <= 48693.2 )
						if( VIP <= 46.0844 )
							if( Typical_Price <= 73.1781 )
								if( Positive_Money_Flow_Sum <= 104597 )
									ret := 0.423077
								if( Positive_Money_Flow_Sum > 104597 )
									ret := 0.722433 // buy
							if( Typical_Price > 73.1781 )
								if( MFI <= 55.6708 )
									ret := 0.608696
								if( MFI > 55.6708 )
									ret := 0.070175
						if( VIP > 46.0844 )
							if( MFI_Low <= 15.11 )
								if( VIP_VIM <= 0.045868 )
									ret := 0.000000
								if( VIP_VIM > 0.045868 )
									ret := 0.945946 // buy
							if( MFI_Low > 15.11 )
								if( Positive_Money_Flow_Sum <= 125932 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 125932 )
									ret := 0.285714
					if( Negative_Money_Flow > 48693.2 )
						if( VIP <= 36.8917 )
							if( VIP <= 21.1312 )
								ret := -0.222222
							if( VIP > 21.1312 )
								if( VIP <= 28.8709 )
									ret := 0.818182 // buy
								if( VIP > 28.8709 )
									ret := 0.538462
						if( VIP > 36.8917 )
							if( Negative_Money_Flow_Sum <= 206631 )
								ret := -0.652174
							if( Negative_Money_Flow_Sum > 206631 )
								if( MFI_Low <= 11.1532 )
									ret := -0.444444
								if( MFI_Low > 11.1532 )
									ret := 0.416667
		if( Positive_Money_Flow > 267.953 )
			if( Positive_Money_Flow_Sum <= 2.10329e+06 )
				if( Negative_Money_Flow_Sum <= 272694 )
					if( Typical_Price <= 55.7273 )
						if( MFI_Low <= 53.0873 )
							ret := -0.500000
						if( MFI_Low > 53.0873 )
							ret := -1.000000 // sell
					if( Typical_Price > 55.7273 )
						if( Raw_Money_Flow <= 17952.2 )
							if( MFI <= 55.6162 )
								if( Positive_Money_Flow <= 4781.9 )
									ret := 0.621622
								if( Positive_Money_Flow > 4781.9 )
									ret := -0.168831
							if( MFI > 55.6162 )
								if( MFI_Low <= 66.3944 )
									ret := -0.452436
								if( MFI_Low > 66.3944 )
									ret := 0.279070
						if( Raw_Money_Flow > 17952.2 )
							if( Positive_Money_Flow <= 244037 )
								if( Positive_Money_Flow <= 144016 )
									ret := -0.036597
								if( Positive_Money_Flow > 144016 )
									ret := -0.723404 // sell
							if( Positive_Money_Flow > 244037 )
								if( Negative_Money_Flow_Sum <= 167279 )
									ret := 0.259259
								if( Negative_Money_Flow_Sum > 167279 )
									ret := 0.928571 // buy
				if( Negative_Money_Flow_Sum > 272694 )
					if( VIM <= 6.78783 )
						if( MFI_Low <= -11.6583 )
							ret := -0.750000 // sell
						if( MFI_Low > -11.6583 )
							if( MFI <= 70.1829 )
								if( MFI <= 60.7557 )
									ret := -0.068293
								if( MFI > 60.7557 )
									ret := -1.000000 // sell
							if( MFI > 70.1829 )
								ret := 0.538462
					if( VIM > 6.78783 )
						if( MFI_High <= -61.5089 )
							if( Negative_Money_Flow <= 18.664 )
								if( Positive_Money_Flow <= 22920.5 )
									ret := -0.398374
								if( Positive_Money_Flow > 22920.5 )
									ret := 0.357143
							if( Negative_Money_Flow > 18.664 )
								if( Positive_Money_Flow <= 5775.96 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 5775.96 )
									ret := 0.714286 // buy
						if( MFI_High > -61.5089 )
							if( VIP <= 39.9237 )
								if( VIP_VIM <= -2.33067 )
									ret := -0.933333 // sell
								if( VIP_VIM > -2.33067 )
									ret := 0.415049
							if( VIP > 39.9237 )
								if( Negative_Money_Flow_Sum <= 304893 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 304893 )
									ret := 0.137931
			if( Positive_Money_Flow_Sum > 2.10329e+06 )
				if( MFI_Low <= 76.1494 )
					if( MFI_Low <= 72.6459 )
						if( VIM <= 14.8914 )
							ret := 0.416667
						if( VIM > 14.8914 )
							if( MFI <= 81.6229 )
								ret := 1.000000 // buy
							if( MFI > 81.6229 )
								ret := 0.833333 // buy
					if( MFI_Low > 72.6459 )
						ret := 1.000000 // buy
				if( MFI_Low > 76.1494 )
					if( VIM <= 15.7367 )
						if( Positive_Money_Flow_Sum <= 2.22479e+07 )
							if( MFI <= 98.0139 )
								ret := -0.888889 // sell
							if( MFI > 98.0139 )
								ret := -0.700000 // sell
						if( Positive_Money_Flow_Sum > 2.22479e+07 )
							ret := 0.055556
					if( VIM > 15.7367 )
						ret := 0.615385
	
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
float op_operation = decision_tree_0_SHOP_1Min_edd75f56(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)

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


