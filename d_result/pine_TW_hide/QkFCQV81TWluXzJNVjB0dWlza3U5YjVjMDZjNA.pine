//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: BABA_5Min_2MV0_9b5c06c4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_5Min_2MV0_9b5c06c4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_5Min_9b5c06c4(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 1158.73 )
		if( Positive_Money_Flow_Sum <= 2.18453e+08 )
			if( Negative_Money_Flow_Sum <= 8.00897e+06 )
				if( VIM <= 0.994289 )
					if( VIP_VIM <= 0.390434 )
						if( Negative_Money_Flow_Sum <= 6.77174e+06 )
							if( MFI_High <= -41.7838 )
								if( Raw_Money_Flow <= 775528 )
									ret := 0.045455
								if( Raw_Money_Flow > 775528 )
									ret := 0.772727 // buy
							if( MFI_High > -41.7838 )
								if( VIP <= 1.0409 )
									ret := -0.220280
								if( VIP > 1.0409 )
									ret := -0.085261
						if( Negative_Money_Flow_Sum > 6.77174e+06 )
							if( VIM <= 0.864484 )
								if( VIP <= 0.963615 )
									ret := -0.684211
								if( VIP > 0.963615 )
									ret := 0.378378
							if( VIM > 0.864484 )
								if( VIP <= 1.22275 )
									ret := -0.495868
								if( VIP > 1.22275 )
									ret := 1.000000 // buy
					if( VIP_VIM > 0.390434 )
						if( Raw_Money_Flow <= 9.3363e+07 )
							if( MFI <= 85.8739 )
								if( Raw_Money_Flow <= 137246 )
									ret := -0.142487
								if( Raw_Money_Flow > 137246 )
									ret := 0.085575
							if( MFI > 85.8739 )
								if( Negative_Money_Flow_Sum <= 2.40119e+06 )
									ret := -0.231449
								if( Negative_Money_Flow_Sum > 2.40119e+06 )
									ret := 0.104603
						if( Raw_Money_Flow > 9.3363e+07 )
							ret := 1.000000 // buy
				if( VIM > 0.994289 )
					if( Money_Flow_Ratio <= 0.646313 )
						if( VIP <= 1.52014 )
							if( MFI_Low <= 15.7584 )
								if( Typical_Price <= 84.3633 )
									ret := 0.067548
								if( Typical_Price > 84.3633 )
									ret := -0.070278
							if( MFI_Low > 15.7584 )
								if( Typical_Price <= 97.3433 )
									ret := -0.219858
								if( Typical_Price > 97.3433 )
									ret := 0.450000
						if( VIP > 1.52014 )
							if( Positive_Money_Flow_Sum <= 3.00378e+06 )
								if( VIP_VIM <= 0.245661 )
									ret := -0.229299
								if( VIP_VIM > 0.245661 )
									ret := 0.093750
							if( Positive_Money_Flow_Sum > 3.00378e+06 )
								if( MFI_High <= -43.4793 )
									ret := -1.000000 // sell
								if( MFI_High > -43.4793 )
									ret := -0.750000 // sell
					if( Money_Flow_Ratio > 0.646313 )
						if( MFI_High <= -17.6875 )
							if( Positive_Money_Flow <= 14061.6 )
								if( Positive_Money_Flow_Sum <= 620077 )
									ret := 0.073529
								if( Positive_Money_Flow_Sum > 620077 )
									ret := -0.190661
							if( Positive_Money_Flow > 14061.6 )
								if( Positive_Money_Flow <= 1.29833e+06 )
									ret := 0.091801
								if( Positive_Money_Flow > 1.29833e+06 )
									ret := -0.215517
						if( MFI_High > -17.6875 )
							if( Money_Flow_Ratio <= 2.57005 )
								if( Positive_Money_Flow_Sum <= 1.34599e+07 )
									ret := -0.114654
								if( Positive_Money_Flow_Sum > 1.34599e+07 )
									ret := 0.600000
							if( Money_Flow_Ratio > 2.57005 )
								if( Positive_Money_Flow <= 1.4004e+07 )
									ret := 0.038406
								if( Positive_Money_Flow > 1.4004e+07 )
									ret := -0.400000
			if( Negative_Money_Flow_Sum > 8.00897e+06 )
				if( Typical_Price <= 110.17 )
					if( Negative_Money_Flow_Sum <= 1.28447e+07 )
						if( Negative_Money_Flow_Sum <= 1.24369e+07 )
							if( MFI_Low <= 11.7002 )
								if( Raw_Money_Flow <= 906442 )
									ret := -0.197861
								if( Raw_Money_Flow > 906442 )
									ret := 0.280000
							if( MFI_Low > 11.7002 )
								if( VIM <= 0.591132 )
									ret := -0.500000
								if( VIM > 0.591132 )
									ret := 0.184041
						if( Negative_Money_Flow_Sum > 1.24369e+07 )
							if( Typical_Price <= 94.0194 )
								if( Positive_Money_Flow_Sum <= 3.2321e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 3.2321e+06 )
									ret := 0.788462 // buy
							if( Typical_Price > 94.0194 )
								ret := -0.500000
					if( Negative_Money_Flow_Sum > 1.28447e+07 )
						if( Positive_Money_Flow <= 2.42261e+06 )
							if( VIM <= 0.648797 )
								if( Raw_Money_Flow <= 465158 )
									ret := 0.166667
								if( Raw_Money_Flow > 465158 )
									ret := 0.909091 // buy
							if( VIM > 0.648797 )
								if( VIP_VIM <= -0.611025 )
									ret := 0.165354
								if( VIP_VIM > -0.611025 )
									ret := -0.054274
						if( Positive_Money_Flow > 2.42261e+06 )
							if( MFI <= 11.381 )
								if( Negative_Money_Flow_Sum <= 3.48534e+08 )
									ret := -0.675000
								if( Negative_Money_Flow_Sum > 3.48534e+08 )
									ret := 0.300000
							if( MFI > 11.381 )
								if( MFI_High <= -29.0833 )
									ret := 0.063171
								if( MFI_High > -29.0833 )
									ret := 0.003301
				if( Typical_Price > 110.17 )
					if( Money_Flow_Ratio <= 1.15265 )
						if( Positive_Money_Flow_Sum <= 1.49237e+08 )
							if( Negative_Money_Flow_Sum <= 1.01749e+07 )
								if( VIP <= 0.956059 )
									ret := 0.000000
								if( VIP > 0.956059 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.01749e+07 )
								if( VIP <= 0.802011 )
									ret := 0.666667
								if( VIP > 0.802011 )
									ret := -0.274194
						if( Positive_Money_Flow_Sum > 1.49237e+08 )
							if( VIP_VIM <= 0.022622 )
								if( VIM <= 1.04755 )
									ret := 1.000000 // buy
								if( VIM > 1.04755 )
									ret := 0.250000
							if( VIP_VIM > 0.022622 )
								ret := -0.200000
					if( Money_Flow_Ratio > 1.15265 )
						if( VIM <= 0.900471 )
							if( Positive_Money_Flow_Sum <= 2.88834e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 2.88834e+07 )
								if( Raw_Money_Flow <= 7.5628e+06 )
									ret := -0.800000 // sell
								if( Raw_Money_Flow > 7.5628e+06 )
									ret := 0.071429
						if( VIM > 0.900471 )
							if( Money_Flow_Ratio <= 4.05584 )
								if( VIM <= 0.908476 )
									ret := -0.500000
								if( VIM > 0.908476 )
									ret := -0.924528 // sell
							if( Money_Flow_Ratio > 4.05584 )
								if( Raw_Money_Flow <= 5.04685e+06 )
									ret := 0.166667
								if( Raw_Money_Flow > 5.04685e+06 )
									ret := -0.800000 // sell
		if( Positive_Money_Flow_Sum > 2.18453e+08 )
			if( VIP_VIM <= 0.132626 )
				if( Typical_Price <= 113.866 )
					if( Positive_Money_Flow <= 1.45327e+07 )
						if( Negative_Money_Flow_Sum <= 2.37721e+08 )
							if( Money_Flow_Ratio <= 1.07045 )
								if( VIP_VIM <= -0.044159 )
									ret := 0.750000 // buy
								if( VIP_VIM > -0.044159 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 1.07045 )
								if( VIP <= 0.939753 )
									ret := 0.333333
								if( VIP > 0.939753 )
									ret := -0.318182
						if( Negative_Money_Flow_Sum > 2.37721e+08 )
							if( Positive_Money_Flow <= 8.06709e+06 )
								ret := -0.500000
							if( Positive_Money_Flow > 8.06709e+06 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow > 1.45327e+07 )
						if( Negative_Money_Flow_Sum <= 2.07343e+08 )
							if( Positive_Money_Flow_Sum <= 2.50445e+08 )
								if( MFI_High <= -14.5048 )
									ret := 0.518987
								if( MFI_High > -14.5048 )
									ret := -0.268293
							if( Positive_Money_Flow_Sum > 2.50445e+08 )
								if( Typical_Price <= 73.5886 )
									ret := 0.000000
								if( Typical_Price > 73.5886 )
									ret := 0.711538 // buy
						if( Negative_Money_Flow_Sum > 2.07343e+08 )
							if( MFI <= 64.3298 )
								if( VIM <= 0.940219 )
									ret := -0.850000 // sell
								if( VIM > 0.940219 )
									ret := 0.283630
							if( MFI > 64.3298 )
								if( Negative_Money_Flow_Sum <= 2.94042e+08 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 2.94042e+08 )
									ret := -1.000000 // sell
				if( Typical_Price > 113.866 )
					if( Negative_Money_Flow_Sum <= 6.93549e+08 )
						if( MFI <= 49.1346 )
							if( VIM <= 1.06937 )
								ret := -0.750000 // sell
							if( VIM > 1.06937 )
								ret := 0.333333
						if( MFI > 49.1346 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 6.93549e+08 )
						ret := -1.000000 // sell
			if( VIP_VIM > 0.132626 )
				if( MFI <= 67.4271 )
					if( Positive_Money_Flow_Sum <= 3.1078e+08 )
						if( Negative_Money_Flow_Sum <= 2.31728e+08 )
							if( Raw_Money_Flow <= 1.93981e+07 )
								if( Positive_Money_Flow_Sum <= 2.70981e+08 )
									ret := -0.168675
								if( Positive_Money_Flow_Sum > 2.70981e+08 )
									ret := 0.666667
							if( Raw_Money_Flow > 1.93981e+07 )
								if( Typical_Price <= 77.6264 )
									ret := 0.185185
								if( Typical_Price > 77.6264 )
									ret := -0.481203
						if( Negative_Money_Flow_Sum > 2.31728e+08 )
							if( VIP <= 1.11642 )
								if( Typical_Price <= 74.0833 )
									ret := -0.250000
								if( Typical_Price > 74.0833 )
									ret := -1.000000 // sell
							if( VIP > 1.11642 )
								ret := -0.250000
					if( Positive_Money_Flow_Sum > 3.1078e+08 )
						if( Positive_Money_Flow_Sum <= 4.3781e+08 )
							if( Negative_Money_Flow_Sum <= 2.0763e+08 )
								if( Negative_Money_Flow_Sum <= 1.88696e+08 )
									ret := 0.240741
								if( Negative_Money_Flow_Sum > 1.88696e+08 )
									ret := -0.640000
							if( Negative_Money_Flow_Sum > 2.0763e+08 )
								if( Negative_Money_Flow_Sum <= 2.47981e+08 )
									ret := 0.703125 // buy
								if( Negative_Money_Flow_Sum > 2.47981e+08 )
									ret := 0.075000
						if( Positive_Money_Flow_Sum > 4.3781e+08 )
							if( Money_Flow_Ratio <= 1.76659 )
								if( Positive_Money_Flow <= 4.21213e+07 )
									ret := 0.875000 // buy
								if( Positive_Money_Flow > 4.21213e+07 )
									ret := -0.333333
							if( Money_Flow_Ratio > 1.76659 )
								if( Raw_Money_Flow <= 2.27022e+07 )
									ret := 0.000000
								if( Raw_Money_Flow > 2.27022e+07 )
									ret := -0.837838 // sell
				if( MFI > 67.4271 )
					if( Positive_Money_Flow <= 6.93872e+07 )
						if( MFI_High <= -4.80469 )
							if( Positive_Money_Flow <= 1.28749e+07 )
								if( Raw_Money_Flow <= 9.72303e+06 )
									ret := -0.217391
								if( Raw_Money_Flow > 9.72303e+06 )
									ret := -0.800000 // sell
							if( Positive_Money_Flow > 1.28749e+07 )
								if( Raw_Money_Flow <= 2.72202e+07 )
									ret := 0.144531
								if( Raw_Money_Flow > 2.72202e+07 )
									ret := 0.396985
						if( MFI_High > -4.80469 )
							if( Positive_Money_Flow <= 2.98101e+07 )
								if( Positive_Money_Flow_Sum <= 3.39175e+08 )
									ret := 0.320755
								if( Positive_Money_Flow_Sum > 3.39175e+08 )
									ret := -0.254386
							if( Positive_Money_Flow > 2.98101e+07 )
								if( Positive_Money_Flow_Sum <= 6.2632e+08 )
									ret := -0.155779
								if( Positive_Money_Flow_Sum > 6.2632e+08 )
									ret := -0.903226 // sell
					if( Positive_Money_Flow > 6.93872e+07 )
						if( Positive_Money_Flow_Sum <= 9.49791e+08 )
							if( Typical_Price <= 107.412 )
								if( Positive_Money_Flow <= 3.44857e+08 )
									ret := 0.604878
								if( Positive_Money_Flow > 3.44857e+08 )
									ret := -1.000000 // sell
							if( Typical_Price > 107.412 )
								if( Positive_Money_Flow_Sum <= 6.19959e+08 )
									ret := 0.307692
								if( Positive_Money_Flow_Sum > 6.19959e+08 )
									ret := -0.666667
						if( Positive_Money_Flow_Sum > 9.49791e+08 )
							if( Negative_Money_Flow_Sum <= 7.0576e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 7.0576e+07 )
								if( VIP <= 1.33943 )
									ret := -0.400000
								if( VIP > 1.33943 )
									ret := -1.000000 // sell
	if( Negative_Money_Flow > 1158.73 )
		if( Money_Flow_Ratio <= 0.837818 )
			if( Positive_Money_Flow_Sum <= 241606 )
				if( VIM <= 1.94467 )
					if( MFI <= 0.130204 )
						if( MFI_Low <= -19.9875 )
							if( Negative_Money_Flow_Sum <= 6.81016e+06 )
								ret := -0.833333 // sell
							if( Negative_Money_Flow_Sum > 6.81016e+06 )
								ret := 0.200000
						if( MFI_Low > -19.9875 )
							ret := -1.000000 // sell
					if( MFI > 0.130204 )
						if( Typical_Price <= 76.1926 )
							if( Typical_Price <= 72.9083 )
								if( Negative_Money_Flow <= 121013 )
									ret := 0.210526
								if( Negative_Money_Flow > 121013 )
									ret := -0.600000
							if( Typical_Price > 72.9083 )
								if( VIM <= 1.58893 )
									ret := -0.222222
								if( VIM > 1.58893 )
									ret := -0.702128 // sell
						if( Typical_Price > 76.1926 )
							if( MFI_High <= -63.3985 )
								if( Money_Flow_Ratio <= 0.049978 )
									ret := -0.303030
								if( Money_Flow_Ratio > 0.049978 )
									ret := 0.384615
							if( MFI_High > -63.3985 )
								if( Typical_Price <= 78.9898 )
									ret := 0.500000
								if( Typical_Price > 78.9898 )
									ret := -0.617647
				if( VIM > 1.94467 )
					if( Negative_Money_Flow_Sum <= 286799 )
						if( MFI <= 34.6705 )
							ret := 0.200000
						if( MFI > 34.6705 )
							if( Raw_Money_Flow <= 21630.9 )
								ret := 0.500000
							if( Raw_Money_Flow > 21630.9 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 286799 )
						if( VIP <= 1.35407 )
							if( Negative_Money_Flow <= 107609 )
								if( VIP_VIM <= -0.844209 )
									ret := 0.625000
								if( VIP_VIM > -0.844209 )
									ret := -0.400000
							if( Negative_Money_Flow > 107609 )
								if( MFI_High <= -61.3106 )
									ret := -0.033333
								if( MFI_High > -61.3106 )
									ret := 0.750000 // buy
						if( VIP > 1.35407 )
							if( MFI_High <= -42.6355 )
								if( Positive_Money_Flow_Sum <= 153528 )
									ret := 0.193182
								if( Positive_Money_Flow_Sum > 153528 )
									ret := -0.289256
							if( MFI_High > -42.6355 )
								ret := -1.000000 // sell
			if( Positive_Money_Flow_Sum > 241606 )
				if( Money_Flow_Ratio <= 0.040741 )
					if( Money_Flow_Ratio <= 0.0124 )
						if( Negative_Money_Flow_Sum <= 3.59211e+07 )
							ret := 0.666667
						if( Negative_Money_Flow_Sum > 3.59211e+07 )
							if( Positive_Money_Flow <= 1507.32 )
								if( Negative_Money_Flow <= 2.75228e+07 )
									ret := -0.024096
								if( Negative_Money_Flow > 2.75228e+07 )
									ret := -0.500000
							if( Positive_Money_Flow > 1507.32 )
								ret := -1.000000 // sell
					if( Money_Flow_Ratio > 0.0124 )
						if( Positive_Money_Flow <= 733.575 )
							if( Negative_Money_Flow <= 192982 )
								if( Negative_Money_Flow_Sum <= 4.96415e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 4.96415e+07 )
									ret := 0.290909
							if( Negative_Money_Flow > 192982 )
								if( Negative_Money_Flow <= 2.16909e+07 )
									ret := 0.639175
								if( Negative_Money_Flow > 2.16909e+07 )
									ret := 0.352632
						if( Positive_Money_Flow > 733.575 )
							if( Positive_Money_Flow <= 368087 )
								if( Typical_Price <= 86.6871 )
									ret := 1.000000 // buy
								if( Typical_Price > 86.6871 )
									ret := 0.666667
							if( Positive_Money_Flow > 368087 )
								ret := 0.000000
				if( Money_Flow_Ratio > 0.040741 )
					if( Negative_Money_Flow_Sum <= 3.39833e+06 )
						if( MFI_High <= -57.9687 )
							if( Raw_Money_Flow <= 1.03053e+06 )
								if( VIM <= 1.96483 )
									ret := 0.398866
								if( VIM > 1.96483 )
									ret := 0.135514
							if( Raw_Money_Flow > 1.03053e+06 )
								if( VIP_VIM <= -0.641678 )
									ret := -0.714286 // sell
								if( VIP_VIM > -0.641678 )
									ret := 0.083333
						if( MFI_High > -57.9687 )
							if( Positive_Money_Flow <= 29614.9 )
								if( Negative_Money_Flow_Sum <= 2.92637e+06 )
									ret := 0.125838
								if( Negative_Money_Flow_Sum > 2.92637e+06 )
									ret := 0.348000
							if( Positive_Money_Flow > 29614.9 )
								if( VIM <= 2.30609 )
									ret := 0.547619
								if( VIM > 2.30609 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 3.39833e+06 )
						if( Negative_Money_Flow <= 2.36786e+07 )
							if( VIM <= 0.87606 )
								if( VIP_VIM <= 0.348736 )
									ret := 0.481752
								if( VIP_VIM > 0.348736 )
									ret := 0.074627
							if( VIM > 0.87606 )
								if( VIP <= 0.634227 )
									ret := -0.109694
								if( VIP > 0.634227 )
									ret := 0.084324
						if( Negative_Money_Flow > 2.36786e+07 )
							if( Typical_Price <= 114.723 )
								if( Money_Flow_Ratio <= 0.778418 )
									ret := 0.160714
								if( Money_Flow_Ratio > 0.778418 )
									ret := 0.531646
							if( Typical_Price > 114.723 )
								if( MFI_High <= -50.5958 )
									ret := 0.250000
								if( MFI_High > -50.5958 )
									ret := -0.909091 // sell
		if( Money_Flow_Ratio > 0.837818 )
			if( Positive_Money_Flow_Sum <= 7.18488e+08 )
				if( Typical_Price <= 83.1884 )
					if( MFI_Low <= 29.7819 )
						if( Negative_Money_Flow_Sum <= 4.62484e+08 )
							if( Positive_Money_Flow_Sum <= 676061 )
								if( VIM <= 1.77365 )
									ret := 0.493506
								if( VIM > 1.77365 )
									ret := -0.092308
							if( Positive_Money_Flow_Sum > 676061 )
								if( Negative_Money_Flow <= 16701.9 )
									ret := -0.533333
								if( Negative_Money_Flow > 16701.9 )
									ret := -0.026934
						if( Negative_Money_Flow_Sum > 4.62484e+08 )
							if( Positive_Money_Flow_Sum <= 4.84099e+08 )
								ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 4.84099e+08 )
								ret := 1.000000 // buy
					if( MFI_Low > 29.7819 )
						if( Positive_Money_Flow <= 2737.63 )
							if( Negative_Money_Flow_Sum <= 389420 )
								if( Typical_Price <= 72.6072 )
									ret := -0.010870
								if( Typical_Price > 72.6072 )
									ret := 0.248980
							if( Negative_Money_Flow_Sum > 389420 )
								if( Positive_Money_Flow_Sum <= 875733 )
									ret := -0.119760
								if( Positive_Money_Flow_Sum > 875733 )
									ret := 0.089241
						if( Positive_Money_Flow > 2737.63 )
							if( VIM <= 1.04149 )
								if( VIM <= 0.694381 )
									ret := -0.727273 // sell
								if( VIM > 0.694381 )
									ret := 0.097222
							if( VIM > 1.04149 )
								if( Positive_Money_Flow_Sum <= 1.05976e+06 )
									ret := 0.155963
								if( Positive_Money_Flow_Sum > 1.05976e+06 )
									ret := 0.527559
				if( Typical_Price > 83.1884 )
					if( Raw_Money_Flow <= 2.41566e+07 )
						if( Positive_Money_Flow_Sum <= 4.22993e+07 )
							if( Positive_Money_Flow_Sum <= 1.30711e+07 )
								if( Negative_Money_Flow_Sum <= 1.00351e+07 )
									ret := 0.007660
								if( Negative_Money_Flow_Sum > 1.00351e+07 )
									ret := 0.604167
							if( Positive_Money_Flow_Sum > 1.30711e+07 )
								if( VIM <= 0.794962 )
									ret := 0.688889
								if( VIM > 0.794962 )
									ret := 0.148410
						if( Positive_Money_Flow_Sum > 4.22993e+07 )
							if( VIM <= 0.69325 )
								if( VIM <= 0.629421 )
									ret := 0.000000
								if( VIM > 0.629421 )
									ret := -0.609375
							if( VIM > 0.69325 )
								if( Positive_Money_Flow_Sum <= 6.70362e+07 )
									ret := -0.203528
								if( Positive_Money_Flow_Sum > 6.70362e+07 )
									ret := -0.005846
					if( Raw_Money_Flow > 2.41566e+07 )
						if( Negative_Money_Flow_Sum <= 2.96417e+08 )
							if( Positive_Money_Flow_Sum <= 2.69064e+08 )
								if( MFI_Low <= 49.7729 )
									ret := 0.311178
								if( MFI_Low > 49.7729 )
									ret := -0.197368
							if( Positive_Money_Flow_Sum > 2.69064e+08 )
								if( VIP <= 0.983632 )
									ret := 0.882353 // buy
								if( VIP > 0.983632 )
									ret := -0.178977
						if( Negative_Money_Flow_Sum > 2.96417e+08 )
							if( VIM <= 0.914457 )
								if( Negative_Money_Flow_Sum <= 3.90219e+08 )
									ret := 0.375000
								if( Negative_Money_Flow_Sum > 3.90219e+08 )
									ret := -0.681818
							if( VIM > 0.914457 )
								if( MFI_Low <= 43.0857 )
									ret := 0.659864
								if( MFI_Low > 43.0857 )
									ret := -0.750000 // sell
			if( Positive_Money_Flow_Sum > 7.18488e+08 )
				if( Negative_Money_Flow_Sum <= 7.73184e+08 )
					if( VIP_VIM <= 0.626397 )
						if( MFI_High <= -5.02182 )
							if( Negative_Money_Flow_Sum <= 3.54036e+08 )
								if( Raw_Money_Flow <= 4.86031e+07 )
									ret := -0.125000
								if( Raw_Money_Flow > 4.86031e+07 )
									ret := 0.954545 // buy
							if( Negative_Money_Flow_Sum > 3.54036e+08 )
								if( MFI_High <= -17.5459 )
									ret := 0.222222
								if( MFI_High > -17.5459 )
									ret := -0.742857 // sell
						if( MFI_High > -5.02182 )
							if( Raw_Money_Flow <= 8.4599e+07 )
								if( Negative_Money_Flow <= 6.50233e+07 )
									ret := -0.900000 // sell
								if( Negative_Money_Flow > 6.50233e+07 )
									ret := -0.250000
							if( Raw_Money_Flow > 8.4599e+07 )
								if( MFI_Low <= 64.7615 )
									ret := -0.500000
								if( MFI_Low > 64.7615 )
									ret := 1.000000 // buy
					if( VIP_VIM > 0.626397 )
						if( VIP_VIM <= 0.752951 )
							ret := -1.000000 // sell
						if( VIP_VIM > 0.752951 )
							if( Raw_Money_Flow <= 8.95704e+07 )
								ret := -0.833333 // sell
							if( Raw_Money_Flow > 8.95704e+07 )
								ret := 0.166667
				if( Negative_Money_Flow_Sum > 7.73184e+08 )
					if( MFI <= 57.3045 )
						ret := -1.000000 // sell
					if( MFI > 57.3045 )
						ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_BABA_5Min_9b5c06c4(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)

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


