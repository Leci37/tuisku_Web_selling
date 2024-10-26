//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: NVDA_30Min_2MV0_bb731cf0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2MV0_bb731cf0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_bb731cf0(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIM <= 0.809884 )
		if( Negative_Money_Flow_Sum <= 1.90293e+08 )
			if( VIP_VIM <= 0.762149 )
				if( Positive_Money_Flow_Sum <= 1.12802e+10 )
					if( Typical_Price <= 247.575 )
						if( Raw_Money_Flow <= 1.45017e+07 )
							if( Positive_Money_Flow <= 6.81648e+06 )
								if( MFI_High <= -6.27762 )
									ret := 0.316770
								if( MFI_High > -6.27762 )
									ret := -0.017903
							if( Positive_Money_Flow > 6.81648e+06 )
								if( Positive_Money_Flow_Sum <= 4.07571e+07 )
									ret := 0.746479 // buy
								if( Positive_Money_Flow_Sum > 4.07571e+07 )
									ret := -0.017544
						if( Raw_Money_Flow > 1.45017e+07 )
							if( MFI <= 96.6132 )
								if( Negative_Money_Flow_Sum <= 1.30185e+07 )
									ret := -0.568421
								if( Negative_Money_Flow_Sum > 1.30185e+07 )
									ret := -0.098341
							if( MFI > 96.6132 )
								if( MFI <= 98.2938 )
									ret := 0.223443
								if( MFI > 98.2938 )
									ret := -0.032305
					if( Typical_Price > 247.575 )
						if( Money_Flow_Ratio <= 35.572 )
							if( Negative_Money_Flow_Sum <= 6.10354e+06 )
								if( MFI_Low <= 72.434 )
									ret := 0.333333
								if( MFI_Low > 72.434 )
									ret := 0.714286 // buy
							if( Negative_Money_Flow_Sum > 6.10354e+06 )
								if( Positive_Money_Flow_Sum <= 4.16313e+07 )
									ret := -0.753425 // sell
								if( Positive_Money_Flow_Sum > 4.16313e+07 )
									ret := -0.288889
						if( Money_Flow_Ratio > 35.572 )
							if( MFI <= 98.4536 )
								if( VIM <= 0.616073 )
									ret := 0.883721 // buy
								if( VIM > 0.616073 )
									ret := 0.137546
							if( MFI > 98.4536 )
								if( MFI_Low <= 78.932 )
									ret := -0.355372
								if( MFI_Low > 78.932 )
									ret := -0.043689
				if( Positive_Money_Flow_Sum > 1.12802e+10 )
					if( Money_Flow_Ratio <= 165.792 )
						if( MFI <= 98.9181 )
							ret := 1.000000 // buy
						if( MFI > 98.9181 )
							ret := 0.769231 // buy
					if( Money_Flow_Ratio > 165.792 )
						ret := 0.466667
			if( VIP_VIM > 0.762149 )
				if( Raw_Money_Flow <= 2.48596e+08 )
					if( Raw_Money_Flow <= 1.3017e+08 )
						if( MFI <= 37.4769 )
							ret := -0.846154 // sell
						if( MFI > 37.4769 )
							if( Raw_Money_Flow <= 1.12675e+06 )
								if( Typical_Price <= 46.7323 )
									ret := 0.592593
								if( Typical_Price > 46.7323 )
									ret := -0.094340
							if( Raw_Money_Flow > 1.12675e+06 )
								if( Negative_Money_Flow_Sum <= 4.64321e+07 )
									ret := 0.398844
								if( Negative_Money_Flow_Sum > 4.64321e+07 )
									ret := -0.012579
					if( Raw_Money_Flow > 1.3017e+08 )
						if( Typical_Price <= 111.395 )
							ret := 0.600000
						if( Typical_Price > 111.395 )
							if( VIP_VIM <= 0.832409 )
								if( Money_Flow_Ratio <= 76.6722 )
									ret := -0.444444
								if( Money_Flow_Ratio > 76.6722 )
									ret := -0.826087 // sell
							if( VIP_VIM > 0.832409 )
								if( VIP_VIM <= 0.963566 )
									ret := -0.058824
								if( VIP_VIM > 0.963566 )
									ret := -0.800000 // sell
				if( Raw_Money_Flow > 2.48596e+08 )
					if( Positive_Money_Flow_Sum <= 1.08018e+09 )
						if( VIM <= 0.600473 )
							ret := 0.428571
						if( VIM > 0.600473 )
							ret := -0.666667
					if( Positive_Money_Flow_Sum > 1.08018e+09 )
						if( Raw_Money_Flow <= 2.82539e+08 )
							if( Money_Flow_Ratio <= 147.373 )
								ret := 0.833333 // buy
							if( Money_Flow_Ratio > 147.373 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 2.82539e+08 )
							if( VIP <= 1.38227 )
								if( Money_Flow_Ratio <= 99.55 )
									ret := 0.450000
								if( Money_Flow_Ratio > 99.55 )
									ret := -0.173913
							if( VIP > 1.38227 )
								if( VIP <= 1.41712 )
									ret := 0.615385
								if( VIP > 1.41712 )
									ret := 0.310127
		if( Negative_Money_Flow_Sum > 1.90293e+08 )
			if( MFI <= 3.96753 )
				if( VIP_VIM <= 0.408187 )
					if( MFI_Low <= -16.5138 )
						ret := -0.600000
					if( MFI_Low > -16.5138 )
						ret := -1.000000 // sell
				if( VIP_VIM > 0.408187 )
					ret := -0.166667
			if( MFI > 3.96753 )
				if( Typical_Price <= 253.83 )
					if( Positive_Money_Flow <= 6.23019e+09 )
						if( Negative_Money_Flow_Sum <= 5.93872e+09 )
							if( Money_Flow_Ratio <= 7.3732 )
								if( Positive_Money_Flow <= 2.65902e+08 )
									ret := 0.012433
								if( Positive_Money_Flow > 2.65902e+08 )
									ret := 0.212418
							if( Money_Flow_Ratio > 7.3732 )
								if( VIM <= 0.68696 )
									ret := 0.119691
								if( VIM > 0.68696 )
									ret := 0.436000
						if( Negative_Money_Flow_Sum > 5.93872e+09 )
							if( MFI_Low <= 56.6773 )
								if( MFI <= 70.7042 )
									ret := 0.487179
								if( MFI > 70.7042 )
									ret := -0.068966
							if( MFI_Low > 56.6773 )
								if( Negative_Money_Flow <= 6.07054e+07 )
									ret := 0.909091 // buy
								if( Negative_Money_Flow > 6.07054e+07 )
									ret := 0.533333
					if( Positive_Money_Flow > 6.23019e+09 )
						if( Positive_Money_Flow <= 6.56733e+09 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow > 6.56733e+09 )
							ret := -0.100000
				if( Typical_Price > 253.83 )
					if( Negative_Money_Flow <= 8.23199e+07 )
						if( Raw_Money_Flow <= 9.66988e+08 )
							if( VIP_VIM <= 0.689757 )
								if( MFI_High <= 3.20216 )
									ret := 0.129817
								if( MFI_High > 3.20216 )
									ret := -0.153153
							if( VIP_VIM > 0.689757 )
								if( Negative_Money_Flow <= 6.40068e+06 )
									ret := 0.323980
								if( Negative_Money_Flow > 6.40068e+06 )
									ret := -0.352941
						if( Raw_Money_Flow > 9.66988e+08 )
							if( Negative_Money_Flow_Sum <= 2.19039e+08 )
								if( Positive_Money_Flow_Sum <= 5.65605e+09 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 5.65605e+09 )
									ret := -0.133333
							if( Negative_Money_Flow_Sum > 2.19039e+08 )
								if( VIP_VIM <= 0.947001 )
									ret := 0.361076
								if( VIP_VIM > 0.947001 )
									ret := -0.277778
					if( Negative_Money_Flow > 8.23199e+07 )
						if( Raw_Money_Flow <= 3.27558e+09 )
							if( Negative_Money_Flow_Sum <= 4.27279e+09 )
								if( Typical_Price <= 492.654 )
									ret := 0.442308
								if( Typical_Price > 492.654 )
									ret := 0.053030
							if( Negative_Money_Flow_Sum > 4.27279e+09 )
								if( VIM <= 0.681861 )
									ret := 0.111111
								if( VIM > 0.681861 )
									ret := 0.640523
						if( Raw_Money_Flow > 3.27558e+09 )
							if( MFI_High <= 3.86924 )
								if( Negative_Money_Flow_Sum <= 8.64741e+09 )
									ret := -0.214286
								if( Negative_Money_Flow_Sum > 8.64741e+09 )
									ret := 0.416667
							if( MFI_High > 3.86924 )
								ret := -1.000000 // sell
	if( VIM > 0.809884 )
		if( Raw_Money_Flow <= 9.29385e+07 )
			if( Negative_Money_Flow_Sum <= 7.50078e+09 )
				if( VIM <= 1.47521 )
					if( Positive_Money_Flow_Sum <= 9.99464e+08 )
						if( Negative_Money_Flow_Sum <= 1.52484e+08 )
							if( Positive_Money_Flow <= 5446.03 )
								if( MFI <= 68.1485 )
									ret := 0.000198
								if( MFI > 68.1485 )
									ret := 0.190237
							if( Positive_Money_Flow > 5446.03 )
								if( Positive_Money_Flow <= 2.18542e+06 )
									ret := -0.137753
								if( Positive_Money_Flow > 2.18542e+06 )
									ret := -0.002809
						if( Negative_Money_Flow_Sum > 1.52484e+08 )
							if( Negative_Money_Flow_Sum <= 1.71978e+09 )
								if( Positive_Money_Flow <= 3.69344e+07 )
									ret := 0.072874
								if( Positive_Money_Flow > 3.69344e+07 )
									ret := -0.024656
							if( Negative_Money_Flow_Sum > 1.71978e+09 )
								if( Negative_Money_Flow_Sum <= 1.82196e+09 )
									ret := -0.545064
								if( Negative_Money_Flow_Sum > 1.82196e+09 )
									ret := -0.013370
					if( Positive_Money_Flow_Sum > 9.99464e+08 )
						if( Raw_Money_Flow <= 8.69683e+06 )
							if( Positive_Money_Flow_Sum <= 2.13012e+09 )
								if( Money_Flow_Ratio <= 0.489523 )
									ret := -0.335217
								if( Money_Flow_Ratio > 0.489523 )
									ret := -0.090056
							if( Positive_Money_Flow_Sum > 2.13012e+09 )
								if( Negative_Money_Flow_Sum <= 7.32649e+08 )
									ret := 0.130802
								if( Negative_Money_Flow_Sum > 7.32649e+08 )
									ret := -0.027645
						if( Raw_Money_Flow > 8.69683e+06 )
							if( MFI_High <= -32.7084 )
								if( Typical_Price <= 469.768 )
									ret := 0.179487
								if( Typical_Price > 469.768 )
									ret := 0.409091
							if( MFI_High > -32.7084 )
								if( Negative_Money_Flow_Sum <= 3.20418e+09 )
									ret := 0.055375
								if( Negative_Money_Flow_Sum > 3.20418e+09 )
									ret := -0.136662
				if( VIM > 1.47521 )
					if( Positive_Money_Flow_Sum <= 1.46519e+07 )
						if( Positive_Money_Flow_Sum <= 6.33295e+06 )
							if( Raw_Money_Flow <= 2.60843e+06 )
								if( VIP_VIM <= -0.525283 )
									ret := 0.539474
								if( VIP_VIM > -0.525283 )
									ret := 0.180952
							if( Raw_Money_Flow > 2.60843e+06 )
								if( Negative_Money_Flow_Sum <= 2.75629e+08 )
									ret := -0.424000
								if( Negative_Money_Flow_Sum > 2.75629e+08 )
									ret := 0.547619
						if( Positive_Money_Flow_Sum > 6.33295e+06 )
							if( Negative_Money_Flow <= 27788 )
								if( VIP_VIM <= -0.664956 )
									ret := -0.166667
								if( VIP_VIM > -0.664956 )
									ret := 0.348837
							if( Negative_Money_Flow > 27788 )
								if( Raw_Money_Flow <= 6.3373e+06 )
									ret := 0.668571
								if( Raw_Money_Flow > 6.3373e+06 )
									ret := 0.233333
					if( Positive_Money_Flow_Sum > 1.46519e+07 )
						if( Negative_Money_Flow <= 2839.39 )
							if( Negative_Money_Flow_Sum <= 3.62932e+07 )
								if( Money_Flow_Ratio <= 63.621 )
									ret := 0.394495
								if( Money_Flow_Ratio > 63.621 )
									ret := -0.533333
							if( Negative_Money_Flow_Sum > 3.62932e+07 )
								if( VIP <= 0.982743 )
									ret := 0.306931
								if( VIP > 0.982743 )
									ret := -0.337596
						if( Negative_Money_Flow > 2839.39 )
							if( Money_Flow_Ratio <= 0.19191 )
								if( Typical_Price <= 166.872 )
									ret := -0.569892
								if( Typical_Price > 166.872 )
									ret := 0.246479
							if( Money_Flow_Ratio > 0.19191 )
								if( Positive_Money_Flow_Sum <= 1.00897e+08 )
									ret := 0.485232
								if( Positive_Money_Flow_Sum > 1.00897e+08 )
									ret := 0.030374
			if( Negative_Money_Flow_Sum > 7.50078e+09 )
				if( MFI <= 35.8884 )
					if( Typical_Price <= 753.127 )
						if( MFI_High <= -45.2191 )
							if( VIP <= 0.854233 )
								if( MFI_Low <= -18.9795 )
									ret := -0.700000 // sell
								if( MFI_Low > -18.9795 )
									ret := 0.014035
							if( VIP > 0.854233 )
								if( MFI_Low <= -11.9657 )
									ret := -0.207547
								if( MFI_Low > -11.9657 )
									ret := 0.345588
						if( MFI_High > -45.2191 )
							if( Raw_Money_Flow <= 2.3004e+07 )
								ret := -0.947368 // sell
							if( Raw_Money_Flow > 2.3004e+07 )
								ret := 0.000000
					if( Typical_Price > 753.127 )
						if( Money_Flow_Ratio <= 0.280803 )
							if( MFI_High <= -61.736 )
								if( Money_Flow_Ratio <= 0.078375 )
									ret := 0.634615
								if( Money_Flow_Ratio > 0.078375 )
									ret := 0.071429
							if( MFI_High > -61.736 )
								if( VIP_VIM <= -0.372801 )
									ret := 0.615385
								if( VIP_VIM > -0.372801 )
									ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.280803 )
							if( VIM <= 1.01437 )
								ret := -0.750000 // sell
							if( VIM > 1.01437 )
								if( MFI_High <= -50.6717 )
									ret := -0.093750
								if( MFI_High > -50.6717 )
									ret := 0.418605
				if( MFI > 35.8884 )
					if( MFI <= 44.7136 )
						if( MFI_Low <= 16.8863 )
							if( Negative_Money_Flow <= 2.70185e+07 )
								ret := 0.727273 // buy
							if( Negative_Money_Flow > 2.70185e+07 )
								ret := 1.000000 // buy
						if( MFI_Low > 16.8863 )
							if( Positive_Money_Flow <= 1.91548e+06 )
								if( Negative_Money_Flow <= 1.40246e+07 )
									ret := -0.047619
								if( Negative_Money_Flow > 1.40246e+07 )
									ret := 0.484211
							if( Positive_Money_Flow > 1.91548e+06 )
								if( VIP_VIM <= -0.322982 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.322982 )
									ret := 0.661290
					if( MFI > 44.7136 )
						if( VIM <= 1.23285 )
							if( MFI_High <= -34.4306 )
								if( VIP_VIM <= 0.050244 )
									ret := 0.047619
								if( VIP_VIM > 0.050244 )
									ret := -0.357143
							if( MFI_High > -34.4306 )
								if( MFI <= 46.9 )
									ret := 0.775000 // buy
								if( MFI > 46.9 )
									ret := 0.239884
						if( VIM > 1.23285 )
							ret := -0.700000 // sell
		if( Raw_Money_Flow > 9.29385e+07 )
			if( MFI_Low <= 43.5131 )
				if( Money_Flow_Ratio <= 0.033132 )
					if( VIM <= 1.18064 )
						if( MFI_Low <= -18.686 )
							if( Negative_Money_Flow <= 3.86457e+08 )
								if( MFI_Low <= -18.9855 )
									ret := 0.087912
								if( MFI_Low > -18.9855 )
									ret := -0.487179
							if( Negative_Money_Flow > 3.86457e+08 )
								if( Negative_Money_Flow_Sum <= 1.42142e+09 )
									ret := 0.557377
								if( Negative_Money_Flow_Sum > 1.42142e+09 )
									ret := -0.029412
						if( MFI_Low > -18.686 )
							if( Typical_Price <= 162.793 )
								if( MFI_High <= -77.3893 )
									ret := -0.101562
								if( MFI_High > -77.3893 )
									ret := 0.571429
							if( Typical_Price > 162.793 )
								if( Positive_Money_Flow_Sum <= 1.0265e+08 )
									ret := -0.204545
								if( Positive_Money_Flow_Sum > 1.0265e+08 )
									ret := -0.573333
					if( VIM > 1.18064 )
						if( Money_Flow_Ratio <= 0.01287 )
							if( Negative_Money_Flow <= 1.64948e+08 )
								if( Negative_Money_Flow_Sum <= 1.59343e+08 )
									ret := 0.923077 // buy
								if( Negative_Money_Flow_Sum > 1.59343e+08 )
									ret := 0.367816
							if( Negative_Money_Flow > 1.64948e+08 )
								if( VIP_VIM <= -0.49837 )
									ret := -0.166667
								if( VIP_VIM > -0.49837 )
									ret := 0.230263
						if( Money_Flow_Ratio > 0.01287 )
							if( Raw_Money_Flow <= 2.11376e+09 )
								if( Negative_Money_Flow_Sum <= 2.87786e+08 )
									ret := -0.933333 // sell
								if( Negative_Money_Flow_Sum > 2.87786e+08 )
									ret := 0.190544
							if( Raw_Money_Flow > 2.11376e+09 )
								if( MFI_High <= -77.0832 )
									ret := 0.620000
								if( MFI_High > -77.0832 )
									ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.033132 )
					if( VIM <= 0.924936 )
						if( MFI_Low <= 41.0468 )
							if( Negative_Money_Flow_Sum <= 1.22054e+10 )
								if( Negative_Money_Flow_Sum <= 1.82015e+09 )
									ret := 0.088918
								if( Negative_Money_Flow_Sum > 1.82015e+09 )
									ret := -0.094684
							if( Negative_Money_Flow_Sum > 1.22054e+10 )
								if( Raw_Money_Flow <= 1.99879e+09 )
									ret := 0.670103
								if( Raw_Money_Flow > 1.99879e+09 )
									ret := 0.015385
						if( MFI_Low > 41.0468 )
							if( VIP <= 1.12429 )
								if( Negative_Money_Flow <= 3.78095e+08 )
									ret := -0.287736
								if( Negative_Money_Flow > 3.78095e+08 )
									ret := -0.837500 // sell
							if( VIP > 1.12429 )
								if( Positive_Money_Flow_Sum <= 1.21695e+09 )
									ret := -0.484848
								if( Positive_Money_Flow_Sum > 1.21695e+09 )
									ret := 0.070968
					if( VIM > 0.924936 )
						if( Negative_Money_Flow <= 3.296e+08 )
							if( Positive_Money_Flow_Sum <= 1.02814e+09 )
								if( Negative_Money_Flow_Sum <= 4.36224e+09 )
									ret := -0.134017
								if( Negative_Money_Flow_Sum > 4.36224e+09 )
									ret := -0.506250
							if( Positive_Money_Flow_Sum > 1.02814e+09 )
								if( Raw_Money_Flow <= 4.50417e+08 )
									ret := -0.003809
								if( Raw_Money_Flow > 4.50417e+08 )
									ret := -0.140549
						if( Negative_Money_Flow > 3.296e+08 )
							if( VIP <= 0.955795 )
								if( Typical_Price <= 408.083 )
									ret := -0.273053
								if( Typical_Price > 408.083 )
									ret := -0.101499
							if( VIP > 0.955795 )
								if( Negative_Money_Flow_Sum <= 2.18975e+10 )
									ret := -0.050378
								if( Negative_Money_Flow_Sum > 2.18975e+10 )
									ret := -0.825397 // sell
			if( MFI_Low > 43.5131 )
				if( Positive_Money_Flow_Sum <= 2.4747e+08 )
					if( Positive_Money_Flow <= 2.04941e+08 )
						if( VIP <= 1.19632 )
							if( Typical_Price <= 131.86 )
								ret := 0.714286 // buy
							if( Typical_Price > 131.86 )
								if( MFI_High <= -11.5636 )
									ret := 0.750000 // buy
								if( MFI_High > -11.5636 )
									ret := 0.980769 // buy
						if( VIP > 1.19632 )
							ret := 0.500000
					if( Positive_Money_Flow > 2.04941e+08 )
						if( Negative_Money_Flow_Sum <= 6.972e+06 )
							ret := -0.692308
						if( Negative_Money_Flow_Sum > 6.972e+06 )
							ret := 0.571429
				if( Positive_Money_Flow_Sum > 2.4747e+08 )
					if( MFI <= 82.6684 )
						if( MFI_Low <= 43.5599 )
							ret := 0.727273 // buy
						if( MFI_Low > 43.5599 )
							if( Positive_Money_Flow_Sum <= 3.24281e+10 )
								if( Typical_Price <= 880.059 )
									ret := 0.075515
								if( Typical_Price > 880.059 )
									ret := -0.612403
							if( Positive_Money_Flow_Sum > 3.24281e+10 )
								if( VIP_VIM <= 0.176446 )
									ret := 0.545455
								if( VIP_VIM > 0.176446 )
									ret := 0.892857 // buy
					if( MFI > 82.6684 )
						if( Negative_Money_Flow_Sum <= 5.46831e+06 )
							if( VIP <= 1.09449 )
								if( VIP <= 1.04879 )
									ret := -0.300000
								if( VIP > 1.04879 )
									ret := 0.333333
							if( VIP > 1.09449 )
								if( MFI_High <= 19.3852 )
									ret := -0.811594 // sell
								if( MFI_High > 19.3852 )
									ret := -0.030303
						if( Negative_Money_Flow_Sum > 5.46831e+06 )
							if( MFI_High <= 19.0217 )
								if( Money_Flow_Ratio <= 77.3554 )
									ret := -0.067095
								if( Money_Flow_Ratio > 77.3554 )
									ret := -0.317972
							if( MFI_High > 19.0217 )
								if( Positive_Money_Flow <= 4.07335e+08 )
									ret := 0.620690
								if( Positive_Money_Flow > 4.07335e+08 )
									ret := 0.043478
	
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
float op_operation = decision_tree_0_NVDA_30Min_bb731cf0(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


